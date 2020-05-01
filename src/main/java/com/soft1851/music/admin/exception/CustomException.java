package com.soft1851.music.admin.exception;

import com.soft1851.music.admin.common.ResultCode;

/**
 * @author 12559
 */
public class CustomException extends RuntimeException {
    protected ResultCode resultCode;

    public CustomException(String msg, ResultCode resultCode) {
        super(msg);
        this.resultCode = resultCode;
    }

    public ResultCode getResultCode() {
        return resultCode;
    }
}