# crewrung
크루와 번개모임을 위한 웹
<br>
<br>
## 목차
- [커밋 타입](#커밋-타입)
- [브랜치 전략](#브랜치-전략)
- [git 전략](#git-전략)
- [add와 implement의 차이](#add와-implemnt의-차이점)
- [modify와 fix와 correct의 차이점](#modify와-fix와-correct의-차이점)

---
<br>

## 커밋 타입
| 타입       | 설명                                      | 예시                                               |
|------------|-------------------------------------------|----------------------------------------------------|
| `feat`     | 새로운 기능 추가                          | `feat: add user registration form`                |
| `fix`      | 버그 수정                                 | `fix: resolve crash on login page`                |
| `docs`     | 문서 수정 (README 등)                     | `docs: update README with setup instructions`     |
| `style`    | 코드 포맷팅 (기능 변화 없음)              | `style: reformat code with Prettier`              |
| `refactor` | 코드 리팩토링 (기능 변화 없음)            | `refactor: simplify conditional logic in auth flow` |
| `perf`     | 성능 개선                                 | `perf: optimize image loading time on homepage`   |
| `test`     | 테스트 코드 추가/수정                     | `test: add unit tests for utils.js`               |
| `build`    | 빌드 시스템 관련 변경 (예: 의존성, 도구) | `build: update dependencies to latest versions`   |
| `chore`    | 기타 변경사항 (빌드 제외 설정 등)         | `chore: update .gitignore to exclude .env files`  |
<br>

## 브랜치 전략
- 현재 프로젝트의 경우 main과 feature 브랜치만 사용

| 브랜치     | 설명                                                                 |
|------------|----------------------------------------------------------------------|
| main       | 제품으로 출시할 수 있는 최종 버전의 코드가 있는 브랜치 (배포용)        |
| develop    | 다음 출시 버전을 개발하는 브랜치 (기능 통합 및 테스트용)             |
| feature    | 새로운 기능 개발을 위한 브랜치 (보통 develop에서 분기)               |
| release    | 배포 준비를 위한 브랜치 (버그 수정, 문서화 등 최종 조정)             |
| hotfix     | main에서 분기하여 긴급하게 수정하는 브랜치 (배포 중 버그 등)          |
<br>

## git 전략
1. 클론<br>
```bash
git clone https://github.com/Crewrung/crewrung.git
```
&nbsp;&nbsp;&nbsp;&nbsp;1-1.브랜치가 master로 되어있다면
```bash
git branch -M main
```
2. 새 브랜치 생성<br>
```bash
git checkout -b 브랜치 이름
```
3. 코드 작성 후 커밋<br>
```bash
git add .
```
```bash
git commit -m "feat: 작업내용"
```
4. *** 메인 브랜치 pull (가능하면 메인을 자주 업데이트 해줘야함) ***<br>
```bash
git checkout main
```
```bash
git pull origin main
```
5. feature/board 브랜치에 메인 머지 (메인과 바로 머지하기 전 충돌방지)<br>
```bash
git checkout 작업브랜치
```
```bash
git merge main
```
6. 메인으로 머지<br>
```bash
git checkout main
```
```bash
git merge 작업브랜치
```
7. 푸시<br>
```bash
git push origin main
```
<br>

## add와 implemnt의 차이점
| 항목        | `add`                                      | `implement`                                      |
|-------------|--------------------------------------------|--------------------------------------------------|
| 의미  | "새로 추가했다"                             | "구현했다" 또는 "작동하도록 만들었다"              |
| 초점    | 무엇을 추가했는가에 초점                  | 기능이나 로직을 구현한 것에 초점                  |
| 사용 시점| 파일, 폴더, 버튼, 설정 등 물리적 요소 추가 | 함수, 알고리즘, 로직, 동작 기능 구현              |
| 예시 상황| 새로운 라우터 파일 추가                    | 로그인 기능의 로직을 실제로 작동하게 구현         |
<br>

## modify와 fix와 correct의 차이점
| 단어      | 의미                           | 커밋 타입과의 관계        | 주로 쓰이는 상황                         |
|-----------|--------------------------------|---------------------------|------------------------------------------|
| `modify`  | 기존 코드를 변경               | 보통 `chore` 또는 `refactor` | 기능에 변화 없이 코드 수정할 때         |
| `fix`     | 버그 또는 문제를 수정          | `fix` (표준 커밋 타입)     | 오작동하는 기능이나 버그를 고칠 때      |
| `correct` | 잘못된 부분을 바로잡음         | `fix`나 `chore`로 처리 가능 | 문법 오류, 오타, 논리 실수 등 정정      |


