import React from 'react';
import {connect} from 'react-redux';
import Header from "../common/header";

class InventoryPage extends React.Component {
    constructor(props, context) {
        super(props, context);
        console.log(props);
        props.showSidebar = false;
    }


    render() {
        return (
            <div>
                <Header showSidebar={this.props.showSidebar}/>
                <h3>
                    Inventory Page placeholder
                </h3>
            </div>
        );
    }
}

InventoryPage.propTypes = {};

function mapStateToProps(state) {
    return {
        loading: state.updatedState.ajaxCallsInProgress > 0,
        showSidebar: false
    };
}

export default connect(mapStateToProps)(InventoryPage);
