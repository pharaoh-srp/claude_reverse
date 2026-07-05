package defpackage;

import android.view.animation.Interpolator;
import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j80 {
    public static final epk a = epk.v("a", "p", "s", "rz", "r", "o", "so", "eo", "sk", "sa", "rx", "ry");
    public static final epk b = epk.v("k");

    public static void a(c80 c80Var, bna bnaVar) {
        Float fValueOf = Float.valueOf(MTTypesetterKt.kLineSkipLimitMultiplier);
        List list = (List) c80Var.F;
        if (list.isEmpty()) {
            list.add(new rp9(bnaVar, fValueOf, fValueOf, (Interpolator) null, MTTypesetterKt.kLineSkipLimitMultiplier, Float.valueOf(bnaVar.m)));
        } else if (((rp9) list.get(0)).b == null) {
            list.set(0, new rp9(bnaVar, fValueOf, fValueOf, (Interpolator) null, MTTypesetterKt.kLineSkipLimitMultiplier, Float.valueOf(bnaVar.m)));
        }
    }

    public static boolean b(c80 c80Var) {
        if (c80Var != null) {
            return c80Var.c() && ((Float) ((rp9) ((List) c80Var.F).get(0)).b).floatValue() == MTTypesetterKt.kLineSkipLimitMultiplier;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.i80 c(com.airbnb.lottie.parser.moshi.c r27, defpackage.bna r28) {
        /*
            Method dump skipped, instruction units count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j80.c(com.airbnb.lottie.parser.moshi.c, bna):i80");
    }
}
