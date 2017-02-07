package com.bbgkh.model.DTO;

import com.bbgkh.model.PO.MemberInfoPO;
import com.bbgkh.model.PO.SaleInfoPO;

/**
 * Created by lixiang01 on 2/7/2017.
 */
public class OldMemberDataDTO {

    private MemberInfoPO memberInfo;

    private SaleInfoPO saleInfo;

    public MemberInfoPO getMemberInfo() {
        return memberInfo;
    }

    public void setMemberInfo(MemberInfoPO memberInfo) {
        this.memberInfo = memberInfo;
    }

    public SaleInfoPO getSaleInfo() {
        return saleInfo;
    }

    public void setSaleInfo(SaleInfoPO saleInfo) {
        this.saleInfo = saleInfo;
    }
}
