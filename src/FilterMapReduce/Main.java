package FilterMapReduce;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<Student> student1 = new ArrayList<>();

        student1.add(new Student(2, "Aftab"));
        student1.add(new Student(3, "John"));

        System.out.println(student1);


        List<Integer> num = new ArrayList<>();
        num.add(5);
        num.add(2);
        num.add(18);
        num.add(9);
        num.add(13);
        num.add(10);

        System.out.println(num);
//        int result= num.stream()
//                .filter(n->n%2==0)
//                .map(n->n*2)
//                .reduce(1,(c,e)->c*e);
        student1 = student1.stream()
                .map(n -> {
                    if (2==n.getId()){
                        n.setId(10);
                    }
                    return n;
                }).collect(Collectors.toList());

        System.out.println(student1);

        num.forEach(j -> {
            if (j == 10)
                System.out.println(j);
        });

//        passengers = passengers.stream()
//        .map(b -> {
//            if (id == b.getId()) {
//                b.setId(passenger.getId());
//                b.setPName(passenger.getPName());
//            }
//            return b;
//        }).collect(Collectors.toList());

//        Aftab=(int a) -> {
//            return a + 10;
//        };

    }
}
