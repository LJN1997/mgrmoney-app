package com.uek.mgrmoney.entity;

import com.uek.mgrmoney.enumeration.ProductStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 理财产品实体类
 * @author jiani
 * @since jdk8
 * 锁定期 用integer不用int是因为默认值需要null不需要0
 * bigdecimal    浮点类型的数据在底层的存储是很复杂的，存储的是伪随机数
 * java语言为了解决这个问题，封装了一个工具类BigDecimal，用于准确进行两个数的运算
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product implements Serializable {
    //--产品编号
    private String id;
    //--产品名称
    private String name;
    //--起投金额
    private BigDecimal startAmount;
    //--投资步长
    private BigDecimal stepAmount;
    //--锁定期
    private Integer lockupPeriod;
    //--收益率
    private BigDecimal earningRate;
    //--状态
    /**
     * @see com.uek.mgrmoney.enumeration.ProductStatus
     */
    private String status;
    //--备注
    private String remark;
    //--创建时间
    private Date createAt;
    //--产品创建者
    private String createUser;
    //--产品更新时间
    private Date updateAt;
    //--产品更新者
    private String updateUser;
    //--为了产品状态安全考虑，我们使用枚举类型所以重写了set方法
    public void setStatus(ProductStatus productStatus){
        this.status = productStatus.name();
    }
}
