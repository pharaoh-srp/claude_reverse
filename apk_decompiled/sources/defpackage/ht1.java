package defpackage;

import java.time.Instant;
import java.time.ZoneOffset;

/* JADX INFO: loaded from: classes2.dex */
public final class ht1 implements i69 {
    public static final xwc e = new xwc(100.0d);
    public final Instant a;
    public final ZoneOffset b;
    public final xwc c;
    public final ijb d;

    public ht1(Instant instant, ZoneOffset zoneOffset, xwc xwcVar, ijb ijbVar) {
        this.a = instant;
        this.b = zoneOffset;
        this.c = xwcVar;
        this.d = ijbVar;
        quj.k(xwcVar.E, "percentage");
        quj.m(xwcVar, e, "percentage");
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
        if (!(obj instanceof ht1)) {
            return false;
        }
        ht1 ht1Var = (ht1) obj;
        return this.c.equals(ht1Var.c) && this.a.equals(ht1Var.a) && x44.r(this.b, ht1Var.b) && this.d.equals(ht1Var.d);
    }

    public final int hashCode() {
        int i = ebh.i(this.a, Double.hashCode(this.c.E) * 31, 31);
        ZoneOffset zoneOffset = this.b;
        return this.d.hashCode() + ((i + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31);
    }

    @Override // defpackage.y7e
    public final ijb m() {
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BodyFatRecord(time=");
        sb.append(this.a);
        sb.append(", zoneOffset=");
        sb.append(this.b);
        sb.append(", percentage=");
        sb.append(this.c);
        sb.append(", metadata=");
        return ebh.q(sb, this.d, ')');
    }
}
