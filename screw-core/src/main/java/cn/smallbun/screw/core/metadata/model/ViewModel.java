package cn.smallbun.screw.core.metadata.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @author LuYi
 */
@Data
public class ViewModel implements Serializable {

    private String viewName;

    private String createSql;

    private String comment;
}
