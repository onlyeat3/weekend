package cn.xiaocuoben.mapper.addon;

import java.io.Serializable;
import java.util.function.Function;

/**
 * @author Frank
 */
public interface Fn<T, R> extends Function<T, R>, Serializable {
}
