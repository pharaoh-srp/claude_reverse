package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class ig8 {
    public static final kw9 a = yb5.w(w1a.G, new jd7(17));

    public static float a(gg8 gg8Var) {
        float fC = c(gg8Var);
        kg8 kg8Var = gg8Var.V;
        if (x44.r(kg8Var, kg8.a)) {
            return 1.0f;
        }
        if (x44.r(kg8Var, jg8.a)) {
            return va6.a(fC, 7.0f) < 0 ? 1.0f : 0.3334f;
        }
        mr9.b();
        return MTTypesetterKt.kLineSkipLimitMultiplier;
    }

    public static final boolean b(gg8 gg8Var) {
        return ((Boolean) gg8Var.S.b.getValue()).booleanValue();
    }

    public static final float c(gg8 gg8Var) {
        float f = gg8Var.e0;
        if (Float.isNaN(f)) {
            f = gg8Var.X.c;
        }
        return !Float.isNaN(f) ? f : gg8Var.W.c;
    }

    public static final float d(gg8 gg8Var) {
        float f = gg8Var.f0;
        if (MTTypesetterKt.kLineSkipLimitMultiplier > f || f > 1.0f) {
            f = gg8Var.X.d;
        }
        return (MTTypesetterKt.kLineSkipLimitMultiplier > f || f > 1.0f) ? gg8Var.W.d : f;
    }

    public static final List e(gg8 gg8Var) {
        gg8Var.h0.getClass();
        List list = gg8Var.X.b;
        if (list.isEmpty()) {
            list = null;
        }
        if (list != null) {
            return list;
        }
        List list2 = gg8Var.W.b;
        List list3 = list2.isEmpty() ? null : list2;
        return list3 == null ? lm6.E : list3;
    }
}
