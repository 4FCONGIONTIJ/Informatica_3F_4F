# Compilatore e flag
CXX = g++
CXXFLAGS = -std=c++14 -Wall

# Nome dell'eseguibile finale
TARGET = programma

# File sorgente
SRCS = main.cpp Veicoli.cpp 2ruote.cpp 3ruote.cpp 4ruote.cpp
OBJS = $(SRCS:.cpp=.o)

# Regola di default
all: $(TARGET)

# Link dei file oggetto per creare l'eseguibile
$(TARGET): $(OBJS)
	$(CXX) $(CXXFLAGS) -o $(TARGET) $(OBJS)

# Compilazione dei singoli file sorgente in file oggetto
%.o: %.cpp
	$(CXX) $(CXXFLAGS) -c $< -o $@

# Pulizia dei file generati
clean:
	rm -f $(OBJS) $(TARGET)