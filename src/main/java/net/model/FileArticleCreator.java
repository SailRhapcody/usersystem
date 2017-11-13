package net.model;

import java.io.*;

/**
 * Created by SailRhapcody on 11/12/2017.
 */
public class FileArticleCreator {
    private ArticleModelClass articleModelClass;
    private OutputStream outStream = null;
    private BufferedOutputStream bis = null;

    public FileArticleCreator(ArticleModelClass model){
        this.articleModelClass = model;
    }

    public boolean writeArticle() {
        String article_content = articleModelClass.getArticleContainer();
        String file_name = articleModelClass.getArticleHeaderName();
        try {
            outStream = new FileOutputStream("src/main/webapp/resources/articles/" + file_name + ".txt", false);
            bis = new BufferedOutputStream(outStream);
            for (Character c : article_content.toCharArray()) {
                bis.write(c);
            }
            bis.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
