package Bai6;

import java.util.Stack;

class EditAction2 {
    private String description;
    private String editedBy;
    private String editTime;

    public EditAction2(String description, String editedBy, String editTime) {
        this.description = description;
        this.editedBy = editedBy;
        this.editTime = editTime;
    }

    @Override
    public String toString() {
        return "[" + editTime + "] " + description + " (by " + editedBy + ")";
    }
}

