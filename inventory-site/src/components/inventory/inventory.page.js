import React from 'react';
import {connect} from 'react-redux';

class InventoryPage extends React.Component {
    constructor(props, context) {
        super(props, context);
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
    return state;
}

export default connect(mapStateToProps)(InventoryPage);
