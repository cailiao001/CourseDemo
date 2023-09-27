package com.example.edu.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author YinDehua
 * @since 2023-05-19
 */
@Getter
@Setter
@TableName("edu_course_studyhistory")
@ApiModel(value = "CourseStudyhistory对象", description = "")
public class CourseStudyhistory implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("课程id")
    private Integer courseId;

    @ApiModelProperty("学生id")
    private Integer studentId;

    @ApiModelProperty("创建时间")
    private Date createTime;

    @ApiModelProperty("修改时间")
    private Date updateTime;

    @ApiModelProperty("课程状态（0-可申请，1-待审核，2-已审核）")
    private Integer courseStatus;

    @ApiModelProperty("排序")
    private Integer sort;

    @ApiModelProperty("是否已删除 0-未删除 1-已删除")
    private Boolean isDeleted;


}
