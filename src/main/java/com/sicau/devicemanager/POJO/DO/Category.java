package com.sicau.devicemanager.POJO.DO;

import com.sicau.devicemanager.config.validation.group.DeviceValidatedGroup.InsertTree;
import com.sicau.devicemanager.config.validation.group.DeviceValidatedGroup.InsertTreeByPId;
import com.sicau.devicemanager.config.validation.group.DeviceValidatedGroup.ListTreeByPId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * 设备分类
 * @author Yazhe
 * Created at 14:57 2018/8/7
 */
@Data
@ApiModel("设备分类")
public class Category {

    @NotNull(message = "id不能为空", groups = {InsertTree.class})
    private String id;

    /**
     * 父级地点id
     */
    @ApiModelProperty("父级分类id")
    @NotNull(message = "父级分类id不能为空", groups = {InsertTree.class, ListTreeByPId.class, InsertTreeByPId.class})
    private String parentId;

    /**
     * 地名
     */
    @ApiModelProperty("分类名")
    @NotNull(message = "名称不能为空", groups = {InsertTree.class, InsertTreeByPId.class})
    private String name;

    /**
     * 层级
     */
    @ApiModelProperty("层级")
    private Integer level;

    /**
     * 路径
     */
    @ApiModelProperty("路径")
    private String path;
}
