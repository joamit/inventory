import {AJAX_CALL_ERROR, BEGIN_AJAX_CALL} from './action.types';

export function beginAjaxCall() {
    return {
        type: BEGIN_AJAX_CALL
    };
}

export function ajaxCallError() {
    return {
        type: AJAX_CALL_ERROR
    };
}