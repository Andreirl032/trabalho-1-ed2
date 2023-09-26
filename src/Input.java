import java.util.Scanner;

public class Input {
    static Scanner input = new Scanner( System.in );

    public static int readInteger(  ){
        while ( true ){
            if ( input.hasNextInt() ){
                return input.nextInt();
            }
            System.err.println( "Invalid value: " + input.nextLine() );
        }
    }

    public static String readString(  ){
        return input.nextLine();
    }

    public static float readFloat(  ){
        while (true){
            if ( input.hasNextFloat() ){
                return input.nextFloat();
            }
            System.err.println( "Invalid value: " + input.nextLine() );
        }
    }

    public static long readLong(  ){
        while (true){
            if ( input.hasNextLong() ){
                return input.nextLong();
            }
            System.err.println( "Invalid value: " + input.nextLine() );
        }
    }
}
