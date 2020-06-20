public class App {
    public static void main(String[] args) throws Exception {
        App app = new App();
        app.decrypt("defg", "3");
        app.encrypt("ABCabcXYZxyz", "2");
    }

    private String encrypt(String text, String key) {
        char[] cs = text.toCharArray();
        for (int i = 0; i < cs.length; i++) {

            cs[i] += Integer.parseInt(key);
            if (cs[i] > 'z') {
                cs[i] -= 26;
            }
            else if (cs[i] > 'Z'&&(cs[i]-2)<'a'){
                     cs[i] -= 26;   
            }
        }

        System.out.println(cs);
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
