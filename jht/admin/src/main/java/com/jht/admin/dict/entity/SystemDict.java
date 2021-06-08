package com.jht.admin.dict.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 系统字典
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2021-05-26 10:39:45
 */
@Data
@TableName("system_dict")
public class SystemDict implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId(value="dict_id", type = IdType.AUTO)
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
	@TableField(value="create_time", fill = FieldFill.INSERT)
	private Date createTime;
	/**
	 * 修改时间
	 */
	@TableField(value="modify_time", fill = FieldFill.INSERT_UPDATE)
	private Date modifyTime;
	/**
	 * 是否删除
	 */
	@TableLogic
	@TableField(value="is_delete", fill = FieldFill.INSERT)
	private Boolean isDelete;

}
