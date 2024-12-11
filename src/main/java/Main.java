public class Main {
    public static void main(String[] args){

        MessangerAuthor destroyer2006 = new MessangerAuthor("Destroyer2006", "Tagir", 89995535335L, "Zzcy%7xJh7kF");

        MessangerAuthor lystic = new MessangerAuthor("lystic", "Olavi", 89996736373L, "fPC0XaQ@9cjl");

        MessangerAuthor dimov = new MessangerAuthor("Dimov", "Dmitry", 89999179171L, "R2jq$S4r4zeE");

        MessangerAuthor baxlish = new MessangerAuthor("Baxlish", "Emil", 89998138381L, "y#uHqXfgY0X5");

        MessangerAddress message1 = new MessangerAddress(lystic, dimov, "Happy birthday!", "22:10");

        MessangerAddress message2 = new MessangerAddress(destroyer2006, baxlish, "Thank you!", "22:14");

        MessangerAddress message3 = new MessangerAddress(destroyer2006, baxlish, "Good morning! How are you?", "9:13");

        MessangerAddress message4 = new MessangerAddress(baxlish, destroyer2006, "Fine, thanks", "9:17");

        destroyer2006.printUserInfo();
        System.out.println();
        lystic.printUserInfo();
        System.out.println();
        dimov.printUserInfo();
        System.out.println();
        baxlish.printUserInfo();
        System.out.println();

        message1.printMessageInfo();
        System.out.println();
        message2.printMessageInfo();
        System.out.println();
        message3.printMessageInfo();
        System.out.println();
        message4.printMessageInfo();
        System.out.println();
    }
}
