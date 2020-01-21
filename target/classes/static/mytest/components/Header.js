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
        //this.handleClick = this.handleClick.bind(this);
    }

    // handleClick(){
    //     this.setState({goodsActivate: true})
    // }

    handleGoodsButtonClick = (category) => {
        fetch("/test/getProductsByCategory?category=" + category)
            .then(response => response.json())
            .then((data) => {
                this.setState({goodsActivate: true});
                let arr2D = [];
                while(data.length) arr2D.push(data.splice(0, 3));
                this.setState({goods: arr2D});
                this.props.updateGoodsActivateState(true, arr2D);
            });
    };

    render(){
        return (
            <div className="container">
                <h1>Выберите категорию товаров</h1>
                <div className="row">
                    <div className="col-sm">
                        <button onClick={() => {
                            this.handleGoodsButtonClick(1)
                            }}>Телефоны</button>
                    </div>
                    <div className="col-sm">
                        <button onClick={() => {
                            this.handleGoodsButtonClick(2)
                        }}>Телевизоры</button>
                    </div>
                    <div className="col-sm">
                        <button onClick={() => {
                            this.handleGoodsButtonClick(3)
                        }}>Компьютеры</button>
                    </div>
                    <div className="col-sm">
                        <button onClick={() => {
                            this.handleGoodsButtonClick(4)
                        }}>Техника для кухни</button>
                    </div>
                    <div className="col-sm">
                        <button onClick={() => {
                            this.handleGoodsButtonClick(5)
                        }}>Техника для дома</button>
                    </div>
                </div>
            </div>
        );
    }
}

export default Header;