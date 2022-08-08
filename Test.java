//(7).demonstrate concept of Interface.

interface Deprecated
{
  int bpay = 20000;
  double bonus(double b);
}

class Sales implements Deprecated
{
	public double bonus(double b)
	{
		System.out.println("Bonus : "+(bpay*b));
          return (bpay+(bpay*b));
	}
}

class Test
{
	public static void main(String[] args) {
		Sales s = new Sales();
		System.out.println("Total Salary : "+(s.bonus(0.2)));
	}
}