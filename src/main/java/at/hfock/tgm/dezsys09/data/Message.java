package at.hfock.tgm.dezsys09.data;

/**
 * Diese Klasse ist fuer die Benachrichtigung von REST Anfragen zustaendig
 *
 * @author hfock
 */
public class Message {

    private int status;
    private String message;

    /**
     * Konstruktor
     * @param status Status
     * @param message Nachricht
     */
    public Message(int status, String message) {
        this.status = status;
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }
}
