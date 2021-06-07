package com.jht.admin.dict.dto;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @author admin
 */
@Getter
@Setter
public class SystemDictInDTO {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long dictId;
    /**
     * 值
     */
    private String dictValue;
    /**
     * 标签
     */
    private String dictLabel;
    /**
     * 类别
     */
    private String dictType;
    /**
     * 描述
     */
    private String description;
    /**
     * 排序
     */
    private Integer dictSort;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date modifyTime;
    /**
     * 是否删除
     */
    private Boolean isDelete;
    /**
     * 当前页数
     */
    private int currPage;
    /**
     * 每页记录数
     */
    private int pageSize;

    @Override
    public String toString() {
        return "SystemDictInDTO{" +
                "dictId=" + dictId +
                ", dictValue='" + dictValue + '\'' +
                ", dictLabel='" + dictLabel + '\'' +
                ", dictType='" + dictType + '\'' +
                ", description='" + description + '\'' +
                ", dictSort=" + dictSort +
                ", createTime=" + createTime +
                ", modifyTime=" + modifyTime +
                ", isDelete=" + isDelete +
                ", currPage=" + currPage +
                ", pageSize=" + pageSize +
                '}';
    }
}
