import React from "react";
import Header from './Header.js';

class GoodsGrid extends React.Component {
    constructor(props){
        super(props);
    }

    render() {
        return (
            <div id="goods_grid" className="container">
                <div className="row">
                    <div className="col"><div className="inside_col"></div></div>
                    <div className="col"><div className="inside_col"></div></div>
                    <div className="col"><div className="inside_col"></div></div>
                    <div className="col"><div className="inside_col"></div></div>
                    <div className="col"><div className="inside_col"></div></div>
                </div>
                <div className="row">
                    <div className="col"><div className="inside_col"></div></div>
                    <div className="col"><div className="inside_col"></div></div>
                    <div className="col"><div className="inside_col"></div></div>
                    <div className="col"><div className="inside_col"></div></div>
                    <div className="col"><div className="inside_col"></div></div>
                </div>
            </div>
        );
    }
}

export default GoodsGrid;