import React from 'react';

class AboutPage extends React.Component {
    render() {
        return (
            <div className="container-fluid">
                <div className="panel panel-default">
                    <div className="panel-heading">
                        <h5 className="panel-title">About the application</h5>
                    </div>
                    <div className="panel-body">
                        <p>This application uses React, Redux, React Router and a variety of other helpful tools.</p>
                    </div>
                </div>
            </div>
        );
    }
}

export default AboutPage;
