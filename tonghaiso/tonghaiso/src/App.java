import java.util.ArrayList;

public class App {

  // hàm làm đầy
  static String fill(String string, int length) {
    String s1 = "";

    int amount = length - string.length();
    string = reverse(string);
    for (int i = 0; i < amount; i++) {
      string = string + "0";

    }

    string = reverse(string);
    return string;
  }

  // hàm đảo ngược
  static String reverse(String string) {

    String result = "";
    for (int i = 0; i < string.length(); i++) {
      result += string.charAt(string.length() - 1 - i);
    }
    return result;
  }

  // hàm tính tổng
  static String total(String numberA, String numberB) {

    String result = "";
    int temp = 0, mnemonicNumber = 0, sum = 0;
    int length;

    // kiểm tra xem số nào ngắn hơn và làm đầy
    if (numberA.length() < numberB.length()) {
      numberA = fill(numberA, numberB.length());
      length = numberB.length();
    } else {
      numberB = fill(numberB, numberA.length());
      length = numberA.length();
    }

    for (int i = length - 1; i >= 0; i--) {
      sum = numberA.charAt(i) - '0' + numberB.charAt(i) - '0' + mnemonicNumber;
      temp = sum % 10;
      mnemonicNumber = sum / 10;
      result = result + temp;
    }

    result = reverse(result);

    return result;
  }

  public static void main(String[] args) throws Exception {
    String a = "655555555555555555554365435555555555555544745765476547654765476476";
    String b = "65555555465547654755543654365465555555555547654755554765755555555544745765476547654765476436";

    System.out.println("kết quả là " + total(a, b));

  }
}
