package exception;

public class ExceptionApiDemo {
    public static void main(String[] args) {
        System.out.println("PGM is start!");

        try{
            String line = "abc";
            System.out.println(Integer.parseInt(line));
        }catch(NumberFormatException e){
            System.out.println("something is wrong!");
            e.printStackTrace();
            System.out.println(e.getMessage());
        }


        System.out.println("PGM is end!");
    }
}
