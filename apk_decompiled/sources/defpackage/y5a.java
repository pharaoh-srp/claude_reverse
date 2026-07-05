package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes3.dex */
public final class y5a extends h0g {
    public final float i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y5a(pk7 pk7Var, d0g d0gVar, int i) {
        super(pk7Var, (i & 4) != 0 ? hj6.R : d0gVar, e59.e, pk7.b, MTTypesetterKt.kLineSkipLimitMultiplier);
        float f = (i & 2) != 0 ? 1.0f : 16.0f;
        this.i = f;
    }

    public static void b(y5a y5aVar, yd2 yd2Var, float f, float f2, float f3) {
        y5aVar.getClass();
        float fB = (yd2Var.a.b(y5aVar.i) * 1.0f) / 2.0f;
        y5aVar.a(yd2Var, f, f3 - fB, f2, f3 + fB);
    }

    public static void c(y5a y5aVar, yd2 yd2Var, float f, float f2, float f3) {
        y5aVar.getClass();
        float fB = (yd2Var.a.b(y5aVar.i) * 1.0f) / 2.0f;
        y5aVar.a(yd2Var, f - fB, f2, f + fB, f3);
    }

    @Override // defpackage.h0g
    public final boolean equals(Object obj) {
        if (super.equals(obj) && (obj instanceof y5a)) {
            return this.i == ((y5a) obj).i;
        }
        return false;
    }

    @Override // defpackage.h0g
    public final int hashCode() {
        return Float.hashCode(this.i) + (super.hashCode() * 31);
    }
}
