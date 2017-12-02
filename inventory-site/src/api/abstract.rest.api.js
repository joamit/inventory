import toastr from 'toastr';
import "isomorphic-fetch";

class AbstractRestApi {


    static concatParams(params) {
        let concatenatedParams = '';
        if (params !== undefined && params !== null) {
            for (const param in params) {
                if (params.hasOwnProperty(param) && params[param] !== null && String(params[param]).length > 0) {
                    if (concatenatedParams.length > 0) {
                        concatenatedParams = `${concatenatedParams}&`;
                    }
                    concatenatedParams = `${concatenatedParams + param}=${String(params[param])}`;
                }
            }
        }
        return concatenatedParams;
    }

    static doHttpRequestForJson(method, URL, params, payload) {
        let body = null;
        if (payload !== undefined && payload !== null) {
            body = JSON.stringify(payload);
        }

        const SOURCE = params ? `${URL}?${this.concatParams(params)}` : `${URL}`;
        return fetch(SOURCE, {
                method,
                body,
                credentials: 'include',
                headers: {
                    'Accept': 'application/json, */*',
                    'Content-Type': 'application/json'
                }
            }
        )
            .then(response => {
                if (!response.ok) {
                    let error = `${response.status} ${response.statusText}`;
                    if (response.status === 401) {
                        error += 'Please provide credentials';
                        return response.text()
                            .then((text) => {
                                toastr.warning(text);
                            });
                    } else {
                        error += ' Network Issue';
                    }
                    throw new Error(error);
                }
                return response.json();
            })
            .catch((error) => {
                toastr.options.closeButton = true;
                toastr.options.timeOut = 10000;
                toastr.options.extendedTimeOut = 10000;
                toastr.options.preventDuplicates = true;
                toastr.error(`${URL}`, `${error.message}`);
            });
    }


    static doGet(URL, params) {
        return this.doHttpRequestForJson("GET", URL, params, null);
    }

    static doPost(URL, params, body) {
        return this.doHttpRequestForJson("POST", URL, params, body);
    }
}

export default AbstractRestApi;