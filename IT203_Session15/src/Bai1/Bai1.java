package Bai1;

public class Bai1 {
    public static void main(String[] args) {
        MedicalRecordHistory history = new MedicalRecordHistory();
        history.addEdit(new EditAction("Sửa tên bệnh nhân", "08:30"));
        history.addEdit(new EditAction("Cập nhật chuẩn đoán", "09:00"));
        history.addEdit(new EditAction("Thêm kết quả xét nghiệm", "09:15"));

        history.displayHistory();

        System.out.println("\nChỉnh sửa gần nhất:");
        System.out.println(history.getLatestEdit());

        history.undoEdit();
        history.undoEdit();

        history.displayHistory();
    }
}