# Hello World! 출력
## 문제
Hello World!를 출력하시오.

## 해결 과정
main() 함수 안에 String output method인 `System.out.println()`를 이용햐어 Hello World! 를 출력한다.

```Java
public class Main {
    public static void main(String [] args) {
        System.out.println("Hello World!");
    }
}
```

## 주의사항
문제 자체는 어렵지 않으나 백준 첫 문제인 만큼 기본 설정에서 에러가 자주 나므로, 다음과 같은 사항을 명시해야 한다.

1. class name을 `Main`으로 설정
2. code 최상단에 `package` 삭제
3. class name과 main method 앞에 `public`을 붙임
4. Hello World! 오탈자에 주의