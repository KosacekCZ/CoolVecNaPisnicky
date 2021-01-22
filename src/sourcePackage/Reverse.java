package sourcePackage;

public class Reverse {
    public String reversed = "";
    Reader r = new Reader();

    public void reverse() {
        System.out.println(r.verejnyText);
        int length = r.text.length();
        for (int i = length - 1; i >= 0; i--) {
            reversed += r.text.charAt(i);
        }
    }

}
