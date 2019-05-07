##### 🏷 여자친구를 위해 계획한 토이 프로젝트입니다. <br>🏷 우연히 이 코드를 보시는 분들 현실적인 피드백주시면 감사하겠습니다. <br>🏷 funchcode@gmail.com 👈🏽 피드백(url 또는 키워드)주시면 열심히 공부하겠습니다. <br>
<br>
<h2>네일 샵 관리 프로그램(미완)</h2> <br>

### 사용(할)기술

- SpringBoot(Gradle) + Handlebars + jQuery + Bootstrap
- MySQL
- Full Calendar

### 구현(할)기능

- 고객, 직원, 서비스(CRUD)
- Calendar 예약 관리
- 단축키 등록
- Kakao플러스 친구 알림받기
- Instagram Graph API로 알림받기(앱검수필요)
- Google chart로 매출표기
- 직원 월급 자동 계산
- 서비스 사용 제한

### 고민

- 아트에 대한 고민 해결방법
- 효과적인 광고기능
- 네일 샵 블로그 구현고민 + 챗봇 + 예약시스템
- 최신 유행 트랜드 어떤 주제와 방식으로 크롤링 고민

---
### 삽질로그 <br>

👉🏽 datasource의 url 값에 serverTimeZone=UTC를 작성해야 KST(Korea Standard Time) 오류를 해결할 수 있다. <br>
<br>
👉🏽 ```@Builder``` 사용 시 cannot be applied to given types 에러가 발생<br>
@Builder 사용 시에 모든 필드를 가지는 생성자를 가지게 해주면 된다(@AllArgsConstructor).<br>
<br>
👉🏽 ```@GeneratedValue()```에서 strategy에서 GenerationType.AUTO를 사용 시에 hibernate_sequence테이블이 생성되고 next_val 칼럼에 다음 번호가 저장된다.<br>
GenerationType.AUTO를 사용하는 모든 Entity가 hibernate_sequence 테이블 sequence를 사용하게 된다.<br>
<br>
👉🏽 ```@GeneratedValue()```에서 strategy를 GenerationType.IDENTITY를 사용 시에 default value 오류가 발생했다.<br>
이는 MySQL 해당 Entity 키 칼럼에 대한 Auto_increment 옵션을 설정하지 않아서 발생한 오류였다.<br>
<br>
👉🏽 ```@Builder```을 사용시에 필수로 받아야하는 인자를 설정할 수 없다. <br>
<br>
👉🏽 ```@Builder```시에 @Builder.Default를 설정하지 않으면 0, null, false 값이 나온다.<br>
<br>
👉🏽 서버를 Auto 재가동하는 방법은 Gradle에 spring-boot-devtools를 추가해주고 [command+shift+a], registry에 compiler.automake.allow.when.app.running에 체크를 해준다.<br>
또한 application.yml에 spring:devtools:livereload:enabled: true를 설정해준다.<br>
<br>
👉🏽 Handlebars 정적자원 변경시 자동 갱신하는 방법은 application.yml에 handlebars:cache: false로 설정한다.<br>
<br>
👉🏽 Javascript Arrow Function에서 에러가 발생 시 Intellij IDEA Preferences에 Language 클릭 Javascript ECMA Script 6로 업그레이드하면 된다.<br>

---
### 계획(진행) 현황 <br>

**서비스 흐름도** <br>
<img src="./src/main/resources/static/images/serviceflow.png" width="80%" /> <br>
<br>
**ERD** <br>
<img src="./src/main/resources/static/images/erdcloud.png" width="80%" />