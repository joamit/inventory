import React from 'react';
import {connect} from 'react-redux';

class InventoryPage extends React.Component {
    constructor(props, context) {
        super(props, context);
        console.log(props);
    }


    render() {
        return (
            <h3>
                Inventory Page placeholder
            </h3>
        );
    }
}

InventoryPage.propTypes = {};

function mapStateToProps(state) {
    return {
        loading: state.updatedState.ajaxCallsInProgress > 0,
        showSidebar: state.updatedState.showSidebar
    };
}

export default connect(mapStateToProps)(InventoryPage);
