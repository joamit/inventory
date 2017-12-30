import React from 'react';

const TextInput = ({name, label, onChange, placeholder, value, error}) => {
    let wrapperClass = 'form-group row';
    if (error && error.length > 0) {
        wrapperClass += ' ' + 'has-error';
    }

    return (
        <div className={wrapperClass}>
            <label htmlFor={name} className="col-sm-2 col-form-label">{label}</label>
            <div className="col-sm-10">
                <input type="text" name={name} className="form-control"
                       placeholder={placeholder} value={value}
                       onChange={onChange}/>
                {error && <div className="alert alert-danger">{error}</div>}
            </div>
        </div>
    );
};

TextInput.propTypes = {
    name: React.PropTypes.string.isRequired,
    label: React.PropTypes.string.isRequired,
    onChange: React.PropTypes.func.isRequired,
    placeholder: React.PropTypes.string,
    value: React.PropTypes.string.isRequired,
    error: React.PropTypes.string
};

export default TextInput;