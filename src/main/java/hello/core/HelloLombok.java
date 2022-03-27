package hello.core;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/*
    getter, setter 자동 생성 (annotaion으로만..)
*/
@Getter
@Setter
@ToString
public class HelloLombok {

    private String name;
    private int age;


}
