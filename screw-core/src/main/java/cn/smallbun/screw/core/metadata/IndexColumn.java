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
package cn.smallbun.screw.core.metadata;

import java.io.Serializable;

/**
 * 索引接口
 */
public interface IndexColumn extends Serializable {
    String getTableName();

    /**
     * 获取索引名
     *
     * @return {@link String}
     */
    String getIndexName();

    /**
     * 索引包含的列
     *
     * @return {@link String}
     */
    String getColumnName();

    /**
     * 索引类型
     *
     * @return {@link String}
     */
    String getIndexType();

    /**
     * 是否唯一索引
     */
    String getUnique();

}
