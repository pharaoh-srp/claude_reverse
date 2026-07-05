package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class yn6 implements Comparable {
    public static final sn6 G = new sn6();
    public static final LinkedHashMap H;
    public final double E;
    public final xn6 F;

    static {
        xn6[] xn6VarArrValues = xn6.values();
        int iD0 = tta.d0(xn6VarArrValues.length);
        if (iD0 < 16) {
            iD0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iD0);
        for (xn6 xn6Var : xn6VarArrValues) {
            linkedHashMap.put(xn6Var, new yn6(0.0d, xn6Var));
        }
        H = linkedHashMap;
    }

    public yn6(double d, xn6 xn6Var) {
        this.E = d;
        this.F = xn6Var;
    }

    public final double a() {
        return this.F.a() * this.E;
    }

    public final double b() {
        return this.F == xn6.F ? this.E : a() / 1000.0d;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        yn6 yn6Var = (yn6) obj;
        yn6Var.getClass();
        return this.F == yn6Var.F ? Double.compare(this.E, yn6Var.E) : Double.compare(a(), yn6Var.a());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yn6)) {
            return false;
        }
        yn6 yn6Var = (yn6) obj;
        return this.F == yn6Var.F ? this.E == yn6Var.E : a() == yn6Var.a();
    }

    public final int hashCode() {
        return Double.hashCode(a());
    }

    public final String toString() {
        return this.E + ' ' + this.F.b();
    }
}
