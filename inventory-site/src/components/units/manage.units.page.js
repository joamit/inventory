import React from 'react';
import {connect} from 'react-redux';
import ManageUnitsForm from "./manage.units.form";

class ManageUnitsPage extends React.Component {
    constructor(props, context) {
        super(props, context);
        const unit = {};
        unit.name = '';
        unit.symbol = '';
        unit.siPrefixes = [];
        unit.selectedPrefix = '';

        const siPrefixes = [];
        siPrefixes.push({prefix: 'milli', symbol: 'm', exponent: -3, base: 10});
        siPrefixes.push({prefix: 'kilo', symbol: 'K', exponent: 3, base: 10});

        this.state = {
            unit: unit,
            siPrefixes: siPrefixes,
            errors: {},
            saving: false
        };
        this.onSave = this.onSave.bind(this);
        this.onChange = this.onChange.bind(this);
        this.addSiPrefix = this.addSiPrefix.bind(this);
    }

    onSave() {
        this.state.saving = true;
        delete this.state.unit.selectedPrefix;
        console.log('Saving unit object', this.state.unit);
        this.state.saving = false;
        //TODO: shall we perform a redirect here???
    }

    onChange(event) {
        const field = event.target.name;
        let unit = this.state.unit;
        unit[field] = event.target.value;
        return this.setState({unit: unit});
    }

    addSiPrefix() {
        //TODO: how to avoid inserting duplicates here...
        this.state.unit.siPrefixes.push(this.state.unit.selectedPrefix);
    }

    render() {
        return (
            <ManageUnitsForm
                formTitle="Add a new Unit"
                unit={this.state.unit}
                siPrefixes={this.state.siPrefixes}
                onSave={this.onSave}
                onChange={this.onChange}
                addSiPrefix={this.addSiPrefix}
                isLoading={this.state.saving}
                errors={this.state.errors}/>
        );
    }
}

ManageUnitsPage.propTypes = {};

function mapStateToProps(state) {
    return state;
}

export default connect(mapStateToProps)(ManageUnitsPage);
