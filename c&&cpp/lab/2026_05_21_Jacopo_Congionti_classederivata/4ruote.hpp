#ifndef RUOTE4_HPP
#define RUOTE4_HPP
using namespace std;
#include "Veicoli.hpp"
#include <string>

class QuattroRuote : public Veicoli {
protected:
    string getMarche() override;
    double getCostoMedio() override;
};

#endif 