package defpackage;

import android.os.Build;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class r0j implements i69 {
    public static final Map f;
    public final Instant a;
    public final ZoneOffset b;
    public final ijb c;
    public final double d;
    public final int e;

    static {
        Map mapH0 = sta.h0(new cpc("other", 0), new cpc("metabolic_cart", 1), new cpc("heart_rate_ratio", 2), new cpc("cooper_test", 3), new cpc("multistage_fitness_test", 4), new cpc("rockport_fitness_test", 5));
        f = mapH0;
        quj.n(mapH0);
    }

    public r0j(Instant instant, ZoneOffset zoneOffset, ijb ijbVar, double d, int i) {
        this.a = instant;
        this.b = zoneOffset;
        this.c = ijbVar;
        this.d = d;
        this.e = i;
        if (Build.VERSION.SDK_INT >= 34) {
            h0c.c(this);
        } else {
            quj.k(d, "vo2MillilitersPerMinuteKilogram");
            quj.m(Double.valueOf(d), Double.valueOf(100.0d), "vo2MillilitersPerMinuteKilogram");
        }
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
        if (!(obj instanceof r0j)) {
            return false;
        }
        r0j r0jVar = (r0j) obj;
        return this.d == r0jVar.d && this.e == r0jVar.e && this.a.equals(r0jVar.a) && x44.r(this.b, r0jVar.b) && this.c.equals(r0jVar.c);
    }

    public final int hashCode() {
        int i = ebh.i(this.a, ((Double.hashCode(this.d) * 31) + this.e) * 31, 31);
        ZoneOffset zoneOffset = this.b;
        return this.c.hashCode() + ((i + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31);
    }

    @Override // defpackage.y7e
    public final ijb m() {
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Vo2MaxRecord(time=");
        sb.append(this.a);
        sb.append(", zoneOffset=");
        sb.append(this.b);
        sb.append(", vo2MillilitersPerMinuteKilogram=");
        sb.append(this.d);
        sb.append(", measurementMethod=");
        sb.append(this.e);
        sb.append(", metadata=");
        return ebh.q(sb, this.c, ')');
    }
}
