import java.util.Stack;

public class BrowserHistoryManager {
    public static void main(String[] args) {
        Stack<String> history = new Stack<>();

        history.push("google.com");
        history.push("facebook.com");
        history.push("youtube.com");

        System.out.println("History after adding websites: " + history);

        String lastVisited = history.peek();
        System.out.println("Last  visited website: " + lastVisited);

        String backToSite = history.pop();
        System.out.println("Went back from: " + backToSite);

        System.out.println("History after going back: " + history);

    }
}
