package fpp;

public class CountRepresentations {
  public static void main(String[] args) {
    countRepresentations(12);
  }

  static int countRepresentations(int numRupees) {
    int maxRupee20 = numRupees / 20;
    int maxRupee10 = numRupees / 10;
    int maxRupee5 = numRupees / 5;
    int maxRupee2 = numRupees / 2;
    int maxRupee1 = numRupees;

    int sum = 0, count = 0;
    String text = "";
    for (int rupee20 = 0; rupee20 <= maxRupee20; rupee20++)
      for (int rupee10 = 0; rupee10 <= maxRupee10; rupee10++)
        for (int rupee5 = 0; rupee5 <= maxRupee5; rupee5++)
          for (int rupee2 = 0; rupee2 <= maxRupee2; rupee2++)
            for (int rupee1 = 0; rupee1 <= maxRupee1; rupee1++) {
              sum = rupee20 * 20 + rupee10 * 10 + rupee5 * 5 + rupee2 * 2 + rupee1;
              if (sum == numRupees) {
                count++;
                text = count + ". ";
                if (rupee20 > 0) {
                  text += rupee20 + " twenty rupee notes, ";
                }
                if (rupee10 > 0) {
                  text += rupee10 + " ten rupee notes, ";
                }
                if (rupee5 > 0) {
                  text += rupee5 + " five rupee notes, ";
                }
                if (rupee2 > 0) {
                  text += rupee2 + " two rupee notes, ";
                }
                if (rupee1 > 0) {
                  text += rupee1 + " one rupee notes, ";
                }
                System.out.println(text);
              }
            }

    return count;
  }
}
