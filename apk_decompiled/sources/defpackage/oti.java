package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class oti implements Comparable {
    public static final oti J;
    public final int E;
    public final int F;
    public final int G;
    public final String H;
    public final u0h I = new u0h(new g2h(8, this));

    static {
        new oti("", 0, 0, 0);
        J = new oti("", 0, 1, 0);
        new oti("", 1, 0, 0);
    }

    public oti(String str, int i, int i2, int i3) {
        this.E = i;
        this.F = i2;
        this.G = i3;
        this.H = str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        oti otiVar = (oti) obj;
        otiVar.getClass();
        Object value = this.I.getValue();
        value.getClass();
        Object value2 = otiVar.I.getValue();
        value2.getClass();
        return ((BigInteger) value).compareTo((BigInteger) value2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof oti)) {
            return false;
        }
        oti otiVar = (oti) obj;
        return this.E == otiVar.E && this.F == otiVar.F && this.G == otiVar.G;
    }

    public final int hashCode() {
        return ((((527 + this.E) * 31) + this.F) * 31) + this.G;
    }

    public final String toString() {
        String str = this.H;
        String strConcat = !bsg.I0(str) ? "-".concat(str) : "";
        StringBuilder sb = new StringBuilder();
        sb.append(this.E);
        sb.append('.');
        sb.append(this.F);
        sb.append('.');
        return vb7.l(this.G, strConcat, sb);
    }
}
