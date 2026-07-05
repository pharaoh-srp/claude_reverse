package defpackage;

import java.util.LinkedHashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class fva implements Comparable {
    public static final xua G = new xua();
    public static final LinkedHashMap H;
    public final double E;
    public final eva F;

    static {
        eva[] evaVarArrValues = eva.values();
        int iD0 = tta.d0(evaVarArrValues.length);
        if (iD0 < 16) {
            iD0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iD0);
        for (eva evaVar : evaVarArrValues) {
            linkedHashMap.put(evaVar, new fva(0.0d, evaVar));
        }
        H = linkedHashMap;
    }

    public fva(double d, eva evaVar) {
        this.E = d;
        this.F = evaVar;
    }

    public final double a(eva evaVar) {
        return this.F == evaVar ? this.E : b() / evaVar.a();
    }

    public final double b() {
        return this.F.a() * this.E;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        fva fvaVar = (fva) obj;
        fvaVar.getClass();
        return this.F == fvaVar.F ? Double.compare(this.E, fvaVar.E) : Double.compare(b(), fvaVar.b());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fva)) {
            return false;
        }
        fva fvaVar = (fva) obj;
        return this.F == fvaVar.F ? this.E == fvaVar.E : b() == fvaVar.b();
    }

    public final int hashCode() {
        return Double.hashCode(b());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.E);
        sb.append(' ');
        String lowerCase = this.F.name().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        sb.append(lowerCase);
        return sb.toString();
    }
}
