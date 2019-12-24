import React from "react";
import ReactDom from "react-dom";
import Header from './components/Header.js';
import {render} from 'react-dom';


// class Main extends React.Component {
//     constructor(props) {
//         super(props);
//     }
//
//
// }
//
// export default Main;

render(
    <Header/>,
    document.getElementById("react1")
);