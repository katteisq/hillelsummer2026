
 interface Printer {
    void print(Messanger.Message message);
}
/*
void - metoda nie zwraca żadnej wartości, jej jedynym zadaniem jest wpisanie tekstu w konsoli
print - nazwa metody
(Message message) - nie używamy String ponieważ przekazujemy w taki sposób tylko sam tekst wiadomości
Nasza wiadomośc składa się z dwóch elementów dlatego uzywamy Message ponieważ pozwala na
grupowanie w sobie tych dwóch obiektów
 */
