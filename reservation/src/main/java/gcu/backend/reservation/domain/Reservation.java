package gcu.backend.reservation.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "member_id", nullable = false)
    private long member_id;
    @Column(name = "starting_point", nullable = false)
    private String starting_point;
    @Column(name = "destination", nullable = false)
    private String destination;
    @Column(name = "receiver_name", nullable = false)
    private String receiver_name;
    @Column(name = "receiver_tel", nullable = false)
    private String receiver_tel;

    @Column(name = "weight", nullable = false)
    private float weight;
    @Column(name = "post_description")
    private String post_description;
    @Column(name = "quantity", nullable = false)
    private float quantity;

    @Builder
    public Reservation(Long member_id, String starting_point, String destination, String receiver_name,
                       String receiver_tel, float weight, String post_description, float quantity) {
        this.member_id = member_id;
        this.starting_point = starting_point;
        this.destination = destination;
        this.receiver_name = receiver_name;
        this.receiver_tel = receiver_tel;
        this.weight = weight;
        this.post_description = post_description;
        this.quantity = quantity;
    }
}

