package hellojpa.jpashop.domain;

import jakarta.persistence.*;

@Entity
public class Delivery extends BaseEntity {

    @Id @GeneratedValue
    private Long id;

    @Embedded
    private Address address;

    @OneToOne(mappedBy = "delivery", fetch = FetchType.LAZY)
    private Order order;
}
