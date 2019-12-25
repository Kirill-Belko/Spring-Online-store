//import 'bootstrap/dist/css/bootstrap.min.css';
import $ from 'jquery';
import Popper from 'popper.js';
//import 'bootstrap/dist/js/bootstrap.bundle.min';
import React from 'react';
import ReactDom from "react-dom";

class Header extends React.Component {
    constructor(props){
        super(props);
    }

    render(){
        return (
            <div className="container">
                <h1>Выберите категорию товаров</h1>
                <div className="row">
                    <div className="col-sm">
                        Телефоны
                    </div>
                    <div className="col-sm">
                        Телевизоры
                    </div>
                    <div className="col-sm">
                        Компьютеры
                    </div>
                    <div className="col-sm">
                        Техника для кухни
                    </div>
                    <div className="col-sm">
                        Техника для дома
                    </div>
                </div>
            </div>
        );
    }
}

export default Header;