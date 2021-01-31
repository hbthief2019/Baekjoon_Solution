# We love kriii
## 문제
ACM-ICPC 인터넷 예선, Regional, 그리고 World Finals까지 이미 2회씩 진출해버린 kriii는 미련을 버리지 못하고 왠지 모르게 올해에도 파주 World Finals 준비 캠프에 참여했다.

대회를 뜰 줄 모르는 지박령 kriii를 위해서 격려의 문구를 출력해주자.
- 두 줄에 걸쳐 "강한친구 대한육군"을 한 줄에 한 번씩 출력한다.

## 해결 과정
main() 함수 안에 String output method인 `System.out.println()`를 이용하여
**강한친구 대한육군**을 두 번 출력한다.

```Java
public class Main {
    public static void main(String [] args) {
        System.out.println("강한친구 대한육군");
        System.out.println("강한친구 대한육군");
    }
}
```

## 주의사항
문제 자체는 어렵지 않으나 백준 첫 문제인 만큼 기본 설정에서 에러가 자주 나므로, 다음과 같은 사항을 명시해야 한다.

1. class name을 `Main`으로 설정
2. code 최상단에 `package` 삭제
3. class name과 main method 앞에 `public`을 붙임
4. **강한친구 대한육군** 오탈자에 주의