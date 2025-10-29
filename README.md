
<div align="center">

<!-- logo -->
## Whiskypedia 프로젝트

</div> 

### 📝 프로젝트 소개

----

```
위스키 SNS
```

### 버전

----

spring boot : 3.4.2  
java : 17

### API 명세서

----


### 컨벤션 규칙

----

- Git 커밋 메시지는 `faet`, `docs`, `test`, `refactor`, `fix`, `chore` 를 이용한다.
    - feat: 기능 추가, 개발
    - docs: 문서 작성
    - test: 테스트 코드 작성
    - refactor: 리팩토링 작업
    - fix : 버그 수정
    - chore : 그외

- 기본적으로 Java 컨벤션을 준수한다. (https://thalals.tistory.com/325)
- 클린코드 원칙에 맞춰 개발한다.
- else 를 사용하지 않는다.
- depth 는 2를 넘어가지 않는다. ex) for 메서드 내부에 if 가 있으면 depth 가 2 이다.
- 상수는 따로 분리한다.
- DTO 매핑은 Service 계층에서 진행한다.


### 디렉토리 구조

-----

- auth : 인증/인가 관련 로직을 구현한다.
- config : 애플리케이션 전역 설정 Bean 을 등록한다.
- constants : 상수를 관리한다.
- domain : 도메인 관련 로직을 구현한다.
    - controller : Rest API 계층
    - dto : dto 네이밍은 요청(xxxRequest), 응답(xxxResponse) 로 정의한다.
    - entity : 테이블과 매핑되는 클래스를 정의한다.
    - repository : 저장소역할을 담당한다.
    - service : 비지니스 로직을 담당한다.
- exception : 예외 관련 처리를 담당한다.
- infra : redis, s3, fcm 등 외부 라이브러리와 연동한다.


### 실행 방법

----

(1) 루트 디렉토리에 .env 환경설정 파일을 만든다.  
(2) .env 관련 설정은 다음과 같다. 
```
DB_URL=jdbc:mysql://localhost:3306/{테이블 이름}?serverTimezone=Asia/Seoul
DB_USERNAME={사용자 db id}
DB_PASSWORD={사용자 db pw}
SECRET_KEY=...
ACCESS_KEY_EXPIRATION_SECONDS=...
REFRESH_KEY_EXPIRATION_SECONDS= ...
```


### 기능 명세서

----

### 로그인/회원가입 기능 
- [ ] Google 소셜로그인을 이용해 로그인한다.
- [ ] Google 계정 유/무 를 판단한 뒤 계정이 있으면 사용자 정보를 조회하고, 계정이 존재하지 않으면 Client 에게 회원가입을 요청한다.

### 사용자 관련 기능
- [ ] 자신의 정보를 조회한다. (마이페이지)

### 위스키 관련 기능
- [ ] WhiskyEdition API 를 이용해 모든 위스키의 정보를 토대로 조회한다.
  - [ ] 위스키의 이름, 도수, 년도, 지역, 제조회사, 이미지, 종류, 향, 맛 등을 나타낸다.
    - [ ] 위스키를 필터링(도수, 년도, 지역, 제조회사, 종류)하여 조회할 수 있도록 한다.
- [ ] 해당 위스키의 사용자 리뷰를 나타낸다.
  - [ ] 평점, 댓글, 사용자 이름이 보이게 한다.
- [ ] Monthly, Weekly 조회순, 관심등록 순으로 10위까지 랭킹 부여한다.
- [ ] 관심있는, 마셔본 위스키를 분류하여 사용자가 추가할 수 있도록 한다.
  - [ ] 관심 추가한 위스키의 게시물를 피드에 최신 순으로 보여지게 한다.
  

  
