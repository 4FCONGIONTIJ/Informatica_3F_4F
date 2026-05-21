#ifndef RUOTE3_HPP
#define RUOTE3_HPP
using namespace std;
#include "Veicoli.hpp"
#include <string>

class TreRuote : public Veicoli {
protected:
    string getMarche() override;
    double getCostoMedio() override;
};

#endif 