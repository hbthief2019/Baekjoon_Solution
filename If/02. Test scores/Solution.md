# 시험 성적
---
## 문제
시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.

### 입력
첫째 줄에 시험 점수가 주어진다. 시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.

### 출력
시험 성적을 출력한다.

---
## 풀이
사용자로부터 값을 입력받기 위해 Scanner 클래스를 import 하고 main()에 객체를 선언한다.

```Java
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
    }
}
```

사용자로부터 점수를 입력받아 저장하는 정수형 변수 score를 선언한다.

```Java
int score = sc.nextInt();
```

`if - else`문을 이용하여 score가 각각의 범위에 해당할 때 A, B, C, D, F를 출력할 수 있도록 한다.

값에 따라 출력되는 점수가 달라질 수 있으므로 `&& 연산자`를 이용하여 정확한 범위를 설정한다.

```Java
if(score >= 90 && score <= 100)     System.out.println("A");
else if(score >= 80 && score <= 89) System.out.println("B");
else if(score >= 70 && score <= 79) System.out.println("C");
else if(score >= 60 && score <= 69) System.out.println("D");
else                                System.out.println("F");
```
---

## 전체코드
```Java
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        int score = sc.nextInt();

        if(score >= 90 && score <= 100)     System.out.println("A");
        else if(score >= 80 && score <= 89) System.out.println("B");
        else if(score >= 70 && score <= 79) System.out.println("C");
        else if(score >= 60 && score <= 69) System.out.println("D");
        else                                System.out.println("F");
    }
}
```