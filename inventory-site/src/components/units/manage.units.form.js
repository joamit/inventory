import React from 'react';
import TextInput from "../common/text.input";
import SelectInput from "../common/select.input";

const ManageUnitsForm = ({formTitle, unit, siPrefixes, onSave, addSiPrefix, onChange, isLoading, errors}) => {
    return (
        <form>
            <h4>{formTitle}</h4>
            <div className="row">
                <div className="col-md-6">
                    <TextInput name="name" label="Name" onChange={onChange} value={unit.name} error={errors.name}/>
                </div>
                <div className="col-md-6">
                    <TextInput name="symbol" label="Symbol" onChange={onChange} value={unit.symbol}
                               error={errors.symbol}/>
                </div>
            </div>
            <div className="row">
                <div className="col-md-12">
                    {
                        unit.siPrefixes.map(siPrefix => `${siPrefix.prefix},`)
                    }
                </div>
            </div>
            <div className="row">
                <div className="col-md-8">
                    <SelectInput name="selectedPrefix" label="Available SI Prefixes" onChange={onChange}
                                 options={siPrefixes} error={errors.siPrefixes} value={unit.selectedPrefix}/>
                </div>
                <div className="col-md-2 text-right">
                    <button onClick={addSiPrefix} className="btn btn-default">Add Si Prefix</button>
                </div>
            </div>

            <input
                type="submit"
                disabled={isLoading}
                value={isLoading ? 'Saving...' : 'Save'}
                className={isLoading ? 'btn btn-success' : 'btn btn-primary'}
                onClick={onSave}/>
        </form>

    );
};

ManageUnitsForm.propTypes = {
    formTitle: React.PropTypes.string,
    unit: React.PropTypes.object.isRequired,
    siPrefixes: React.PropTypes.array.isRequired,
    onSave: React.PropTypes.func.isRequired,
    onChange: React.PropTypes.func.isRequired,
    addSiPrefix: React.PropTypes.func.isRequired,
    isLoading: React.PropTypes.bool.isRequired,
    errors: React.PropTypes.object.isRequired
};

export default ManageUnitsForm;