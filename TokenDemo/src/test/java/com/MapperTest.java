package com;

import com.entity.User;
import com.mapper.MenuMapper;
import com.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.List;

@SpringBootTest
public class MapperTest {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private MenuMapper menuMapper;

    @Test
    public void TestBCryptPassWordEncoder() {
        BCryptPasswordEncoder bcp = new BCryptPasswordEncoder();
        System.out.println(bcp.matches("123456",
                "$2a$10$ihPgkxQW0qoSQOix8dTmaeKtO2NgQ.6R53qlVjLXM8SmeiJNpdZJe"));
        /* $2a$10$ihPgkxQW0qoSQOix8dTmaeKtO2NgQ.6R53qlVjLXM8SmeiJNpdZJe
        $2a$10$DcSRFujlfrIbI.nDRrGLZeu/w71XHgL5UR/rss1rBO6CdJans1Zga */
        /*String encode1 = bcp.encode("123456");
        String encode2 = bcp.encode("123456");
        System.out.println(encode1);
        System.out.println(encode2);*/
    }

    @Test
    public void test(){
        List<User> userList = userMapper.selectList(null);
        System.out.println(userList);
    }

    @Test
    public void testSelectPermsByUserId(){
        List<String> strings = menuMapper.selectPermsByUserId(1L);
        System.out.println(strings);
    }
}
