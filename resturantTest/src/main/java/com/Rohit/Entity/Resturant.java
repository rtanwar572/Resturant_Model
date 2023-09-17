package com.Rohit.Entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Resturant {
    private Integer resId;
    private Integer resNumber;
    private String resAdd;
    private String resName;
    private String resSpecial;

    private Integer totalStuff;
    private double startingMealPrice;

    public static int size() {
        return Resturant.size();
    }
}
