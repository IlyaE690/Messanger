public class Main {
    public static void main(String[] args){

        MessangerAuthor user1 = new MessangerAuthor("Destroyer2006", "Tagir", 89995535335L, "Zzcy%7xJh7kF");

        MessangerAuthor user2 = new MessangerAuthor("lystic", "Olavi", 89996736373L, "fPC0XaQ@9cjl");

        MessangerAuthor user3 = new MessangerAuthor("Dimov", "Dmitry", 89999179171L, "R2jq$S4r4zeE");

        MessangerAuthor user4 = new MessangerAuthor("Baxlish", "Emil", 89998138381L, "y#uHqXfgY0X5");

        MessangerAddress message1 = new MessangerAddress(user2, user3, "Happy birthday!", "22:10");

        MessangerAddress message2 = new MessangerAddress(user1, user4, "Thank you!", "22:14");

        MessangerAddress message3 = new MessangerAddress(user1, user4, "Good morning! How are you?", "9:13");

        MessangerAddress message4 = new MessangerAddress(user4, user1, "Fine, thanks", "9:17");

        user1.printUserInfo();
        user2.printUserInfo();
        user3.printUserInfo();
        user4.printUserInfo();

        message1.printMessageInfo();
        message2.printMessageInfo();
        message3.printMessageInfo();
        message4.printMessageInfo();
    }
}
