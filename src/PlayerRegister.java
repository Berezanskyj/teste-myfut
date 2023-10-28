import java.util.Scanner;


public class PlayerRegister {
    public void register() {
        DbConnection dblist = new DbConnection();
        Scanner ent = new Scanner(System.in);
        // idjogador, nome , cpf , pos_preferencia , idade , tel_jogador
        Integer id = null;
        String name;
        String cpf;
        String pos_preferencia;
        int age;
        String phone_number;

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

        dblist.SqlInsert(id, name, cpf, pos_preferencia, age, phone_number);




    }
}
