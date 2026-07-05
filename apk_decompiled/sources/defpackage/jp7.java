package defpackage;

import android.os.Build;
import java.time.Instant;
import java.time.ZoneOffset;

/* JADX INFO: loaded from: classes2.dex */
public final class jp7 implements sa9 {
    public static final vr g = new vr(new pr(), "FloorsClimbed", nr.TOTAL, "floors");
    public final Instant a;
    public final ZoneOffset b;
    public final Instant c;
    public final ZoneOffset d;
    public final double e;
    public final ijb f;

    public jp7(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, double d, ijb ijbVar) {
        this.a = instant;
        this.b = zoneOffset;
        this.c = instant2;
        this.d = zoneOffset2;
        this.e = d;
        this.f = ijbVar;
        if (!instant.isBefore(instant2)) {
            sz6.p("startTime must be before endTime.");
            throw null;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            h0c.c(this);
        } else {
            quj.k(d, "floors");
            quj.m(Double.valueOf(d), Double.valueOf(1000000.0d), "floors");
        }
    }

    @Override // defpackage.sa9
    public final Instant b() {
        return this.a;
    }

    @Override // defpackage.sa9
    public final Instant e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jp7)) {
            return false;
        }
        jp7 jp7Var = (jp7) obj;
        return this.e == jp7Var.e && this.a.equals(jp7Var.a) && x44.r(this.b, jp7Var.b) && this.c.equals(jp7Var.c) && x44.r(this.d, jp7Var.d) && this.f.equals(jp7Var.f);
    }

    @Override // defpackage.sa9
    public final ZoneOffset f() {
        return this.d;
    }

    @Override // defpackage.sa9
    public final ZoneOffset g() {
        return this.b;
    }

    public final int hashCode() {
        int iHashCode = Double.hashCode(this.e) * 31;
        ZoneOffset zoneOffset = this.b;
        int i = ebh.i(this.c, (iHashCode + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31, 31);
        ZoneOffset zoneOffset2 = this.d;
        return this.f.hashCode() + ((i + (zoneOffset2 != null ? zoneOffset2.hashCode() : 0)) * 31);
    }

    @Override // defpackage.y7e
    public final ijb m() {
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FloorsClimbedRecord(startTime=");
        sb.append(this.a);
        sb.append(", startZoneOffset=");
        sb.append(this.b);
        sb.append(", endTime=");
        sb.append(this.c);
        sb.append(", endZoneOffset=");
        sb.append(this.d);
        sb.append(", floors=");
        sb.append(this.e);
        sb.append(", metadata=");
        return ebh.q(sb, this.f, ')');
    }
}
