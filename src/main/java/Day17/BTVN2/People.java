package Day17.BTVN2;

import Day16.Products;
import jakarta.validation.constraints.Null;
import org.springframework.util.LinkedMultiValueMap;

import java.lang.invoke.SwitchPoint;
import java.util.*;

public class People {
    public People() {

    }

    String name;
    String nationality;
    int age;

    public People(String name, String nationality, int age) {
        this.name = name;
        this.nationality = nationality;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /*@Override
    public String toString() {
        return "Person{" +
                "name='" + name +"-"+ '\'' +
                ", nationality='" + nationality +"-"+ '\'' +
                ", age=" + age +
                '}';
    }*/
    @Override
    public String toString() {
        return name + "-" + nationality + "-" + age;
    }

    public ArrayList<People> addPeople() {
        ArrayList<People> people = new ArrayList<>(List.of(
                new People("Vinh", "Vietnam", 28),
                new People("Lan", "Vietnam", 24),
                new People("John", "USA", 27),
                new People("Lee", "China", 67),
                new People("Kim", "Korea", 22),
                new People("Long", "Vietnam", 18),
                new People("Jungho", "Korea", 19),
                new People("Tian", "China", 20),
                new People("Clara", "USA", 40),
                new People("Mikura", "Japan", 27),
                new People("Sony", "Japan", 29),
                new People("Xiang", "China", 78),
                new People("Peter", "France", 18),
                new People("Haloy", "Malaysia", 20),
                new People("Magie", "Malaysia", 32)
        ));
        /*people.stream().forEach(System.out::println);*/
        return people;
    }

    public void countPeople(ArrayList<People> people) {
        HashMap<String, Integer> countPeopleByCountries = new HashMap<>();
        for (People p : people) {
            Integer count = countPeopleByCountries.get(p.getNationality());
            if (count == null) {
                countPeopleByCountries.put(p.getNationality(), 1);
            } else {
                countPeopleByCountries.put(p.getNationality(), count + 1);
            }
        }

        for (Map.Entry<String, Integer> entry : countPeopleByCountries.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }

    public void Sort(@org.jetbrains.annotations.NotNull ArrayList<People> people) {
        Collections.sort(people,Comparator.comparing(People::getName));
        for (People p : people) {
            if (p.age > 25) {
                /*if (!maps.containsKey(p.name + p.nationality + p.age)) {
                    maps.put(p.name + p.nationality + p.age, p);*/
                    System.out.println(p);
            }
        }

    }

    public void average(@org.jetbrains.annotations.NotNull ArrayList<People> people) {

        HashMap<String, List<People>> maps = new HashMap<>();

        for (People p : people) {
            List<People> person = maps.get(p.getNationality());
            if (maps.containsKey(p.getNationality()) == false) {
                person = new ArrayList<>();
                person.add(p);
                maps.put(p.getNationality(), person);
            } else {

                person.add(p);
                maps.put(p.getNationality(), person);
            }

        }
        for (Map.Entry<String, List<People>> entry : maps.entrySet()) {
            Float avg = 0f;
            Integer sum=0;
            for (People people1 : entry.getValue() ){
                     sum = sum+people1.age;
            }
            avg=Float.valueOf(sum/entry.getValue().size());
            System.out.println(entry.getValue() + " : " + avg);
        }

    }

    public void evaluation(@org.jetbrains.annotations.NotNull ArrayList<People> people) {
        String str ="";

        for (People p : people) {
            if (p.age <20) {
                str="- Nổi loạn";
            }
            else if (p.age >=20 && p.age<=30) {
                str="- Việc làm";
            }
            else if (p.age >=31 && p.age<=40) {
                str="- Sự nghiệp";
            }
            else
            {
                str="- Hưởng thụ";
            }

            System.out.println(p + str);
            }
        }


    }

