#include "Veicoli.hpp"
#include <iostream>
using namespace std;
void Veicoli::marche() {
cout << "Marche disponibili: " << getMarche() << "\n";
}
void Veicoli::costomedio() {
cout << "Costo medio della categoria: " << getCostoMedio() << " EUR\n";
}