import java.util.Scanner;

public class Article {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(",");
        String title = input[0];
        String content = input[1];
        String author = input[2];

       Articles articles = new Articles(title,content, author);

       int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
         String[] commands = scanner.nextLine().split(": ");
         String command = commands[0];

         switch (command){
             case "Edit":
                 articles.editContent(commands[1]);
                 break;
             case "ChangeAuthor":
                 articles.changeAuthor(commands[1]);
                 break;
             case "Rename":
                 articles.renameTitle(commands[1]);
                 break;

         }

        }
        System.out.println(articles.toString());

    }
    static class Articles {

        String title;
        String content;
        String author;

        public Articles(String title, String content, String author) {
            this.title = title;

            this.content = content;

            this.author = author;
        }

        public String getTitle() {

            return title;
        }

        public String getContent() {
            return content;
        }

        public String getAuthor() {
            return author;
        }

        public void renameTitle(String title) {
            this.title = title;
        }

        public void editContent(String content) {
            this.content = content;
        }

        public void changeAuthor(String author) {
            this.author = author;
        }
        public String toString (){
            return String.format("%s - %s: %s",getTitle(),getContent(),getAuthor());
        }
    }
}
