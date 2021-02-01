# 두 수 비교하기
---
## 문제
두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.

### 입력
첫째 줄에 A와 B가 주어진다. A와 B는 공백 한 칸으로 구분되어져 있다.

### 출력
첫째 줄에 다음 세 가지 중 하나를 출력한다.

- A가 B보다 큰 경우에는 '>'를 출력한다.
- A가 B보다 작은 경우에는 '<'를 출력한다.
- A와 B가 같은 경우에는 '=='를 출력한다.


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

`if문`을 이용하여 아래와 같이 해결한다.

- A > B 일 때 System.out.println(">");
- A > B 일 때 System.out.println("<");
- 이외의 경우(같을 경우) System.out.println("==");

```Java
if(A > B) System.out.println(">");
else if(A < B) System.out.println("<");
else System.out.println("==");
```

여기서 "=="는 크거나 작지 않는 `나머지 경우`이므로, 굳이 `else if`를 추가로 쓰지 않아도 된다.

---

## 전체코드
```Java
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        if(A > B) System.out.println(">");
        else if(A < B) System.out.println("<");
        else System.out.println("==");
    }
}
```