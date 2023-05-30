package dao;
import com.mysql.cj.jdbc.Driver;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import models.Ad;


public class MySQLAdsDao implements Ads {

      private Connection connection;


    public MySQLAdsDao(Config config) {
            try {
//                DriverManager.registerDriver(new Driver());
                DriverManager.registerDriver(new Driver());
                connection = DriverManager.getConnection(
                        config.getUrl(),
                        config.getUser(),
                        config.getPassword()
                );
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        }



    @Override
    public List<Ad> all() {
        try {
            Statement stmt = connection.createStatement();

            String selectAds = "SELECT * FROM ads";
            ResultSet rs = stmt.executeQuery(selectAds);
            List<Ad> allAds = new ArrayList<>();
            while (rs.next()) {
                allAds.add(new Ad(rs.getLong("id"), rs.getLong("user_id"), rs.getString("title"), rs.getString("description")));
            }
            return allAds;
        } catch (SQLException e) {
            throw new RuntimeException("Error creating statment");
        }
    }

    @Override
    public long insertAd(Ad ad) {
        try {
            Statement stm = connection.createStatement();
            String insertQuery = String.format("INSERT INTO ads (user_id, title, description) VALUES('%s','%s','%s')", ad.getUserId(), ad.getTitle(), ad.getDescription());
            stm.executeUpdate(insertQuery, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = stm.getGeneratedKeys();

            if (rs.next()) {
                System.out.println("New models.Ad inserted");
            }
            return rs.getLong(1);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Error adding ad to the database");

        }
    }
}
