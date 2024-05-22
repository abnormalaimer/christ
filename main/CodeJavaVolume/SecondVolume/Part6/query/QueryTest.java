package CodeJavaVolume.SecondVolume.Part6.query;

public class QueryTest {
    private static final String allQuery="SELECT Books.Price,Books.Title FROM Books";
    private static final String authorPublisherQuery="SELECT Books.Price,Books.Title"
            +"FROM Books,BooksAuthors,Authors,Publishers"
            +"WHERE Books.Author=Authors.ID AND Books.Publisher=Publishers.ID";
    public static void main(String[] args) {

    }
}
