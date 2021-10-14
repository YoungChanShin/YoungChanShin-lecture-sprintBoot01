# sprint-boot-lecture01
[인프런] 스프링 입문 - 코드로 배우는 스프링 부트, 웹 MVC, DB 접근 기술

## 프로젝트 환경설정

1. build.gradle

```ini
plugins {
	id 'org.springframework.boot' version '2.5.2'
	id 'io.spring.dependency-management' version '1.0.11.RELEASE'
	id 'java'
}

group = 'hello'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'

repositories {
	mavenCentral()
}

dependencies {
	implementation 'org.springframework.boot:spring-boot-starter'
	testImplementation 'org.springframework.boot:spring-boot-starter-test'
}

test {
	useJUnitPlatform()
}

```

2. 단축키(윈도우, IntelliJ)

https://twofootdog.tistory.com/84

`settings`에 `keymap`

- generate => Alt + Insert
  - constructor, getter and setter 자동 생성
  - 포커스가 프로젝트 영역에 있을 때는 새 파일 생성
- import, implement => Alt + Enter
- 생성자 호출 시 변수 자동 생성 => Ctrl + Alt + V 

```
new Member(1L. Grade.VIP);
// Ctrl + Alt + V
Member member = new Member(1L. Grade.VIP);
```

- Alt + 1 : 포커스 프로젝트/코드 영역 이동하기
- Ctrl + Shift + Enter : 자동 완성과 줄바꿈
- Ctrl + Shift +t : Test class 생성



## 회원 도메인 개발

- 프로젝트가 커지면 `MemoryRepository` 인터페이스와 구현체인 `MemoryMemberRepository`의 저장 패키지를 분리하는 것이 좋다. 
- 역할을 먼저 만들고 구현을 한다
- 역할들의 협력관계를 그대로 재사용할 수 있다.
