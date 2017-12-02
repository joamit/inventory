import React from 'react';
import {IndexRoute, Route} from 'react-router';
import App from './app';
import HomePage from './home/home.page';
import AboutPage from './about/about.page';
import InventoryPage from "./inventory/inventory.page";

export default (
    <Route path="/" component={App}>
        <IndexRoute component={HomePage}/>
        <Route path="about" component={AboutPage}/>
        <Route path="inventory" component={InventoryPage}/>
    </Route>
);