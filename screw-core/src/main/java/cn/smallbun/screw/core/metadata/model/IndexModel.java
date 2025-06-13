package cn.smallbun.screw.core.metadata.model;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author LuYi
 */
@Data
public class IndexModel implements Serializable {
    private static final long serialVersionUID = 869476838837281009L;

    private String indexName;

    private List<String> columns = new ArrayList<>();

    private Boolean unique;
}
