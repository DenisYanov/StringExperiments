
public class Loader
{
    public static void main(String[] args)
    {
        int totalIncome=0;
        int index=0;
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        System.out.println(text);

       while (text.contains(" "))
   {
         try {
             totalIncome+=Integer.parseInt(text.substring(0, text.indexOf(" ")).trim());
         }
        catch(Exception e){
       }
            text=text.substring(text.indexOf(" ")+1);
   }
        System.out.println("Total income:" + totalIncome+ " rub.");
    }
}