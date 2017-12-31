import React from 'react';
import {connect} from 'react-redux';
import BubblePreLoader from 'react-bubble-preloader';

class App extends React.Component {
    render() {
        return (
            <div id="wrapper">
                {this.props.children}
                {this.props.loading && <div className="text-center"><BubblePreLoader animation={{speed: 1}}/></div>}
            </div>
        );
    }
}

App.propTypes = {
    children: React.PropTypes.object.isRequired,
    loading: React.PropTypes.bool.isRequired
};

function mapStateToProps(state, ownProps) {
    return {
        loading: state.updatedState.ajaxCallsInProgress > 0,
        showSidebar: state.updatedState.showSidebar
    };
}

export default connect(mapStateToProps)(App);
