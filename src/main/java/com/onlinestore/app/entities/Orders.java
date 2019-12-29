package com.onlinestore.app.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "ORDERS")
public class Orders {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ORDERS_SEQ")
    @SequenceGenerator(name="ORDERS_SEQ", sequenceName="ORDERS_SEQ", allocationSize=1)
    @Column(name = "ID")
    private Integer id;

    @OneToMany
    @JoinColumn(name = "PRODUCT_ID")
    private List<Product> productList;

    @ManyToOne
    @JoinColumn(name = "CUSTOMER_ID")
    private Customer customer;

    @Column(name = "PROD_QUANTITY")
    private Integer prod_quantity;

    @Column(name = "ORDER_SUM")
    private Double order_sum;

    @Column(name = "DELIVERY_METHOD")
    private String delivery_method;

    @Column(name = "PAYMENT_METHOD")
    private String payment_method;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "COMMENTARY")
    private String commentary;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Integer getProd_quantity() {
        return prod_quantity;
    }

    public void setProd_quantity(Integer prod_quantity) {
        this.prod_quantity = prod_quantity;
    }

    public Double getOrder_sum() {
        return order_sum;
    }

    public void setOrder_sum(Double order_sum) {
        this.order_sum = order_sum;
    }

    public String getDelivery_method() {
        return delivery_method;
    }

    public void setDelivery_method(String delivery_method) {
        this.delivery_method = delivery_method;
    }

    public String getPayment_method() {
        return payment_method;
    }

    public void setPayment_method(String payment_method) {
        this.payment_method = payment_method;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCommentary() {
        return commentary;
    }

    public void setCommentary(String commentary) {
        this.commentary = commentary;
    }
}
