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
            StringBuilder sb = new StringBuilder();
            sb.append("Pessoa cadastrada com sucesso!");
            sb.append("\nNome: ").append(nome);
            sb.append("\nFone: ").append(fone);
            sb.append("\nEmail: ").append(email);
            JOptionPane.showMessageDialog(null, sb);
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
            StringBuilder sb = new StringBuilder();
            sb.append("Pessoa[").append(id).append("] atualizada com sucesso!");
            sb.append("\nNovo nome: ").append(nome);
            sb.append("\nNovo fone: ").append(fone);
            sb.append("\nNovo email: ").append(email);
            JOptionPane.showMessageDialog(null, sb);
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
            String[] p = getPessoa(id);
            StringBuilder sb = new StringBuilder();
            sb.append("Pessoa[").append(id).append("] deletada com sucesso!\n");
            sb.append("Novo nome: ").append(p[0]);
            sb.append("\nNovo fone: ").append(p[1]);
            sb.append("\nNovo email: ").append(p[2]);
            JOptionPane.showMessageDialog(null, sb);
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void list() {
        String sql = "select * from tb_pessoa";
        ConnectionFactory factory = new ConnectionFactory();
        try (Connection c = factory.getConnection()) {
            PreparedStatement ps = c.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            StringBuilder sb = new StringBuilder();
            while (rs.next()) {
                int id = rs.getInt("codigo");
                String nome = rs.getString("nome"),
                        fone = rs.getString("fone"),
                        email = rs.getString("email");
                sb.append(String.format("Codigo: %d, Nome: %s, Fone: %s, Email: %s\n", id, nome, fone, email));
            }
            JOptionPane.showMessageDialog(null, sb);
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String[] getPessoa(int id) {
        String sql = "select * from tb_pessoa";
        ConnectionFactory factory = new ConnectionFactory();
        try (Connection c = factory.getConnection()) {
            String[] p = new String[3];
            PreparedStatement ps = c.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            String nome = null, fone = null, email = null;
            while (rs.next())
                if (rs.getInt("codigo") == id) {
                    p[0] = rs.getString("nome");
                    p[1] = rs.getString("fone");
                    p[2] = rs.getString("email");
                }
            ps.execute();
            return p;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public boolean contem(int id) {
        String sql = "select * from tb_pessoa";
        ConnectionFactory factory = new ConnectionFactory();
        try (Connection c = factory.getConnection()) {
            String[] p = new String[3];
            PreparedStatement ps = c.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            String nome = null, fone = null, email = null;
            StringBuilder sb = new StringBuilder();
            while (rs.next())
                if (rs.getInt("codigo") == id)
                    return true;
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
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
