#Petar Canoski 
#233053

2. CFG слика

3. Цикломатската комплексност можеме да ја пресметаме како C = P + 1.
   Во нашиот код p (бројот на предикатни јазли) е 7. Затоа:
   C = 7 + 1 → C = 8

4. Потребни се 5 тест случаи за да се опфатат сите изјави (statements).

Првиот тест случај е за листа со вредност null за да добиеме исклучок.

Вториот тест случај е артикл без име за да добиеме исклучок.

Третиот тест случај е скап артикл за да се додаде попуст.

Четвртиот тест случај е невалиден број на картичка за да видиме исклучок.

Петтиот тест случај е празна листа од артикли и валидна картичка.


Statement: allItems = null,
cardNumber = "123" | allItems = [("", 100, 0, 1)],
cardNumber = 1234567891234567 | allItems = [("exp", 350, 0, 1)],
cardNumber = 1234567891234567 | allItems = [("име", 100, 0, 1)],
cardNumber = 123 | allItems = [],
cardNumber = 1234567891234567

1 ✓ ✓ ✓ ✓ ✓  
2 ✓  
3 ✓ ✓ ✓ ✓  
4 ✓ ✓ ✓ ✓  
5 ✓ ✓ ✓  
6 ✓ ✓ ✓  
7 ✓  
8 ✓ ✓  
9 ✓  
10 ✓ ✓  
11  
12 ✓ ✓  
13 ✓ ✓ ✓  
14 ✓ ✓  
15 ✓ ✓  
16 ✓ ✓  
17 ✓ ✓  
18 ✓ ✓  
19  
20 ✓  
21 ✓ ✓

5.За овој критериум ни требаат 4 случаи бидејќи треба да ги опфатиме само TXX, XTX, XXT, FFF.
if (item.getPrice() > 300 || item.getDiscount() > 0 || item.getQuantity() > 10).
TXX → item = Item(350, 0, 0)

XTX → item = Item(350, 10, 0)

XXT → item = Item(350, 0, 120)

FFF → item = Item(250, -10, -10)