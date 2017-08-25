import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		bancomat();

	}

	static int pin=1111;
	static int x =0;
	static int bal=1000;
	
	public static boolean pass(){
		System.out.println("Введіть пароль");
		if(pin==new Scanner(System.in).nextInt()){
			return true;
		}
		
		
		else{
		return false;
		}
	}//pass
		public static void bancomat() {
			if(pass()){
				menu();
			}else{
				if(x<2){
					System.out.println("У вас залишилося: "+x+" спроб.");
					x++;
					bancomat();
					
				}
				
			}
		}//bancomat
		
		public static void menu(){
			System.out.println("1) Показати баланс" + "\n" +
		 			 "2) Зняти готівку" + "\n" +
		 			 "3) Поповнити рахунок" + "\n" +
		 			 "4) logout");;
			switch (new Scanner(System.in).nextInt()) {
			case 1 :
				ball();
			case 2 :
				getCash();
			case 3 :
				setCash();
			case 4 :
				break;

			default:
				System.out.println("Немає такої опції");
				menu();
			}
			
		}
		public static void ball(){
			System.out.println("На вашому рахунку:"+bal);
			menu();
		}
		
		public static void getCash(){
			System.out.println("Яку суму ви бараєте зняти?:");
			int sum=new Scanner(System.in).nextInt();
			if(sum<=bal){
				bal-=sum;
				ball();
			}
			else{
				System.out.println("На вашому балансі недостатньо коштів");
				getCash();
			}
			
		}
		public static void setCash(){
			System.out.println("Яку суму в бажаєте внести?");
			bal+= new Scanner(System.in).nextInt();
			ball();
			menu();
		}
		
		
		
		
}
