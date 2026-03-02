package Bai3;

import java.util.Stack;

public class MedicationProcessChecker {
    private Stack<String> stack = new Stack<>();
    public boolean checkProcess(String[] actions) {
        for (String action : actions) {
            if (action.equals("PUSH")) {
                stack.push("Thuốc");
            } else if (action.equals("POP")) {
                if (stack.isEmpty()) {
                    System.out.println("Không thể POP khi Stack rỗng.");
                    return false;
                }
                stack.pop();
            } else {
                System.out.println("Hành động không hợp lệ - " + action);
                return false;
            }
        }

        if (!stack.isEmpty()) {
            System.out.println("Kết thúc ca trực nhưng vẫn còn thuốc chưa phát hết.");
            return false;
        }

        System.out.println("Quy trình hợp lệ.");
        return true;
    }

    public void reset() {
        stack.clear();
    }
}

