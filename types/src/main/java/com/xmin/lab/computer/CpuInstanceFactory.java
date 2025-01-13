package com.xmin.lab.computer;

import java.util.Random;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * @author liminggangrs
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class CpuInstanceFactory {

    private static final Random random = new Random();

    public static CpuInstance createAmdArm() {
        return new CpuInstance("AMD", "ARM", random.nextDouble() * 100);
    }

    public static CpuInstance createAmdX86() {
        return new CpuInstance("AMD", "X86", random.nextDouble() * 100);
    }

    public static CpuInstance createRiscVArm() {
        return new CpuInstance("RISC_V", "ARM", random.nextDouble() * 100);
    }

    public static CpuInstance createIntelArm() {
        return new CpuInstance("INTEL", "ARM", random.nextDouble() * 100);
    }

    public static CpuInstance createIntelX86() {
        return new CpuInstance("INTEL", "X86", random.nextDouble() * 100);
    }

}
