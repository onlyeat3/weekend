# weekend

基于 https://github.com/abel533/Mapper 做的增强

可以在Example.Criteria的条件方法里传lambada。(再也不用担心改数据库了......)

栗子：
```
  UserMapper userMapper     = sqlSession.getMapper(UserMapper.class);
  Sunday<User> sunday = Sunday.of(User.class);
  sunday.sundayCriteria()
          .andIsNull(User::getId)
          .andBetween(User::getId,0,10)
          .andIn(User::getUserName, Arrays.asList("a","b","c"));
  List<User> users = userMapper.selectByExample(sunday);
```
