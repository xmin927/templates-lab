package com.xmin.lab.jdk8;

import com.xmin.lab.computer.CpuInstance;
import com.xmin.lab.computer.CpuInstanceFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author liminggangrs
 */
public class LambdaExpr {

    public static void main(String[] args) {
        List<CpuInstance> cpuInstances = List.of(
            new CpuInstance("AMD", "ARM", 200D),
            new CpuInstance("INTEL", "X86", 300D)
        );
//        foreach(cpuInstances);
        filter(cpuInstances);
//        flatMap(cpuInstances);
    }

    /**
     * 1. lambda express 2. 方法引用
     */
    private static void foreach(List<CpuInstance> cpuInstances) {
        cpuInstances.forEach(v -> System.out.printf(v.getBrand()));
        cpuInstances.forEach(System.out::println);
    }

    private static void streamMap(List<CpuInstance> cpuInstances) {

    }

    private static void map(List<CpuInstance> cpuInstances) {
        //map
        cpuInstances.stream().map(v -> {
            v.setPrice(v.getPrice() + 100);
            return v;
        }).forEach(System.out::println);
        //peek
        cpuInstances.stream().peek(v -> v.setPrice(v.getPrice() + 100)).forEach(System.out::println);
    }

    private static void filter(List<CpuInstance> cpuInstances) {
        //filter
        cpuInstances.stream()
            .filter(v -> v.getPrice() < 210)
            .peek(v -> v.setPrice(v.getPrice() + 10))
            .forEach(System.out::println);
    }

    private static void flatMap() {
        List<List<CpuInstance>> cpuSets = new ArrayList<>();
        List<CpuInstance> setOne = List.of(CpuInstanceFactory.createAmdArm(), CpuInstanceFactory.createAmdX86());
        List<CpuInstance> setTwo = List.of(CpuInstanceFactory.createIntelArm(), CpuInstanceFactory.createIntelX86());
        cpuSets.add(setOne);
        cpuSets.add(setTwo);
        //flatmap
        cpuSets.stream().flatMap(Collection::stream)
            .forEach(System.out::println);
    }

}
