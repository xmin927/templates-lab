package com.xmin.lab.computer;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author liminggangrs
 */
@Data
@AllArgsConstructor
public class CpuInstance {

    private String brand;

    private String instructionSet;

    private Double price;


}
