package semana22.exercicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeletarAluno {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost/a?user=rodrigo&password=&useSSL=true";
        Connection conn = DriverManager.getConnection(url);

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o ID do aluno desejado para *DELETAR* seus dados: ");
        int id = sc.nextInt();
        sc.close();

        String sql = "DELETE FROM alunos WHERE ID = ?;";
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, id);
        pstm.close();
        conn.close();
    }
}
