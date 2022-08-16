import java.util.*;
public class Main {
    public static void main(String[] args) {

        int output = Solution.numberSearch("Hello6 ");
        System.out.println(output);

    }
}

 class Solution {
    public static int numberSearch(String str) {
        // TODO:
        if(str.length()==0){ // 빈 문자열은 0을 리턴한다.
            return 0;
        }

        str = str.replaceAll(" ",""); // 문자열의 공백 제거
        int strLength = str.length(); // 초기 문자열의 길이
        double sum = 0;	// 문자열에 포함된 숫자의 합
        double charLength = 0; // 문자열에 포함된 숫자와 공백을 제외 한 문자열의 길이

        // 문자열을 문자 배열로 변환
        Character[] charArr = new Character[strLength];

        for(int i=0; i<strLength;i++){
            charArr[i] = str.charAt(i);
            if(Character.isDigit(charArr[i])){
                sum = sum + Character.getNumericValue(charArr[i]);
            } else{
                charLength+=1.0;
            }
        }
        return (int)Math.round(sum/charLength);

    }
}