package defpackage;

import java.time.Instant;
import java.time.ZoneOffset;

/* JADX INFO: loaded from: classes2.dex */
public final class d96 implements sa9 {
    public static final f3a g;
    public static final vr h;
    public final Instant a;
    public final ZoneOffset b;
    public final Instant c;
    public final ZoneOffset d;
    public final f3a e;
    public final ijb f;

    static {
        y2a y2aVar = f3a.G;
        g = y2a.a(1000000.0d);
        h = new vr(new ur(new ty4(1, f3a.G, y2a.class, "meters", "meters(D)Landroidx/health/connect/client/units/Length;", 0, 9)), "Distance", nr.TOTAL, "distance");
    }

    public d96(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, f3a f3aVar, ijb ijbVar) {
        this.a = instant;
        this.b = zoneOffset;
        this.c = instant2;
        this.d = zoneOffset2;
        this.e = f3aVar;
        this.f = ijbVar;
        quj.l(f3aVar, (f3a) sta.f0(f3aVar.F, f3a.H), "distance");
        quj.m(f3aVar, g, "distance");
        if (instant.isBefore(instant2)) {
            return;
        }
        sz6.p("startTime must be before endTime.");
        throw null;
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
        if (!(obj instanceof d96)) {
            return false;
        }
        d96 d96Var = (d96) obj;
        f3a f3aVar = d96Var.e;
        f3a f3aVar2 = this.e;
        return f3aVar2.equals(f3aVar) && this.a.equals(d96Var.a) && x44.r(this.b, d96Var.b) && this.c.equals(d96Var.c) && x44.r(this.d, d96Var.d) && this.f.equals(d96Var.f) && f3aVar2.a() == f3aVar.a();
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
        f3a f3aVar = this.e;
        int i = ebh.i(this.a, f3aVar.hashCode() * 31, 31);
        ZoneOffset zoneOffset = this.b;
        int i2 = ebh.i(this.c, (i + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31, 31);
        ZoneOffset zoneOffset2 = this.d;
        int iHashCode = zoneOffset2 != null ? zoneOffset2.hashCode() : 0;
        return Double.hashCode(f3aVar.a()) + ((this.f.hashCode() + ((i2 + iHashCode) * 31)) * 31);
    }

    @Override // defpackage.y7e
    public final ijb m() {
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DistanceRecord(startTime=");
        sb.append(this.a);
        sb.append(", startZoneOffset=");
        sb.append(this.b);
        sb.append(", endTime=");
        sb.append(this.c);
        sb.append(", endZoneOffset=");
        sb.append(this.d);
        sb.append(", distance=");
        sb.append(this.e);
        sb.append(", metadata=");
        return ebh.q(sb, this.f, ')');
    }
}
