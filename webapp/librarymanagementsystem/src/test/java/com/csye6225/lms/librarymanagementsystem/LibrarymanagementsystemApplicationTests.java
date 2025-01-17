package com.csye6225.lms.librarymanagementsystem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.jdbc.EmbeddedDatabaseConnection;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
@AutoConfigureTestDatabase(connection = EmbeddedDatabaseConnection.HSQL)
public class LibrarymanagementsystemApplicationTests {

    @Test
    public void contextLoads() {
    }

}
