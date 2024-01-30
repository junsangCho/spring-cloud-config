Spring Cloud Config Server

Config Server 란 설정 정보들을 외부화하여 서버 및 클라이언트에게 제공하는 시스템이다.
분산된 시스템에서 설정정보를 중앙에서 관리한다는 장점이 있고 설정이 변경되어도 서버를 재배포하지 않아도 변경된 내용을 반영시킬수 있다.
토큰, 키, 계정정보 등 민감한 설정정보의 노출을 줄이고 보다 private 한 환경에서 설정 정보들을 관리할 수 있어 보안적인 측면에서도 이점이 있다.
git이나 AWS 등을 통해 설정파일을 보관하고 읽어 올 수 있다.

[Spring Cloud Config Server 장점]
1. 설정파일의 중앙관리화
2. 재배포 없이 설정변경에 대한 내용 반영
3. 민감 정보의 보안성 강화

[refreshing properties]
1. 서버의 경우 연동되어 있는 경로의 설정파일이 변경되는 즉시 refresh 된다
2. 설정파일의 확인 방법은 /{application name}/{profile} 로 확인가능하다.

