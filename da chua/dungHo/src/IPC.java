import java.util.List;

public interface IPC {
   int count1(List<PC> var1, String var2);

   int count2(List<PC> var1, double var2);

   int count3(List<PC> var1, double var2);

   List<PC> sublist(List<PC> var1, String var2);

   PC find1(List<PC> var1);

   PC find2(List<PC> var1);

   List<PC> find3(List<PC> var1, String var2);

   List<PC> find4(List<PC> var1, String var2);

   void remove1(List<PC> var1, String var2);

   void remove1(List<PC> var1, String var2, double var3);

   void remove1(List<PC> var1, String var2, double var3, double var5);

   double average(List<PC> var1, String var2);
}