package com.youmou.utils;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class R {
    private Integer code;
    private String msg;
    private Object data;

    private R(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
        this.data = null;
    }

    private R(Integer code, Object data) {
        this.code = code;
        this.msg = "操作成功";
        this.data = data;
    }

    private R(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static R ok(String msg) {
        return new R(200, msg);
    }

    public static R ok(Object data) {
        return new R(200, data);
    }

    public static R ok(String msg, Object data) {
        return new R(200, msg, data);
    }


    public static R error(String msg) {
        return new R(500, msg);
    }

    public static R error() {
        return new R(500, "异常错误");
    }

    public static R create(Integer code, String msg, Object data) {
        return new R(code, msg, data);
    }

    public static R create(Integer code, String msg) {
        return new R(code, msg);
    }
}
