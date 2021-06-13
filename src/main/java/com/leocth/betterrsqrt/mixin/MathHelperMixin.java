package com.leocth.betterrsqrt.mixin;

import net.minecraft.util.math.MathHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(MathHelper.class)
public class MathHelperMixin {
    @ModifyConstant(
        method = "fastInverseSqrt(F)F",
        constant = @Constant(intValue = 0x5f3759df)
    )
    private static int modifyRsqrt32Constant(int original) { return 0x5f375a86; }

    @ModifyConstant(
        method = "fastInverseSqrt(D)D",
        constant = @Constant(longValue = 0x5fe6eb50c7b537aaL)
    )
    private static long modifyRsqrt64Constant(long original) { return 0x5fe6eb50c7b537a9L; }
}
