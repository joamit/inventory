import {createStore} from 'redux';
import rootReducer from '../reducers/index';
import initialState from '../reducers/initial.state';


describe('Store', () => {

    it('should initialize the store with initial state', () => {
        //arrange setup
        const store = createStore(rootReducer, initialState);
        console.log(store);
    });

});