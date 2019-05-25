 

public class TriangleUtilities {
/*n the class, Triangles Write a method that returns a String representation of
 * a row of asterisks whose length is equal to the width specified.
 */ 
    public static String getRow(int numberOfStars) {
        String str = "";
        for(int i = 0; i < numberOfStars; i++) {
        str = str + "*";
        }
    return str;
    }
    
    public static String getTriangle(int numberOfRows) {
      String str = "";
        for(int i = 1; i <=numberOfRows; i++) {
           
            for(int j = 1; j <=i; j++) {
        
                str = str + "*";
                
            }
            str = str + "\n";
        }
    
        return str;
    }
     
    public static String getSmallTriangle() {
        String str = "";
        for(int i = 1; i <=4; i++) {
           
            for(int j = 1; j <=i; j++) {
        
                str = str + "*";
                
            }
            str = str + "\n";
        }
    
        return str;

     
    } 
    public static String getLargeTriangle() {
        String str = "";
        for(int i = 1; i <=9; i++) {
           
            for(int j = 1; j <=i; j++) {
        
                str = str + "*";
                
            }
        str = str + "\n";
    }
    
    return str;
}
}
