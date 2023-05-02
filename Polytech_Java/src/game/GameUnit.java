package game;

import java.util.Random;
import java.util.Scanner;

//보스의 체력은 1000
//유닛의 기본 체력은 500
//턴당 공격, 회복 선택
//공격시 100~149의 랜덤한 데미지
//회복시 100~149의 랜덤한 힐링
//
//보스 마지막 유효타시 유효타를 날린 유닛의 승리
//유닛의 체력이 다 닳는면 상대 유닛의 승리


public class GameUnit{
	static int bossPower = 1000;
    private int unitPower = 500;
    private MyWeapon weapon; 
    private String name;
    
    GameUnit(){}
    GameUnit(String name){
    	this.name = name;
    	weapon = new MyWeapon();
    	weapon.charge(unitPower);
    }
    
    void attack(int x) {
    	bossPower = bossPower - x;
    	weapon.fire(x);
    }
    
    public static void main(String[] args) {
    	GameUnit unit1 = new GameUnit("unit1");
        GameUnit unit2 = new GameUnit("unit2");
        
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        
        int count = 0;
        
        while(true){
        	count++;
        	
        	System.out.print(unit1.name + "님 공격(y)/충전(n)을 입력하세요>> ");
        	String a1 = sc.next();
        	int p1  = 100 + random.nextInt(50);
        	
        	switch(a1) {
        		case "y":{
        			unit1.attack(p1);
        			System.out.println(unit1.name + "는 " + p1 + "만큼 데미지를 넣었습니다.");
		        	
		        	if (unit1.weapon.getRestPower() <= 0) {
		        		System.out.println(unit1.name + "의 체력이 다 닳았습니다.");
		        		System.out.println("게임 끝");
		        		System.out.print(unit2.name + "의 승리");
		        		System.exit(1);
		        	}
		        	
		        	if (bossPower <= 0) {
		        		System.out.println(unit1.name + "의 공격으로 보스가 쓰러졌습니다.");
		        		System.out.println("게임 끝");
		        		System.out.print(unit1.name + "의 승리");
		        		System.exit(1);
		        	}
		        	else {
		        		System.out.println("공격후 보스의 체력은 " + bossPower);
		        	}
		        	break;
        		}
        		
        		case "n": {
        			unit1.weapon.charge(p1);
        			System.out.println(p1 + "만큼 체력 회복");
        			break;
        		}
        	}
        	
	        System.out.println();	
        	
        	System.out.print(unit2.name + "님 공격(y)/충전(n)을 입력하세요>> ");
        	String a2 = sc.next(); 
        	int p2  = 100 + random.nextInt(50);
        	switch(a2) {
        		case "y":{
        			unit2.attack(p2);
        			System.out.println(unit2.name + "는 " + p2 + "만큼 데미지를 넣었습니다.");
		        	
		        	if (unit1.weapon.getRestPower() <= 0) {
		        		System.out.println(unit1.name + "의 체력이 다 닳았습니다.");
		        		System.out.println("게임 끝");
		        		System.out.print(unit2.name + "의 승리");
		        		System.exit(1);
		        	}
		        	
		        	if (bossPower <= 0) {
		        		System.out.println(unit2.name + "의 공격으로 보스가 쓰러졌습니다.");
		        		System.out.println("게임 끝");
		        		System.out.print(unit2.name + "의 승리");
		        		System.exit(1);
		        	}
		        	else {
		        		System.out.println("공격후 보스의 체력은 " + bossPower);
		        	}
		        	break;
        		}
        		
	        	case "n":{
	        		unit2.weapon.charge(p2);
	        		System.out.println(p2 + "만큼 체력 회복");
	        		break;
	        	}
        	}
	        	
	        	System.out.println();
	        	
	        	System.out.println(unit1.name + "의 현재 체력" + unit1.weapon.getRestPower());
	        	System.out.println(unit2.name + "의 현재 체력" + unit2.weapon.getRestPower());
	        	
	        	
	        	System.out.println();
	        	System.out.println("========= " + count + "턴 끝 =========");
	        	System.out.println();
	        	
        }
    }
}

