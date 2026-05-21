#ifndef VEICOLI.HPP
#define VEICOLI.HPP
#include <string>
using namespace std;
class Veicoli{
    public:
    virtual ~Veicoli() = default;
    void marche();
    void costomedio();
    protected:
    virtual string getMarche() = 0;
    virtual double getCostoMedio() = 0;
};
#endif 