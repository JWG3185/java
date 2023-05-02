package game;

import java.util.Random;
import java.util.Scanner;

//������ ü���� 1000
//������ �⺻ ü���� 500
//�ϴ� ����, ȸ�� ����
//���ݽ� 100~149�� ������ ������
//ȸ���� 100~149�� ������ ����
//
//���� ������ ��ȿŸ�� ��ȿŸ�� ���� ������ �¸�
//������ ü���� �� ��¸� ��� ������ �¸�


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
        	
        	System.out.print(unit1.name + "�� ����(y)/����(n)�� �Է��ϼ���>> ");
        	String a1 = sc.next();
        	int p1  = 100 + random.nextInt(50);
        	
        	switch(a1) {
        		case "y":{
        			unit1.attack(p1);
        			System.out.println(unit1.name + "�� " + p1 + "��ŭ �������� �־����ϴ�.");
		        	
		        	if (unit1.weapon.getRestPower() <= 0) {
		        		System.out.println(unit1.name + "�� ü���� �� ��ҽ��ϴ�.");
		        		System.out.println("���� ��");
		        		System.out.print(unit2.name + "�� �¸�");
		        		System.exit(1);
		        	}
		        	
		        	if (bossPower <= 0) {
		        		System.out.println(unit1.name + "�� �������� ������ ���������ϴ�.");
		        		System.out.println("���� ��");
		        		System.out.print(unit1.name + "�� �¸�");
		        		System.exit(1);
		        	}
		        	else {
		        		System.out.println("������ ������ ü���� " + bossPower);
		        	}
		        	break;
        		}
        		
        		case "n": {
        			unit1.weapon.charge(p1);
        			System.out.println(p1 + "��ŭ ü�� ȸ��");
        			break;
        		}
        	}
        	
	        System.out.println();	
        	
        	System.out.print(unit2.name + "�� ����(y)/����(n)�� �Է��ϼ���>> ");
        	String a2 = sc.next(); 
        	int p2  = 100 + random.nextInt(50);
        	switch(a2) {
        		case "y":{
        			unit2.attack(p2);
        			System.out.println(unit2.name + "�� " + p2 + "��ŭ �������� �־����ϴ�.");
		        	
		        	if (unit1.weapon.getRestPower() <= 0) {
		        		System.out.println(unit1.name + "�� ü���� �� ��ҽ��ϴ�.");
		        		System.out.println("���� ��");
		        		System.out.print(unit2.name + "�� �¸�");
		        		System.exit(1);
		        	}
		        	
		        	if (bossPower <= 0) {
		        		System.out.println(unit2.name + "�� �������� ������ ���������ϴ�.");
		        		System.out.println("���� ��");
		        		System.out.print(unit2.name + "�� �¸�");
		        		System.exit(1);
		        	}
		        	else {
		        		System.out.println("������ ������ ü���� " + bossPower);
		        	}
		        	break;
        		}
        		
	        	case "n":{
	        		unit2.weapon.charge(p2);
	        		System.out.println(p2 + "��ŭ ü�� ȸ��");
	        		break;
	        	}
        	}
	        	
	        	System.out.println();
	        	
	        	System.out.println(unit1.name + "�� ���� ü��" + unit1.weapon.getRestPower());
	        	System.out.println(unit2.name + "�� ���� ü��" + unit2.weapon.getRestPower());
	        	
	        	
	        	System.out.println();
	        	System.out.println("========= " + count + "�� �� =========");
	        	System.out.println();
	        	
        }
    }
}

