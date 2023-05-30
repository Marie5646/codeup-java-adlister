package dao;

public class DaoFactory {
    private static Ads adsDao;
    private static Users usersDao;


    public static Ads getAdsDao() {
        if (adsDao == null) {
            adsDao = new MySQLAdsDao(new Config());
        }
        return adsDao;
    }

    public static Users getUserDao() {
        if (usersDao == null) {
            usersDao = new MySQLUserDao(new Config());
        }
        return usersDao;
    }








}
