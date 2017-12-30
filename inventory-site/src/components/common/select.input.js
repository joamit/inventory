import React, {PropTypes} from 'react';

const SelectInput = ({name, label, onChange, defaultOption, value, error, options}) => {
    return (
        <div className="form-group row">
            <label htmlFor={name} className="col-sm-2 col-form-label">{label}</label>
            <div className="col-sm-10">
                <select
                    name={name}
                    value={value}
                    onChange={onChange}
                    className="form-control">
                    <option key="defaultKey" value="" selected>{defaultOption}</option>
                    {
                        options.map((opt) => {
                            return <option key={opt.value} value={opt.value}>{opt.text}</option>;
                        })
                    }
                </select>
                {error && <div className="alert alert-danger">{error}</div>}
            </div>
        </div>
    );
};

SelectInput.propTypes = {
    name: React.PropTypes.string.isRequired,
    label: React.PropTypes.string.isRequired,
    onChange: React.PropTypes.func.isRequired,
    defaultOption: React.PropTypes.string,
    value: React.PropTypes.string.isRequired,
    error: React.PropTypes.string,
    options: React.PropTypes.arrayOf(PropTypes.object).isRequired
};

export default SelectInput;