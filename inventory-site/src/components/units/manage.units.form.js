import React from 'react';
import TextInput from "../common/text.input";
import Modal from "../common/modal";

const ManageUnitsForm = ({
                             formTitle, unit, siPrefixes, onSave, addSiPrefix,
                             onChange, isLoading, errors, onModalOpen, onModalClose, showModal
                         }) => {
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
                    <button className="btn btn-default" onClick={onModalOpen}>Open Modal</button>
                </div>
            </div>

            <button onClick={onModalOpen}>Open modal</button>
            <Modal isOpen={showModal} onClose={onModalClose}>
                <h1>Modal title</h1>
                <p>hello</p>
                <p>
                    <button onClick={onModalClose}>Close</button>
                </p>
            </Modal>

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
    addSiPrefix: React.PropTypes.func.isRequired,
    onChange: React.PropTypes.func.isRequired,
    isLoading: React.PropTypes.bool.isRequired,
    errors: React.PropTypes.object.isRequired,
    onModalOpen: React.PropTypes.func,
    onModalClose: React.PropTypes.func,
    showModal: React.PropTypes.bool
};

export default ManageUnitsForm;