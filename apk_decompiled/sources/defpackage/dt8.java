package defpackage;

import android.os.Build;
import java.time.Instant;
import java.time.ZoneOffset;

/* JADX INFO: loaded from: classes2.dex */
public final class dt8 implements sa9 {
    public static final t5j g;
    public static final vr h;
    public final Instant a;
    public final ZoneOffset b;
    public final Instant c;
    public final ZoneOffset d;
    public final t5j e;
    public final ijb f;

    static {
        o5j o5jVar = t5j.G;
        g = new t5j(100.0d, s5j.E);
        h = new vr(new ur(new ty4(1, o5jVar, o5j.class, "liters", "liters(D)Landroidx/health/connect/client/units/Volume;", 0, 18)), "Hydration", nr.TOTAL, "volume");
    }

    public dt8(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, t5j t5jVar, ijb ijbVar) {
        this.a = instant;
        this.b = zoneOffset;
        this.c = instant2;
        this.d = zoneOffset2;
        this.e = t5jVar;
        this.f = ijbVar;
        if (!instant.isBefore(instant2)) {
            sz6.p("startTime must be before endTime.");
            throw null;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            h0c.c(this);
            return;
        }
        quj.l(t5jVar, (t5j) sta.f0(t5jVar.F, t5j.H), "volume");
        quj.m(t5jVar, g, "volume");
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
        if (!(obj instanceof dt8)) {
            return false;
        }
        dt8 dt8Var = (dt8) obj;
        return this.e.equals(dt8Var.e) && this.a.equals(dt8Var.a) && x44.r(this.b, dt8Var.b) && this.c.equals(dt8Var.c) && x44.r(this.d, dt8Var.d) && this.f.equals(dt8Var.f);
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
        int i = ebh.i(this.a, this.e.hashCode() * 31, 31);
        ZoneOffset zoneOffset = this.b;
        int i2 = ebh.i(this.c, (i + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31, 31);
        ZoneOffset zoneOffset2 = this.d;
        return this.f.hashCode() + ((i2 + (zoneOffset2 != null ? zoneOffset2.hashCode() : 0)) * 31);
    }

    @Override // defpackage.y7e
    public final ijb m() {
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HydrationRecord(startTime=");
        sb.append(this.a);
        sb.append(", startZoneOffset=");
        sb.append(this.b);
        sb.append(", endTime=");
        sb.append(this.c);
        sb.append(", endZoneOffset=");
        sb.append(this.d);
        sb.append(", volume=");
        sb.append(this.e);
        sb.append(", metadata=");
        return ebh.q(sb, this.f, ')');
    }
}
