### 스프링 입문 - 코드로 배우는 스프링 부트, 웹 MVC, DB 접근 기술

``` 
[환경설정]
springboot 2.7.8
java 11
oracle
thymeleaf
```

```
2022.02.06 학습 시작
2022.02.12 git token -> ssh 변경... 일주일 헤멤
2022.02.15 thymeleaf 학습 및 springboot 라이브러리 학습
2022.02.16 회원관리 예제 - 백엔드 개발 & junit 테스트 학습(TDD)
2022.02.20 생성자 의존성 주입 및 H2 db 학습
2022.04.23 - @SpringBootTest : 스프링 컨테이너와 테스트를 함께 실행한다.
           - @Transational   : 테스트 케이스에 이 어노테이션이 있으면, 테스트 시작 전에 트랜잭션을 시작하고 , 테스트를 완료 후에 항상 록백 한다
           이렇게 하면 데이터가 남지 않으므로 다음 테스트에 영향을 주지 않는다.
```

회원 관리 예제 - 백엔드 개발
==============================
- [x] 비지니스 요구사항 정리
- [x] 회원 도메인과 리포지토리 만들기
- [x] 회원 리포지토리 테스트 케이스 작성
- [x] 회원 서비스 개발
- [x] 회원 서비스 테스트

비지니스 요구사항 정리
==============================
- 데이터 : 회원ID , 이름
- 기능 : 회원 등록 , 조회
- 아직 데이터 저장소가 선정되지 않음(가상의 시나리오)


###공식문서

스프링 : [https://docs.spring.io/spring-boot/docs/current/reference/html/web.html#web](https://docs.spring.io/spring-boot/docs/current/reference/html/web.html#web) 
