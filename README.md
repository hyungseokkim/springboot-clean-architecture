# 🧱 Spring Boot Clean Architecture Template

Spring Boot 기반의 클린 아키텍처 구조를 적용한 백엔드 프로젝트 템플릿입니다.  
표준화된 디렉토리 구조, 예외 처리, 응답 포맷, Swagger 설정 등을 미리 구성하여  
실무 투입 전 연습 및 개인 포트폴리오로 활용할 수 있습니다.

---

## 📁 프로젝트 구조

```
com.hyungseok.clean
├── api              // 컨트롤러 (입출력 담당)
├── application      // 유즈케이스 계층 (비즈니스 인터페이스)
├── domain           // 도메인 계층 (엔티티, VO, 인터페이스)
├── infrastructure   // 외부 시스템 연동 (DB, 외부 API)
├── common           // 공통 응답, 예외, 설정 등
└── CleanApplication.java
```

---

## ⚙️ 기술 스택

| 영역 | 기술 |
|------|------|
| 언어 | Java 17 |
| 프레임워크 | Spring Boot 3.3.13 |
| ORM | MyBatis |
| 문서화 | SpringDoc OpenAPI (Swagger) |
| 검증 | Spring Boot Validation |
| 기타 | Lombok, Gradle, REST API |

---

## 🧩 주요 기능

- 클린 아키텍처 기반 계층 분리
- Swagger를 활용한 API 문서 자동화
- 공통 응답 객체 (`BaseResponse`) 설계
- 글로벌 예외 처리기 (`GlobalExceptionHandler`)
- 유효성 검증 (Validation)
- 실무용 디렉토리 및 책임 분리

---

## 🔧 실행 방법

```bash
# 빌드
./gradlew clean build

# 실행
./gradlew bootRun
```

접속 주소: [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

---

## 📌 향후 추가 예정

- [ ] 파일 업로드 표준 API
- [ ] JWT 인증 구조
- [ ] 테스트 코드 구성
- [ ] React 기반 프론트엔드 연동

---

## 🙋‍♂️ 작성자

- GitHub: [hyungseokkim](https://github.com/hyungseokkim)
