package defpackage;

import java.time.Instant;
import java.time.ZoneOffset;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class qzf implements i69 {
    public static final Map e;
    public final Instant a;
    public final ZoneOffset b;
    public final ijb c;
    public final int d;

    static {
        Map mapH0 = sta.h0(new cpc("protected", 1), new cpc("unprotected", 2));
        e = mapH0;
        quj.n(mapH0);
    }

    public qzf(int i, ijb ijbVar, Instant instant, ZoneOffset zoneOffset) {
        this.a = instant;
        this.b = zoneOffset;
        this.c = ijbVar;
        this.d = i;
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
        if (!(obj instanceof qzf)) {
            return false;
        }
        qzf qzfVar = (qzf) obj;
        return this.d == qzfVar.d && this.a.equals(qzfVar.a) && x44.r(this.b, qzfVar.b) && this.c.equals(qzfVar.c);
    }

    public final int hashCode() {
        int i = ebh.i(this.a, this.d * 31, 31);
        ZoneOffset zoneOffset = this.b;
        return this.c.hashCode() + ((i + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31);
    }

    @Override // defpackage.y7e
    public final ijb m() {
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SexualActivityRecord(time=");
        sb.append(this.a);
        sb.append(", zoneOffset=");
        sb.append(this.b);
        sb.append(", protectionUsed=");
        sb.append(this.d);
        sb.append(", metadata=");
        return ebh.q(sb, this.c, ')');
    }
}
