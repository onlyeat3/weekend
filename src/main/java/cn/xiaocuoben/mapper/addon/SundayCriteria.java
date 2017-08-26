package cn.xiaocuoben.mapper.addon;

import cn.xiaocuoben.mapper.addon.reflection.Reflections;
import tk.mybatis.mapper.entity.EntityColumn;
import tk.mybatis.mapper.entity.Example.Criteria;

import java.util.Map;

/**
 * @author Frank
 */
public class SundayCriteria<A,B> extends Criteria {
    protected SundayCriteria(Map<String, EntityColumn> propertyMap, boolean exists, boolean notNull) {
        super(propertyMap, exists, notNull);
    }

    public SundayCriteria<A, B> andIsNull(Fn<A,B> fn){
        this.andIsNull(Reflections.fnToFieldName(fn));
        return this;
    }

    public SundayCriteria<A,B> andIsNotNull(Fn<A,B> fn) {
        super.andIsNotNull(Reflections.fnToFieldName(fn));
        return this;
    }

    public SundayCriteria<A, B> andEqualTo(Fn<A,B> fn, Object value) {
        super.andEqualTo(Reflections.fnToFieldName(fn), value);
        return this;
    }

    public SundayCriteria<A,B> andNotEqualTo(Fn<A,B> fn, Object value) {
         super.andNotEqualTo(Reflections.fnToFieldName(fn), value);
        return this;
    }

    public SundayCriteria<A,B> andGreaterThan(Fn<A,B> fn, Object value) {
         super.andGreaterThan(Reflections.fnToFieldName(fn), value);
        return this;
    }

    public SundayCriteria<A,B> andGreaterThanOrEqualTo(Fn<A,B> fn, Object value) {
         super.andGreaterThanOrEqualTo(Reflections.fnToFieldName(fn), value);
        return this;
    }

    public SundayCriteria<A,B> andLessThan(Fn<A,B> fn, Object value) {
         super.andLessThan(Reflections.fnToFieldName(fn), value);
        return this;
    }

    public SundayCriteria<A,B> andLessThanOrEqualTo(Fn<A,B> fn, Object value) {
         super.andLessThanOrEqualTo(Reflections.fnToFieldName(fn), value);
        return this;
    }

    public SundayCriteria<A,B> andIn(Fn<A,B> fn, Iterable values) {
        super.andIn(Reflections.fnToFieldName(fn), values);
        return this;
    }

    public SundayCriteria<A,B> andNotIn(Fn<A,B> fn, Iterable values) {
         super.andNotIn(Reflections.fnToFieldName(fn), values);
        return this;
    }

    public SundayCriteria<A,B> andBetween(Fn<A,B> fn, Object value1, Object value2) {
        super.andBetween(Reflections.fnToFieldName(fn), value1, value2);
        return this;
    }

    public SundayCriteria<A,B> andNotBetween(Fn<A,B> fn, Object value1, Object value2) {
         super.andNotBetween(Reflections.fnToFieldName(fn), value1, value2);
        return this;
    }

    public SundayCriteria<A,B> andLike(Fn<A,B> fn, String value) {
         super.andLike(Reflections.fnToFieldName(fn), value);
        return this;
    }

    public SundayCriteria<A,B> andNotLike(Fn<A,B> fn, String value) {
        super.andNotLike(Reflections.fnToFieldName(fn), value);
        return this;
    }

    public SundayCriteria<A,B> orIsNull(Fn<A,B> fn) {
         super.orIsNull(Reflections.fnToFieldName(fn));
        return this;
    }

    public SundayCriteria<A,B> orIsNotNull(Fn<A,B> fn) {
         super.orIsNotNull(Reflections.fnToFieldName(fn));
        return this;
    }

    public SundayCriteria<A,B> orEqualTo(Fn<A,B> fn, Object value) {
         super.orEqualTo(Reflections.fnToFieldName(fn), value);
        return this;
    }

    public SundayCriteria<A,B> orNotEqualTo(Fn<A,B> fn, Object value) {
        super.orNotEqualTo(Reflections.fnToFieldName(fn), value);
        return this;
    }

    public SundayCriteria<A,B> orGreaterThan(Fn<A,B> fn, Object value) {
        super.orGreaterThan(Reflections.fnToFieldName(fn), value);
        return this;
    }

    public SundayCriteria<A,B> orGreaterThanOrEqualTo(Fn<A,B> fn, Object value) {
        super.orGreaterThanOrEqualTo(Reflections.fnToFieldName(fn), value);
        return this;
    }

    public SundayCriteria<A,B> orLessThan(Fn<A,B> fn, Object value) {
        super.orLessThan(Reflections.fnToFieldName(fn), value);
        return this;
    }

    public SundayCriteria<A,B> orLessThanOrEqualTo(Fn<A,B> fn, Object value) {
        super.orLessThanOrEqualTo(Reflections.fnToFieldName(fn), value);
        return this;
    }

    public SundayCriteria<A,B> orIn(Fn<A,B> fn, Iterable values) {
        super.orIn(Reflections.fnToFieldName(fn), values);
        return this;
    }

    public SundayCriteria<A,B> orNotIn(Fn<A,B> fn, Iterable values) {
        super.orNotIn(Reflections.fnToFieldName(fn), values);
        return this;
    }

    public SundayCriteria<A,B> orBetween(Fn<A,B> fn, Object value1, Object value2) {
        super.orBetween(Reflections.fnToFieldName(fn), value1, value2);
        return this;
    }

    public SundayCriteria<A,B> orNotBetween(Fn<A,B> fn, Object value1, Object value2) {
        super.orNotBetween(Reflections.fnToFieldName(fn), value1, value2);
        return this;
    }

    public SundayCriteria<A,B> orLike(Fn<A,B> fn, String value) {
        super.orLike(Reflections.fnToFieldName(fn), value);
        return this;
    }

    public SundayCriteria<A,B> orNotLike(Fn<A,B> fn, String value) {
        super.orNotLike(Reflections.fnToFieldName(fn), value);
        return this;
    }
}
