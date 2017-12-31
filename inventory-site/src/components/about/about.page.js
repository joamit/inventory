import React from 'react';
import Header from "../common/header";
import {connect} from "react-redux";

class AboutPage extends React.Component {
    render() {
        return (
            <div>
                <Header showSidebar={this.props.showSidebar}/>
                <div id="page-wrapper">
                    <div className="panel panel-default">
                        <div className="panel-heading">
                            <h5 className="panel-title">About the application</h5>
                        </div>
                        <div className="panel-body">
                            <p>This application uses React, Redux, React Router and a variety of other helpful tools.</p>
                        </div>
                    </div>
                </div>
            </div>
        );
    }
}

function mapStateToProps(state) {
    return {
        loading: state.updatedState.ajaxCallsInProgress > 0,
        showSidebar: state.updatedState.showSidebar
    };
}

export default connect(mapStateToProps)(AboutPage);
