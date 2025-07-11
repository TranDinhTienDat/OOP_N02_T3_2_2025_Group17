public class TestUser {
    public static void TestUser() {
        User u = new User("Nguyen Van A", "a@gmail.com", 28);
        System.out.println("Tên: " + u.getName());
        System.out.println("Email: " + u.getEmail());
        System.out.println("Tuổi: " + u.getAge());
    }
}

