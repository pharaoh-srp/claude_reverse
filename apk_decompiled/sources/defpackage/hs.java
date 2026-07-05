package defpackage;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class hs {
    public final Map a;
    public final Map b;
    public final Set c;

    public hs(Map map, Map map2, Set set) {
        set.getClass();
        this.a = map;
        this.b = map2;
        this.c = set;
    }

    public final hs a(hs hsVar) {
        hsVar.getClass();
        return new hs(sta.l0(this.a, hsVar.a), sta.l0(this.b, hsVar.b), dxf.p0(this.c, hsVar.c));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!hs.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        hs hsVar = (hs) obj;
        return this.a.equals(hsVar.a) && this.b.equals(hsVar.b) && x44.r(this.c, hsVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ebh.g(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "AggregationResult(longValues=" + this.a + ", doubleValues=" + this.b + ", dataOrigins=" + this.c + ')';
    }
}
