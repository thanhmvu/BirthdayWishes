import java.io.IOException;

public class BirthdayWish{
    
    static int level = 6;
    static boolean isActive = false;
    static boolean missingDecodeMethod = true;
    
    public static void main(String []args){
        if(isActive){
            try{
                Process p = Runtime.getRuntime().exec( "say Happy belated Birthday" );
            } catch(IOException e){
                System.out.println("Can't execute command line!");
            }
            
            System.out.println(b_message());
        }else{
            System.out.println("[WARNING: You may need to activate the class and implement some missing code!]");
        }
    }
    
    public static String b_message (){
        String message = "";
        
        if(!missingDecodeMethod){
            // insert opening
            message += "\n\n#========================#\n# ";
            message += "Happy belated Birthday #\n# ";
            message += "     to Huyyyy !!!     #\n# ";
            message += "                       #\n# ";

            
            // insert wishes
            String partA = "In{iy uutm ";
            String partB = "z{uuox";
            String wish1 = "sgtnp qnukx";
            String wish2 = "sg sg}ty";
            String wish3 = "zngtnl iuutm";
            int b_age = 10100;
            
            String wishes = " " + decode(partA) + btd(b_age) + " " + decode(partB) + "  #\n# ";
            wishes += "                       #\n# ";
            wishes += "#---  " + decode(wish1) + " ---# #\n# ";
            wishes += "#---   " + decode(wish2) + "  ---# #\n# ";
            wishes += "#--- " + decode(wish3) + " ---# #\n#";
            wishes += "                        #\n";
            
            message += wishes;
            
            // insert ending
            message += "#========================#\n\n";
        }else{
            System.out.println("[WARNING: decode method not found!]");
        }
        
        return message;
    }
    
    public static int btd(int b_num){
        String b_string = "" + b_num;
        return Integer.parseInt(b_string,2);
    }
    
    public static String encode(String input){
        char[] arr = input.toCharArray();
        String output = "";
        for(int i = 0; i < arr.length; i++){
            char x = arr[i];
            if(x != ' '){
                x = (char)((int)arr[i] + level);
            }
            output += x;
        }
        return output;
    }
    
    //////////////////////////////////////////////////////
    /// this method needs to be implemented
    /// then set missingDecodeMethod variable to false
    //////////////////////////////////////////////////////
    public static String decode(String input){
//        missingDecodeMethod = false;
        return "{the-code-for-this-is-missing}";
    }
    
    public static boolean activate(){
        isActive = true;
        return isActive;
    }
}