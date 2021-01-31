# 강아지 출력
## 문제
아래 예제와 같이 개를 출력하시오.

```Java
|\_/|
|q p|   /}
( 0 )"""\
|"^"`    |
||_/=\\__|
```

## 해결 과정
main() 함수 안에 String output method인 `System.out.println()`을 응용하는 문제이다.

가독성을 높이기 위해 각 줄마다 `개행문자(\n)`를 삽입하고 `+ operator`를 이용하여 String을 보기 좋게 출력한다.

```Java
public class Main {
    public static void main(String [] args) {
        System.out.println(
                "|\\_/|"
            + "\n|q p|   /}"
            + "\n( 0 )\"\"\"\\"
            + "\n|\"^\"`    |"
            + "\n||_/=\\\\__|");
    }
}
```

## 주의사항
1. Java String에서 `역슬래시(\)` 문자 그대로 출력하려면 `\\` 으로 써야 한다.
2. Java String에서 `큰따옴표(")` 문자 그대로 출력하려면 `\"` 으로 써야 한다.
3. 각 Line의 공백 문자의 수에 유의