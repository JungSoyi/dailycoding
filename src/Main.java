import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] values = {1,2,3};
        int[] output = Solution.reverseArr(values);
        System.out.println(Arrays.toString(output));
    }
}

class Solution {
    static int[] reverseArr(int[] arr){

        // 1. 탈출조건

        // 2. 입력 array의 0과 length-1 인덱스를 서로 바꾼다.
        // 3. 결과 array에 입력 array의 length-1 과 (결과 array의 length-1) - (입력 array의 length-1)에 각각 넣는다.
        // 3. array0 과 length-1을 제외한 나머지를 다시 반복한다.
        if(arr.length<=1){
            return arr;
        }

        int tempNum = arr[0];
        arr[0] = arr[arr.length-1];
        arr[arr.length-1] = tempNum;

        int[] copiedArr = new int[arr.length-2];
        System.arraycopy(arr,1, copiedArr  , 0, arr.length-2);
        System.arraycopy(reverseArr(copiedArr),0,arr,1,copiedArr.length);
        return arr;
    }
}

/*
a={1,2,3,4,5,6,7,8,9,10} -> a={10,2,3,4,5,6,7,8,9,1}/ ca={2,3,4,5,6,7,8,9}
                                                                                 a={2,3,4,5,6,7,8,9} -> a={9,3,4,5,6,7,8,2} / ca={3,4,5,6,7,8}
                                                                                                                                                     a={3,4,5,6,7,8} -> a={8,4,5,6,7,3}/ca={4,5,6,7}
                                                                                                                                                                                                           a={4,5,6,7} -> a={7,5,6,4}/ca={5,6}
                                                                                                                                                                                                                                                    a={5,6}->a={6,5}
                                                                                                                                                                                                           a={7,6,5,4} <- a={7,5,6,4} 그니까... 마지막 a를.. 직전 a의 1부터 마지막-1까지 복붙...
                                                                                                                                                                                                           arraycopy(reverseArr(ca),0,a,1,ca.length)
 */