package ch05.sec03;

public class ReferenceVariableCompareExample {
    public static void main(String[] args) {


        int[] arr1; //배열 변수 arr1 선언
        int[] arr2; //배열 변수 arr2 선언
        int[] arr3; //배열 변수 arr3 선언
        arr1 = new int[] { 1, 2, 3 }; //배열 { 1, 2, 3 }을 생성하고 arr1 변수에 대입
        arr2 = new int[] { 1, 2, 3 }; //배열 { 1, 2, 3 }을 생성하고 arr2 변수에 대입
        arr3 = arr2; //배열 변수 arr2의 값을 배열 변수 arr3에 대입

        // 예상: arr1와 arr2는 각자 다른 참조값을 가지고 있고
        // arr3은 arr2를 얕은 복사했기 때문에 참조 값이 동일
        // 따라서 첫 번째 출력은 false 두 번째 출력은 true
        // 결과 => 동일
        System.out.println(arr1 == arr2); // arr1과 arr2 변수가 같은 배열을 참조하는지 검사
        System.out.println(arr2 == arr3); // arr2와 arr3 변수가 같은 배열을 참조하는지 검사
    }
}