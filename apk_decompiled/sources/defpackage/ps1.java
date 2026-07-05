package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class ps1 implements Comparable {
    public static final LinkedHashMap G;
    public final double E;
    public final os1 F;

    static {
        os1[] os1VarArrValues = os1.values();
        int iD0 = tta.d0(os1VarArrValues.length);
        if (iD0 < 16) {
            iD0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iD0);
        for (os1 os1Var : os1VarArrValues) {
            linkedHashMap.put(os1Var, new ps1(0.0d, os1Var));
        }
        G = linkedHashMap;
    }

    public ps1(double d, os1 os1Var) {
        this.E = d;
        this.F = os1Var;
    }

    public final double a() {
        return this.F.a() * this.E;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ps1 ps1Var = (ps1) obj;
        ps1Var.getClass();
        return this.F == ps1Var.F ? Double.compare(this.E, ps1Var.E) : Double.compare(a(), ps1Var.a());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ps1)) {
            return false;
        }
        ps1 ps1Var = (ps1) obj;
        return this.F == ps1Var.F ? this.E == ps1Var.E : a() == ps1Var.a();
    }

    public final int hashCode() {
        return Double.hashCode(a());
    }

    public final String toString() {
        return this.E + ' ' + this.F.b();
    }
}
