import java.util.Scanner;
// DBLIST.DBCONNECTION = LISTA TODOS OS DADOS DA TABELA JOGADOR
// ResultSet resultSet = statement.executeQuery("select * from jogador");
// a variavel resultSet pode ser REATRIBUIDA com outro comando SQL

public class Main {
    public static void main(String[] args) {
        DbConnection dblist = new DbConnection();
        PlayerRegister Register = new PlayerRegister();
//        Scanner ent = new Scanner(System.in);
//        UserRegister userRegister = new UserRegister();

//        dblist.SqlInsert(null, "Ney", "4", "Falso 9", 27, "0800");
        dblist.SqlConnection();

//        Register.register();

    }
}