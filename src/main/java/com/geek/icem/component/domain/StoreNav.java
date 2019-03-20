package com.geek.icem.component.domain;

import java.util.Date;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "`t_store_nav`")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StoreNav {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(generator = "JDBC")
    private Long id;

    /**
     * 文字默认颜色
     */
    @Column(name = "`color`")
    private String color;

    /**
     * 文字激活颜色
     */
    @Column(name = "`active_color`")
    private String activeColor;

    /**
     * 创建时间
     */
    @Column(name = "`create_time`")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "`update_time`")
    private Date updateTime;

    /**
     * 卖家id
     */
    @Column(name = "`seller_id`")
    private Long sellerId;

    /**
     * 渠道：H5，支付宝小程序，轻店铺
     */
    @Column(name = "`channel`")
    private String channel;

    @Column(name = "`background_color`")
    private String backgroundColor;
}