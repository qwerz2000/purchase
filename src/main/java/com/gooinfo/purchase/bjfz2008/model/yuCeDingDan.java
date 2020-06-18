package com.gooinfo.purchase.bjfz2008.model;

import lombok.Data;

@Data
public class yuCeDingDan {
    private String beiShaDate;//备纱日期
    private String yeWuZu;//业务组
    private String yuCeNo;//预测订单号
    private String yuCeDate;//预测下单日期
    private String variety;//品种（布编）
    private String yuCeQuanity;//预测数量
    private String varietyId;//布编ID
}
