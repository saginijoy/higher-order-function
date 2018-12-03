final class Person {
    private String firtsName;
    private String lastName;
    private int age;

    public Person(String firtsName, String lastName, int age) {

        this.firtsName = firtsName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirtsName() {
        return firtsName;
    }

    public void setFirtsName(String firtsName) {
        this.firtsName = firtsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
