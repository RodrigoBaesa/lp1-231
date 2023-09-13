package semana22.exercicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class BuscarAlunoPorNome {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost/a?user=rodrigo&password=&useSSL=true";
        Connection conn = DriverManager.getConnection(url);

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o NOME do aluno desejado: ");
        String nome = sc.nextLine();
        sc.close();

        String sql = "SELECT * FROM alunos WHERE nome = ?;";
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, nome);
        ResultSet rs = pstm.executeQuery(sql);

        while(rs.next()) {
            int id = rs.getInt("id");
            String nomeAluno = rs.getString("nome");
            String email = rs.getString("email");
            boolean ativo = rs.getBoolean("ativo");

            System.out.println("ID: " + id);
            System.out.println("Nome: " + nomeAluno);
            System.out.println("Email: " + email);
            System.out.println("Ativo: " + ativo);
        }

        pstm.close();
        conn.close();
    }
}
