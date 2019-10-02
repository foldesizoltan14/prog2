class Madar {
public void repul() {};
};

class Prog {
public void fgv ( Madar madar) {
		madar.repul();
		}

};
class Sas extends Madar {};
class Pingvin extends Madar {};

class Liskov{
		public static void main(String[] args)
		{	
			Prog kod = new Prog();
			Madar mad = new Madar ();
			kod.fgv (mad);
	
			Sas sas = new Sas();
			kod.fgv (sas);
			
			Pingvin pingvin = new Pingvin();
			kod.fgv(pingvin);
	}
}
