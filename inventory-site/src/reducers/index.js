import {combineReducers} from 'redux';
import updatedState from './ajax.status.reducer';

const rootReducer = combineReducers({
    updatedState
});

export default rootReducer;