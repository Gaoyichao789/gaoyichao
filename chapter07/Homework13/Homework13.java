package Homework13;

public class Homework13 {
    public static void main(String[] args) {
        Homework13 homework13 = new Homework13();
        Person persons[] = new Person[4];
        persons[0] = new Student("一发居士",'男',23,"20231133");
        persons[1] = new Student("二发居士",'男',12,"20231133");
        persons[2] = new Teacher("三发居士",'男',32,2);
        persons[3] = new Teacher("四发居士",'男',5,25);
        Person temp = null;
        for(int i = 0;i < persons.length - 1;i++){
            for (int j = 0;j < persons.length - i - 1;j++){
                if(persons[j].getAge() < persons[j + 1].getAge()){
                    temp = persons[j];
                    persons[j] = persons[j + 1];
                    persons[j + 1] = temp;
                }
            }
        }

        for(int i = 0;i < persons.length;i++){
            homework13.test(persons[i]);
        }
    }
    public void test(Person p){
        if(p instanceof Student){
            ((Student) p).study();;
        } else if (p instanceof  Teacher) {
            ((Teacher) p).teach();
        }
    }
}
