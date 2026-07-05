package defpackage;

import android.os.Build;
import java.time.Instant;
import java.time.ZoneOffset;

/* JADX INFO: loaded from: classes2.dex */
public final class kk6 implements sa9 {
    public static final f3a g;
    public static final f3a h;
    public static final vr i;
    public final Instant a;
    public final ZoneOffset b;
    public final Instant c;
    public final ZoneOffset d;
    public final f3a e;
    public final ijb f;

    static {
        y2a y2aVar = f3a.G;
        g = y2a.a(1000000.0d);
        h = y2a.a(-1000000.0d);
        i = new vr(new ur(new ty4(1, f3a.G, y2a.class, "meters", "meters(D)Landroidx/health/connect/client/units/Length;", 0, 10)), "ElevationGained", nr.TOTAL, "elevation");
    }

    public kk6(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, f3a f3aVar, ijb ijbVar) {
        this.a = instant;
        this.b = zoneOffset;
        this.c = instant2;
        this.d = zoneOffset2;
        this.e = f3aVar;
        this.f = ijbVar;
        if (!instant.isBefore(instant2)) {
            sz6.p("startTime must be before endTime.");
            throw null;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            h0c.c(this);
        } else {
            quj.l(f3aVar, h, "elevation");
            quj.m(f3aVar, g, "elevation");
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
        if (!(obj instanceof kk6)) {
            return false;
        }
        kk6 kk6Var = (kk6) obj;
        return this.e.equals(kk6Var.e) && this.a.equals(kk6Var.a) && x44.r(this.b, kk6Var.b) && this.c.equals(kk6Var.c) && x44.r(this.d, kk6Var.d) && this.f.equals(kk6Var.f);
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
        int i2 = ebh.i(this.a, this.e.hashCode() * 31, 31);
        ZoneOffset zoneOffset = this.b;
        int i3 = ebh.i(this.c, (i2 + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31, 31);
        ZoneOffset zoneOffset2 = this.d;
        return this.f.hashCode() + ((i3 + (zoneOffset2 != null ? zoneOffset2.hashCode() : 0)) * 31);
    }

    @Override // defpackage.y7e
    public final ijb m() {
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ElevationGainedRecord(startTime=");
        sb.append(this.a);
        sb.append(", startZoneOffset=");
        sb.append(this.b);
        sb.append(", endTime=");
        sb.append(this.c);
        sb.append(", endZoneOffset=");
        sb.append(this.d);
        sb.append(", elevation=");
        sb.append(this.e);
        sb.append(", metadata=");
        return ebh.q(sb, this.f, ')');
    }
}
