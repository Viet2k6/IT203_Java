package Bai6;

public class Bai6 {
    public static void main(String[] args) {
        // Bệnh nhân chờ khám
        PatientWaitingQueue pwq = new PatientWaitingQueue();
        pwq.addPatient(new Patient3("BN01", "Nguyễn Văn A", 30, "Nam"));
        pwq.addPatient(new Patient3("BN02", "Trần Thị B", 45, "Nữ"));
        pwq.displayQueue();
        System.out.println("Gọi khám: " + pwq.callNextPatient());

        // Lịch sử chỉnh sửa bệnh án
        MedicalRecordHistory2 mrh = new MedicalRecordHistory2("HS001");
        mrh.addEdit(new EditAction2("Thêm chẩn đoán: Viêm phổi", "Bác sĩ Nam", "10:00"));
        mrh.addEdit(new EditAction2("Cập nhật thuốc: Kháng sinh", "Bác sĩ Nam", "10:05"));
        mrh.displayHistory();
        System.out.println("Hoàn tác: " + mrh.undoEdit());

        // Hệ thống gọi số tự động
        TicketSystem ts = new TicketSystem();
        ts.issueTicket("10:10");
        ts.issueTicket("10:12");
        ts.displayTickets();
        System.out.println("Gọi số: " + ts.callNextTicket());

        // Hoàn tác thao tác nhập liệu
        UndoManager um = new UndoManager(3);
        um.addAction(new InputAction("Tên bệnh nhân", "Nguyễn Văn A", "Nguyễn Văn An", "10:15"));
        um.addAction(new InputAction("Tuổi", "30", "31", "10:16"));
        um.displayUndoHistory();
        System.out.println("Undo: " + um.undo());
    }
}
