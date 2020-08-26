package memento;

public class ArticleMemento
{
    private String title;
    private String contents;
    private String imgs;

    public ArticleMemento( String title, String contents, String imgs )
    {
        this.title = title;
        this.contents = contents;
        this.imgs = imgs;
    }

    public String getTitle()
    {
        return title;
    }

    public String getContents()
    {
        return contents;
    }

    public String getImgs()
    {
        return imgs;
    }

    @Override
    public String toString()
    {
        return "ArticleMemento{" +
            "title='" + title + '\'' +
            ", contents='" + contents + '\'' +
            ", imgs='" + imgs + '\'' +
            '}';
    }
}
