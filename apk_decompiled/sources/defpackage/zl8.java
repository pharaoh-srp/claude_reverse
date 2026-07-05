package defpackage;

import android.os.Build;
import java.time.Instant;
import java.time.ZoneOffset;

/* JADX INFO: loaded from: classes2.dex */
public final class zl8 implements i69 {
    public final Instant a;
    public final ZoneOffset b;
    public final double c;
    public final ijb d;

    public zl8(Instant instant, ZoneOffset zoneOffset, double d, ijb ijbVar) {
        this.a = instant;
        this.b = zoneOffset;
        this.c = d;
        this.d = ijbVar;
        if (Build.VERSION.SDK_INT >= 34) {
            h0c.c(this);
        } else {
            quj.j(Double.valueOf(d), Double.valueOf(1.0d), Double.valueOf(200.0d), "heartRateVariabilityMillis");
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
        if (!(obj instanceof zl8)) {
            return false;
        }
        zl8 zl8Var = (zl8) obj;
        return this.c == zl8Var.c && this.a.equals(zl8Var.a) && x44.r(this.b, zl8Var.b) && this.d.equals(zl8Var.d);
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
        StringBuilder sb = new StringBuilder("HeartRateVariabilityRmssdRecord(time=");
        sb.append(this.a);
        sb.append(", zoneOffset=");
        sb.append(this.b);
        sb.append(", heartRateVariabilityMillis=");
        sb.append(this.c);
        sb.append(", metadata=");
        return ebh.q(sb, this.d, ')');
    }
}
