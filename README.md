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

`셋팅`에 `keymap`

- generate => Alt + Insert
  - constructor, getter and setter 자동 생성
- import, implement => Alt + Enter
- 생성자 호출 시 변수 자동 생성 => Ctrl + Alt + V 



## 회원 도메인 개발

- 프로젝트가 커지면 `MemoryRepository` 인터페이스와 구현체인 `MemoryMemberRepository`의 저장 패키지를 분리하는 것이 좋다. 
