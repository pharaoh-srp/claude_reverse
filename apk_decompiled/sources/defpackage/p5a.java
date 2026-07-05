package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes3.dex */
public final class p5a implements zd2 {
    public final float a;

    public p5a(float f) {
        this.a = f;
    }

    @Override // defpackage.zd2
    public final zd2 a(zd2 zd2Var, float f) {
        p5a p5aVar = zd2Var instanceof p5a ? (p5a) zd2Var : null;
        Float fValueOf = p5aVar != null ? Float.valueOf(p5aVar.a) : null;
        float fFloatValue = fValueOf != null ? fValueOf.floatValue() : MTTypesetterKt.kLineSkipLimitMultiplier;
        return new p5a(sq6.k(this.a, fFloatValue, f, fFloatValue));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p5a) {
            return this.a == ((p5a) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }
}
