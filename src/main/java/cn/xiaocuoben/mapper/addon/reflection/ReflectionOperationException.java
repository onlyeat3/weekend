package cn.xiaocuoben.mapper.addon.reflection;

/**
 * @author Frank
 */
public class ReflectionOperationException extends RuntimeException {
    public ReflectionOperationException() {
    }

    public ReflectionOperationException(String message) {
        super(message);
    }

    public ReflectionOperationException(String message, Throwable cause) {
        super(message, cause);
    }

    public ReflectionOperationException(Throwable cause) {
        super(cause);
    }

    public ReflectionOperationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
