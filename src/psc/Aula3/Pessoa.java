package psc.Aula3;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Pessoa {
    private int id;
    private String nome, fone, email;

    public void put() {
        String sql = "insert into tb_pessoa(nome, fone, email) values(?,?,?)";
        ConnectionFactory factory = new ConnectionFactory();
        try (Connection c = factory.getConnection()) {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, nome);
            ps.setString(2, fone);
            ps.setString(3, email);
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update() {
        String sql = "update tb_pessoa set nome = ?, fone = ?, email = ? where codigo = ?";
        ConnectionFactory factory = new ConnectionFactory();
        try (Connection c = factory.getConnection()) {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, nome);
            ps.setString(2, fone);
            ps.setString(3, email);
            ps.setInt(4, id);
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete() {
        String sql = "delete from tb_pessoa where codigo = ?";
        ConnectionFactory factory = new ConnectionFactory();
        try (Connection c = factory.getConnection()) {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void list() {
        String sql = "delete from tb_pessoa where codigo = ?";
        ConnectionFactory factory = new ConnectionFactory();
        try (Connection c = factory.getConnection()) {
            PreparedStatement ps = c.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("codigo");
                String nome = rs.getString("nome"),
                        fone = rs.getString("fone"),
                        email = rs.getString("email"),
                        aux = String.format("Código: %d, Nome: %s, Fone: %s, Email: %s", id, nome, fone, email);
                JOptionPane.showMessageDialog(null, aux);
            }
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
