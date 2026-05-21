#include "Veicoli.hpp"
#include "2ruote.hpp"
#include "3ruote.hpp"
#include "4ruote.hpp"
#include <iostream>
using namespace std;
int main() {
    cout << "--- 2ruote ---\n";
    DueRuote miaMoto;
    miaMoto.marche();
    miaMoto.costomedio();
    cout << "\n";
    cout << "--- 3ruote ---\n";
    TreRuote mioTriciclo;
    mioTriciclo.marche();
    mioTriciclo.costomedio();
    cout << "\n";
    cout << "--- 4ruote ---\n";
    QuattroRuote miaAuto;
    miaAuto.marche();
    miaAuto.costomedio();
    cout << "\n";
    return 0;
}