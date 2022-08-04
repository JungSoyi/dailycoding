public class dailyCoding12 {
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
