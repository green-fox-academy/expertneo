public class string02 {
    public static void main(String[] args) {
        String url = "https//www.reddit.com/r/nevertellmethebots";

        // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
        // Also, the URL is missing a crutial component, find out what it is and insert it too!
        // Try to solve it more than once using different String functions!

        String url2 = url.replace("bots", "odds");
        System.out.println(url2 + ".html");
        String url3= "";

        if (url.contains("bots")){
            url3 = url.replace("bots", "odds") + ".html";
        }
        System.out.println(url3);
    }
}
