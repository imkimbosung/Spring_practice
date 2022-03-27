package hello.core.autowired;

import hello.core.member.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.lang.Nullable;

import java.util.Optional;

/*
* 옵션 처리 테스트
* */
public class AutowiredTest {

    @Test
    void AUtosiredOption(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(TestBean.class);
    }

    static class TestBean{

        /*
            1.  required = false 의존 관계가 없으면 메소드 자체가 호출 안됨
         */
        @Autowired(required = false)
        public void setNoBean1(Member noBean1){
            System.out.println("noBean1 = " + noBean1);
        }

        /*
            2. @Nullable 값이 없으면 자동으로 null 들어감
         */
        @Autowired
        public void setNoBean2(@Nullable Member noBean2){
            System.out.println("noBean2 = " + noBean2);
        }

        /*
            3. Optional<> 값이 없으면 Optional.empty 가 들어감
         */
        @Autowired
        public void setNoBean3(Optional<Member> noBean3){
            System.out.println("noBean3 = " + noBean3);
        }
    }

}
