
/**
 * Write a description of Part1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WordPlay {
    public boolean isVowel(char ch){
     ch=Character.toLowerCase(ch);
     if(ch == 'a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
        return true;
        else return false;
        
     
        
    }
    
    public void testIsVowel(){
    char str='f';
    boolean result=isVowel(str);
    System.out.println(result);
    }
    public StringBuilder replaceVowels(StringBuilder phrase, char ch){
    for(int i=0 ; i<phrase.length() ; i++){
    char str=phrase.charAt(i);
    if(isVowel(str)){
     phrase.setCharAt(i,ch);
    }
    }
    return phrase;
    }
    public void testReplaceVowels(){
    StringBuilder phrase= new StringBuilder("apple");
    StringBuilder result=replaceVowels(phrase,'*');
    System.out.println(result);
    }
    public StringBuilder emphasize(StringBuilder phrase, char ch){
    int i=0;
    for(i=0; i<phrase.length(); i++){
        
        char str=phrase.charAt(i);
    if(str==ch){
         if(i%2==0)
          phrase.setCharAt(i,'*');
         else phrase.setCharAt(i,'+');
      }
    }
    return phrase;

    
  }
  public void testemphasize(){
    StringBuilder phrase= new StringBuilder("Mary Bella Abracadabra");
    StringBuilder result=emphasize(phrase,'a');
    System.out.println(result);
    }
}
