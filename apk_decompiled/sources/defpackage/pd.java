package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class pd implements a08, Serializable {
    public final Object E;
    public final Class F;
    public final String G;
    public final String H;
    public final boolean I;
    public final int J;
    public final int K;

    public pd(int i, int i2, Class cls, Object obj, String str, String str2) {
        this.E = obj;
        this.F = cls;
        this.G = str;
        this.H = str2;
        this.I = (i2 & 1) == 1;
        this.J = i;
        this.K = i2 >> 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pd)) {
            return false;
        }
        pd pdVar = (pd) obj;
        return this.I == pdVar.I && this.J == pdVar.J && this.K == pdVar.K && x44.r(this.E, pdVar.E) && x44.r(this.F, pdVar.F) && this.G.equals(pdVar.G) && this.H.equals(pdVar.H);
    }

    @Override // defpackage.a08
    public final int getArity() {
        return this.J;
    }

    public final int hashCode() {
        Object obj = this.E;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.F;
        return ((((kgh.l(kgh.l((iHashCode + (cls != null ? cls.hashCode() : 0)) * 31, 31, this.G), 31, this.H) + (this.I ? 1231 : 1237)) * 31) + this.J) * 31) + this.K;
    }

    public final String toString() {
        return jce.a.i(this);
    }

    public pd(int i, Class cls, String str, String str2, int i2) {
        this(i, i2, cls, g92.NO_RECEIVER, str, str2);
    }
}
