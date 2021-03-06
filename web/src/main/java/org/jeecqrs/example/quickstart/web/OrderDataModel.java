package org.jeecqrs.example.quickstart.web;

import java.io.Serializable;
import org.jeecqrs.example.quickstart.application.product.ProductListEntry;

public class OrderDataModel implements Serializable {

    private final ProductListEntry product;
    private Boolean selected = false;

    public OrderDataModel(ProductListEntry product) {
        this.product = product;
    }

    public ProductListEntry getProduct() {
        return product;
    }

    public Boolean getSelected() {
        return selected;
    }

    public void setSelected(Boolean selected) {
        this.selected = selected;
    }
    
}
