import React from "react";
import ReactDom from "react-dom";

class App extends React.Component {
    constructor(props){
        super(props);

        //this.state = {isOpen: true};
    }

    render() {
        return <p>Hello, World!</p>
    }

    // shouldComponentUpdate(nextProps, nextState){
    //     return this.state.isOpen !== nextState.isOpen;
    // }

    componentWillMount(){
        console.log("mounting");
    }

    componentWillUpdate(){
        console.log("will update");
    }
}

export default App;