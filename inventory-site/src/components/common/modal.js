import React from 'react';
import {connect} from "react-redux";

const modalStyle = {
    position: 'absolute',
    top: '50%',
    left: '50%',
    transform: 'translate(-50%, -50%)',
    zIndex: '9999',
    background: '#fff',
    minWidth: '400px'
};

const backdropStyle = {
    position: 'absolute',
    width: '100%',
    height: '100%',
    top: '0px',
    left: '0px',
    zIndex: '9998',
    background: 'rgba(0, 0, 0, 0.3)'
};

class Modal extends React.Component {

    close(e) {
        e.preventDefault();
        if (this.props.onClose) {
            this.props.onClose();
        }
    }

    render() {
        if (this.props.isOpen === false)
            return null;

        if (this.props.width && this.props.height) {
            modalStyle.width = this.props.width + 'px';
            modalStyle.height = this.props.height + 'px';
            modalStyle.marginLeft = '-' + (this.props.width / 2) + 'px';
            modalStyle.marginTop = '-' + (this.props.height / 2) + 'px';
            modalStyle.transform = null;
        }

        if (this.props.style) {
            for (let key in this.props.style) {
                modalStyle[key] = this.props.style[key];
            }
        }

        if (this.props.backdropStyle) {
            for (let key in this.props.backdropStyle) {
                backdropStyle[key] = this.props.backdropStyle[key];
            }
        }
        return (
            <div className={this.props.containerClassName}>
                <div className={this.props.className} style={modalStyle}>
                    {this.props.children}
                </div>
                {!this.props.noBackdrop &&
                <div className={this.props.backdropClassName} style={backdropStyle}
                     onClick={e => this.close(e)}/>}
            </div>
        );
    }
}

Modal.propTypes = {
    onClose: React.PropTypes.func.isRequired,
    isOpen: React.PropTypes.bool.isRequired,
    backdropStyle: React.PropTypes.object,
    containerClassName: React.PropTypes.string,
    backdropClassName: React.PropTypes.string,
    noBackdrop: React.PropTypes.bool,
    width: React.PropTypes.number,
    height: React.PropTypes.number,
    children: React.PropTypes.object,
    style: React.PropTypes.object,
    className: React.PropTypes.string
};


function mapStateToProps(state) {
    return state;
}

export default connect(mapStateToProps)(Modal);