package defpackage;

import java.time.Instant;
import java.time.ZoneOffset;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class p4d implements sa9 {
    public final Instant a;
    public final ZoneOffset b;
    public final Instant c;
    public final ZoneOffset d;
    public final ijb e;
    public final boolean f;
    public final int g;
    public final String h;
    public final ArrayList i;
    public final String j;
    public final String k;

    public p4d(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, ijb ijbVar, boolean z, int i, String str, ArrayList arrayList, String str2, String str3) {
        this.a = instant;
        this.b = zoneOffset;
        this.c = instant2;
        this.d = zoneOffset2;
        this.e = ijbVar;
        this.f = z;
        this.g = i;
        this.h = str;
        this.i = arrayList;
        this.j = str2;
        this.k = str3;
        if (instant.isBefore(instant2)) {
            return;
        }
        sz6.p("Failed requirement.");
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
        if (!(obj instanceof p4d)) {
            return false;
        }
        p4d p4dVar = (p4d) obj;
        return this.a.equals(p4dVar.a) && x44.r(this.b, p4dVar.b) && this.c.equals(p4dVar.c) && x44.r(this.d, p4dVar.d) && this.f == p4dVar.f && this.i.equals(p4dVar.i) && x44.r(this.j, p4dVar.j) && x44.r(this.k, p4dVar.k) && this.g == p4dVar.g && this.e.equals(p4dVar.e);
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
        int i = ebh.i(this.c, (iHashCode + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31, 31);
        ZoneOffset zoneOffset2 = this.d;
        int iHashCode2 = (this.i.hashCode() + fsh.p((i + (zoneOffset2 != null ? zoneOffset2.hashCode() : 0)) * 31, 31, this.f)) * 31;
        String str = this.j;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.k;
        int iHashCode4 = (((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.g) * 31;
        String str3 = this.h;
        return this.e.hashCode() + ((iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // defpackage.y7e
    public final ijb m() {
        throw null;
    }

    public final String toString() {
        return "PlannedExerciseSessionRecord(startTime=" + this.a + ", startZoneOffset=" + this.b + ", endTime=" + this.c + ", endZoneOffset=" + this.d + ", hasExplicitTime=" + this.f + ", title=" + this.j + ", notes=" + this.k + ", exerciseType=" + this.g + ", completedExerciseSessionId=" + this.h + ", metadata=" + this.e + ", blocks=" + this.i + ')';
    }
}
