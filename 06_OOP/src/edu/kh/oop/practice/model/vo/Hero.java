package edu.kh.oop.practice.model.vo;

public class Hero {

	private String nickname;	//닉네임
	private String job;			// 직업
	private int hp;				// 체력 
	private int mp;				// 마력
	private int level;			// 레벨
	private double exp;			//경험치
	
	public Hero() {}
	public Hero(String nickname, String job, int hp, int mp, int level, int exp) {}

	
	
	
	
	
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public double getExp() {
		return exp;
	}
	public void setExp(double exp) {
		this.exp = exp;
	}
	
	//2) 매개변수 생성자 -> Alt + Shift + s => 필드 초기화용 생성자 자동완성
	/*public Hero(String nickname, String job, int hp, int mp, int level, double exp) {
		super();
		this.nickname = nickname;
		this.job = job;
		this.hp = hp;
		this.mp = mp;
		this.level = level;
		this.exp = exp;
		*/
	
	public void attack(double exp) {/*전달받은 경험치를 현재 경험치에
		누적하고, 공격했다는 메세지 출력. (단, 현재 경험치가 300 이상이면
		현재 레벨을 1 증가시키고, 레벨이 올랐다는 메세지 출력)}*/ 
	}

		public void dash() {/*대시 할 때 마다 현재 mp에서 -10씩 감소되며 
		대시했다는 메세지 출력. (단, 현재 mp가 0 이하라면 
		마력이 부족하여 대시할 수 없다는 메세지 출력)}*/
		}
	
	
		@Override
		public String toString() {//호출 시 해당 메서드를 호출한 객체의 현재 정보를 출력
			return "Hero [nickname=" + nickname + ", job=" + job + ", hp=" + hp + ", mp=" + mp + ", level=" + level
					+ ", exp=" + exp + "]";
		
	}	
	
}
