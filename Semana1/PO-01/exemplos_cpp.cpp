#include <iostream>
#include <string>
using namespace std;

//Exemplo 1

class Animal{
    private:
        string nome;
    public:
        Animal(){
            this->nome = "Padrao";
        }

        Animal(string nome){
            this->nome = nome;
        }

        virtual void fazerSom(){
            cout<<nome<<" esta fazendo um som!!!"<<endl;
        }

        void setNome(string nome){
            this->nome = nome;
        }

        string getNome(){
            return nome;
        }
};

//Exemplo 2
class Cachorro : Animal{
    private:
        string nome;
    public:
        Cachorro(){
            this->nome = "Cachorro Padrao";
        }

        Cachorro(string nome){
            this->nome = nome;
        }

        void fazerSom(){
            cout<<"O cachorro "<<nome<<" esta fazendo um som!!!"<<endl;
            cout<<"AuAu!!!"<<endl;
        }

        void setNome(string nome){
            this->nome = nome;
        }

        string getNome(){
            return nome;
        }
};
//Exemplo 3
class Gato : Animal{
    private:
        string nome;
    public:
        Gato(){
            this->nome = "Gato Padrao";
        }

        Gato(string nome){
            this->nome = nome;
        }

        void fazerSom(){
            cout<<"O gato "<<nome<<" esta fazendo um som!!!"<<endl;
            cout<<"Miau!!!"<<endl;
        }

        void setNome(string nome){
            this->nome = nome;
        }

        string getNome(){
            return nome;
        }
};
//Exemplo 4
class Porco: Animal{
    private:
        string nome;
    public:
        Porco(){
            this->nome = "Porco Padrao";
        }

        Porco(string nome){
            this->nome = nome;
        }

        void fazerSom(){
            cout<<"O porco "<<nome<<" esta fazendo um som!!!"<<endl;
            cout<<"Oinc oinc!!!"<<endl;
        }

        void setNome(string nome){
            this->nome = nome;
        }

        string getNome(){
            return nome;
        }
};
//Exemplo 5
class Vaca: Animal{
    private:
        string nome;
    public:
        Vaca(){
            this->nome = "Vaca Padrao";
        }

        Vaca(string nome){
            this->nome = nome;
        }

        void fazerSom(){
            cout<<"A vaca "<<nome<<" esta fazendo um som!!!"<<endl;
            cout<<"Muu!!!"<<endl;
        }

        void setNome(string nome){
            this->nome = nome;
        }

        string getNome(){
            return nome;
        }
};



int main(void){

    Animal a1 ("Max");
    a1.fazerSom();

    Cachorro a2("Max");
    a2.fazerSom();

    Gato a3("Juma");
    a3.fazerSom();

    Porco a4;
    a4.fazerSom();

    Vaca a5("Mimosa");
    a5.fazerSom();

    return 0;
}
 
