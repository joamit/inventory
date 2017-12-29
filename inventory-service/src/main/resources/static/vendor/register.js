$('#registrationForm').submit(function () {
    $.ajax({
        url: $('#registrationForm').attr('action'),
        type: 'POST',
        data: $('#registrationForm').serialize(),
        success: function (response) {
            console.log('form submitted.', response);
            if (response && response.success) {
                window.location = "/login";
            } else {
                var errorMsg;
                if (response && response.message) {
                    errorMsg = '<span style=\'color: red\'>' + response.message + '</span>';
                } else {
                    errorMsg = '<span style=\'color: red\'>User Registration Failed!! Please try again.</span>';
                }
                $(".error-text").append(errorMsg);
            }
        },
        error: function (response) {
            console.log('form submission failed!!', response);
            $(".error-text").append("<span style='color: red'>User Registration Failed!! Please try again.</span>");
        }
    });
    return false;
});