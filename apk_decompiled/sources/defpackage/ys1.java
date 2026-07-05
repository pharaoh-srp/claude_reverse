package defpackage;

import android.os.Build;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ys1 implements i69 {
    public static final Map h;
    public static final Map i;
    public static final sdd j;
    public static final sdd k;
    public static final sdd l;
    public static final sdd m;
    public static final vr n;
    public static final vr o;
    public static final vr p;
    public static final vr q;
    public static final vr r;
    public static final vr s;
    public final Instant a;
    public final ZoneOffset b;
    public final ijb c;
    public final sdd d;
    public final sdd e;
    public final int f;
    public final int g;

    static {
        Map mapH0 = sta.h0(new cpc("left_upper_arm", 3), new cpc("left_wrist", 1), new cpc("right_upper_arm", 4), new cpc("right_wrist", 2));
        h = mapH0;
        quj.n(mapH0);
        Map mapH02 = sta.h0(new cpc("lying_down", 3), new cpc("reclining", 4), new cpc("sitting_down", 2), new cpc("standing_up", 1));
        i = mapH02;
        quj.n(mapH02);
        j = new sdd(20.0d);
        k = new sdd(200.0d);
        l = new sdd(10.0d);
        m = new sdd(180.0d);
        rdd rddVar = sdd.F;
        yb ybVar = new yb(1, rddVar, rdd.class, "millimetersOfMercury", "millimetersOfMercury(D)Landroidx/health/connect/client/units/Pressure;", 0, 20);
        nr nrVar = nr.AVERAGE;
        n = pok.g("BloodPressure", nrVar, "systolic", ybVar);
        int i2 = 0;
        int i3 = 1;
        yb ybVar2 = new yb(i3, rddVar, rdd.class, "millimetersOfMercury", "millimetersOfMercury(D)Landroidx/health/connect/client/units/Pressure;", i2, 22);
        nr nrVar2 = nr.MINIMUM;
        o = pok.g("BloodPressure", nrVar2, "systolic", ybVar2);
        yb ybVar3 = new yb(i3, rddVar, rdd.class, "millimetersOfMercury", "millimetersOfMercury(D)Landroidx/health/connect/client/units/Pressure;", i2, 21);
        nr nrVar3 = nr.MAXIMUM;
        p = pok.g("BloodPressure", nrVar3, "systolic", ybVar3);
        q = pok.g("BloodPressure", nrVar, "diastolic", new yb(i3, rddVar, rdd.class, "millimetersOfMercury", "millimetersOfMercury(D)Landroidx/health/connect/client/units/Pressure;", i2, 17));
        r = pok.g("BloodPressure", nrVar2, "diastolic", new yb(i3, rddVar, rdd.class, "millimetersOfMercury", "millimetersOfMercury(D)Landroidx/health/connect/client/units/Pressure;", i2, 19));
        s = pok.g("BloodPressure", nrVar3, "diastolic", new yb(i3, rddVar, rdd.class, "millimetersOfMercury", "millimetersOfMercury(D)Landroidx/health/connect/client/units/Pressure;", i2, 18));
    }

    public ys1(Instant instant, ZoneOffset zoneOffset, ijb ijbVar, sdd sddVar, sdd sddVar2, int i2, int i3) {
        this.a = instant;
        this.b = zoneOffset;
        this.c = ijbVar;
        this.d = sddVar;
        this.e = sddVar2;
        this.f = i2;
        this.g = i3;
        if (Build.VERSION.SDK_INT >= 34) {
            h0c.c(this);
            return;
        }
        quj.l(sddVar, j, "systolic");
        quj.m(sddVar, k, "systolic");
        quj.l(sddVar2, l, "diastolic");
        quj.m(sddVar2, m, "diastolic");
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
        if (!(obj instanceof ys1)) {
            return false;
        }
        ys1 ys1Var = (ys1) obj;
        return this.d.equals(ys1Var.d) && this.e.equals(ys1Var.e) && this.f == ys1Var.f && this.g == ys1Var.g && this.a.equals(ys1Var.a) && x44.r(this.b, ys1Var.b) && this.c.equals(ys1Var.c);
    }

    public final int hashCode() {
        int i2 = ebh.i(this.a, (((fsh.o(this.e.E, Double.hashCode(this.d.E) * 31, 31) + this.f) * 31) + this.g) * 31, 31);
        ZoneOffset zoneOffset = this.b;
        return this.c.hashCode() + ((i2 + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31);
    }

    @Override // defpackage.y7e
    public final ijb m() {
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BloodPressureRecord(time=");
        sb.append(this.a);
        sb.append(", zoneOffset=");
        sb.append(this.b);
        sb.append(", systolic=");
        sb.append(this.d);
        sb.append(", diastolic=");
        sb.append(this.e);
        sb.append(", bodyPosition=");
        sb.append(this.f);
        sb.append(", measurementLocation=");
        sb.append(this.g);
        sb.append(", metadata=");
        return ebh.q(sb, this.c, ')');
    }
}
