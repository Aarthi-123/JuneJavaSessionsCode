package junesessions;

public class IncrementalAndDecremental {

	public static void main(String[] args) {
		
		//1.post increment:
		//++
		int m = 1;
		int n = m++;
		System.out.println(m);//2
		System.out.println(n);//1
		
		int p = -89;
		int q = p++;
		System.out.println(p);//-88
		System.out.println(q);//-89
		
		int t = 0;
		int r = t++;
		System.out.println(t);//1
		System.out.println(r);//0
		
		int k = -999;
		int g = k++;
		System.out.println(g);//-999
		System.out.println(k);//-998
		
		int total = 1;
		System.out.println(total++);//1
		System.out.println(total);//2
		
		//2.pre increment:
		
		int b = 1;
		int v = ++b;
		System.out.println(v);//2
		System.out.println(b);//2
		
		int tt = -89;
		int rr = ++tt;
		System.out.println(rr);//-88
		System.out.println(tt);//-88
		
		int pop = 100;
		System.out.println(++pop);//101
		System.out.println(pop);//101
		
		//3.post decrement:
		//--
		int d = 2;
		int f = d--;
		System.out.println(d);//1
		System.out.println(f);//2
		
		int y = -99;
		int z = y--;
		System.out.println(z);//-99
		System.out.println(y);//-100
		
		int food = -89;
		System.out.println(food--);//-89
		System.out.println(food);//88
		
		//4.pre decrement:
		int e = 2;
		int u = --e;
		System.out.println(e);//1
		System.out.println(u);//1
		
		int test = -989;
		int testing = --test;
		System.out.println(test);//-990
		System.out.println(testing);//-990
		
		int google = -1000;
		System.out.println(--google);//-1001
		System.out.println(google);//-1001
		System.out.println(google++);//-1001
		System.out.println(google);//-1000
		
		int bal = 500;
		int totalBal = bal++ +10;
		int newbal = bal++ +10;
		System.out.println(totalBal);//510
		System.out.println(bal);//501
		System.out.println(totalBal);//510
		System.out.println(newbal);//511
		
		
		
		
		int x = 45;
		int y2 = --x + x-- + x-- + --x + --x;
		System.out.println(y2);//212
		
		
		int le = 2;
		int re = le++ + le++ - le++;
		System.out.println(le);
		
		int te = ++le + le++ -le++; 
		System.out.println(re);//1
		System.out.println(te);//5
		
		
		//explanation:
		//int le = 2;					le=2--->le=3(le++)--->le=4(le++)--->le=5	
		//int re= le++ + le++ - le++;	
		//			2  + 3 - 4 = 1
		
		//int te = ++le + le++ - le++;  le=2--->le=3(++le)---le=4(le++)---le=5(le++)
		//			3   + 3 - 4 = 2
	}

}
