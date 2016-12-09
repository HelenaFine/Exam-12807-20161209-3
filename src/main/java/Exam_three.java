import java.util.Scanner;

public class Exam_three {

	public static void main(String[] args){
	System.out.println("请输入日期（日期格式为2015-01-01）：");
	Scanner scanner= new Scanner(System.in);
	String dateStr = scanner.nextLine();
	String [] str = dateStr.split("-");
	int year = Integer.parseInt(str[0]);
	int month = Integer.parseInt(str[1]);
	int day = Integer.parseInt(str[2]);
	int sum=0;//每月的总天数
	int run=0;//闰年
	switch(month){
	case 1:
		sum=0;
		break;
	case 2:
		sum=31;
		break;
	case 3:
		sum=59;
		break;
	case 4:
		sum=90;
		break;
	case 5:
		sum=120;
		break;
	case 6:
		sum=151;
		break;
	case 7:
		sum=181;
		break;
	case 8:
		sum=212;
		break;
	case 9:
		sum=243;
		break;
	case 10:
		sum=273;
		break;
	case 11:
		sum=304;
		break;
	case 12:
		sum=334;
		break;
	default:System.out.println("您输入的日期错误");
			break;
	}
	
	sum= sum+day;//天数之和
	
	//判断闰年
	if((year%4==0&&year%100!=0)||year%400==0)
	{
		run=1;
		}
	else{
		run=0;
		}
	if(run==1&&month>2)
		{
			sum++;
		}
	System.out.println("您输入的日期为当年的第"+sum+"天");
	  }
	}

