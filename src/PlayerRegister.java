import DAO.ConnectionDAO;

import java.util.Scanner;


public class PlayerRegister {
    public void register() {
        ConnectionDAO dblist = new ConnectionDAO();
        Scanner ent = new Scanner(System.in);
        // idjogador, nome, cpf, pos_preferencia, idade, tel_jogador
        String name;
        String cpf;
        String pos_preferencia;
        int age;
        String phone_number;
        String usuario;
        String senha;

        try {
            System.out.println("Digite seu nome: ");
            name = ent.next();

            System.out.println("Digite seu CPF: ");
            cpf = ent.next();

            System.out.println("Digite sua posição de preferencia: ");
            pos_preferencia = ent.next();

            System.out.println("Digite sua idade: ");
            age = ent.nextInt();

            System.out.println("Digite seu numero de telefone: ");
            phone_number = ent.next();

            System.out.println("Digite seu usuario: ");
            usuario = ent.next();

            System.out.println("Digite sua senha: ");
            senha = ent.next();

            dblist.SqlInsert(null, name, cpf, pos_preferencia, age, phone_number, usuario, senha);
            System.out.println("Registro feito com sucesso!");
        } catch (Exception e) {
            System.out.println("Ocorreu um erro durante o registro :( \n" + e);


        }
    }
}
