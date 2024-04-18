package org.launchcode;

import java.util.Date;

public class MenuItem {
    private Date dataAdded;
    private String itemName;
    private Double itemPrice;
    private String itemDescription;
    private String itemType;

    public MenuItem(Date dataAdded, String itemName, Double itemPrice, String itemDescription, String itemType) {
        this.dataAdded = dataAdded;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemDescription = itemDescription;
        this.itemType = itemType;
    }
    public Date getDataAdded() {
        return dataAdded;
    }

    public String getItemName() {
        return itemName;
    }

    public Double getItemPrice() {
        return itemPrice;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public String getItemType() {
        return itemType;
    }

    public void setDataAdded(Date dataAdded) {
        this.dataAdded = dataAdded;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setItemPrice(Double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

}
