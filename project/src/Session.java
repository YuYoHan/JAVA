public class Session {
    private static Session instance;
    private String loggedInUserId;

    private Session() {}

    public static Session getInstance() {
        if (instance == null) {
            instance = new Session();
        }
        return instance;
    }

    public void setLoggedInUserId(String userId) {
        this.loggedInUserId = userId;
    }

    public String getLoggedInUserId() {
        return loggedInUserId;
    }
}
