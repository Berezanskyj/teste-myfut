public class testa {
    public static void main(String[] args) {
        int id = 1;
        String name = "Joao";
        String cpf = "12";
        String pos_preferencia = "Meia";
        int age = 12;
        String phone_number = "12";
        System.out.println("insert into jogador (idjogador, nome , cpf , pos_preferencia , idade , tel_jogador) values"
                + "("+ id + ","
                + "'" + name + "'" + ","
                + "'" + cpf + "'" + ","
                + "'" + pos_preferencia + "'" + ","
                + age + "," +
                "'" + phone_number + "'" + ")");
    }
}
