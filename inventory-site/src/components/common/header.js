import React from 'react';
import {Link} from 'react-router';

const Header = () => {
    return (
        <nav className="navbar navbar-expand-lg navbar-light bg-light">

            <div className="container-fluid">
                <a className="navbar-brand" href="/">Inventorify</a>
                <button className="navbar-toggler" type="button" data-toggle="collapse"
                        data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                        aria-expanded="false" aria-label="Toggle navigation">
                    <span className="navbar-toggler-icon"/>
                </button>
                <div className="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul className="navbar-nav mr-auto">
                        <li className="nav-item dropdown">
                            <a className="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button"
                               data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                Reference Data
                            </a>
                            <div className="dropdown-menu" aria-labelledby="navbarDropdown">
                                <Link activeClassName="dropdown-item" className="dropdown-item"
                                      to="/manageUnits">Units</Link>
                                <div className="dropdown-divider"/>
                                <Link activeClassName="dropdown-item" className="dropdown-item"
                                      to="/manageManufacturers">Manufacturers</Link>
                                <div className="dropdown-divider"/>
                                <Link activeClassName="dropdown-item" className="dropdown-item"
                                      to="/manageDistributors">Distributors</Link>
                                <div className="dropdown-divider"/>
                                <Link activeClassName="dropdown-item" className="dropdown-item" to="/manageSIPrefixes">SIPrefixes</Link>
                            </div>
                        </li>
                        <li className="nav-item">
                            <Link activeClassName="nav-link" className="nav-link" to="/about">About</Link>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
    );
};

export default Header;
