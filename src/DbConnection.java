import java.sql.*;
import java.sql.DriverManager;

public class DbConnection {
    public void SqlConnection() {
        String url = "jdbc:mysql://localhost:3306/teste";
        String username = "root";
        String password = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url, username, password);

            Statement statement = connection.createStatement();

            //
            ResultSet resultSet = statement.executeQuery("select * from jogador");

            while (resultSet.next()){
                System.out.println(resultSet.getInt(1) + " " + resultSet.getString( 2)
                + " " + resultSet.getString( 3) + " " + resultSet.getString( 4)
                + " " + resultSet.getInt( 5) + " " + resultSet.getString( 6));

            }



            connection.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public void SqlInsert(Integer id, String name, String cpf, String pos_preferencia, int age, String phone_number ){
        String url = "jdbc:mysql://localhost:3306/teste";
        String username = "root";
        String password = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url, username, password);

            Statement statement = connection.createStatement();

            //
            int insertSet = statement.executeUpdate(
                    "insert into jogador (idjogador, nome , cpf , pos_preferencia , idade , tel_jogador) values"
                            + "("+ id + ","
                            + "'" + name + "'" + ","
                            + "'" + cpf + "'" + ","
                            + "'" + pos_preferencia + "'" + ","
                            + age + "," +
                            "'" + phone_number + "'" + ")"


            );

            connection.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
