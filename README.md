# weekend

基于 https://github.com/abel533/Mapper 做的增强

可以在Example.Criteria的条件方法里传lambada。(再也不用担心改数据库了......)

栗子：

代码已经打包在通用Mapper里，不需要额外引入，确认通用Mapper是较新版本即可。

```
  UserMapper    userMapper = sqlSession.getMapper(UserMapper.class);
  Weekend<User> weekend    = Weekend.of(User.class);
  weekend.weekendCriteria()
          .andIsNull(User::getId)
          .andBetween(User::getId,0,10)
          .andIn(User::getUserName, Arrays.asList("a","b","c"));
```