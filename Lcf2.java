class Lcf2 
{
	public static void main(String[] args) 
	{
		int n1 = 12;
		int n2 = 8;
		int large = n1 > n2 ? n1 : n2;
		int i = 1;
		while(true)
		{
			if((large * i ) % n1 == 0 && (large * i ) % n2 == 0){
				System.out.println(" Lcf is = " + (large * i));
				break;
			}
			System.out.println(i);
			i++;
		}
	}
}
