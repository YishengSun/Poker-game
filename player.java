package front;

public class player {
	String name;
	int[] mycard;
	int[] type = new int[3];// 记录拿到的牌的花色,黑桃1-13，红桃
	int[] mycardNUM = new int[3];// 记录拿到的牌算出花色后的数字

	player(String name, int[] id) // id数列是用来存储发牌（deal）生成的三张牌大小的数列
	{
		this.name = name;
		mycard = id;

		type[0] = mycard[0] / 13;
		type[1] = mycard[1] / 13;
		type[2] = mycard[2] / 13;
		mycardNUM[0] = 1 + mycard[0] % 13;
		mycardNUM[1] = 1 + mycard[1] % 13;
		mycardNUM[2] = 1 + mycard[2] % 13;
	}

	player compare(player ano)// 定义一个返回值为player类型的函数,作为两个玩家的数比较
	{
		int metotal = this.mycardNUM[0] + this.mycardNUM[1] + this.mycardNUM[2];
		int anototal = ano.mycardNUM[0] + ano.mycardNUM[1] + ano.mycardNUM[2];
		boolean b = metotal >= anototal;//胜出方式为只考虑牌的数字之和，不考虑花色
		if (b)
			return this;
		else
			return ano;

	}

	public String toString() {
		return name + "\t" + mycard[0] + "\t" + mycard[1] + "\t" + mycard[2];
	}


   public String getcolor(int m){
	   
	   String s="";
		   if (m==0)
             s="黑桃";
		   else if (m==1)
			   s="红桃";
		   else if (m==2)
			   s="方块";
			   else
			   s="梅花";
		   
	  return s;   
			   
	   
   }
   
   public String toString1(){
	   return name+": "+"\t"+getcolor(type[0])+mycardNUM[0]+"\t"+getcolor(type[1])+mycardNUM[1]+"\t"+getcolor(type[2])+mycardNUM[2];
	   
   }
}