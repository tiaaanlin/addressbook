public class BuddyInfo {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    public static void main(String[] args) {
        System.out.println("Hello, World");

        BuddyInfo buddy = new BuddyInfo();
        buddy.setName("Tian");
        System.out.println("Hello, "+buddy.getName());
    }

}