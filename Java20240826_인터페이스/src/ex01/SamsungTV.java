package ex01;

 class SamsungTV {
	
	// 전원 -> on, off  ->  boolean
	// 소리 -> 높이기 낮추기 기능 -> int
	
	private int sound = 0;
	private boolean isActive = false;
	
	public SamsungTV() {}
	
	public SamsungTV(int _sound, boolean _isActive) {
		sound = _sound;
		isActive = _isActive;
	}
	
	public void IsActive(boolean _active) {
		isActive = _active;
	}
	
	public void ChangeSound(int _sound) {
		if(isActive)
		{
			sound += _sound;
		}
		else {
			System.out.println("전원이 꺼져있습니다.");
		}
	}
	
 }
