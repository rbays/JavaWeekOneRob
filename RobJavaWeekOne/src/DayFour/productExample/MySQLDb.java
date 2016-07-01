package DayFour.productExample;

import java.sql.*;
import static DayFour.productExample.ProductGeneration.*;
import static DayFour.productExample.ProductGUI.*;

/**
 * Created by student on 30-Jun-16.
 */
public class MySQLDb {
    Connection conn;
    Statement stt;
    ResultSet rs = null;


    MySQLDb(Connection connection) {
        this.conn = connection;
    }

    private void createTables(Statement statement) throws SQLException{
        statement.executeUpdate("CREATE TABLE Games (" +
                "Id INTEGER Not NULL AUTO_INCREMENT,"+
                "title VARCHAR(40),"+
                "genre VARCHAR(40),"+
                "dev VARCHAR(40),"+
                "price DOUBLE NOT NULL,"+
                "PRIMARY KEY (Id))");
    }

    private void createGame() throws SQLException{

        for(Game g : games) {
            PreparedStatement statement = conn.prepareStatement("INSERT INTO " +
                    "Games (title,genre,dev,price)" +
                    "VALUES (?,?,?,?)");
            statement.setString(1, g.getTitle());
            statement.setString(2,g.getGenre());
            statement.setString(3,g.getDev());
            statement.setDouble(4,g.getPrice());

            statement.executeUpdate();
            statement.close();
        }

    }
    public void createDatabaseTable()throws SQLException{
        Statement statement = conn.createStatement();
        createTables(statement);
        statement.close();
        createGame();
    }

}
