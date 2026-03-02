package Bai6;

import java.util.Stack;

class InputAction {
    private String fieldName;
    private String oldValue;
    private String newValue;
    private String actionTime;

    public InputAction(String fieldName, String oldValue, String newValue, String actionTime) {
        this.fieldName = fieldName;
        this.oldValue = oldValue;
        this.newValue = newValue;
        this.actionTime = actionTime;
    }

    @Override
    public String toString() {
        return "[" + actionTime + "] Field: " + fieldName + " | Old: " + oldValue + " | New: " + newValue;
    }
}
