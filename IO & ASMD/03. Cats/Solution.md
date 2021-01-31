# 고양이 출력
## 문제
아래 예제와 같이 고양이를 출력하시오.

```Java
\    /\
 )  ( ')
(  /  )
 \(__)|
```

## 해결 과정
main() 함수 안에 String output method인 `System.out.println()`을 응용하는 문제이다.

가독성을 높이기 위해 각 줄마다 `개행문자(\n)`를 삽입하고 `+ operator`를 이용하여 String을 보기 좋게 출력한다.

```Java
public class Main {
    public static void main(String [] args) {
        System.out.println(
            "\\    /\\"
            + "\n )  ( ')"
            + "\n(  /  )"
            + "\n \\(__)|"
        );
    }
}
```

## 주의사항
1. Java String에서 `역슬래시(\)` 문자 그대로의 표기는 `\\` 이다.
2. 각 Line의 공백 문자의 수에 유의