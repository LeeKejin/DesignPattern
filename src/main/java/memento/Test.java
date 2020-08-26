package memento;

public class Test
{
    public static void main( String[] args )
    {
        ArticleMementoManager manager = new ArticleMementoManager();

        Article article = new Article();
        article.setTitle( "Title1" );
        article.setContents( "Contents1" );
        article.setImgs( "Images1" );
        ArticleMemento memento = article.saveToArticleMemento();
        manager.addArticleMemento( memento );

        System.out.println( "Before: " + article );

        article.setTitle( "Title2" );
        article.setContents( "Contents2" );
        article.setImgs( "Images2" );
        memento = article.saveToArticleMemento();
        manager.addArticleMemento( memento );

        article.setTitle( "Title3" );
        article.setContents( "Contents3" );
        article.setImgs( "Images3" );
        memento = article.saveToArticleMemento();
        manager.addArticleMemento( memento );

        article.undoArticleMemento( manager.getArticleMemento() );
        System.out.println( "POP 1: " + article );

        article.undoArticleMemento( manager.getArticleMemento() );
        System.out.println( "POP 2: " + article );

        article.undoArticleMemento( manager.getArticleMemento() );
        System.out.println( "POP 3: " + article );
    }
}
