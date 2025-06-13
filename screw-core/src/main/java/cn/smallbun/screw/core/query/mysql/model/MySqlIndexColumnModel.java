/*
 * screw-core - 简洁好用的数据库表结构文档生成工具
 * Copyright © 2020 SanLi (qinggang.zuo@gmail.com)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package cn.smallbun.screw.core.query.mysql.model;

import cn.smallbun.screw.core.mapping.MappingField;
import cn.smallbun.screw.core.metadata.IndexColumn;
import lombok.Data;

/**
 * 表信息
 */
@Data
public class MySqlIndexColumnModel implements IndexColumn {

    private static final long serialVersionUID = -1917761911812533673L;
    /**
     * tableCat
     */
    @MappingField(value = "TABLE_CAT")
    private String tableCat;
    /**
     * 表名
     */
    @MappingField(value = "TABLE_NAME")
    private String tableName;

    @MappingField(value = "NON_UNIQUE")
    private String unique;

    @MappingField(value = "PAGES")
    private String pages;

    @MappingField(value = "TABLE_SCHEM")
    private String tableSchem;

    @MappingField(value = "COLUMN_NAME")
    private String columnName;

    @MappingField(value = "INDEX_NAME")
    private String indexName;

    @MappingField(value = "ASC_OR_DESC")
    private String ascOrDesc;

    @MappingField(value = "INDEX_QUALIFIER")
    private String indexQualifier;

    @MappingField(value = "ORDINAL_POSITION")
    private String ordinalPosition;

    @MappingField(value = "CARDINALITY")
    private String cardinality;

    @MappingField(value = "FILTER_CONDITION")
    private String filterCondition;

    @MappingField(value = "TYPE")
    private String indexType;

    @MappingField(value = "REMARKS")
    private String remarks;

}
