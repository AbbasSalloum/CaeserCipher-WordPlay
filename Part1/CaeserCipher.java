import edu.duke.*;
import org.apache.commons.csv.*;

public class CaeserCipher {
    public String encrypt(String input , int key){
    StringBuilder encrypted = new StringBuilder(input);
    String alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String shiftedAlphabet=alphabet.substring(key)+alphabet.substring(0,key);
    for(int i=0; i<encrypted.length() ; i++){
    char currChar=encrypted.charAt(i);
    int idx=alphabet.indexOf(currChar);
    if(idx!=-1){
    char newChar=shiftedAlphabet.charAt(idx);
    encrypted.setCharAt(i,newChar);
    }
    }
    return encrypted.toString();
    }
    public void testCaeser(){
    int key=23;
     FileResource fr = new FileResource();
     String message = fr.asString();
     String encrypted = encrypt(message, key);
     System.out.println("key is " + key + "\n" + encrypted);
    
    
    
    
    }
    
  

}
