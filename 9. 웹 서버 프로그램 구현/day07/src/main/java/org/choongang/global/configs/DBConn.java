package org.choongang.global.configs;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

// 쿼리할 수 있는 기능
public class DBConn {
    // 객체 만들고 바로 사용 -> static으로 정의
    private static SqlSessionFactory factory;

    // 객체 만든 후 초기화
    static {
        try {
            Reader reader = Resources.getResourceAsReader("org/choongang/global/configs/mybatis-config.xml");

            factory = new SqlSessionFactoryBuilder().build(reader);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 바로 커밋할 수 있게 설정
    public static SqlSession getSession(boolean autoCommit) {
        // rollback 기능
        String mode = System.getenv("mode");
        if (mode != null && mode.equals("test")) autoCommit = false;

        return factory.openSession(autoCommit);
    }

    public static SqlSession getSession() {
        return getSession(true);
    }
}