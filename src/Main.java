public class Main {

    public static void main(String[] args) {
        String outputString = "";
        for (int i = 0; i<args.length; i++) {
            outputString += args[i];
        }
        System.out.println(outputString);
    }
}
