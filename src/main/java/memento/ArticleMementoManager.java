package memento;

import java.util.Stack;

public class ArticleMementoManager
{
    private final Stack< ArticleMemento > articleMementos = new Stack< ArticleMemento >();

    public ArticleMemento getArticleMemento()
    {
        return articleMementos.pop();
    }

    public void addArticleMemento( ArticleMemento articleMemento )
    {
        articleMementos.push( articleMemento );
    }
}
