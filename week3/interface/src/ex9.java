interface Searchable {
    void search(String keyword);
}

class Document implements Searchable {
    private String content;

    Document(String content) {
        this.content = content;
    }

    public void search(String keyword) {
        if (content.contains(keyword)) {
            System.out.println("Keyword '" + keyword + "' found in Document");
        } else {
            System.out.println("Keyword '" + keyword + "' NOT found in Document");
        }
    }
}

class WebPage implements Searchable {
    private String content;

    WebPage(String content) {
        this.content = content;
    }

    public void search(String keyword) {
        if (content.contains(keyword)) {
            System.out.println("Keyword '" + keyword + "' found in WebPage");
        } else {
            System.out.println("Keyword '" + keyword + "' NOT found in WebPage");
        }
    }
}

public class ex9 {
    public static void main(String[] args) {
        Searchable doc = new Document("This is a sample document about Java programming.");
        Searchable page = new WebPage("Welcome to the Java tutorial webpage.");

        doc.search("Java");
        doc.search("Python");

        page.search("Java");
        page.search("Python");
    }
}
