package semana22.exercicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class AtualizarAluno {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost/a?user=rodrigo&password=&useSSL=true";
        Connection conn = DriverManager.getConnection(url);

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira os dados do aluno desejado para *ATUALIZAR* seus dados: ");
        int id = sc.nextInt();
        sc.nextLine();
        String nome = sc.nextLine();
        String email = sc.nextLine();
        boolean ativo = sc.nextBoolean();
        sc.close();

        String sql = "UPDATE alunos SET id = ?, nome = ?, email = ?, ativo = ? WHERE id = ?;";
        PreparedStatement pstm = conn.prepareStatement(sql);

        pstm.setInt(1, id);
        pstm.setString(2, nome);
        pstm.setString(3, email);
        pstm.setBoolean(4, ativo);
        pstm.executeUpdate();
        pstm.close();
        conn.close();
    }
}
