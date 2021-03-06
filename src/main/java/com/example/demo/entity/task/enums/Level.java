package com.example.demo.entity.task.enums;

import lombok.Getter;

/**
 * @author Amonov Bunyod, пт 25.02.2022 16:09 .
 */

@Getter
public enum Level {
    HARD,
    MEDIUM,
    EASY;

    public static Level getLevelByName(String string) {
        for (Level value : values()) {
            if (value.name().equalsIgnoreCase(string))
                return value;
        }
        return MEDIUM;
    }

}
