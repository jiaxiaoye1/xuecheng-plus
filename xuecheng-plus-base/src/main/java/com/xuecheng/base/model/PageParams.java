package com.xuecheng.base.model;

import lombok.Data;
import lombok.ToString;

/**
 * @author: jiaye
 * @date: 2024/2/6 17:59
 * @description: 分页查询通用参数
 */
@Data
@ToString
public class PageParams {

    //当前页码
    private Long pageNo = 1L;

    //每页记录数默认默认值
    private Long pageSize = 10L;

    public PageParams(){
        //不含参构造方法
    }

    public PageParams(Long pageNo, Long pageSize) {
        //含参构造方法
        this.pageNo = pageNo;
        this.pageSize = pageSize;
    }
}
