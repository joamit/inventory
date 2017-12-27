import React from 'react';
import {Link} from 'react-router';

const Header = (showSidebar) => {
    if (showSidebar && showSidebar.showSidebar === true) {
        return (
            <nav className="navbar navbar-default navbar-static-top" role="navigation" style={{marginBottom: "3px"}}>
                <div className="navbar-header">
                    <button type="button" className="navbar-toggle" data-toggle="collapse"
                            data-target=".navbar-collapse">
                        <span className="sr-only">Toggle navigation</span>
                        <span className="icon-bar"/>
                        <span className="icon-bar"/>
                        <span className="icon-bar"/>
                    </button>
                    <a className="navbar-brand" href="/">Inventorify</a>
                </div>
                <ul className="nav navbar-top-links navbar-right">
                    <li className="dropdown">
                        <a className="dropdown-toggle" data-toggle="dropdown" href="#">
                            <i className="fa fa-envelope fa-fw"/> <i className="fa fa-caret-down"/>
                        </a>
                        <ul className="dropdown-menu dropdown-messages">
                            <li>
                                <a href="/">
                                    <div>
                                        <strong>John Smith</strong>
                                        <span className="pull-right text-muted">
                                        <em>Yesterday</em>
                                    </span>
                                    </div>
                                    <div>Can we look into ordering some new parts for Project X!!</div>
                                </a>
                            </li>
                            <li className="divider"/>
                            <li>
                                <a href="#">
                                    <div>
                                        <strong>John Smith</strong>
                                        <span className="pull-right text-muted">
                                        <em>Yesterday</em>
                                    </span>
                                    </div>
                                    <div>I am being serious, please reply as soon as you see this!!!</div>
                                </a>
                            </li>
                            <li className="divider"/>
                            <li>
                                <a href="#">
                                    <div>
                                        <strong>John Smith</strong>
                                        <span className="pull-right text-muted">
                                        <em>Yesterday</em>
                                    </span>
                                    </div>
                                    <div>Common Mate!! where you at??</div>
                                </a>
                            </li>
                            <li className="divider"/>
                            <li>
                                <a className="text-center" href="/user/messages">
                                    <strong>Read All Messages</strong>
                                    <i className="fa fa-angle-right"/>
                                </a>
                            </li>
                        </ul>
                    </li>
                    <li className="dropdown">
                        <a className="dropdown-toggle" data-toggle="dropdown" href="#">
                            <i className="fa fa-tasks fa-fw"/> <i className="fa fa-caret-down"/>
                        </a>
                        <ul className="dropdown-menu dropdown-tasks">
                            <li>
                                <a href="#">
                                    <div>
                                        <p>
                                            <strong>East Coast Warehouse</strong>
                                            <span className="pull-right text-muted">40% Full</span>
                                        </p>
                                        <div className="progress progress-striped active">
                                            <div className="progress-bar progress-bar-success" role="progressbar"
                                                 aria-valuenow="40" aria-valuemin="0" aria-valuemax="100"
                                                 style={{"width": "40%"}}>
                                                <span className="sr-only">40% Full (success)</span>
                                            </div>
                                        </div>
                                    </div>
                                </a>
                            </li>
                            <li className="divider"/>
                            <li>
                                <a href="#">
                                    <div>
                                        <p>
                                            <strong>West Coast Warehouse</strong>
                                            <span className="pull-right text-muted">20% Full</span>
                                        </p>
                                        <div className="progress progress-striped active">
                                            <div className="progress-bar progress-bar-info" role="progressbar"
                                                 aria-valuenow="20" aria-valuemin="0" aria-valuemax="100"
                                                 style={{"width": "20%"}}>
                                                <span className="sr-only">20% Full</span>
                                            </div>
                                        </div>
                                    </div>
                                </a>
                            </li>
                            <li className="divider"/>
                            <li>
                                <a href="#">
                                    <div>
                                        <p>
                                            <strong>Europe Warehouse</strong>
                                            <span className="pull-right text-muted">60% Full</span>
                                        </p>
                                        <div className="progress progress-striped active">
                                            <div className="progress-bar progress-bar-warning" role="progressbar"
                                                 aria-valuenow="60" aria-valuemin="0" aria-valuemax="100"
                                                 style={{"width": "60%"}}>
                                                <span className="sr-only">60% Full (warning)</span>
                                            </div>
                                        </div>
                                    </div>
                                </a>
                            </li>
                            <li className="divider"/>
                            <li>
                                <a href="#">
                                    <div>
                                        <p>
                                            <strong>Asia Warehouse</strong>
                                            <span className="pull-right text-muted">80% Full</span>
                                        </p>
                                        <div className="progress progress-striped active">
                                            <div className="progress-bar progress-bar-danger" role="progressbar"
                                                 aria-valuenow="80" aria-valuemin="0" aria-valuemax="100"
                                                 style={{"width": "80%"}}>
                                                <span className="sr-only">80% Full (danger)</span>
                                            </div>
                                        </div>
                                    </div>
                                </a>
                            </li>
                            <li className="divider"/>
                            <li>
                                <a className="text-center" href="/warehouse/stats">
                                    <strong>See All Warehouses</strong>
                                    <i className="fa fa-angle-right"/>
                                </a>
                            </li>
                        </ul>
                    </li>
                    <li className="dropdown">
                        <a className="dropdown-toggle" data-toggle="dropdown" href="#">
                            <i className="fa fa-bell fa-fw"/> <i className="fa fa-caret-down"/>
                        </a>
                        <ul className="dropdown-menu dropdown-alerts">
                            <li>
                                <a href="#">
                                    <div>
                                        <i className="fa fa-comment fa-fw"/> New inventory order
                                        <span className="pull-right text-muted small">4 minutes ago</span>
                                    </div>
                                </a>
                            </li>
                            <li className="divider"/>
                            <li>
                                <a href="#">
                                    <div>
                                        <i className="fa fa-twitter fa-fw"/> 3 New tweets
                                        <span className="pull-right text-muted small">12 minutes ago</span>
                                    </div>
                                </a>
                            </li>
                            <li className="divider"/>
                            <li>
                                <a href="#">
                                    <div>
                                        <i className="fa fa-envelope fa-fw"/> Message Sent
                                        <span className="pull-right text-muted small">4 minutes ago</span>
                                    </div>
                                </a>
                            </li>
                            <li className="divider"/>
                            <li>
                                <a href="#">
                                    <div>
                                        <i className="fa fa-tasks fa-fw"/> New Task
                                        <span className="pull-right text-muted small">4 minutes ago</span>
                                    </div>
                                </a>
                            </li>
                            <li className="divider"/>
                            <li>
                                <a href="#">
                                    <div>
                                        <i className="fa fa-upload fa-fw"/> Server Rebooted
                                        <span className="pull-right text-muted small">4 minutes ago</span>
                                    </div>
                                </a>
                            </li>
                            <li className="divider"/>
                            <li>
                                <a className="text-center" href="/user/alerts">
                                    <strong>See All Alerts</strong>
                                    <i className="fa fa-angle-right"/>
                                </a>
                            </li>
                        </ul>
                    </li>
                    <li className="dropdown">
                        <a className="dropdown-toggle" data-toggle="dropdown" href="#">
                            <i className="fa fa-user fa-fw"/> <i className="fa fa-caret-down"/>
                        </a>
                        <ul className="dropdown-menu dropdown-user">
                            <li><a href="/user/profile"><i className="fa fa-user fa-fw"/> My Profile</a>
                            </li>
                            <li><a href="/user/settings"><i className="fa fa-gear fa-fw"/> Settings</a>
                            </li>
                            <li className="divider"/>
                            <li><a href="/user/logout"><i className="fa fa-sign-out fa-fw"/> Logout</a>
                            </li>
                        </ul>
                    </li>
                    <li className="dropdown">
                        <a className="dropdown-toggle" data-toggle="dropdown" href="#">
                            <i className="fa fa-question-circle fa-fw"/><i className="fa fa-caret-down"/>
                        </a>
                        <ul className="dropdown-menu dropdown-user">
                            <li>
                                <Link to="about">About</Link>
                            </li>
                        </ul>
                    </li>
                </ul>
                <div className="navbar-default sidebar" role="navigation">
                    <div className="sidebar-nav navbar-collapse">
                        <ul className="nav" id="side-menu">
                            <li>
                                <a href="/"><i className="fa fa-dashboard fa-fw"/> Dashboard</a>
                            </li>
                            <li>
                                <a href="#"><i class="fa fa-bar-chart-o fa-fw"></i>Add<span class="fa arrow"></span></a>
                                <ul class="nav nav-second-level">
                                    <li>
                                        <a href="add/distributor">Distributor</a>
                                    </li>
                                    <li>
                                        <a href="add/manufacturer">Manufacturer</a>
                                    </li>
                                    <li>
                                        <a href="add/si-prefix">Si Prefix</a>
                                    </li>
                                    <li>
                                        <Link to="unit">Unit</Link>
                                    </li>
                                </ul>
                            </li>
                        </ul>
                    </div>
                </div>
            </nav>
        );
    }
    else {
        return (
            <nav className="navbar navbar-default navbar-static-top" role="navigation" style={{marginBottom: "3px"}}>
                <div className="navbar-header">
                    <button type="button" className="navbar-toggle" data-toggle="collapse"
                            data-target=".navbar-collapse">
                        <span className="sr-only">Toggle navigation</span>
                        <span className="icon-bar"/>
                        <span className="icon-bar"/>
                        <span className="icon-bar"/>
                    </button>
                    <a className="navbar-brand" href="/">Inventorify</a>
                </div>
                <ul className="nav navbar-top-links navbar-right">
                    <li className="dropdown">
                        <a className="dropdown-toggle" data-toggle="dropdown" href="#">
                            <i className="fa fa-envelope fa-fw"/> <i className="fa fa-caret-down"/>
                        </a>
                        <ul className="dropdown-menu dropdown-messages">
                            <li>
                                <a href="/">
                                    <div>
                                        <strong>John Smith</strong>
                                        <span className="pull-right text-muted">
                                        <em>Yesterday</em>
                                    </span>
                                    </div>
                                    <div>Can we look into ordering some new parts for Project X!!</div>
                                </a>
                            </li>
                            <li className="divider"/>
                            <li>
                                <a href="#">
                                    <div>
                                        <strong>John Smith</strong>
                                        <span className="pull-right text-muted">
                                        <em>Yesterday</em>
                                    </span>
                                    </div>
                                    <div>I am being serious, please reply as soon as you see this!!!</div>
                                </a>
                            </li>
                            <li className="divider"/>
                            <li>
                                <a href="#">
                                    <div>
                                        <strong>John Smith</strong>
                                        <span className="pull-right text-muted">
                                        <em>Yesterday</em>
                                    </span>
                                    </div>
                                    <div>Common Mate!! where you at??</div>
                                </a>
                            </li>
                            <li className="divider"/>
                            <li>
                                <a className="text-center" href="/user/messages">
                                    <strong>Read All Messages</strong>
                                    <i className="fa fa-angle-right"/>
                                </a>
                            </li>
                        </ul>
                    </li>
                    <li className="dropdown">
                        <a className="dropdown-toggle" data-toggle="dropdown" href="#">
                            <i className="fa fa-tasks fa-fw"/> <i className="fa fa-caret-down"/>
                        </a>
                        <ul className="dropdown-menu dropdown-tasks">
                            <li>
                                <a href="#">
                                    <div>
                                        <p>
                                            <strong>East Coast Warehouse</strong>
                                            <span className="pull-right text-muted">40% Full</span>
                                        </p>
                                        <div className="progress progress-striped active">
                                            <div className="progress-bar progress-bar-success" role="progressbar"
                                                 aria-valuenow="40" aria-valuemin="0" aria-valuemax="100"
                                                 style={{"width": "40%"}}>
                                                <span className="sr-only">40% Full (success)</span>
                                            </div>
                                        </div>
                                    </div>
                                </a>
                            </li>
                            <li className="divider"/>
                            <li>
                                <a href="#">
                                    <div>
                                        <p>
                                            <strong>West Coast Warehouse</strong>
                                            <span className="pull-right text-muted">20% Full</span>
                                        </p>
                                        <div className="progress progress-striped active">
                                            <div className="progress-bar progress-bar-info" role="progressbar"
                                                 aria-valuenow="20" aria-valuemin="0" aria-valuemax="100"
                                                 style={{"width": "20%"}}>
                                                <span className="sr-only">20% Full</span>
                                            </div>
                                        </div>
                                    </div>
                                </a>
                            </li>
                            <li className="divider"/>
                            <li>
                                <a href="#">
                                    <div>
                                        <p>
                                            <strong>Europe Warehouse</strong>
                                            <span className="pull-right text-muted">60% Full</span>
                                        </p>
                                        <div className="progress progress-striped active">
                                            <div className="progress-bar progress-bar-warning" role="progressbar"
                                                 aria-valuenow="60" aria-valuemin="0" aria-valuemax="100"
                                                 style={{"width": "60%"}}>
                                                <span className="sr-only">60% Full (warning)</span>
                                            </div>
                                        </div>
                                    </div>
                                </a>
                            </li>
                            <li className="divider"/>
                            <li>
                                <a href="#">
                                    <div>
                                        <p>
                                            <strong>Asia Warehouse</strong>
                                            <span className="pull-right text-muted">80% Full</span>
                                        </p>
                                        <div className="progress progress-striped active">
                                            <div className="progress-bar progress-bar-danger" role="progressbar"
                                                 aria-valuenow="80" aria-valuemin="0" aria-valuemax="100"
                                                 style={{"width": "80%"}}>
                                                <span className="sr-only">80% Full (danger)</span>
                                            </div>
                                        </div>
                                    </div>
                                </a>
                            </li>
                            <li className="divider"/>
                            <li>
                                <a className="text-center" href="/warehouse/stats">
                                    <strong>See All Warehouses</strong>
                                    <i className="fa fa-angle-right"/>
                                </a>
                            </li>
                        </ul>
                    </li>
                    <li className="dropdown">
                        <a className="dropdown-toggle" data-toggle="dropdown" href="#">
                            <i className="fa fa-bell fa-fw"/> <i className="fa fa-caret-down"/>
                        </a>
                        <ul className="dropdown-menu dropdown-alerts">
                            <li>
                                <a href="#">
                                    <div>
                                        <i className="fa fa-comment fa-fw"/> New inventory order
                                        <span className="pull-right text-muted small">4 minutes ago</span>
                                    </div>
                                </a>
                            </li>
                            <li className="divider"/>
                            <li>
                                <a href="#">
                                    <div>
                                        <i className="fa fa-twitter fa-fw"/> 3 New tweets
                                        <span className="pull-right text-muted small">12 minutes ago</span>
                                    </div>
                                </a>
                            </li>
                            <li className="divider"/>
                            <li>
                                <a href="#">
                                    <div>
                                        <i className="fa fa-envelope fa-fw"/> Message Sent
                                        <span className="pull-right text-muted small">4 minutes ago</span>
                                    </div>
                                </a>
                            </li>
                            <li className="divider"/>
                            <li>
                                <a href="#">
                                    <div>
                                        <i className="fa fa-tasks fa-fw"/> New Task
                                        <span className="pull-right text-muted small">4 minutes ago</span>
                                    </div>
                                </a>
                            </li>
                            <li className="divider"/>
                            <li>
                                <a href="#">
                                    <div>
                                        <i className="fa fa-upload fa-fw"/> Server Rebooted
                                        <span className="pull-right text-muted small">4 minutes ago</span>
                                    </div>
                                </a>
                            </li>
                            <li className="divider"/>
                            <li>
                                <a className="text-center" href="/user/alerts">
                                    <strong>See All Alerts</strong>
                                    <i className="fa fa-angle-right"/>
                                </a>
                            </li>
                        </ul>
                    </li>
                    <li className="dropdown">
                        <a className="dropdown-toggle" data-toggle="dropdown" href="#">
                            <i className="fa fa-user fa-fw"/> <i className="fa fa-caret-down"/>
                        </a>
                        <ul className="dropdown-menu dropdown-user">
                            <li><a href="/user/profile"><i className="fa fa-user fa-fw"/> My Profile</a>
                            </li>
                            <li><a href="/user/settings"><i className="fa fa-gear fa-fw"/> Settings</a>
                            </li>
                            <li className="divider"/>
                            <li><a href="/user/logout"><i className="fa fa-sign-out fa-fw"/> Logout</a>
                            </li>
                        </ul>
                    </li>
                </ul>
            </nav>
        );
    }
};

Header.propTypes = {
    showSidebar: React.PropTypes.bool
};

export default Header;
