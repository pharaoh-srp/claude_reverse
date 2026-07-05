package defpackage;

import android.net.NetworkRequest;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class ql4 {
    public static final ql4 j = new ql4();
    public final t1c a;
    public final k1c b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final long g;
    public final long h;
    public final Set i;

    public ql4(ql4 ql4Var) {
        ql4Var.getClass();
        this.c = ql4Var.c;
        this.d = ql4Var.d;
        this.b = ql4Var.b;
        this.a = ql4Var.a;
        this.e = ql4Var.e;
        this.f = ql4Var.f;
        this.i = ql4Var.i;
        this.g = ql4Var.g;
        this.h = ql4Var.h;
    }

    public final long a() {
        return this.h;
    }

    public final long b() {
        return this.g;
    }

    public final Set c() {
        return this.i;
    }

    public final NetworkRequest d() {
        return (NetworkRequest) this.b.a;
    }

    public final k1c e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !ql4.class.equals(obj.getClass())) {
            return false;
        }
        ql4 ql4Var = (ql4) obj;
        if (this.c == ql4Var.c && this.d == ql4Var.d && this.e == ql4Var.e && this.f == ql4Var.f && this.g == ql4Var.g && this.h == ql4Var.h && x44.r(d(), ql4Var.d()) && this.a == ql4Var.a) {
            return x44.r(this.i, ql4Var.i);
        }
        return false;
    }

    public final t1c f() {
        return this.a;
    }

    public final boolean g() {
        return !this.i.isEmpty();
    }

    public final boolean h() {
        return this.e;
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.a.hashCode() * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31;
        long j2 = this.g;
        int i = (iHashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.h;
        int iHashCode2 = (this.i.hashCode() + ((i + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31;
        NetworkRequest networkRequestD = d();
        return iHashCode2 + (networkRequestD != null ? networkRequestD.hashCode() : 0);
    }

    public final boolean i() {
        return this.c;
    }

    public final boolean j() {
        return this.d;
    }

    public final boolean k() {
        return this.f;
    }

    public final String toString() {
        return "Constraints{requiredNetworkType=" + this.a + ", requiresCharging=" + this.c + ", requiresDeviceIdle=" + this.d + ", requiresBatteryNotLow=" + this.e + ", requiresStorageNotLow=" + this.f + ", contentTriggerUpdateDelayMillis=" + this.g + ", contentTriggerMaxDelayMillis=" + this.h + ", contentUriTriggers=" + this.i + ", }";
    }

    public ql4(k1c k1cVar, t1c t1cVar, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, Set set) {
        k1cVar.getClass();
        t1cVar.getClass();
        this.b = k1cVar;
        this.a = t1cVar;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = j2;
        this.h = j3;
        this.i = set;
    }

    public ql4() {
        this.b = new k1c(null);
        this.a = t1c.E;
        this.c = false;
        this.d = false;
        this.e = false;
        this.f = false;
        this.g = -1L;
        this.h = -1L;
        this.i = um6.E;
    }
}
