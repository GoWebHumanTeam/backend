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
    @Column(name = "senderName", nullable = false)
    private String senderName;
    @Column(name = "senderTel", nullable = false)
    private String senderTel;
    @Column(name = "addressName", nullable = false)
    private String addressName;
    @Column(name = "addressTel", nullable = false)
    private String addressTel;
    @Column(name = "startingPoint", nullable = false)
    private String startingPoint;
    @Column(name = "destination", nullable = false)
    private String destination;
    @Column(name = "postDescription")
    private String postDescription;
    @Column(name = "weight", nullable = false)
    private float weight;
    @Column(name = "quantity", nullable = false)
    private float quantity;

    @Builder
    public Reservation(String senderName, String senderTel, String addressName, String addressTel,
                       String startingPoint, String destination, String postDescription,float weight, float quantity) {
        this.senderName = senderName;
        this.senderTel = senderTel;
        this.addressName = addressName;
        this.addressTel = addressTel;
        this.startingPoint = startingPoint;
        this.destination = destination;
        this.postDescription = postDescription;
        this.weight = weight;
        this.quantity = quantity;
    }
}

