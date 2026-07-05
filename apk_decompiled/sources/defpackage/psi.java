package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class psi implements Comparable {
    public static final ksi G = new ksi();
    public static final LinkedHashMap H;
    public final double E;
    public final osi F;

    static {
        osi[] osiVarArrValues = osi.values();
        int iD0 = tta.d0(osiVarArrValues.length);
        if (iD0 < 16) {
            iD0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iD0);
        for (osi osiVar : osiVarArrValues) {
            linkedHashMap.put(osiVar, new psi(0.0d, osiVar));
        }
        H = linkedHashMap;
    }

    public psi(double d, osi osiVar) {
        this.E = d;
        this.F = osiVar;
    }

    public final double a() {
        return this.F.a() * this.E;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        psi psiVar = (psi) obj;
        psiVar.getClass();
        return this.F == psiVar.F ? Double.compare(this.E, psiVar.E) : Double.compare(a(), psiVar.a());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof psi)) {
            return false;
        }
        psi psiVar = (psi) obj;
        return this.F == psiVar.F ? this.E == psiVar.E : a() == psiVar.a();
    }

    public final int hashCode() {
        return Double.hashCode(a());
    }

    public final String toString() {
        return this.E + ' ' + this.F.b();
    }
}
