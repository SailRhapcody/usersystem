package net.dao;

import net.model.ArticleModelClass;
import net.model.FileArticleCreator;

import java.sql.*;
import java.util.Calendar;

/**
 * Created by SailRhapcody on 11/12/2017.
 */
public class DbHandler {
    private Connection con = null;
    private Statement st = null;
    private ResultSet rs = null;

    public DbHandler(){};

    public void putValues(ArticleModelClass articleModel){
        String url = "jdbc:postgresql://localhost:5432/my_article_info";
        String user = "postgres";
        String password = "j6kz0ycrp392";

        try {
            con = DriverManager.getConnection(url, user, password);
            st = con.createStatement();
            java.sql.Date date = new java.sql.Date(Calendar.getInstance().getTime().getTime());
            String s = "INSERT INTO PUBLIC.articles VALUES(DEFAULT, '" + articleModel.getArticleHeaderName() +
                    "','" + articleModel.getArticleThemeTags() + "','" + date + "');";
            rs = st.executeQuery(s);

            if (rs.next()) {
                System.out.println(rs.getString(1));
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
