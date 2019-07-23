package com.zhang.mgc.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.zhang.mgc.model.User;

public interface UserDao extends JpaRepository<User, Long> {
    // Spring Data JPA 为我们简化了很多查询SQL,直接通过findBy实体属性名即可执行相关查询，多个字段属性用And/Or连接
    User findByUserName(String userName);
}
