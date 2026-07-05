package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes3.dex */
public final class f64 implements zd2 {
    public final float a;

    public f64(float f) {
        this.a = f;
    }

    @Override // defpackage.zd2
    public final zd2 a(zd2 zd2Var, float f) {
        f64 f64Var = zd2Var instanceof f64 ? (f64) zd2Var : null;
        Float fValueOf = f64Var != null ? Float.valueOf(f64Var.a) : null;
        float fFloatValue = fValueOf != null ? fValueOf.floatValue() : MTTypesetterKt.kLineSkipLimitMultiplier;
        return new f64(sq6.k(this.a, fFloatValue, f, fFloatValue));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f64) {
            return this.a == ((f64) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }
}
