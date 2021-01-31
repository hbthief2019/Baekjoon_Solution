# 사칙연산
---
## 문제
두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오.

### 입력 
두 자연수 A와 B가 주어진다. (1 ≤ A, B ≤ 10,000)

### 출력
첫째 줄에 A+B, 둘째 줄에 A-B, 셋째 줄에 A*B, 넷째 줄에 A/B, 다섯째 줄에 A%B를 출력한다.

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

사칙연산에 대한 각각의 결과를 `System.out.printf()`를 이용하여 출력한다.

```Java
// 사칙연산 결과값 출력
System.out.printf("%d\n", A + B);
System.out.printf("%d\n", A - B);
System.out.printf("%d\n", A * B);
System.out.printf("%d\n", A / B);
System.out.printf("%d\n", A % B);
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
        
        // 사칙연산 결과값 출력
        System.out.printf("%d\n", A + B);
        System.out.printf("%d\n", A - B);
        System.out.printf("%d\n", A * B);
        System.out.printf("%d\n", A / B);
        System.out.printf("%d\n", A % B);
    }
}
```