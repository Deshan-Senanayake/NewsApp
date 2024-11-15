package classes;

import java.util.List;

public class Article {
    private String articleID;
    private String title;
    private String content;
    private String category;

    public Article(String articleID, String title, String content, String category) {
        this.articleID = articleID;
        this.title = title;
        this.content = content;
        this.category = category;
    }
    // Getters
    public String getArticleID() {
        return articleID;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getCategory() {
        return category;
    }

}
