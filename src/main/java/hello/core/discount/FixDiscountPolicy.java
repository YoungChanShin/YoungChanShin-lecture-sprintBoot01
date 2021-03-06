package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;
// 정액 할인 정책

public class FixDiscountPolicy implements DiscountPolicy{

    private int discountFixAmount = 1000;

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade()== Grade.VIP){ // enum 타입은 ==을 쓰는 것이 맞다.
            return discountFixAmount;
        }
        return 0;
    }
}
