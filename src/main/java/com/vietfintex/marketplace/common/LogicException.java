package com.vietfintex.marketplace.common;

import org.apache.log4j.Logger;

import java.text.MessageFormat;

public class LogicException extends Exception {
    private static final Logger logger = Logger.getLogger(LogicException.class);

    private String errorCode;
    private String description;
    private String keyMsg;


    public LogicException() {
        super();
    }

    public LogicException(String keyMsg) {
        super();
        this.keyMsg = keyMsg;
    }


    public LogicException(String errorCode, String keyMsg) {
        super();
        this.errorCode = errorCode;
        this.keyMsg = keyMsg;
    }


    public LogicException(String errorCode, String keyMsg, Throwable cause, Object... params) {
        super(cause);
        this.errorCode = errorCode;
        this.keyMsg = keyMsg;
    }

    public LogicException(String errorCode, String keyMsg, Object... params) {
        super();
    }


    @Override
    public String getMessage() {
        return MessageFormat.format("{0}:{1}", errorCode, description);
    }

    @Override
    public String toString() {
        return MessageFormat.format("{0}:{1}", errorCode, description);
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getKeyMsg() {
        return keyMsg;
    }

    public void setKeyMsg(String keyMsg) {
        this.keyMsg = keyMsg;
    }
}
