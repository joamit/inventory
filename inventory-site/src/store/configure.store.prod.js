import {applyMiddleware, createStore} from 'redux';
import rootReducer from '../reducers/index';
import thunk from 'redux-thunk';

export default function configureStore(initialState) {
    return createStore(rootReducer,
        initialState,
        applyMiddleware(thunk));
}