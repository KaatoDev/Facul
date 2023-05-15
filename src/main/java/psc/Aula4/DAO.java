package psc.Aula4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DAO {
    public boolean exist(Usuario usuario) throws Exception {
        String sql = "select nome, senha from tb_users where nome=? and senha=?";
        try(Connection c = ConnectionF.getConnection();
            PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getSenha());
            try(ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }
        }
    }
    public Curso[] getCu() throws Exception {
        String sql = "select * from tb_cursos";
        try(Connection c = ConnectionF.getConnection();
            PreparedStatement ps = c.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = ps.executeQuery()) {
            int total = rs.last() ? rs.getRow() : 0;
            Curso[] cursos = new Curso[total];
            rs.beforeFirst();
            int i=0;
            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome"), tipo = rs.getString("tipo");
                cursos[i++] = new Curso(id, nome, tipo);
            }
            return cursos;
        }
    }
}
