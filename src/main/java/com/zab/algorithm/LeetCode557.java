package com.zab.algorithm;

public class LeetCode557 {

    public String reverseWords(String s) {
        int i = 0, j = i + 1;
        char[] ch = s.toCharArray();
        int length = s.length();
        while (j <= length) {
            if (j == length||ch[j]==' '){
                for(int k = i; k<(i+j)/2;k++){
                    char t =ch[k];
                    ch[k] = ch[j+i-k-1];
                    ch[j+i-k-1] = t;
                }
                i = j+1;
                j = i+1;
            }else{
                j++;
            }
        }
        return new String(ch);
    }

}
