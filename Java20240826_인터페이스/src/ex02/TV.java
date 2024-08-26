package ex02;

interface TV {
	
	int Max = 100;
	
	void powerOn(); // abstract public 생략
	void powerOff();
	void soundUp();
	void soundDown();
	
	// 채널 변경 추가
	default void channelUp() { //default 옵션 부여 
		};
	default void channelDown() {};
}
