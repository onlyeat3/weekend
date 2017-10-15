package cn.xiaocuoben.mapper.addon;

/**
 * @author Frank
 */
public class Weekend<T> extends tk.mybatis.mapper.entity.Example {

    public Weekend(Class<T> entityClass) {
        super(entityClass);
    }

    public Weekend(Class<T> entityClass, boolean exists) {
        super(entityClass, exists);
    }

    public Weekend(Class<T> entityClass, boolean exists, boolean notNull) {
        super(entityClass, exists, notNull);
    }

    public static <A> Weekend<A> of(Class<A> clazz, Boolean exists, boolean notNull) {
        return new Weekend<A>(clazz, exists, notNull);
    }

    public static <A> Weekend<A> of(Class<A> clazz, Boolean exists) {
        return new Weekend<A>(clazz, exists, Boolean.FALSE);
    }

    public static <A> Weekend<A> of(Class<A> clazz) {
        return new Weekend<A>(clazz, Boolean.TRUE);
    }

    public WeekendCriteria<T, Object> createCriteriaAddOn() {
        WeekendCriteria<T, Object> weekendCriteria = new WeekendCriteria<>(this.propertyMap, this.exists, this.notNull);
        return weekendCriteria;
    }

    @Override
    protected Criteria createCriteriaInternal() {
        return this.createCriteriaAddOn();
    }

    @SuppressWarnings("all")
    public WeekendCriteria<T, Object> weekendCriteria() {
        return (WeekendCriteria<T, Object>) this.createCriteria();
    }

}
