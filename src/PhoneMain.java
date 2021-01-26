public class PhoneMain {

    public static void main(String[] args) {
        AbstractPhone phone = new ThomasEdisonPhone(1873);
        AbstractPhone phone1 = new Phone(1930);
        AbstractPhone smartphone1 = new SmartPhone(2000);
        AbstractPhone smartphone2 = new SmartPhone(2010);

        User user = new User("MAriana");
        user.callAnotherUser("0432432",phone);
        user.callAnotherUser("9291013",phone1);
        user.callAnotherUser("2940323",smartphone1);
        user.callAnotherUser("2940323",smartphone2);

    }
}
