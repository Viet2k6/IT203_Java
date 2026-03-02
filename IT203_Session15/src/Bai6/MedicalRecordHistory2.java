package Bai6;

import java.util.Stack;

class MedicalRecordHistory2 {
    private Stack<EditAction2> editStack = new Stack<>();
    private String recordId;

    public MedicalRecordHistory2(String recordId) {
        this.recordId = recordId;
    }

    public void addEdit(EditAction2 action) {
        editStack.push(action);
    }

    public EditAction2 undoEdit() {
        if (editStack.isEmpty()) return null;
        return editStack.pop();
    }

    public void displayHistory() {
        System.out.println("=== Lịch sử chỉnh sửa bệnh án " + recordId + " ===");
        for (EditAction2 e : editStack) {
            System.out.println(e);
        }
    }
}
