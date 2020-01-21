import React from "react";
import Header from './Header.js';

class GoodsGrid extends React.Component {
    constructor(props){
        super(props);
    }

    render() {

        return (
            <div id="goods_grid" className="container">
                {this.props.goods.map((item, index) => {

                            return (
                                <div className="row">
                                    <div className="col"><div className="inside_col">{item[0] !== undefined? item[0].name : ""}</div></div>
                                    <div className="col"><div className="inside_col">{item[1] !== undefined? item[1].name : ""}</div></div>
                                    <div className="col"><div className="inside_col">{item[2] !== undefined? item[2].name : ""}</div></div>
                                </div>
                            );
                 })
                }
            </div>
        );
    }
}

export default GoodsGrid;