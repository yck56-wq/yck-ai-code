package com.yck.aicode.model.enums;

import cn.hutool.core.util.ObjUtil;
import lombok.Getter;

/**
 * 代码生成类型枚举
 */
@Getter
public enum CodeGenTypeEnum {

    HTML("原生 HTML 模式", "html"),
    MULTI_FILE("原生多文件模式", "multi_file");

    private final String text;
    private final String value;

    CodeGenTypeEnum(String text, String value) {
        this.text = text;
        this.value = value;
    }

    /**
     * 根据 value 获取枚举
     *
     * @param value 枚举值的value
     * @return 枚举值
     */
    // 检查传入的value是否为空
    public static CodeGenTypeEnum getEnumByValue(String value) {
        if (ObjUtil.isEmpty(value)) {
            return null;
    // 遍历所有枚举值
        }
        // 比较当前枚举的value与传入的value是否相等
        for (CodeGenTypeEnum anEnum : CodeGenTypeEnum.values()) {
            // 如果匹配，则返回当前枚举
            if (anEnum.value.equals(value)) {
                return anEnum;
            }
    // 如果没有匹配的枚举，则返回null
        }
        return null;
    }
}
