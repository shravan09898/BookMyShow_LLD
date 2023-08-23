package com.scaler.BookMyShow.models;

import com.fasterxml.jackson.databind.ser.Serializers;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Seat extends BaseModel {
    private int rowVal;
    private int colVal;
    private String seatNumber;
    @ManyToOne
    private SeatType seatType;
}
