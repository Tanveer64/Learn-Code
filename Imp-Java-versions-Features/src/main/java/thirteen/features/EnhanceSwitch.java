package thirteen.features;

public class EnhanceSwitch {
    //ased on feedback from the developer community, JDK
    // Enhancement Proposal 354 replaces the break keyword in switch expressions with the new yield keyword:
    public static String getNumbersYield(int number) {
        return switch (number) {
            case 1, 2:
                yield "one or tow";
            case 3:
                yield "three";
            case 4, 5:
                var i = 0;
                i++;
                yield "four or five" + i;
            default:
                yield "defult";
        };
    }

    public static String getNumbersYieldArrow(int number) {
        return switch (number) {
            case 1, 2 -> "one or tow";
            case 3 -> "three";
            case 4, 5 -> {
                var i = 0;
                i++;
                yield "four or five" + i;
            }
            default -> "defult";
        };
    }

    public static void main(String[] args) {
        String caseNumber = EnhanceSwitch.getNumbersYield(2);
        System.out.println("Case Number = " + caseNumber);
        String caseNumberWithArrow = EnhanceSwitch.getNumbersYieldArrow(4);
        System.out.println("Case Number with arrow = " + caseNumberWithArrow);
    }
}
