import React from 'react';
import {Link} from 'react-router';


class HomePage extends React.Component {
    render() {
        return (
            <div className="jumbotron">
                <h1>Inventory Management App</h1>
                <p>This application allows you to manage your inventory needs!!</p>
                <p>This application uses React, Redux and React Router in ES6 to create an ultra responsive and light
                    web application.</p>
                <Link to="inventory" className="btn btn-primary btn-lg">Get Started</Link>
            </div>
        );
    }
}

export default HomePage;
