package com.endava.upskill.confservice.domain.model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import com.endava.upskill.confservice.domain.model.entity.Status;
import com.endava.upskill.confservice.domain.model.entity.User;

class UserTest {

    @Test
    void whenValidUser_thenDontThrowExceptions() {
        Assertions.assertThatNoException().isThrownBy(
                () -> new User("validuser", "username@gmail.com",
                        Status.ACTIVE, null, null, null));
    }
}
