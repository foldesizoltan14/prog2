#include <iostream>

using namespace std;

class Szulo
{
public:
 void szul()
	{
		cout<<"Szulo vagyok"<<endl;
}
};
class gyermek: public Szulo
{
public:
 void gyer()
	{
		cout<<"gyerek vagyok"<<endl;
}
};



int main(int argc, char **argv)
{

Szulo* egy = new Szulo();
gyermek* ketto = new gyermek();
egy->szul();
ketto->gyer();
ketto->szul();
egy->gyer();
}
	


