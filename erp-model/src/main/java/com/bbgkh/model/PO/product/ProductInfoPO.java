package com.bbgkh.model.PO.product;

import com.bbgkh.model.BaseModel;
import com.bbgkh.model.PO.product.attribute.AttributeInfoPO;

/**这个实体类仅仅用于描述一个产品，而非一个商品
 * Created by lixiang on 11/12/2016.
 */
public class ProductInfoPO extends BaseModel{
    private int id;
    private String productSysNo;


    private AttributeInfoPO attributeInfo;

    public AttributeInfoPO getAttributeInfo() {
        return attributeInfo;
    }

    public void setAttributeInfo(AttributeInfoPO attributeInfo) {
        this.attributeInfo = attributeInfo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductSysNo() {
        return productSysNo;
    }

    public void setProductSysNo(String productSysNo) {
        this.productSysNo = productSysNo;
    }


}
