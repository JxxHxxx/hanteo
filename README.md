# hanteo
안녕하세요. 이재헌입니다.

# 1번 문제 설명서
- 검색 조건 요구 사항을 확인하실 수 있도록 기본 데이터를 넣어두었습니다. [기본 데이터(data.sql)](https://github.com/JxxHxxx/hanteo/blob/master/src/main/resources/data.sql)



- 카테고리 검색 API 테스트 방법 (로컬 환경 기준) 

```
1. DemoApplication 을 실행해주세요.
```

```
2. 검색 API 요청 HTTP 메서드 및 URI

GET: localhost:8080/boards
```
   
```
쿼리 파라미터 설명

genderId : 성별 카테고리 식별자
idolGroupId : 아이돌 그룹 카테고리 식별자
boardId : 게시판 카테고리 식별자
genderName : 성별 이름
idolGroupName : 아이돌 그룹 이름
boardName : 게시판 이름
```

```
API 호출 예시
GET : localhost:8080/boards?genderId=1&idolGroupId=2
```

# 2번 문제 설명서
- 프로젝트 내 solution2/Runner.java main 메서드를 실행시켜주세요.

- 구현 방법은 solution2/CoinResolver.java 에 작성해두었습니다.
