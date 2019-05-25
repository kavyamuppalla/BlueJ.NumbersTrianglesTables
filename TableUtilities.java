 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
       String str = "";
       for(int i = 1; i <= 5; i++) {
           
       for(int j = 1; j <= 5; j++) {
           int n = i*j;
           String number = String.format("%3s",n);
           str = str + number +" |";
        }
        str = str + "\n";
        
        }
        return str;
    }

    public static String getLargeMultiplicationTable() {
        String str = "";
       for(int i = 1; i <= 10; i++) {
           
       for(int j = 1; j <= 10; j++) {
           int n = i*j;
           String number = String.format("%3s",n);
           str = str + number +" |";
        }
        str = str + "\n";
        
        }
        return str;
    }

    public static String getMultiplicationTable(int tableSize) {
       String str = "";
       for(int i = 1; i <= tableSize; i++) {
           
       for(int j = 1; j <= tableSize; j++) {
           int n = i*j;
           String number = String.format("%3s",n);
           str = str + number +" |";
        }
        str = str + "\n";
        
        }
        return str;
    }
}
