package dao;

import models.Ad;

import java.sql.SQLException;
import java.util.List;

public interface Ads {
    List<Ad> all() throws SQLException;

    Long insertAd(Ad ad);

}
