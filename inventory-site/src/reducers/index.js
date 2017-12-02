import {combineReducers} from 'redux';
import ajaxCallsInProgress from './ajax.status.reducer';

const rootReducer = combineReducers({
    ajaxCallsInProgress
});

export default rootReducer;