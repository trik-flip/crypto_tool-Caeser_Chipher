public class App {
    public static void main(String[] args) throws Exception {
        App app = new App();
        app.encrypt("abcd", "2");
        app.decrypt("defg", "3");
    }

    private String encrypt(String text, String key) {
        for (char chr : text.toCharArray()) {
            chr += Integer.parseInt(key);
            System.out.print(chr);
        }
        return null;
    }
    private String decrypt(String text, String key){
      char[] textArray = text.toCharArray();
      String retText = "";
      for (int i = 0;i < textArray.length;i++){
        textArray[i] -= Integer.parseInt(key);
        retText += textArray[i];
      }
        System.out.println(retText);
      return retText;
    }
}
