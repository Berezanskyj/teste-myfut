import DAO.ConnectionDAO;

import java.util.Scanner;
// DBLIST.DBCONNECTION = LISTA TODOS OS DADOS DA TABELA JOGADOR
// ResultSet resultSet = statement.executeQuery("select * from jogador");
// a variavel resultSet pode ser REATRIBUIDA com outro comando SQL

public class Main {
    public static void main(String[] args) {
        ConnectionDAO dblist = new ConnectionDAO();
        PlayerRegister Register = new PlayerRegister();
        Scanner ent = new Scanner(System.in);
        String question;

        System.out.println("""
                Escolha uma opção:\s
                 1 - Registrar.
                 2 - Listar dados.""");

        int choose = ent.nextInt();

        switch (choose) {
            case 1:
                Register.register();
                break;

            case 2:
                ;
        }





    }
}