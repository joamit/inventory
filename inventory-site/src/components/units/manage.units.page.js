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
        siPrefixes.push({id: 'test1', prefix: 'milli', symbol: 'm', exponent: -3, base: 10});
        siPrefixes.push({id: 'test2', prefix: 'kilo', symbol: 'K', exponent: 3, base: 10});

        //use ids as the values for finding actual object later
        const siPrefixesOptions = [];
        siPrefixesOptions.push({value: 'test1', text: 'milli'});
        siPrefixesOptions.push({value: 'test2', text: 'kilo'});

        this.state = {
            unit: unit,
            siPrefixes: siPrefixes,
            siPrefixesOptions: siPrefixesOptions,
            errors: {},
            saving: false,
            showModal: false
        };
        this.onSave = this.onSave.bind(this);
        this.onChange = this.onChange.bind(this);
        this.addSiPrefix = this.addSiPrefix.bind(this);
        this.onModalClose = this.onModalClose.bind(this);
        this.onModalOpen = this.onModalOpen.bind(this);
    }

    onSave(event) {
        event.preventDefault();
        this.setState({saving: true});
        delete this.state.unit.selectedPrefix;
        console.log('Saving unit object', this.state.unit);
        this.setState({saving: false});
        //TODO: shall we perform a redirect here???
    }

    onChange(event) {
        const field = event.target.name;
        let unit = this.state.unit;
        unit[field] = event.target.value;
        return this.setState({unit: unit});
    }

    addSiPrefix(event) {
        event.preventDefault();
        //TODO: how to avoid inserting duplicates here...
        const siPrefix = this.state.siPrefixes.find(siPrefix => siPrefix.id === this.state.unit.selectedPrefix);
        this.state.unit.siPrefixes.push(siPrefix);
        this.onModalClose();
    }

    onModalClose() {
        this.setState({showModal: false});
    }

    onModalOpen(event) {
        event.preventDefault();
        this.setState({showModal: true});
    }

    render() {
        return (
            <ManageUnitsForm
                formTitle="Add a new Unit"
                unit={this.state.unit}
                siPrefixes={this.state.siPrefixesOptions}
                onSave={this.onSave}
                onChange={this.onChange}
                addSiPrefix={this.addSiPrefix}
                isLoading={this.state.saving}
                showModal={this.state.showModal}
                errors={this.state.errors}
                onModalClose={this.state.onModalClose}
                onModalOpen={this.state.onModalOpen}/>
        );
    }
}

ManageUnitsPage.propTypes = {};

function mapStateToProps(state) {
    return state;
}

export default connect(mapStateToProps)(ManageUnitsPage);
