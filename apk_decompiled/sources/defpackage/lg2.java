package defpackage;

import java.time.Instant;
import java.time.ZoneOffset;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class lg2 implements i69 {
    public static final Map f;
    public static final Map g;
    public final Instant a;
    public final ZoneOffset b;
    public final ijb c;
    public final int d;
    public final int e;

    static {
        Map mapH0 = sta.h0(new cpc("clear", 5), new cpc("creamy", 3), new cpc("dry", 1), new cpc("sticky", 2), new cpc("watery", 4), new cpc("unusual", 6));
        f = mapH0;
        quj.n(mapH0);
        Map mapH02 = sta.h0(new cpc("light", 1), new cpc("medium", 2), new cpc("heavy", 3));
        g = mapH02;
        quj.n(mapH02);
    }

    public lg2(Instant instant, ZoneOffset zoneOffset, ijb ijbVar, int i, int i2) {
        this.a = instant;
        this.b = zoneOffset;
        this.c = ijbVar;
        this.d = i;
        this.e = i2;
    }

    @Override // defpackage.i69
    public final Instant a() {
        return this.a;
    }

    @Override // defpackage.i69
    public final ZoneOffset c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!lg2.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        lg2 lg2Var = (lg2) obj;
        return this.a.equals(lg2Var.a) && x44.r(this.b, lg2Var.b) && this.d == lg2Var.d && this.e == lg2Var.e && this.c.equals(lg2Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ZoneOffset zoneOffset = this.b;
        return this.c.hashCode() + ((((((iHashCode + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31) + this.d) * 31) + this.e) * 31);
    }

    @Override // defpackage.y7e
    public final ijb m() {
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CervicalMucusRecord(time=");
        sb.append(this.a);
        sb.append(", zoneOffset=");
        sb.append(this.b);
        sb.append(", appearance=");
        sb.append(this.d);
        sb.append(", sensation=");
        sb.append(this.e);
        sb.append(", metadata=");
        return ebh.q(sb, this.c, ')');
    }
}
