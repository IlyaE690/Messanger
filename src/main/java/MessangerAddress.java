public class MessangerAddress {
    private MessangerAuthor sender = new MessangerAuthor();
    private MessangerAuthor poluchatel = new MessangerAuthor();
    private String text;
    private String time;
    private void setText(String text) {
        this.text = text;
    }
    private void setSender(MessangerAuthor sender) {
        this.sender = sender;
    }
    private void setPoluchatel(MessangerAuthor poluchatel) {
        this.poluchatel = poluchatel;
    }
    private void setTime(String time) {
        this.time = time;
    }
}