//import 'bootstrap/dist/css/bootstrap.min.css';
import $ from 'jquery';
import Popper from 'popper.js';
//import 'bootstrap/dist/js/bootstrap.bundle.min';
import React from 'react';
import ReactDom from "react-dom";

class Header extends React.Component {
    constructor(props){
        super(props);

        this.state = {
            goodsActivate: false
        };
        this.handleClick = this.handleClick.bind(this);
    }

    handleClick(){
        this.setState({goodsActivate: true})
    }

    render(){
        return (
            <div className="container">
                <h1>Выберите категорию товаров</h1>
                <div className="row">
                    <div className="col-sm">
                        <button onClick={() => {
                            this.setState({goodsActivate: true});
                            this.props.updateGoodsActivateState(true)
                            }}>Телефоны</button>
                    </div>
                    <div className="col-sm">
                        <a>Телевизоры</a>
                    </div>
                    <div className="col-sm">
                        <a>Компьютеры</a>
                    </div>
                    <div className="col-sm">
                        <a>Техника для кухни</a>
                    </div>
                    <div className="col-sm">
                        <a>Техника для дома</a>
                    </div>
                </div>
            </div>
        );
    }
}

export default Header;