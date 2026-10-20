package io.github.rostikq.task01;

public class EmailCuratorNotifier implements CuratorNotifier {
    @Override
    public void notifyCurator(String email, String studentName, String transcriptText) {
        if (email != null && !email.isBlank()) {
            System.out.println("Надсилання пошти куратору " + email);
            System.out.println("Тема: Успішність студента " + studentName);
            System.out.println("Тіло: " + transcriptText);
        }
    }
}
