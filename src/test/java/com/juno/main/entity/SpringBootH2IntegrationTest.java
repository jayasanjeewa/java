package com.juno.main.entity;

import com.juno.main.Application;
import com.juno.main.H2JpaConfig;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = {Application.class, H2JpaConfig.class})
public class SpringBootH2IntegrationTest {
}
