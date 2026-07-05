package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class jad implements Comparable {
    public static final fad G = new fad();
    public static final LinkedHashMap H;
    public final double E;
    public final iad F;

    static {
        iad[] iadVarArrValues = iad.values();
        int iD0 = tta.d0(iadVarArrValues.length);
        if (iD0 < 16) {
            iD0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iD0);
        for (iad iadVar : iadVarArrValues) {
            linkedHashMap.put(iadVar, new jad(0.0d, iadVar));
        }
        H = linkedHashMap;
    }

    public jad(double d, iad iadVar) {
        this.E = d;
        this.F = iadVar;
    }

    public final double a() {
        return this.F.b() * this.E;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        jad jadVar = (jad) obj;
        jadVar.getClass();
        return this.F == jadVar.F ? Double.compare(this.E, jadVar.E) : Double.compare(a(), jadVar.a());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jad)) {
            return false;
        }
        jad jadVar = (jad) obj;
        return this.F == jadVar.F ? this.E == jadVar.E : a() == jadVar.a();
    }

    public final int hashCode() {
        return Double.hashCode(a());
    }

    public final String toString() {
        return this.E + ' ' + this.F.a();
    }
}
