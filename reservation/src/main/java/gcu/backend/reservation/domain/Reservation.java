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
    @Column(name = "sender_name", nullable = false)
    private String sender_name;
    @Column(name = "sender_tel", nullable = false)
    private String sender_tel;
    @Column(name = "address_name", nullable = false)
    private String address_name;
    @Column(name = "address_tel", nullable = false)
    private String address_tel;
    @Column(name = "starting_point", nullable = false)
    private String starting_point;
    @Column(name = "destination", nullable = false)
    private String destination;
    @Column(name = "post_description")
    private String post_description;
    @Column(name = "weight", nullable = false)
    private float weight;
    @Column(name = "quantity", nullable = false)
    private float quantity;

    @Builder
    public Reservation(String sender_name, String sender_tel, String address_name, String address_tel,
                       String starting_point, String destination, String post_description,float weight, float quantity) {
        this.sender_name = sender_name;
        this.sender_tel = sender_tel;
        this.address_name = address_name;
        this.address_tel = address_tel;
        this.starting_point = starting_point;
        this.destination = destination;
        this.post_description = post_description;
        this.weight = weight;
        this.quantity = quantity;
    }
}

