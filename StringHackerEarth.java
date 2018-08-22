/*
You are given a String  of size , consisting of lowercase English characters. 
Now, you need to select a single English lowercase alphabet, and delete all occurences of it 
from the given string 
Considering you do the mentioned exactly once over the given string,
what is the minimum possible length of the resultant string ?

Input Format :

The first line contains a single integer N. The next line contains a String  of length  
consisting of lowercase Englsh characters.

Output Format :

Print the required answer on a single line

Constraints :

Note that the Expected Output feature of Custom Invocation is not supported for this contest. 

SAMPLE INPUT 
5
aaaaa
SAMPLE OUTPUT 
0
Explanation
We can delete all occurences of the letter  to get a resultant string of length .
 */

package codingpractice;


import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception {
       
        //Scanner
        Scanner in = new Scanner(System.in);
       
        //Taking length of the String
        int n = in.nextInt();
        String s = in.next();                 
        
        // Using HashMap data structure to store the number of occurences of each character
        // in the String
        HashMap<Character,Integer> hm = new HashMap<>();
        
        //Converting String into char Array.
        char cc[] = s.toCharArray();
        
        /*
        * This is used for storing each character in the HashMap
        * If HashMap already contains that character, then just
        * get the value of it from HashMap and increase it by 1 
        * and then again put it back into HashMap
        * Else --> Add it with count 1
        */
        
        for(char c : cc){
            
            if(hm.containsKey(c)){
            hm.put(c,  hm.get(c) + 1);   
            }
            
            else{
                hm.put(c,1);
            }
            
        }
        
        /*
        My Logic ---> If we just find out the Maximum occurence character in this string,
                      Then we can just delete that character and get the minimun 
                      length of the String.
        */
        
        int max = hm.get(cc[0]);
        
        //Finding maximum occurences of the character
        for (Character key: hm.keySet()) {
            
    if(max < hm.get(key)){
        max = hm.get(key);
    }

   }
        //Therefore, minimum length would be
        // total length of string - Maximum occurred character count
        System.out.println(n-max);
       
    }
}
