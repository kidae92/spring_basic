package spring.basic.discount;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import spring.basic.annotation.MainDiscountPolicy;
import spring.basic.member.Grade;
import spring.basic.member.Member;

@Component
@MainDiscountPolicy
@Primary
public class RateDiscountPolicy implements DiscountPolicy{

    private int discountPercent = 10;


    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP){
            return price * discountPercent / 100;
        } else {
            return 0;
        }


    }
}
