package ex02;

// 세션 역할
public class SessionManager {
    private static String currentUser;

    public static void loginUser(String userName){
        currentUser = userName;
    }

    public static void logoutUser() {
        currentUser = null;
    }

    // 현재 로그인 중인지 확인
    public static boolean isLoggedIn() {
        return currentUser != null;
    }

    public static String getCurrentUser() {
        return currentUser;
    }
}
