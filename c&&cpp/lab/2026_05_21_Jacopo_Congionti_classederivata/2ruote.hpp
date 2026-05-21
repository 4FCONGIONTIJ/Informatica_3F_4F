#ifndef RUOTE2_HPP
#define RUOTE2_HPP
using namespace std;
#include "Veicoli.hpp"
#include <string>

class DueRuote : public Veicoli {
protected:
    string getMarche() override;
    double getCostoMedio() override;
};

#endif 