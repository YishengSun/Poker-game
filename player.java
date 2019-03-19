package front;

public class player {
	String name;
	int[] mycard;
	int[] type = new int[3];// ��¼�õ����ƵĻ�ɫ,����1-13������
	int[] mycardNUM = new int[3];// ��¼�õ����������ɫ�������

	player(String name, int[] id) // id�����������洢���ƣ�deal�����ɵ������ƴ�С������
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

	player compare(player ano)// ����һ������ֵΪplayer���͵ĺ���,��Ϊ������ҵ����Ƚ�
	{
		int metotal = this.mycardNUM[0] + this.mycardNUM[1] + this.mycardNUM[2];
		int anototal = ano.mycardNUM[0] + ano.mycardNUM[1] + ano.mycardNUM[2];
		boolean b = metotal >= anototal;//ʤ����ʽΪֻ�����Ƶ�����֮�ͣ������ǻ�ɫ
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
             s="����";
		   else if (m==1)
			   s="����";
		   else if (m==2)
			   s="����";
			   else
			   s="÷��";
		   
	  return s;   
			   
	   
   }
   
   public String toString1(){
	   return name+": "+"\t"+getcolor(type[0])+mycardNUM[0]+"\t"+getcolor(type[1])+mycardNUM[1]+"\t"+getcolor(type[2])+mycardNUM[2];
	   
   }
}