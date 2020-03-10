package com.sfc.selenium_app.selenium_app.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.sfc.selenium_app.BaseEntity;

/**
 * <p>
 * 
 * </p>
 *
 * @author sufuchuan
 * @since 2020-03-10
 */
public class AppFunction extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "function_id", type = IdType.AUTO)
    private Integer functionId;

    private Integer projectId;

    private String cases;

    private String desc;

    public Integer getFunctionId() {
        return functionId;
    }

    public void setFunctionId(Integer functionId) {
        this.functionId = functionId;
    }
    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }
    public String getCases() {
        return cases;
    }

    public void setCases(String cases) {
        this.cases = cases;
    }
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public static final String FUNCTION_ID = "function_id";

    public static final String PROJECT_ID = "project_id";

    public static final String CASES = "cases";

    public static final String DESC = "desc";

    @Override
    public String toString() {
        return "AppFunction{" +
            "functionId=" + functionId +
            ", projectId=" + projectId +
            ", cases=" + cases +
            ", desc=" + desc +
        "}";
    }
}
