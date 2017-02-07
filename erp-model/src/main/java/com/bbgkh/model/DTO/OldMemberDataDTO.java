package com.bbgkh.model.DTO;

/**
 * Created by lixiang01 on 2/7/2017.
 */
public class OldMemberDataDTO {

    private MemberInfoDTO memberInfo;

    private SaleInfoDTO saleInfo;

    public MemberInfoDTO getMemberInfo() {
        return memberInfo;
    }

    public void setMemberInfo(MemberInfoDTO memberInfo) {
        this.memberInfo = memberInfo;
    }

    public SaleInfoDTO getSaleInfo() {
        return saleInfo;
    }

    public void setSaleInfo(SaleInfoDTO saleInfo) {
        this.saleInfo = saleInfo;
    }
}
