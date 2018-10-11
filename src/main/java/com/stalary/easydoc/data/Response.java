/**
 * @(#)Response.java, 2018-10-10.
 * <p>
 * Copyright 2018 Stalary.
 */
package com.stalary.easydoc.data;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * Response
 *
 * @author lirongqian
 * @since 2018/10/10
 */
@Data
public class Response {

    private int code;

    private String description;

    private Map<String, String> fieldMap = new HashMap<>();

    public Response(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public Response(int code, String description, Map<String, String> fieldMap) {
        this.code = code;
        this.description = description;
        this.fieldMap = fieldMap;
    }
}