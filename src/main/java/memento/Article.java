package memento;

public class Article
{
    private String title;
    private String contents;
    private String imgs;

    public String getTitle()
    {
        return title;
    }

    public void setTitle( String title )
    {
        this.title = title;
    }

    public String getContents()
    {
        return contents;
    }

    public void setContents( String contents )
    {
        this.contents = contents;
    }

    public String getImgs()
    {
        return imgs;
    }

    public void setImgs( String imgs )
    {
        this.imgs = imgs;
    }

    @Override
    public String toString()
    {
        return "Article{" +
            "title='" + title + '\'' +
            ", contents='" + contents + '\'' +
            ", imgs='" + imgs + '\'' +
            '}';
    }

    public ArticleMemento saveToArticleMemento()
    {
        ArticleMemento articleMemento = new ArticleMemento( title, contents, imgs );
        return articleMemento;
    }

    public void undoArticleMemento( ArticleMemento articleMemento )
    {
        this.title = articleMemento.getTitle();
        this.contents = articleMemento.getContents();
        this.imgs = articleMemento.getImgs();
    }
}
