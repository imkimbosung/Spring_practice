package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*; // siatic
import static org.junit.jupiter.api.Assertions.*;

class RateDiscoutPolicyTest {

    RateDiscoutPolicy discountPolicy = new RateDiscoutPolicy();

    @Test
    @DisplayName("VIP는 10% 할인 적용")
    void vip_o(){
        // givne
        Member member = new Member(1L, "memberVIP", Grade.VIP);
        //when
        int discount = discountPolicy.discount(member, 10000);
        //then
        assertThat(discount).isEqualTo(1000);
    }

    @Test
    @DisplayName("VIP가 아니면 할인 적용 안됨")
    void vip_x(){
        // givne
        Member member = new Member(2L, "memberBASIC", Grade.BASIC);
        //when
        int discount = discountPolicy.discount(member, 10000);
        //then
        assertThat(discount).isEqualTo(0);
    }
}