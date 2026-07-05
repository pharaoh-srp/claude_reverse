package defpackage;

import java.time.Instant;
import java.time.ZoneOffset;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class rs1 implements i69 {
    public static final ps1 h = new ps1(50.0d, os1.E);
    public static final Map i;
    public static final Map j;
    public final Instant a;
    public final ZoneOffset b;
    public final ijb c;
    public final ps1 d;
    public final int e;
    public final int f;
    public final int g;

    static {
        Map mapH0 = sta.h0(new cpc("general", 1), new cpc("after_meal", 4), new cpc("fasting", 2), new cpc("before_meal", 3));
        i = mapH0;
        quj.n(mapH0);
        Map mapH02 = sta.h0(new cpc("interstitial_fluid", 1), new cpc("capillary_blood", 2), new cpc("plasma", 3), new cpc("tears", 5), new cpc("whole_blood", 6), new cpc("serum", 4));
        j = mapH02;
        quj.n(mapH02);
    }

    public rs1(Instant instant, ZoneOffset zoneOffset, ijb ijbVar, ps1 ps1Var, int i2, int i3, int i4) {
        this.a = instant;
        this.b = zoneOffset;
        this.c = ijbVar;
        this.d = ps1Var;
        this.e = i2;
        this.f = i3;
        this.g = i4;
        quj.l(ps1Var, (ps1) sta.f0(ps1Var.F, ps1.G), "level");
        quj.m(ps1Var, h, "level");
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
        if (!rs1.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        rs1 rs1Var = (rs1) obj;
        return this.a.equals(rs1Var.a) && x44.r(this.b, rs1Var.b) && this.d.equals(rs1Var.d) && this.e == rs1Var.e && this.f == rs1Var.f && this.g == rs1Var.g && this.c.equals(rs1Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ZoneOffset zoneOffset = this.b;
        return this.c.hashCode() + ((((((((this.d.hashCode() + ((iHashCode + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31)) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31);
    }

    @Override // defpackage.y7e
    public final ijb m() {
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BloodGlucoseRecord(time=");
        sb.append(this.a);
        sb.append(", zoneOffset=");
        sb.append(this.b);
        sb.append(", level=");
        sb.append(this.d);
        sb.append(", specimenSource=");
        sb.append(this.e);
        sb.append(", mealType=");
        sb.append(this.f);
        sb.append(", relationToMeal=");
        sb.append(this.g);
        sb.append(", metadata=");
        return ebh.q(sb, this.c, ')');
    }
}
