Spring Cloud Config Client

Config Server 를 통해 필요한 설정을 가져오며 Profile, AppName, label 등을 통해 원하는 조건에서의 설정을 다르게 가져 올 수 있다.

Config file 을 읽어들이는 우선순위는 아래와 같다.

[Spring Cloud Config 설정 파일 우선 순위]
1. 프로젝트의 application.yaml
2. 설정 저장소의 application.yaml
3. 프로젝트의 application-{profile}.yaml
4. 설정 저장소의 {application name}/{application name}-{profile}
* 만약 순서대로 읽다가 동일한 값을 지니는 설정 정보가 있다면 덮어 씌워지므로 주의가 필요하다

[properties 값 객체 바인딩]
@ConfigurationProperties 어노테이션을 사용하여 properties 를 읽어와서 객체에 주입할 수 있다.
 - prefix 를 지원하기 때문에 해당하는 계층의 값을 한번에 가져올 수 있다.
 - 객체 필드에 주입하기 위해서는 setter 가 필수적으로 필요하다
 - 해당객체를 빈에 등록하여야 한다.
   1) @Configuration 을 사용
   2) @EnableConfigurationProperties 을 사용
 - @RefreshScope 어노테이션을 사용하면 설정파일의 내용이 변동될 경우 해당 properties 값이 자동으로 업데이트 된다. 

[Dynamic Configration properties]
1. Spring Actuator를 사용해서 config client에 있는 /actuator/refresh를 호출한다. (POST 호출)
2. Spring Cloud Bus와 연결되어 있는 config client의 /actuator/busrefresh를 호출한다.
3. Spring Cloud Bus와 연결되어 있는 config server의 /monitor를 호출한다.