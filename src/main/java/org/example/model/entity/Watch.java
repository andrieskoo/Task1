package org.example.model.entity;

import lombok.*;
import org.example.model.Brand;
import org.example.model.Color;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public abstract class Watch {
    private Double price;
    private Date receivedDate;
    private Color color;
    private String brand;

}
