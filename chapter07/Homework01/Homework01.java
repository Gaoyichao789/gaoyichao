package Homework01;

public class Homework01 {
    public static void main(String[] args) {
        Person persons[] = new Person[3];
        persons[0] = new Person("一发居士",23,"个人练习生");
        persons[1] = new Person("二发居士",11,"博士指挥官");
        persons[2] = new Person("三发居士",3,"莱芜市最高指挥部部长");

        Person temp = null;
        for(int i = 0;i < persons.length - 1;i++){
            for(int j = 0;j < persons.length - 1 - i;j++){
                if(persons[i].getAge() < persons[i + 1].getAge()){
                    temp = persons[i];
                    persons[i] = persons[i + 1];
                    persons[i + 1] = temp;
                }
            }
        }
        for(int i = 0;i < persons.length;i++){
            System.out.println(persons[i].toString());
        }

    }
}
