package cn.xiaocuoben.mapper.addon;

import cn.xiaocuoben.mapper.addon.entity.User;
import cn.xiaocuoben.mapper.addon.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author Frank
 */
public class UserMapperTest {

    /**
     * 执行，然后看日志打出来的SQL
     */
    @Test
    public void testSelectIdIsNull(){
        SqlSession sqlSession = MybatisHelper.getSqlSession();
        UserMapper userMapper     = sqlSession.getMapper(UserMapper.class);
        Sunday<User> sunday = Sunday.of(User.class);
        sunday.sundayCriteria()
                .andIsNull(User::getId)
                .andBetween(User::getId,0,10)
                .andIn(User::getUserName, Arrays.asList("a","b","c"));

        List<User> users = userMapper.selectByExample(sunday);
        for (User user : users) {
            System.out.println(user.getUserName());
        }
    }
}
