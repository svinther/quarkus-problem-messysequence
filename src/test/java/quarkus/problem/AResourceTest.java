package quarkus.problem;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;
import javax.sql.DataSource;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import static io.restassured.RestAssured.given;
import static io.smallrye.config.ConfigLogging.log;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class AResourceTest {

    @Inject
    DataSource dataSource;

    @BeforeEach
    public void clear() throws SQLException {
      try(Connection connection = dataSource.getConnection()) {
          try(Statement statement = connection.createStatement()) {
              statement.execute("ALTER SEQUENCE giftSeq RESTART WITH 1;");
          }

          try(Statement statement = connection.createStatement()) {
              statement.execute("DELETE FROM gift");
          }
      }
    }

    @Test
    public void testHelloEndpoint() {
        for (int i =1; i<=100; i++) {
            given()
                    .when().put("/gift/somegift")
                    .then()
                    .statusCode(200)
                    .body("id", is(i));
        }
    }

}