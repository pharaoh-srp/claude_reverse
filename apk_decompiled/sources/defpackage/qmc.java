package defpackage;

import android.os.Build;
import java.time.Instant;
import java.time.ZoneOffset;

/* JADX INFO: loaded from: classes2.dex */
public final class qmc implements i69 {
    public final Instant a;
    public final ZoneOffset b;
    public final xwc c;
    public final ijb d;

    public qmc(Instant instant, ZoneOffset zoneOffset, xwc xwcVar, ijb ijbVar) {
        double d = xwcVar.E;
        this.a = instant;
        this.b = zoneOffset;
        this.c = xwcVar;
        this.d = ijbVar;
        if (Build.VERSION.SDK_INT >= 34) {
            h0c.c(this);
        } else {
            quj.k(d, "percentage");
            quj.m(Double.valueOf(d), Double.valueOf(100.0d), "percentage");
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
        if (!(obj instanceof qmc)) {
            return false;
        }
        qmc qmcVar = (qmc) obj;
        return this.c.equals(qmcVar.c) && this.a.equals(qmcVar.a) && x44.r(this.b, qmcVar.b) && this.d.equals(qmcVar.d);
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
        StringBuilder sb = new StringBuilder("OxygenSaturationRecord(time=");
        sb.append(this.a);
        sb.append(", zoneOffset=");
        sb.append(this.b);
        sb.append(", percentage=");
        sb.append(this.c);
        sb.append(", metadata=");
        return ebh.q(sb, this.d, ')');
    }
}
