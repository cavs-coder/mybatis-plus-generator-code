package com.cavs_coder.generator.data;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.sql.Timestamp;

/**
 * @author fuguangwei
 * @date 2023-11-10
 */
@Data
public class BaseEntity {

    @TableId(type = IdType.ASSIGN_ID)
    @ApiModelProperty("主键id")
    private Long id;
    @ApiModelProperty("创建人")
    private Long createBy;
    @ApiModelProperty("创建时间")
    private Timestamp createTime;
    @ApiModelProperty("修改人")
    private Long updateBy;
    @ApiModelProperty("修改时间")
    private Timestamp updateTime;
    @ApiModelProperty("企业id")
    private Long corpId;

}
