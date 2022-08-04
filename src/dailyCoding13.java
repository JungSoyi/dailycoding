import java.util.ArrayList;

public class dailyCoding13 {
        public static String readVertically(String[] arr) {
            // TODO:
            // 1. 배열 요소 중 가장 긴 값을 찾는다.
            int maxLength = 0;
            for(int i=0; i<arr.length; i++){
                if(arr[i].length()>maxLength){
                    maxLength = arr[i].length();
                }
            }

            // 2. 새 문자배열 리스트를 만든다. 문자배열의 크기는 1.에서 찾은 값이다.
            ArrayList<char[]> list = new ArrayList<char[]>();



            // 3. 새 리스트에 입력 배열요소를 문자로 변환해서 할당한다.
            for(int i=0; i<arr.length;i++){
                char[] charArr = new char[maxLength];
                for(int j=0; j<maxLength; j++){
                    charArr[j]='0';
                }
                    for(int j=0; j<arr[i].length();j++) {
                        charArr[ j ] = arr[ i ].charAt(j);
                    }
                list.add(charArr);
            }
            // 4. 각 리스트 요소의 순서에 맞게 문자를 문자열로 만든다.
            String str = "";
            for(int i=0; i<maxLength;i++){
                for(int j=0; j<arr.length; j++){
                    str += list.get(j)[i];
                }
            }

            str = str.replaceAll("0","");
            return str;
        }

}
