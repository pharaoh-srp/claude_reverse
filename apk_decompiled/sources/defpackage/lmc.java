package defpackage;

import java.time.Instant;
import java.time.ZoneOffset;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class lmc implements i69 {
    public static final Map e;
    public final Instant a;
    public final ZoneOffset b;
    public final int c;
    public final ijb d;

    static {
        Map mapH0 = sta.h0(new cpc("inconclusive", 0), new cpc("positive", 1), new cpc("high", 2), new cpc("negative", 3));
        e = mapH0;
        quj.n(mapH0);
    }

    public lmc(int i, ijb ijbVar, Instant instant, ZoneOffset zoneOffset) {
        this.a = instant;
        this.b = zoneOffset;
        this.c = i;
        this.d = ijbVar;
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
        if (!(obj instanceof lmc)) {
            return false;
        }
        lmc lmcVar = (lmc) obj;
        return this.c == lmcVar.c && this.a.equals(lmcVar.a) && x44.r(this.b, lmcVar.b) && this.d.equals(lmcVar.d);
    }

    public final int hashCode() {
        int i = ebh.i(this.a, Integer.hashCode(this.c) * 31, 31);
        ZoneOffset zoneOffset = this.b;
        return this.d.hashCode() + ((i + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31);
    }

    @Override // defpackage.y7e
    public final ijb m() {
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OvulationTestRecord(time=");
        sb.append(this.a);
        sb.append(", zoneOffset=");
        sb.append(this.b);
        sb.append(", result=");
        sb.append(this.c);
        sb.append(", metadata=");
        return ebh.q(sb, this.d, ')');
    }
}
