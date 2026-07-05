package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class t5j implements Comparable {
    public static final o5j G = new o5j();
    public static final LinkedHashMap H;
    public final double E;
    public final s5j F;

    static {
        s5j[] s5jVarArrValues = s5j.values();
        int iD0 = tta.d0(s5jVarArrValues.length);
        if (iD0 < 16) {
            iD0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iD0);
        for (s5j s5jVar : s5jVarArrValues) {
            linkedHashMap.put(s5jVar, new t5j(0.0d, s5jVar));
        }
        H = linkedHashMap;
    }

    public t5j(double d, s5j s5jVar) {
        this.E = d;
        this.F = s5jVar;
    }

    public final double a() {
        return this.F.a() * this.E;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        t5j t5jVar = (t5j) obj;
        t5jVar.getClass();
        return this.F == t5jVar.F ? Double.compare(this.E, t5jVar.E) : Double.compare(a(), t5jVar.a());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t5j)) {
            return false;
        }
        t5j t5jVar = (t5j) obj;
        return this.F == t5jVar.F ? this.E == t5jVar.E : a() == t5jVar.a();
    }

    public final int hashCode() {
        return Double.hashCode(a());
    }

    public final String toString() {
        return this.E + ' ' + this.F.b();
    }
}
