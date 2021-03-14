package com.juno.main.entity;

import com.juno.main.Application;
import com.juno.main.repository.GenericEntityRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = Application.class)
class EntityIntegrationTest {

    @Autowired
    private GenericEntityRepository genericEntityRepository;

    @Test
    public void givenGenericEntityRepository_whenSaveAndRetreiveEntity_thenOK() {

        GenericEntity genericEntity = genericEntityRepository
                .save(new GenericEntity("test"));
       // GenericEntity foundEntity = genericEntityRepository
              //  .findOne(genericEntity.getId());

        //assertNotNull(foundEntity);
        //assertEquals(genericEntity.getValue(), foundEntity.getValue());

    }

}