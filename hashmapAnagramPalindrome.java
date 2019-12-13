import java.util.*;
class palindrome{//}
public static void main(String args[]){//}
String str ="laptoppoplaptop";
HashMap <Character,Integer> map=new HashMap<>();
for(int i=0;i<str.length();i++){
    char c =str.charAt(i);
    if(map.containsKey(c)==false){
        map.put(c,1);
    }
    else{
        map.put(c,map.get(c)+1);
    }
}
int oddCount=0;
for(char s:map.keySet()){
    if(map.get(s)%2!=0){
        oddCount++;
    }
}
if(oddCount<=1){
    System.out.println("Palindrome");
}
else{
    System.out.println("Not a palindrome");
}
}
}









