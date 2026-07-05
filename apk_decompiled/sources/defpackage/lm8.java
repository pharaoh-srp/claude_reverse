package defpackage;

import android.os.Build;
import java.time.Instant;
import java.time.ZoneOffset;

/* JADX INFO: loaded from: classes2.dex */
public final class lm8 implements i69 {
    public static final f3a e;
    public static final vr f;
    public static final vr g;
    public static final vr h;
    public final Instant a;
    public final ZoneOffset b;
    public final f3a c;
    public final ijb d;

    static {
        y2a y2aVar = f3a.G;
        e = y2a.a(3.0d);
        y2a y2aVar2 = f3a.G;
        f = pok.g("Height", nr.AVERAGE, "height", new ty4(1, y2aVar2, y2a.class, "meters", "meters(D)Landroidx/health/connect/client/units/Length;", 0, 15));
        g = pok.g("Height", nr.MINIMUM, "height", new ty4(1, y2aVar2, y2a.class, "meters", "meters(D)Landroidx/health/connect/client/units/Length;", 0, 17));
        h = pok.g("Height", nr.MAXIMUM, "height", new ty4(1, y2aVar2, y2a.class, "meters", "meters(D)Landroidx/health/connect/client/units/Length;", 0, 16));
    }

    public lm8(Instant instant, ZoneOffset zoneOffset, f3a f3aVar, ijb ijbVar) {
        this.a = instant;
        this.b = zoneOffset;
        this.c = f3aVar;
        this.d = ijbVar;
        if (Build.VERSION.SDK_INT >= 34) {
            h0c.c(this);
            return;
        }
        quj.l(f3aVar, (f3a) sta.f0(f3aVar.F, f3a.H), "height");
        quj.m(f3aVar, e, "height");
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
        if (!(obj instanceof lm8)) {
            return false;
        }
        lm8 lm8Var = (lm8) obj;
        return this.c.equals(lm8Var.c) && this.a.equals(lm8Var.a) && x44.r(this.b, lm8Var.b) && this.d.equals(lm8Var.d);
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
        StringBuilder sb = new StringBuilder("HeightRecord(time=");
        sb.append(this.a);
        sb.append(", zoneOffset=");
        sb.append(this.b);
        sb.append(", height=");
        sb.append(this.c);
        sb.append(", metadata=");
        return ebh.q(sb, this.d, ')');
    }
}
