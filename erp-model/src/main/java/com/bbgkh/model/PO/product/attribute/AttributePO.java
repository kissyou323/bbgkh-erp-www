package com.bbgkh.model.PO.product.attribute;

import com.bbgkh.model.BaseModel;

/**用来存放属性的实体类。
 * 例：
 * id ----Name
 * 1 ---- 颜色
 * 2 ---- 尺码
 * Created by lixiang on 12/26/2016.
 */
public class AttributePO extends BaseModel {

    private String id;
    private String attributeId;
    private String attributeName;

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

    public String getAttributeName() {
        return attributeName;
    }

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }
}
