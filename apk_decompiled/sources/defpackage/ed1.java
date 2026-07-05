package defpackage;

import java.time.Instant;
import java.time.ZoneOffset;

/* JADX INFO: loaded from: classes2.dex */
public final class ed1 implements i69 {
    public static final jad e = new jad(10000.0d, iad.F);
    public static final vr f = new vr(new ur(new yb(1, yn6.G, sn6.class, "kilocalories", "kilocalories(D)Landroidx/health/connect/client/units/Energy;", 0, 13)), "BasalCaloriesBurned", nr.TOTAL, "energy");
    public final Instant a;
    public final ZoneOffset b;
    public final jad c;
    public final ijb d;

    public ed1(Instant instant, ZoneOffset zoneOffset, jad jadVar, ijb ijbVar) {
        this.a = instant;
        this.b = zoneOffset;
        this.c = jadVar;
        this.d = ijbVar;
        quj.l(jadVar, (jad) sta.f0(jadVar.F, jad.H), "bmr");
        quj.m(jadVar, e, "bmr");
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
        if (!(obj instanceof ed1)) {
            return false;
        }
        ed1 ed1Var = (ed1) obj;
        return this.c.equals(ed1Var.c) && this.a.equals(ed1Var.a) && x44.r(this.b, ed1Var.b) && this.d.equals(ed1Var.d);
    }

    public final int hashCode() {
        int i = ebh.i(this.a, this.c.hashCode() * 31, 31);
        ZoneOffset zoneOffset = this.b;
        return this.d.hashCode() + ((i + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31);
    }

    @Override // defpackage.y7e
    public final ijb m() {
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BasalMetabolicRateRecord(time=");
        sb.append(this.a);
        sb.append(", zoneOffset=");
        sb.append(this.b);
        sb.append(", basalMetabolicRate=");
        sb.append(this.c);
        sb.append(", metadata=");
        return ebh.q(sb, this.d, ')');
    }
}
