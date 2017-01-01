package com.bbgkh.model.PO.product.attribute;

import com.bbgkh.model.BaseModel;

/**用以标识某一属性下面具体的属性值
 * 例：
 * attributeId -----attributeInfoId-------attributeInfoName
 *      1                   1                   红色
 *      1                   2                   牛仔
 *      2                   1                   27
 * Created by lixiang on 12/26/2016.
 */
public class AttributeInfoPO extends BaseModel{
    private String id ;
    private String attributeId;
    private String attributeInfoId;
    private String attributeInfoName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAttributeId() {
        return attributeId;
    }

    public void setAttributeId(String attributeId) {
        this.attributeId = attributeId;
    }

    public String getAttributeInfoId() {
        return attributeInfoId;
    }

    public void setAttributeInfoId(String attributeInfoId) {
        this.attributeInfoId = attributeInfoId;
    }

    public String getAttributeInfoName() {
        return attributeInfoName;
    }

    public void setAttributeInfoName(String attributeInfoName) {
        this.attributeInfoName = attributeInfoName;
    }
}
