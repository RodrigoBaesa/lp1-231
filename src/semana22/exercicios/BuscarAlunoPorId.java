package semana22.exercicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class BuscarAlunoPorId {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost/a?user=rodrigo&password=&useSSL=true";
        Connection conn = DriverManager.getConnection(url);

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o ID do aluno desejado: ");
        int id = sc.nextInt();
        sc.close();

        String sql = "SELECT * FROM alunos WHERE id = ?;";
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, id);
        ResultSet rs = pstm.executeQuery(sql);

        while(rs.next()) {
            int idAluno = rs.getInt("id");
            String nome = rs.getString("nome");
            String email = rs.getString("email");
            boolean ativo = rs.getBoolean("ativo");

            System.out.println("ID: " + idAluno);
            System.out.println("Nome: " + nome);
            System.out.println("Email: " + email);
            System.out.println("Ativo: " + ativo);
        }

        pstm.close();
        conn.close();
    }

}