datasource의 url 값에 serverTimeZone=UTC를 작성해야 KST(Korea Standard Time) 오류를 해결할 수 있다.

@Builder 사용 시 cannot be applied to given types 에러가 발생
@Builder 사용 시에 모든 필드를 가지는 생성자를 가지게 해주면 된다.
@AllArgsConstructor

@GeneratedValue()에서 strategy에서 GenerationType.AUTO를 사용 시에 hibernate_sequence테이블이 생성되고 next_val 칼럼에 다음 번호가 저장된다.
GenerationType.AUTO를 사용하는 모든 Entity가 hibernate_sequence 테이블 sequence를 사용하게 된다.

@GeneratedValue()에서 strategy를 GenerationType.IDENTITY를 사용 시에 default value 오류가 발생했다.
이는 MySQL 해당 Entity 키 칼럼에 대한 Auto_increment 옵션을 설정하지 않아서 발생한 오류였다.

@Builder을 사용시에 필수로 받아야하는 인자를 설정할 수 없다.
@Builder시에 @Builder.Default를 설정하지 않으면 0, null, false 값이 나온다.

서버를 Auto 재가동하는 방법은 Gradle에 spring-boot-devtools를 추가해주고 [command+shift+a], registry에 compiler.automake.allow.when.app.running에 체크를 해준다.
또한 application.yml에 spring:devtools:livereload:enabled: true를 설정해준다.

Handlebars 정적자원 변경시 자동 갱신하는 방법은 application.yml에 handlebars:cache: false로 설정한다.

Javascript Arrow Function에서 에러가 발생 시 Intellij IDEA Preferences에 Language 클릭 Javascript ECMA Script 6로 업그레이드하면 된다.
