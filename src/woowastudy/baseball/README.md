# 우아한 테크코스
## 1주차 미션 : 숫자 야구 게임

### 기능 구현

0. 사용자가 게임을 시작한다.
1. 컴퓨터는 랜덤한 서로 다른 세자리 수를 생성한다.(1-9)
2. 사용자는 입력을 통해 랜덤한 세자리 수를 유추한다.
3. 입력값 3자리 수 중 각 자리수와 컴퓨터가 생성한 난수의 각 자리 수를 비교
4. 자리수도 같고 수도 일치하는 경우 Strike, 자리수는 다르나 수는 있는 경우 Ball, 모두 다른 경우 Nothing을 출력
5. 게임이 끝나면 재시작/종료를 선택할 수 있다.

-- 클래스 : 사용자 입력 & 검증 // 게임모델 : 난수 생성, 비교 // 출력 

### 예외 처리

1. 사용자가 문자열을 입력하는 경우(Int형으로 변환되지 않는)
2. 사용자가 범위 밖의 값을 입력하는 경우

### 리팩토링

1. 사용자의 입력 및 랜덤값을 값객체로 사용해보자.