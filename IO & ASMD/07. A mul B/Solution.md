# A, B을 입력받아 A * B의 결과값 출력
## 문제
두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.

첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)

첫째 줄에 A * B를 출력한다.

## 해결 과정
사용자로부터 어떤 값(정수, 실수, 단어, 줄단위의 String)을 입력받기 위해서는 `Scanner 클래스`가 필요하다.

Scanner를 사용하기 위해 `java.util` 패키지에 포함되어 있는 Scanner 클래스를 `import` 한다.

```Java
imort java.util.Scanner;
```

호출한 Scanner 클래스를 사용하기 위해 main() 안에 `객체`를 생성한다.
`System.in`에 입력한 값을 `바이트 단위`로 읽는다.

```Java
Scanner sc = new Scanner(System.in);
```

A, B 두 개의 값을 객체 sc를 이용하여 사용자로부터 입력 받는다. 정수 값이 필요하므로 `nextInt()` 메소드를 사용한다.

```Java
int A = sc.nextInt();
int B = sc.nextInt();
```

`System.out.println()`을 이용하여 A * B 값을 출력한다. 문자열이 아니므로 연산을 `큰따옴표("")`로 묶지 않도록 주의한다.

```Java
System.out.println(A * B);
```

---

## 전체 코드

```Java
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        // 사용자로부터 값을 입력받기 위한 Scanner 클래스 객체 생성
        Scanner sc = new Scanner(System.in);

        // A와 B의 값을 사용자로부터 입력 받음
        int A = sc.nextInt();
        int B = sc.nextInt();

        // A * B의 결과값 출력
        System.out.println(A * B);
    }
}
```