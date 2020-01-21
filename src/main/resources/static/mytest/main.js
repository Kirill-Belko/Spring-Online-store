import React from "react";
import Header from './components/Header.js';
import GoodsGrid from './components/GoodsGrid.js'
import {render} from 'react-dom';


class Main extends React.Component {
    constructor(props) {
        super(props);
    }

    state = {
        goodsActivate: "",
        goods: []
    };

    updateGoodsActivateState = (value, arr) => {
        this.setState({goodsActivate: value});
        this.setState({goods: arr});
    };

    render(){
        let goods_grid = "";
        if(this.state.goodsActivate === true){
            goods_grid = <GoodsGrid goods = {this.state.goods}/>;
        }
        return(
            <div>
                <Header updateGoodsActivateState = {this.updateGoodsActivateState}/>
                {goods_grid}
            </div>

        );

    }
}
//
// export default Main;

render(
    <div>
        <Main />
    </div>,
    document.getElementById("react1")
);
// render(
//     <Header/>,
//     document.getElementById("react_phones")
// );
