package net.model;

/**
 * Created by SailRhapcody on 11/12/2017.
 */

public class ArticleModelClass {

    private String articleHeaderName;
    private String articleContainer;
    private String articleThemeTags;
    public ArticleModelClass(){} //default constructor

    public String getArticleHeaderName() {
        return articleHeaderName;
    }

    public void setArticleHeaderName(String articleHeaderName) {
        this.articleHeaderName = articleHeaderName;
    }

    public String getArticleThemeTags() {
        return articleThemeTags;
    }

    public void setArticleThemeTags(String articleThemeTags) {
        this.articleThemeTags = articleThemeTags;
    }

    public String getArticleContainer() {
        return articleContainer;
    }

    public void setArticleContainer(String articleContainer) {
        this.articleContainer = articleContainer;
    }


    //getter and setter for name
}