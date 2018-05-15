package com.itfinn.utils.base;

import java.util.LinkedList;
import java.util.List;

/**
 * @author itFinn.com
 * @date 2018-03-07 17:05
 */
public class ExceptionUtils {

    /**
     * 功能：得到异常的堆栈信息。包括异常信息简述，以及详细堆栈信息。
     *
     * @param e 异常
     * @return List<String>
     */
    public static List<String> getStackTrace(Exception e) {
        List<String> errList = new LinkedList<String>();
        errList.add(e.toString());
        for (StackTraceElement line : e.getStackTrace()) {
            errList.add(line.toString());
        }
        return errList;
    }
}
