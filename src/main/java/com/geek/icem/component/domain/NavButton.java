package com.geek.icem.component.domain;

import java.util.Date;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "`t_nav_button`")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class NavButton {
    /**
     * 主键id
     */
    @Id
    @Column(name = "`id`")
    @GeneratedValue(generator = "JDBC")
    private Long id;

    @Column(name = "`store_nav_id`")
    private Long storeNavId;

    @Column(name = "`page_id`")
    private String pageId;

    /**
     * 原生页面地址
     */
    @Column(name = "`page_name`")
    private String pageName;

    @Column(name = "`page_url`")
    private String pageUrl;

    /**
     * 原生页面标题
     */
    @Column(name = "`page_title`")
    private String pageTitle;

    /**
     * 导航按钮文字
     */
    @Column(name = "`text`")
    private String text;

    /**
     * 普通状态图标
     */
    @Column(name = "`icon_name`")
    private String iconName;

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
}