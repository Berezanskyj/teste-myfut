import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class testa {
    public static void main(String[] args) {
            Scanner ent = new Scanner(System.in);
            String url = "jdbc:mysql://localhost:3306/teste";
            String username = "root";
            String password = "";
            String usuario;
            String senha;





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
    }

