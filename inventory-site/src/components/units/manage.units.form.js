import React from 'react';
import TextInput from "../common/text.input";
import SelectInput from "../common/select.input";
import Modal from 'react-overlays/lib/Modal';

let rand = () => (Math.floor(Math.random() * 20) - 10);

const modalStyle = {
    position: 'fixed',
    zIndex: 1040,
    top: 0, bottom: 0, left: 0, right: 0
};

const backdropStyle = {
    position: 'fixed',
    top: 0, bottom: 0, left: 0, right: 0,
    zIndex: 'auto',
    backgroundColor: '#000',
    opacity: 0.5
};

const ManageUnitsForm = ({
                             formTitle, unit, siPrefixes, onSave, addSiPrefix,
                             onChange, isLoading, errors, showModal,
                             onModalClose, onModalOpen
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
                    <input onClick={onModalOpen} className="btn btn-primary" type="button" value="Add Si Prefix"/>
                </div>
            </div>
            <Modal
                aria-labelledby="modal-label"
                style={modalStyle}
                backdropStyle={backdropStyle}
                show={showModal}
                onHide={onModalClose}
            >
                <div className="row">
                    <div className="col-md-8">
                        <SelectInput name="selectedPrefix" label="Available SI Prefixes" onChange={onChange}
                                     options={siPrefixes} error={errors.siPrefixes} value={unit.selectedPrefix}/>
                    </div>
                    <div className="col-md-2 text-right">
                        <input onClick={addSiPrefix} className="btn btn-primary" type="button" value="Add Si Prefix"/>
                    </div>
                </div>
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
    showModal: React.PropTypes.bool.isRequired,
    onModalClose: React.PropTypes.func,
    onModalOpen: React.PropTypes.func
};

export default ManageUnitsForm;