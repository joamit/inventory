/* eslint-disable import/default */
import 'babel-polyfill';
import React from 'react';
import {render} from 'react-dom';
import configureStore from './store/configure.store.dev';
import {Provider} from 'react-redux';
import {browserHistory, Router} from 'react-router';
import routes from './components/routes';

import '../styles/styles.css';
import '../node_modules/toastr/build/toastr.min.css';

const store = configureStore();

render(
    <Provider store={store}>
        <Router history={browserHistory} routes={routes}/>
    </Provider>,
    document.getElementById('app')
);