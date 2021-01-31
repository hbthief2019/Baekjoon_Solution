# 곱셈
---
## 문제
(세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.

![process_of_multiplication](IMG_process_of_multiplication.png)


(1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.

### 입력
첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.

### 출력
첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다.

---

## 풀이
사용자로부터 정수 값을 입력받기 위해 Scanner 클래스를 import 하여 객체를 생성한다.

```Java
imort java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        canner sc = new Scanner(System.in);
    }
}
```

정수형 변수 A, B를 생성하여 사용자로부터 값을 입력 받는다.

```Java
int A = sc.nextInt();
int B = sc.nextInt();
```

B(Destination value)의 각각의 자릿수에 대한 곱셉의 결과를 저장할 세 가지의 변수를 선언한다.

B의 각각의 자릿수를 추출하는 법은 다음과 같다.

- 1의 자리수  : 10의 나머지 연산
- 10의 자리수 : 100의 나머지 연산한 결과값을 10으로 나눈 값
- 100의 자리수 : 100으로 나눈 값

```Java
/*************************************
 * firstCarry  : A × B의 1자리수
 * secondCarry : A × B의 10자리수
 * thirdCarry  : A × B의 100의 자리수
**************************************/
int firstCarry = A * (B%10);
int secondCarry = A * ((B%100) / 10);
int thirdCarry = A * (B/100);
```

마지막으로 각각의 Carry와 A * B의 값을 printf() 함수를 이용하여 출력한다.

```Java
// 각각의 Carry 출력
System.out.printf("%d\n", firstCarry);
System.out.printf("%d\n", secondCarry);
System.out.printf("%d\n", thirdCarry);

// A * B 결과값 출력
System.out.printf("%d\n", A * B);
```

---
## 전체코드
```Java
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        // 사용자로부터 정수값 입력받음
        int A = sc.nextInt();
        int B = sc.nextInt();

        /*************************************
         
         * firstCarry  : A × B의 1자리수
         * secondCarry : A × B의 10자리수
         * thirdCarry  : A × B의 100의 자리수
         
        **************************************/
        int firstCarry = A * (B%10);
        int secondCarry = A * ((B%100) / 10);
        int thirdCarry = A * (B/100);

        // 각각의 Carry 출력
        System.out.printf("%d\n", firstCarry);
        System.out.printf("%d\n", secondCarry);
        System.out.printf("%d\n", thirdCarry);

        // A * B 결과값 출력
        System.out.printf("%d\n", A * B);
    }
}
```