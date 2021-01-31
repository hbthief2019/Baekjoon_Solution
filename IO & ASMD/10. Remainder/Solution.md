# 나머지
---
## 문제
(A+B)%C는 ((A%C) + (B%C))%C 와 같을까?

(A×B)%C는 ((A%C) × (B%C))%C 와 같을까?

세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.

### 입력
첫째 줄에 A, B, C가 순서대로 주어진다. (2 ≤ A, B, C ≤ 10000)

### 출력 
첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C, 셋째 줄에 (A×B)%C, 넷째 줄에 ((A%C) × (B%C))%C를 출력한다.

---
## 풀이
사용자로부터 값을 입력받기 위해 `Scanner` 클래스를 `import` 하고 main()에 객체를 선언한다.

```Java
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
    }
}
```

System.out.printf()를 이용하여 아래의 값들을 출력한다.

|줄|연산|
|:--:|:--:|
|첫째 줄|(A+B)%C|
|둘째 줄|((A%C) + (B%C))%C|
|셋째 줄|(A×B)%C|
|넷째 줄|((A%C) × (B%C))%C|

```Java
System.out.printf("%d\n", (A+B)%C);
System.out.printf("%d\n", ((A%C) + (B%C))%C);
System.out.printf("%d\n", (A*B)%C);
System.out.printf("%d\n", ((A%C) * (B%C))%C);
```

---

## 전체코드
```Java
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        System.out.printf("%d\n", (A+B)%C);
        System.out.printf("%d\n", ((A%C) + (B%C))%C);
        System.out.printf("%d\n", (A*B)%C);
        System.out.printf("%d\n", ((A%C) * (B%C))%C);
    }
}
```