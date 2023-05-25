package dao;

import javax.servlet.jsp.jstl.core.Config;

public class DaoFactory {
    private static Ads adsDao;
    private static Ads usersDao;

    public static Ads getAdsDao() {
        if (adsDao == null) {
            adsDao = new MySQLAdsDao(new Config());
        }
        return adsDao;
    }

    public static Ads getUserDao() {
        if (usersDao == null) {
            usersDao = new MySQLUserDao(new Config());
        }
        return usersDao;
    }








}
