package defpackage;

import android.os.Build;
import java.time.Instant;
import java.time.ZoneOffset;

/* JADX INFO: loaded from: classes2.dex */
public final class mqe implements i69 {
    public final Instant a;
    public final ZoneOffset b;
    public final double c;
    public final ijb d;

    public mqe(Instant instant, ZoneOffset zoneOffset, double d, ijb ijbVar) {
        this.a = instant;
        this.b = zoneOffset;
        this.c = d;
        this.d = ijbVar;
        if (Build.VERSION.SDK_INT >= 34) {
            h0c.c(this);
        } else {
            quj.k(d, "rate");
            quj.m(Double.valueOf(d), Double.valueOf(1000.0d), "rate");
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
        if (!(obj instanceof mqe)) {
            return false;
        }
        mqe mqeVar = (mqe) obj;
        return this.c == mqeVar.c && this.a.equals(mqeVar.a) && x44.r(this.b, mqeVar.b) && this.d.equals(mqeVar.d);
    }

    public final int hashCode() {
        int i = ebh.i(this.a, Double.hashCode(this.c) * 31, 31);
        ZoneOffset zoneOffset = this.b;
        return this.d.hashCode() + ((i + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31);
    }

    @Override // defpackage.y7e
    public final ijb m() {
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RespiratoryRateRecord(time=");
        sb.append(this.a);
        sb.append(", zoneOffset=");
        sb.append(this.b);
        sb.append(", rate=");
        sb.append(this.c);
        sb.append(", metadata=");
        return ebh.q(sb, this.d, ')');
    }
}
