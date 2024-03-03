
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyPen implements IPen {
  public int f1(List<Pen> t) {
    int count = 0;
    for (Pen pen : t) {
      if (countChars(pen.getName(), 'A') >= 2) {
        count++;
      }
    }
    return count;
  }

  public void f2(List<Pen> t) {
    int minPrice = Integer.MAX_VALUE;
    int minPriceIndex = -1;

    for (int i = 0; i < t.size(); i++) {
      Pen pen = t.get(i);
      if (pen.getPrice() % 2 == 1 && pen.getPrice() < minPrice) {
        minPrice = pen.getPrice();
        minPriceIndex = i;
      }
    }

    if (minPriceIndex != -1) {
      t.remove(minPriceIndex);
    }
  }

  public void f3(List<Pen> t) {
      Collections.sort(t.subList(2, 7),
              Comparator.comparing(Pen::getName)
              .thenComparingInt(Pen::getMinusPrice));}
//    if (t.size() >= 7) {
//      List<Pen> sublist = t.subList(2, 7);
//      Collections.sort(sublist, new Comparator<Pen>() {
//        public int compare(Pen pen1, Pen pen2) {
//          int nameComparison = pen1.getName().compareTo(pen2.getName());
//          if (nameComparison != 0) {
//            return nameComparison;
//          } else {
//            return Integer.compare(pen2.getPrice(), pen1.getPrice());
//          }
//        }
//      });
//    }
//  }

  private int countChars(String str, char ch) {
    int count = 0;
    for (char c : str.toCharArray()) {
      if (c == ch) {
        count++;
      }
    }
    return count;
  }

}
