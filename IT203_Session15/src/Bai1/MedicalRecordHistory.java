package Bai1;

import java.util.Stack;

class MedicalRecordHistory {
    private Stack<EditAction> history = new Stack<>();

    // Thêm chỉnh sửa mới
    void addEdit(EditAction action) {
        history.push(action);
        System.out.println("Đã thêm chỉnh sửa: " + action);
    }

    // Undo chỉnh sửa gần nhất
    EditAction undoEdit() {
        if (history.isEmpty()) {
            System.out.println("Không có chỉnh sửa để undo.");
            return null;
        }
        EditAction removed = history.pop();
        System.out.println("Undo chỉnh sửa: " + removed);
        return removed;
    }

    // Xem chỉnh sửa gần nhất
    EditAction getLatestEdit() {
        if (history.isEmpty()) {
            System.out.println("Chưa có chỉnh sửa nào.");
            return null;
        }
        return history.peek();
    }

    boolean isEmpty() {
        return history.isEmpty();
    }

    void displayHistory() {
        System.out.println("\n--- LỊCH SỬ CHỈNH SỬA ---");
        if (history.isEmpty()) {
            System.out.println("Danh sách trống.");
            return;
        }
        for (EditAction action : history) {
            System.out.println(action);
        }
    }
}
