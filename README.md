
# 🧱 SpringBoot Clean Architecture Template

클린 아키텍처 기반으로 구성된 Spring Boot 백엔드 템플릿입니다.  
MyBatis 기반의 표준 세팅을 적용하여 실무 환경과 유사하게 구성하였습니다.

---

## 📁 프로젝트 구조

```
src/
└── main/
    └── java/
        └── com.hyungseok.clean/
            ├── adapter          # 외부 요청 (Controller 등)
            ├── application      # 유즈케이스 / 서비스 계층
            ├── domain           # 엔티티 및 도메인 인터페이스
            ├── infrastructure   # 외부 시스템 (DB, API 등) 연동
            └── common           # 공통 응답, 상수 등
                ├── constants
                └── response
```

---

## ⚙️ 기술 스택

| 항목        | 내용                                  |
|-----------|-------------------------------------|
| Language   | Java 17                              |
| Framework  | Spring Boot 3.2.5                    |
| ORM / DAO  | MyBatis 3.0.4                        |
| DB         | MySQL (Connector 8.0.33)             |
| Docs       | SpringDoc OpenAPI (Swagger) 2.5.0    |
| Validation | Spring Boot Validation               |
| Build Tool | Gradle + Dependency Management       |
| 기타       | Lombok, UTF-8 인코딩 설정 등        |

---

## 🔧 Gradle 주요 설정

```groovy
tasks.withType(JavaCompile).configureEach {
    options.encoding = 'UTF-8'
}

tasks.named('test') {
    useJUnitPlatform()
    ignoreFailures = true // 개발 중 테스트 실패 무시
}
```

---

## 📦 기능 개발 현황

- [x] Gradle + Spring Boot 초기 세팅
- [x] MyBatis, MySQL 연동
- [x] 공통 응답 객체 (BaseResponse, CommonResponseCode)
- [ ] 전역 예외 처리 설계
- [ ] 파일 업로드 표준 예제
- [ ] Swagger 문서 연동 검증
- [ ] Dockerfile 작성

---

## 📌 기타

- Spring Boot 프로젝트와 프론트엔드(React)는 분리된 레포에서 관리 예정
- 본 프로젝트는 포트폴리오/실무 템플릿용으로 작성됨
