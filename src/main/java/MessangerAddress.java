public class MessangerAddress {
    private MessangerAuthor sender = new MessangerAuthor();

    private MessangerAuthor addressee = new MessangerAuthor();

    private String text;

    private String time;

    public MessangerAddress(){}

    public MessangerAddress(MessangerAuthor sender, MessangerAuthor addressee, String text, String time){
        this.sender = sender;
        this.addressee = addressee;
        this.text = text;
        this.time = time;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setSender(MessangerAuthor sender) {
        this.sender = sender;
    }

    public void setAddressee(MessangerAuthor addressee) {
        this.addressee = addressee;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTime() {
        return time;
    }

    public MessangerAuthor getSender() {
        return sender;
    }

    public MessangerAuthor getAddressee() {
        return addressee;
    }

    public String getText() {
        return text;
    }

    public void printMessageInfo() {
        System.out.println("Sender: " + sender.getNickname());
        System.out.println("Addressee: " + addressee.getNickname());
        System.out.println("Text: " + text);
        System.out.println("Time: " + time);
    }
}