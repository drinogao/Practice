/*通过五个集合(由二进制转十进制)，找出生日在一个月中的哪一天，1-31可用5位二进制数表示，
  例:Set5 Set4 Set3 Set2 Set1，1为0 0 0 0 1，即出现在set1集合内，某天的 Setk 位为1，那么该数就会出现在k的集合内
  如31二进制为1 1 1 1 1,即31会出现在每一个集合当中.
  
  通过用户选择哪个集合中出现用户的生日，再将集合的第一个数加起来就是用户的生日
  五个集合其实就是相当于一个二进制的数，如果set1中出现了用户的生日days加1，因为set1是二进制中的第五位即00001，
  set2是二进制中的第四位即00010，days加2，00100为4，01000为8，10000为16以此类推
  
  如生日为7，那么7就在Set1 Set2 Set3中出现，按(Set5 Set4 Set3 Set2 Set1)即为 00111得出用户生日 */

import java.util.*;

class GuessBrithday{
	public static void main(String[] args){
		String set1 =		  "1	3	5	7\n" + 
					  "9	11	13	15\n" +
					  "17	19	21	23\n" +
					  "25	27	29	31";
		
		String set2 = 		  "2	3	6	7\n" +
					  "10	11	14	15\n" +
					  "18	19	22	23\n" +
					  "26	27	30	31";
		
		String set3 =		  "4	5	6	7\n" +
					  "12	13	14	15\n" +
					  "20	21	22	23\n" + 
					  "28	29	30	31";
		
		String set4 = 		 "8	9	10	11\n" +
					  "12	13	14	15\n" +
					  "24	25	26	27\n" +
					  "28	29	30	31";
		
		String set5 =		  "16	17	18	19\n" +
					  "20	21	22	23\n" +
					  "24	25	26	27\n" +
					  "28	29	30	31";
		
		int day = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println(set1);
		System.out.print("Is your birthday in Set?\n" + "If in it,enter 1 else 0.\n");
		int answer = input.nextInt();
		if(answer == 1)
			day += 1;
		
		System.out.println(set2);
		System.out.print("Is your birthday in Set?\n" + "If in it,enter 1 else 0.\n");
		answer = input.nextInt();
		if(answer == 1)
			day += 2;
		
		System.out.println(set3);
		System.out.print("Is your birthday in Set?\n" + "If in it,enter 1 else 0.\n");
		answer = input.nextInt();
		if(answer == 1)
			day += 4;
		
		System.out.println(set4);
		System.out.print("Is your birthday in Set?\n" + "If in it,enter 1 else 0.\n");
		answer = input.nextInt();
		if(answer == 1)
			day += 8;
		
		System.out.println(set5);
		System.out.print("Is your birthday in Set?\n" + "If in it,enter 1 else 0.\n");
		answer = input.nextInt();
		if(answer == 1)
			day += 16;
		
		System.out.println("Your birthday is " + day);
	}
}


/*利用同样的方法，也可以得出月份，年份
  月份通过4位二进制即可表达，所以只需四个集合*/

import java.util.*;

class GuessBrithday_Month{
	public static void main(String[] args){
		String set1 = "1	3	5	7	9	11" ;
		
		String set2 = "2	3	6	7	10	11";	
		
		String set3 = "4	5	6	7	12";	
		
		String set4 = "8	9	10	11	12";
		
		int month = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println(set1);
		System.out.print("Is your birthday in Set?\n" + "If in it,enter 1 else 0.\n");
		int answer = input.nextInt();
		if(answer == 1)
			month += 1;
		
		System.out.println(set2);
		System.out.print("Is your birthday in Set?\n" + "If in it,enter 1 else 0.\n");
		answer = input.nextInt();
		if(answer == 1)
			month += 2;
		
		System.out.println(set3);
		System.out.print("Is your birthday in Set?\n" + "If in it,enter 1 else 0.\n");
		answer = input.nextInt();
		if(answer == 1)
			month += 4;
		
		System.out.println(set4);
		System.out.print("Is your birthday in Set?\n" + "If in it,enter 1 else 0.\n");
		answer = input.nextInt();
		if(answer == 1)
			month += 8;
		
		System.out.println("Your birthday is " + month);
	}
}
