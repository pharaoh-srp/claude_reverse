package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final class ebj implements tdb {
    public final to1 a;

    public ebj(to1 to1Var) {
        this.a = to1Var;
    }

    @Override // defpackage.tdb
    public final int a(c79 c79Var, long j, int i, fu9 fu9Var) {
        int i2 = (int) (j >> 32);
        if (i >= i2) {
            return Math.round((1.0f + (fu9Var == fu9.E ? MTTypesetterKt.kLineSkipLimitMultiplier : -0.0f)) * ((i2 - i) / 2.0f));
        }
        return wd6.e0(this.a.a(i, i2, fu9Var), 0, i2 - i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ebj) && this.a.equals(((ebj) obj).a);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + (Float.hashCode(this.a.a) * 31);
    }

    public final String toString() {
        return "Horizontal(alignment=" + this.a + ", margin=0)";
    }
}
