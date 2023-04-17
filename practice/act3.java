package practice;

import static practice.act1.*;

public class act3 {
    public static void main(String[] args) {
        System.out.println(biggest(6,5,4));
        String s = new String("Hardships often prepare ordinary people for an extraordinary destiny");

    }
    public static int biggest(int a,int b,int c){

        int big = 0;
        if ( a > b ){
            big = (a > c) ? a : b;
        }
        else{
            big = ( b > c) ? b : c;
        }
        return big;
    }
    public static String big_word(String s){
        String[] words = s.split(" ");
        String big = words[0],small = words[0];
        for(int i = 0; i < words.length; i++){
            if (countChars(big) < countChars(words[i])){
                big = words[i];
            }
            else if (countChars(small) > countChars(words[i])){
                small = words[i];
            }
        }
        return big;
    }
}
