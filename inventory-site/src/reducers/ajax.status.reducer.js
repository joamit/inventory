import {AJAX_CALL_ERROR, BEGIN_AJAX_CALL} from '../actions/action.types';
import initialState from './initial.state';

function actionTypeEndsInSuccess(type) {
    return type.substring(type.length - 8) === '_SUCCESS';
}

export default function ajaxStatusReducer(state = initialState, action) {
    if (action.type === BEGIN_AJAX_CALL) {
        return state.ajaxCallsInProgress + 1;
    } else if (action.type === AJAX_CALL_ERROR ||
        actionTypeEndsInSuccess(action.type)) {
        return state.ajaxCallsInProgress - 1;
    }
    return state;
}