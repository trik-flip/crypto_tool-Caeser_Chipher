public class App {
    public static void main(String[] args) throws Exception {
        App app = new App();
        app.encrypt("abcd", "2");
    }

    private String encrypt(String text, String key) {
        for (char chr : text.toCharArray()) {
            chr += Integer.parseInt(key);
            System.out.print(chr);
        }
        return null;
    }
}
