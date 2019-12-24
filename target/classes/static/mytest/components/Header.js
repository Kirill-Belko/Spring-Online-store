import React from 'react';
import ReactDom from "react-dom";

class Header extends React.Component {
    constructor(props){
        super(props);
    }

    render(){
        return (
            <h1>Hello from Header</h1>
        );
    }
}

export default Header;