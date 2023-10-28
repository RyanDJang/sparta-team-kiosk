package main.kiosk;

import main.utils.ConsoleInput;

public class KioskController {
    // (DB에 담겨있어야할) 비밀번호 값
    private static final String password = "1234qwer";

    public void openManagerKiosk() {
        // 관리자 여부 묻기 뷰
        KioskView.askIfManager();

        // 패스워드 입력
        String passwordInput = ConsoleInput.readNextLine();

        // if(isManger) => do storeKiosk
        if (isManager(passwordInput)) {
        }
        // else => do clientKiosk
    }

    // 패스워드 확인 메서드
    public boolean isManager(String passwordInput) {
        if (passwordInput.equals(password)) {
            return true;
        }
        return false;
    }
}
