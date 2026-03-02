package Bai6;

import java.util.Stack;

class UndoManager {
    private Stack<InputAction> undoStack = new Stack<>();
    private int maxUndoSteps;

    public UndoManager(int maxUndoSteps) {
        this.maxUndoSteps = maxUndoSteps;
    }

    public void addAction(InputAction action) {
        if (undoStack.size() == maxUndoSteps) {
            undoStack.remove(0);
        }
        undoStack.push(action);
    }

    public InputAction undo() {
        if (undoStack.isEmpty()) return null;
        return undoStack.pop();
    }

    public void displayUndoHistory() {
        System.out.println("=== Lịch sử thao tác nhập liệu ===");
        for (InputAction a : undoStack) {
            System.out.println(a);
        }
    }
}

