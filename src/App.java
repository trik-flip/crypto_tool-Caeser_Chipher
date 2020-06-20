public class App {
    public static void main(String[] args) throws Exception {
        App app = new App();
        app.encrypt("abcd", "2");
    }

    private void encrypt(String text, String key) {
        for (char chr : text.toCharArray()) {
            
        }
        System.out.println(text + key);
    }
}
