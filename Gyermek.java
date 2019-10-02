class Szulo
{
public void szul()
	{
		System.out.println("Szulo vagyok");
}
};
class Gyermek extends Szulo
{
public void gyer()
	{
		System.out.println("Gyermek vagyok");
}


public static void main (String[] args)
{
Szulo egy = new Szulo();
Gyermek ketto = new Gyermek();
egy.szul();
ketto.gyer();
ketto.szul();
egy.gyer();


}
};
