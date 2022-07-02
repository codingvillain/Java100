import java.util.Arrays;
import java.util.Scanner;

public class Array {

    public static void main(String[] args){

    /*
    1. 배열의 용도와 배열을 선언하는 방법에 대해서 작성해보시오.
       아래 코드에서 배열의 생성이 틀린 것을 찾아보시오.
       이 문제는 배열의 개념과 역할 그리고 배열을 사용하기 위해 선언하는 방법에 대해서 아는지를 묻는 문제이다.
    * */
    int[] sales_table = new int[100];
    int sales_table2[] = new int[100];
    int[] sales_table3;
    sales_table3 = new int[100];


    /*
    배열이란?
    - 자동차 판매 회사에서 영업사원의 판매 실적을 저장한다고 할 때 배열이 없으면 변수를 사용하여 저장할 것이다.
    - 영업사원이 10명 정도라면 모르겠지만, 100명이 넘는다면 변수를 일일이 선언하고 영업사원의 판매실적을 저장하는 것이 상당히 번거롭다.
    - 그러나 배열을 이용하면 일일이 변수를 선언할 필요없이 한방에 선언이 되고, 초기화 값도 한방에 셋팅해준다.
    - 즉, 배열은 동일한 데이터 파입의 값들을 하나의 배열명으로 저장시킬 수 있는 아주 편리한 자료구조이다.

    배열의 선언
    - 데이터타입[] 배열명 = new 데이터타입[배열크기];
    - 데이터타입 배열명[] = new 데이터타입[배열크기];

    배열의 선언 -> 배열의 크기 지정 -> 배열 공간의 값은 자동으로 초기화 세팅됨(정수형: 0, 실수형: 0.0)

    자동차 판매 회사의 영업사원 100명에 대한 영업실적을 저장하는 배열 선언 및 크기 지정 -> 2가지 방식
   * */
    // 첫번째 방식
    int[] sales_table4 = new int[100];

    // 두번째 방식
    double[] sales_table5;
    sales_table5 = new double[100];

    // 선언한 배열 사용하기
    System.out.println(sales_table4[0]);  // 0
    System.out.println(sales_table4[99]); // 0


    //////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /*
    2. 배열과 인덱스의 관계에 대해서 설명하고 배열의 초깃값은 어떻게 셋팅되는지 말해보시오.
       크기 10의 정수형 배열을 생성하고 인덱스로 배열 공간의 값을 출력해보시오.
       이 문제는 자바의 배열 및 인덱스 사용법 그리고 배열 생성시 초깃값이 어떻게 정해지는지를 묻는 문제이다.

        // 아래 코드의 결과를 말해보시오
    * */
        // 배열의 선언 및 크기 지정 -> 학생 10명의 성적을 담는 배열
        int[] scores = new int[10];
        int s_size = scores.length;
        System.out.println(s_size); // 10

        // 선언한 배열을 인덱스로 접근하여 값 출력하기
        System.out.println(scores[0]); // 0
        System.out.println(scores[9]); // 0
     // System.out.println(scores[10]); // Err
        System.out.println(scores[s_size - 1]); // 0


        /*
        배열과 인덱스
        - 크기 10의 정수형 배열을 선언하고 크기 10을 지정하면 메모리상에는 10개의 정수형 값을 담을 수 있는 공간이 생성된다.
        - 배열 변수는 참조형 타입으로써 해당 메모리 공간을 가리키게 된다. -> 즉, 해당 메모리 공간의 주소 값을 가진다. -> 이 주소 값을 통해서 참조한다.
        - 주소 값을 참조 값이라고도 부른다.
        - 공간이 10개 만들어지면 동시에 자동적으로 해당 공간에 접근할 수 있는 인덱스 번호가 자동 부여된다. ->인덱스 번호는 0부터 시작.
        - 따라서, 크기가 10인 배열 공간의 첫 번째 인덱스는 0이고, 마지막 공간의 인덱스는 9가된다. 즉, '마지막 인덱스 - 1'이 된다.
        - 인덱스 사용 -> 배열명[인덱스 번호]
        * */

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /*
    3. 배열 요소에 데이터 값을 넣으려면 어떻게 해야하는지 작성해보시오.
       이 문제는 배열을 생성한 후에 데이터 값을 입력하는 방법에 대해서 아는지를 묻는 문제이다.
        3
        11
        22
        33
        44
        44
    * */
        // 배열 선언
        int[] sales = new int[5];

        // 선언한 배열 공간에 값 입력하기
        sales[0] = 3;
        sales[1] = 11;
        sales[2] = 22;
        sales[3] = 33;
        sales[4] = 44;

        // 값 출력
        System.out.println(sales[0]); // 3
        System.out.println(sales[1]); // 11
        System.out.println(sales[2]); // 22
        System.out.println(sales[3]); // 33
        System.out.println(sales[4]); // 44
        System.out.println(sales[sales.length -1]); // 44

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////

        /*
        4. 크기 5의 정수형 배열을 선언하고 55, 88, 60, 100, 90으로 각 요소의 값을 초기화하시오.
            이 문제는 배열 선언과 동시에 특정 값으로 초기화 할 수 있는지를 묻는 문제이다.
            이때, 2가지 방식으로 초기화를 할 수 있는데 모두 작성해보시오.
        * */
        // [1]
        int[] sales4_1 = {55, 88, 60, 100, 90};
        System.out.println(sales4_1[1]); // 88

        // [2]
        int[] sales4_2 = new int[] {55, 88, 60, 100, 90};
        System.out.println(sales4_2[2]); // 60

        // [3]
        int[] sales4_3;
        sales4_3 = new int[]{55, 88, 60, 100, 90};
        System.out.println(sales4_3[3]); // 100

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////

        /*
        5. 배열 요소의 값을 반복문을 사용하여 모두 출력하시오.
            이 문제는 배열 원소의 값을 for문과 같은 반복문을 사용하여 출력할 수 있는지를 묻는 문제이다.
        * */
        // 배열 선언과 동시에 특정 값으로 초기화
        int[] sales5_1 = {33, 52, 93, 100, 87};

        // 반복문을 사용하여 모든 값 출력
        for(int i = 0; i < sales5_1.length; i++){
            System.out.print(sales5_1[i] + " ");
        }
        System.out.println();

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////

        /*
        6. 크기 5의 정수형과 실수형 배열을 생성하고 각각의 주소 값을 출력해보시오.
            주소 값은 다른 말로 참조 값이라고도 한다.
            이 문제는 배열 변수에 들어있는 값이 참조형 타입인지에 대해서 알고 있는지를 묻는 문제이다.
        * */
        // 정수형과 실수형 배열 변수 선언
        int[] ar = {3, 3, 3, 3, 4};
        double[] ar2 = {9.8, 2.45, 5.98, 5.11, 3.14};

        // 마지막 배열 요소 값 출력
        System.out.println(ar[ar.length-1]); // 4
        System.out.println(ar2[ar2.length-1]); // 3.14

        // 배열명 자체를 찍어서 출력 -> 주소(참조) 값 -> I: 정수형 배열, D: 실수형 배열을 의미
        System.out.println(ar); // I
        System.out.println(ar2); // D

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////

        /*
        7. 배열의 값들을 for문과 같은 반복문을 사용하지 않고 한꺼번에 출력하는 코드를 작성하시오.
            이 문제는 반복문이 아닌 메서드로 배열의 요소 값들을 출력하는 방법에 대해서 아는지를 묻는 문제이다.
/
        Arrays.toString() 메서드
        반복문을 사용하지 않고 배열의 값을 출력하고자 한다면 Arrays 클래스의 toString() 메서드를 사용하면 된다.
        toString() 인자로는 배열명을 넣어주면 된다.
        사용을 위해서는 기본적으로 java.util.Arrays 임포트 선언이 되어져 있어야 한다. -> 세미콜론 입력 필수!
        * */

        //import java.util.Arrays;
        // 배열 선언
        int[] ar7_1 = {238, 483, 239, 442, 487, 239, 873};

        // toString() 메서드를 사용하여 값 출력
        System.out.println(Arrays.toString(ar7_1));
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////

        /*
        8. 다음 중 다중 배열의 선언으로 맞는 것을 골라보시오.
           이 문제는 배열 선언을 여러 개 해야하는 경우 한중에 모두 선언하고 만들 수 있는지를 묻는 문제이다.

           [1]
           int[] a, b, c;

           [2]
           int d[], e[], f[];

           [3]
           int g[], h, i;  // g만 배열 선언이 되고 h와 i는 정수형 인자로 만들어진다.
        * */

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////

        /*
        9. 배열을 복사하는 메서드를 말해보고 관련된 예제 코드를 구현해보시오.
           이 문제는 배열 복사시 사용하는 메서드와 사용법에 대해서 알고 있는지를 묻는 문제이다.
           [결과물]
           [1,2,3,4,5]
           [1,2,3,4,3,4,5,8,9,10]

           arraycopy() 메서드 사용 -> 사용법 -> System.arraycopy(원본배열명, ???, 복사배열명, ???, 길이); // 원본배열명 : 복사할 배열의 시작점 , 복사배열명 : 덮어쓰기될 배열에서 시작점.
        * */
        int[] ar9_1 = {1,2,3,4,5};
        int [] ar9_2 = {1,2,3,4,5,6,7,8,9,10};

        // 배열 복사하기 -> System.arraycopy();
        System.arraycopy(ar9_1,2, ar9_2, 4, 3); // [1,2,3,4,3,4,5,8,9,10]
        System.out.println(Arrays.toString(ar9_1));
        System.out.println(Arrays.toString(ar9_2));

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////

        /*
        10. 1,2차원 배열의 생성 및 출력을 다양한 예제로 구현해보시오.
            이 문제는 자바 배열에 관해서 2차원 배열 위주로 생성 및 출력을 다양하게 해보는 종합문제입니다.

        * */
            // [1] String 1차원 배열 -> 3개의 문자열을 담을 수 있는 배열 생성하기
            // String 타입의 참조 변수 3개를 저장하기 위한 공간 생성 -> 이때, 참조형 변수 각 요소는 기본값 -> null로 초기화

            String[] province = new String[3];
            System.out.println(province[0]); // null
            System.out.println(province[1]); // null
            System.out.println(province[2]); // null

            // [2] String 배열 초기화 -> 직접입력
            province[0] = "강원도";
            province[1] = "전라도";
            province[2] = "경상도";

            // [3] String 배열 초기화 -> 배열 선언 및 생성시 {}로 동시에 초기화
            String[] nation = new String[]{"한국","미국","중국"};

            String[] flower = {"무궁화","해바라기","개나리"};

            // [4] 반복문을 사용하여 배열 값 모두 출력
            for (int i = 0; i < flower.length; i++){
                System.out.println(flower[i] + " ");
            };
            System.out.println();

            //[5] 향상된 for문으로 배열 요소 출력
            for (String aaa:flower)
                System.out.println(aaa);

            // [6] 2차원 배열 만들기 -> 2x3 Shape
            // 아시아 -> 동북아시아 (한국, 중국, 일본), 동남아시아 (태국, 베트남, 필리핀)
            String[][] asia_nations = {
                    {"한국","중국","일본"},
                    {"태국","베트남","필리핀"}
            };

        System.out.println(asia_nations[0]); // 1차원 배열의 주소를 참조하는 값이 출력

        System.out.println(asia_nations[0][1]); // 중국
        System.out.println(asia_nations[1][0]); // 태국

        System.out.println(asia_nations.length); // 2
        System.out.println(asia_nations[0].length); // 3
        System.out.println(asia_nations[1].length); // 3

        // [7] : 반복문을 사용한 String 2차원 배열 값 출력
        for (int i = 0; i< asia_nations.length; i++){
            for (int j = 0;j< asia_nations[i].length; j++){
                System.out.print(asia_nations[i][j] + " ");
            };
                 System.out.println();
        };

        // [8] : charAt() 메서드 -> 해당 인덱스에 있는 값을 반환 -> 단어를 char 배열에 한글자씩 저장할 수 있음.
        String[] atrAr = {"hong", "kim", "park"};
        System.out.println(atrAr[0].charAt(2)); // n

        // [9] : 반복문에서 charAt() 메서드 사용
        // [9-1] 잘못된 예
        for (int i = 0; i< atrAr.length; i++)
            System.out.println(atrAr[0].charAt(i)); // hir -> 이중 반복문을 사용해야 한다.
        System.out.println();
        // [9-2] 잘못된 예
        for (int i = 0; i<atrAr.length;i++)
            for (int j = 0; j< atrAr.length; j++)
                System.out.println(atrAr[i].charAt(j)); // hon kim par

        System.out.println(atrAr.length); // 3
        // System.out.println(atrAr[0].length); // Err
        System.out.println(atrAr[0].length()); // 4

        for (int i = 0; i< atrAr.length; i++)
            for (int j = 0; j<atrAr[i].length(); j++)
                System.out.print(atrAr[i].charAt(j) + " ");
            System.out.println();

        // [10] : length vs length()
        int[] aaa = new int[10];
        System.out.println(aaa.length); // 10

        String bbb = "Welcome to Seoul";
        System.out.println(bbb.length()); // 16 (공백 문자 포함)

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////

        /*
        11. 사용자 입력을 받아 2차원 배열을 생성하고 값을 입력하는 코드를 구현하시오.
            이때, 중첩 반복문을 사용하여 출력도 같이 해보시오.
            이 문제는 배열 생성시 사용자로 부터 입력을 받아서 2차원 배열을 반들 수 있는지를 묻는 문제이다.

            [결과 출력]
            행의 갯수를 입력하고 [Enter] 치세요 = 3
            열의 갯수를 입력하고 [Enter] 치세요 = 3
            1번째 행에 입력할 문자 3개를 차례대로 입력하고 [Enter] 치세요 = #$ㅍ
            2번째 행에 입력할 문자 3개를 차례대로 입력하고 [Enter] 치세요 = ^&*
            3번째 행에 입력할 문자 3개를 차례대로 입력하고 [Enter] 치세요 = !@#
            #$ㅍ
            ^&*
            !@#
        * */

        // [1] : 사용자 입력을 위한 객체 선언
        Scanner sc = new Scanner(System.in);

        // [2] : 2차원 배열의 행과 열 선언 -> 사용자 입력으로 처리
        System.out.print(" 행의 갯수를 입력하고 [Enter] 치세요 = ");
        int R = sc.nextInt();
        System.out.print(" 열의 갯수를 입력하고 [Enter] 치세요 = ");
        int C = sc.nextInt();

        // [3] : char 2차원 배열 선언 -> 사용자로 부터 R, C 입력받아 -> gameMap[R][C] 생성.
        char[][] gameMap = new char[R][C];

        // [4] : 사용자 입력을 받아서 저장할 String 배열 선언 -> 이때 크기를 [R]로 해주도록 한다.(중요!)
        // 크기를 R만큼만 해주면 되는 이유? -> 어차피 사용자가 입력하는 값은 안쪽 for문을 돌면서 2차원 배열에 입력하기 때문이다.
        String[] strAr10_1 = new String[R];

        // [5] : 2차원 배열 요소 -> 사용자가 입력하는 값으로 세팅
        for (int i = 0; i<R; i++){
            System.out.print((i+1)+ "번째 행에 입력할 문자"+ C +"개를 차례대로 입력하고 [Enter] 치세요 =");
            strAr10_1[i] = sc.next();
            for (int j = 0; j<C; j++){
                gameMap[i][j] = strAr10_1[i].charAt(j); // j 인덱스에 있는 값을 하나씩 가져와서 -> gameMap 좌표에 세팅
            };
        };

        // [6] : 2차원 배열에 들어있는 값 출력하기
        System.out.println(strAr10_1);  // 참조 주소값 출력
        System.out.println(strAr10_1[0]); // 0번째 값
        System.out.println(strAr10_1[1]); // 1번째 값

        System.out.println("---------------------------------------------------");
        for (int i = 0; i<R; i++){
            for (int j = 0; j<C; j++){
                System.out.print(gameMap[i][j]+ " ");
            };
            System.out.println();
        };
        System.out.println("---------------------------------------------------");

    }


}
