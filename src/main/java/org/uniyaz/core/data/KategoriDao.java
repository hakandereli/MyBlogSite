package org.uniyaz.core.data;

import org.uniyaz.core.domain.Kategori;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author HAKAN DERELİ
 * @since 5.xxx.x
 */
public class KategoriDao {
    Connection connection = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    Statement st = null;

    public void addKategori(Kategori kategori) {
        try {
            connection = DatabaseConnection.getConnection();
            String sql = "INSERT INTO testuniversal.kategori (ad) VALUES (?)";
            ps = connection.prepareStatement(sql);
            ps.setString(1, kategori.getAdi());
            ps.executeUpdate();

        } catch (SQLException hata) {
            throw new RuntimeException(hata);
        } catch (ClassNotFoundException hata) {
            throw new RuntimeException(hata);
        }finally {
            DatabaseConnection.closeConnection(connection);
        }
    }

    public List<Kategori> kategoriListing() {
        List<Kategori> kategoriList = new ArrayList<Kategori>();
        try {
            connection = DatabaseConnection.getConnection();
            String sql = "SELECT * FROM testuniversal.kategori";
            st = connection.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                kategoriList.add(new Kategori(
                        rs.getInt("id"),
                        rs.getString("ad")
                ));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            DatabaseConnection.closeConnection(connection);
        }

        return kategoriList;
    }

    public void deleteKategori(Kategori kategori) {
        try {
            connection = DatabaseConnection.getConnection();
            ps = connection.prepareStatement("DELETE FROM testuniversal.kategori WHERE (id=?);");
            String deleteKategoriItemId=String.valueOf(kategori.getId());
            ps.setString(1, deleteKategoriItemId);
            ps.executeUpdate();
        } catch (SQLException | ClassNotFoundException | NullPointerException hata) {
            throw new RuntimeException(hata);
        }finally {
            DatabaseConnection.closeConnection(connection);
        }
    }
}
