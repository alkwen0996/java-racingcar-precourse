# 프리코스 2주차 미션 - 자동차 경주 게임

## 🚓 구현 기능 목록

### [게임 내용]

#### 사용자

    - 컴퓨터(상대방), 유저(나)

#### 게임 진행 과정

    1. 경주에 참여할 n대의 자동차 이름을 입력받는다.
    2. 몇번의 라운드를 수행할지 입력받는다.
    3. 각 차수별로 결과를 출력하면서 게임을 진행한다.
    4. 우승자를 선정하여 출력한다.

### [구현 기능 목록]

#### 자동차 경주 게임 진행

    1. 자동차 이름을 입력받는다.
        -> 쉼표(,)를 기준으로 입력받는다.
        -> 각 자동차의 이름의 길이 5이하의 영어 대,소문자 및 숫자(0~9)만 가능하다.
        -> 자동차의 개수는 2대이상 입력되어야 한다.
        -> 잘못된 값 입력시 IllegalArgumentException 발생 후 재입력 하게 한다.

    2. 게임을 몇번 진행할지 시도 횟수를 입력받는다.
        -> 게임 시도 횟수는 한 자리 숫자(1~9)만 가능하다.
        -> 잘못된 값 입력시 IllegalArgumentException 발생 후 재입력 하게 한다.

    3. 전진 여부를 결정한다.
        3-1. 랜덤으로 범위(0~9)내의 값을 입력받는다.
        3-2. 값이 4이상일 경우 전진한다.

    4. 라운드별로 게임 진행 결과를 출력한다.
        4-1. "-" 기호로 전진 표시
        4-2. 각 차수당 자동차 이름별로 위치를 출력

    5. 우승자를 선정한다.
        5-1. 우승자가 여러명일 경우 쉼표(,)로 구분하여 출력.

    6. 우승자를 출력한다.

#### 예외처리

    1. 자동차 이름은 5글자 이하의 영어 대,소문자 및 숫자(0~9)로만 구성되어야 한다.
    2. 자동차 대수는 2대 이상 입력 해야한다.
    3. 게임 라운드 시도 횟수는 1 이상의 숫자를 입력해야 한다.
