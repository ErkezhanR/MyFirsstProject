import java.util.regex.Pattern;

public class Main12 {

    public boolean containNumbersOnly(String source){
        boolean result = false;
        Pattern pattern = Pattern.compile("[0-9]+.[0-9]+"); //correct pattern for both float and integer.
        pattern = Pattern.compile("\\d+.\\d+"); //correct pattern for both float and integer.

        result = pattern.matcher(source).matches();
        if(result){
            System.out.println("\"" + source + "\""  + " is a number");
        }else
            System.out.println("\"" + source + "\""  + " is a String");
        return result;
    }

    public static void main(String[] args){
        Main12 obj = new Main12();
        obj.containNumbersOnly("123456");
        obj.containNumbersOnly("123a12  ");
    }

}