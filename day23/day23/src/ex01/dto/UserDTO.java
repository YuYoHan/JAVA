package ex01.dto;

public class UserDTO {
    private int userId;
    private String userName;
    private String userPw;
    private String userAddr;
    private String userPhone;

    public UserDTO() {
    }

    public UserDTO(int userId, String userName, String userPw, String userAddr, String userPhone) {
        this.userId = userId;
        this.userName = userName;
        this.userPw = userPw;
        this.userAddr = userAddr;
        this.userPhone = userPhone;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPw() {
        return userPw;
    }

    public void setUserPw(String userPw) {
        this.userPw = userPw;
    }

    public String getUserAddr() {
        return userAddr;
    }

    public void setUserAddr(String userAddr) {
        this.userAddr = userAddr;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPw='" + userPw + '\'' +
                ", userAddr='" + userAddr + '\'' +
                ", userPhone='" + userPhone + '\'' +
                '}';
    }
}
