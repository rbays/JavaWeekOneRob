package DayFour.productExample;
import DayFour.awesome.generated.tables.Games;
import DayFour.awesome.generated.tables.records.GamesRecord;
import org.jooq.DSLContext;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import org.junit.*;

import java.sql.*;
import static DayFour.awesome.generated.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;

/**
 * Created by student on 01-Jul-16.
 */
public class Testing {
    Connection conn;
    String username = "root";
    String password = "Password100";
    String url = "jdbc:mysql://localhost:3306/awesome?UseSSL=false";
    Statement statement;
    DSLContext context;


    public void connectToDb() throws Exception{
        //get the driver
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection(url,username,password);

    }

    @Test
    public void retrieveData()throws Exception{

        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection(url,username,password);

        context = DSL.using(conn, SQLDialect.MYSQL);

        //Result<?> result = context.select().from(Games.GAMES.TITLE.getName()).eq("Portal");


        statement = conn.createStatement();
        ResultSet rs;
        rs = statement.executeQuery("SELECT * FROM games where price < 5");

        ResultSetMetaData metaData;
        metaData = rs.getMetaData();

        int columns = metaData.getColumnCount();
        int rows = 0;
        while (rs.next()){
            rows +=1;
        }

        String[][] result = new String[columns][rows];
        rs = statement.executeQuery("SELECT * FROM games where price < 5");

        int curRow = 0;

        while (rs.next()){

            for (int i = 1; i<= columns;i++){
                result[i-1][curRow] = rs.getString(i);
            }
            curRow +=1;
        }

        Assert.assertEquals("Does Not Match",result[1][0],"Portal" );


    }
}
