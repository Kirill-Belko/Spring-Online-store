import React from "react"
import {render} from 'react-dom'
import App from './App.js'

class AppMain extends React.Component {
    constructor(props){
        super(props);

        this.state = {
            openComponentId: null,

        }
    }
    render() {
        return (
            <ul>
                <App
                    isOpen = {this.state.openComponentId === 1}
                    onClick = {this.handleClick.bind(this, 1)}
                />
                <App
                    isOpen = {this.state.openComponentId === 1}
                    onClick = {this.handleClick.bind(this, 1)}
                />
                <App
                    isOpen = {this.state.openComponentId === 1}
                    onClick = {this.handleClick.bind(this, 1)}
                />
            </ul>
        );
    }

    handleClick = (openCompId) => this.setState({openComponentId: openCompId})
}

export default AppMain;