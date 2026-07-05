package defpackage;

import java.time.Instant;
import java.time.ZoneOffset;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class mng implements jof {
    public static final vr g = new vr(new pr(), "StepsCadenceSeries", nr.AVERAGE, "rate");
    public static final vr h = new vr(new pr(), "StepsCadenceSeries", nr.MINIMUM, "rate");
    public static final vr i = new vr(new pr(), "StepsCadenceSeries", nr.MAXIMUM, "rate");
    public final Instant a;
    public final ZoneOffset b;
    public final Instant c;
    public final ZoneOffset d;
    public final List e;
    public final ijb f;

    public mng(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, List list, ijb ijbVar) {
        this.a = instant;
        this.b = zoneOffset;
        this.c = instant2;
        this.d = zoneOffset2;
        this.e = list;
        this.f = ijbVar;
        if (instant.isAfter(instant2)) {
            sz6.p("startTime must not be after endTime.");
            throw null;
        }
    }

    @Override // defpackage.sa9
    public final Instant b() {
        return this.a;
    }

    @Override // defpackage.jof
    public final List d() {
        return this.e;
    }

    @Override // defpackage.sa9
    public final Instant e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mng)) {
            return false;
        }
        mng mngVar = (mng) obj;
        return this.a.equals(mngVar.a) && x44.r(this.b, mngVar.b) && this.c.equals(mngVar.c) && x44.r(this.d, mngVar.d) && this.e.equals(mngVar.e) && this.f.equals(mngVar.f);
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
        int iHashCode = this.a.hashCode() * 31;
        ZoneOffset zoneOffset = this.b;
        int i2 = ebh.i(this.c, (iHashCode + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31, 31);
        ZoneOffset zoneOffset2 = this.d;
        return this.f.hashCode() + kgh.m((i2 + (zoneOffset2 != null ? zoneOffset2.hashCode() : 0)) * 31, 31, this.e);
    }

    @Override // defpackage.y7e
    public final ijb m() {
        return this.f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StepsCadenceRecord(startTime=");
        sb.append(this.a);
        sb.append(", startZoneOffset=");
        sb.append(this.b);
        sb.append(", endTime=");
        sb.append(this.c);
        sb.append(", endZoneOffset=");
        sb.append(this.d);
        sb.append(", samples=");
        sb.append(this.e);
        sb.append(", metadata=");
        return ebh.q(sb, this.f, ')');
    }
}
