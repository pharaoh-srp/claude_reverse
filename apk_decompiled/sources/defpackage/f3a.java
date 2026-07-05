package defpackage;

import java.util.LinkedHashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class f3a implements Comparable {
    public static final y2a G = new y2a();
    public static final LinkedHashMap H;
    public final double E;
    public final e3a F;

    static {
        e3a[] e3aVarArrValues = e3a.values();
        int iD0 = tta.d0(e3aVarArrValues.length);
        if (iD0 < 16) {
            iD0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iD0);
        for (e3a e3aVar : e3aVarArrValues) {
            linkedHashMap.put(e3aVar, new f3a(0.0d, e3aVar));
        }
        H = linkedHashMap;
    }

    public f3a(double d, e3a e3aVar) {
        this.E = d;
        this.F = e3aVar;
    }

    public final double a() {
        return this.F.a() * this.E;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        f3a f3aVar = (f3a) obj;
        f3aVar.getClass();
        return this.F == f3aVar.F ? Double.compare(this.E, f3aVar.E) : Double.compare(a(), f3aVar.a());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f3a)) {
            return false;
        }
        f3a f3aVar = (f3a) obj;
        return this.F == f3aVar.F ? this.E == f3aVar.E : a() == f3aVar.a();
    }

    public final int hashCode() {
        return Double.hashCode(a());
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
