첫번째 앱은 사용자가 주사위를 굴리고, 나온 값을 확인할 수 있는 앱이다.
주사위는 1~6의 육면체 주사위이며, 화면에 나온 주사위의 눈 값이 표기되어야 한다.
뿐만 아니라 1~6까지의 숫자가 나온 횟수와 해당 횟수를 사용자가 Reset할 수 있는 버튼이 있어야 한다.
또한 주사위는 한번 굴릴 때마다 색이 바뀌어야한다.

주사위를 누를때마다 주사위를 굴리는 함수를 호출 – 해당 함수는 주사위를 돌리고, 주사위의 색을 바꾸고, Count를 증가시켜야 한다.
Reset 버튼을 누를 시 Count를 Reset

하나의 Activity, 두개의 Button, 한 개의 Textbox?
각 버튼을 Onclick 할 시 작동하는 두개의 메소드 (DiceRoll, CountReset)
Dice(Onclick) -> DiceRoll -> Reset(Onclick) -> CountReset

 
2. 손전등 앱
Flashlight Application은 화면의 색을 변경하는 Application이다.
특정 색상을 띄는 Main Screen과 Main Screen의 색을 변경시킬 수 있는 Button이 함께 제공된다.
사용자가 해당 Button (Ex. Red)를 누를 시, Main Screen의 Color가 해당 색으로 변화한다.

MainActivity의 배경색 변화시키기
한 개의 Activity, 다수의 Button, 


Custom 버튼을 추가하여 사용자 지정 색상을 사용할 수 있으면 좋을 것 같다
