package cn.xiaocuoben.mapper.addon;

import tk.mybatis.mapper.entity.Example;

/**
 * @author Frank
 */
public class Sunday<T> extends tk.mybatis.mapper.entity.Example {

    public Sunday(Class<T> entityClass) {
        super(entityClass);
    }

    public Sunday(Class<T> entityClass, boolean exists) {
        super(entityClass, exists);
    }

    public Sunday(Class<T> entityClass, boolean exists, boolean notNull) {
        super(entityClass, exists, notNull);
    }

    public SundayCriteria<T,Object> createCriteriaAddOn() {
        SundayCriteria<T,Object> sundayCriteria = new SundayCriteria<>(this.propertyMap,this.exists,this.notNull);
        return sundayCriteria;
    }

    @Override
    protected Criteria createCriteriaInternal() {
        return this.createCriteriaAddOn();
    }

    public static <A> Sunday<A> of(Class<A> clazz, Boolean exists, boolean notNull){
        return new Sunday<A>(clazz,exists,notNull);
    }
    public static <A> Sunday<A> of(Class<A> clazz, Boolean exists){
        return new Sunday<A>(clazz,exists,Boolean.FALSE);
    }
    public static <A> Sunday<A> of(Class<A> clazz){
        return new Sunday<A>(clazz,Boolean.TRUE);
    }

    @SuppressWarnings("all")
    public SundayCriteria<T,Object> sundayCriteria(){
        return (SundayCriteria<T, Object>) this.createCriteria();
    }

}
