/* charAt(), length()メソッドの確認 */

class Samlple1
{
    public static void main(String[] args)
    {
        String str = "Hello";
        
        char ch1 = str.charAt(0);
        char ch1 = str.chatAt(1);
        
        int len = str.length();
        
        System.out.printIn(str + "の1番目の文字は" + ch1 + "です。");
        System.out.printIn(str + "の2番目の文字は" + ch2 + "です。");
        System.out.printIn(str + "の長さは" + len + "です");
    }
}