package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class kqh {
    public static final Object o = new Object();
    public static final j7b p;
    public Object a = o;
    public j7b b = p;
    public long c;
    public long d;
    public long e;
    public boolean f;
    public boolean g;
    public f7b h;
    public boolean i;
    public long j;
    public long k;
    public int l;
    public int m;
    public long n;

    static {
        xm7 xm7Var = new xm7();
        iz8 iz8Var = nz8.F;
        vde vdeVar = vde.I;
        List list = Collections.EMPTY_LIST;
        vde vdeVar2 = vde.I;
        e7b e7bVar = new e7b();
        h7b h7bVar = h7b.a;
        Uri uri = Uri.EMPTY;
        p = new j7b("androidx.media3.common.Timeline", new d7b(xm7Var), uri != null ? new g7b(uri, null, null, list, vdeVar2, -9223372036854775807L) : null, new f7b(e7bVar), n7b.B, h7bVar);
        ebh.w(1, 2, 3, 4, 5);
        ebh.w(6, 7, 8, 9, 10);
        tpi.w(11);
        tpi.w(12);
        tpi.w(13);
    }

    public final boolean a() {
        return this.h != null;
    }

    public final void b(j7b j7bVar, boolean z, boolean z2, f7b f7bVar, long j, long j2) {
        this.a = o;
        this.b = j7bVar != null ? j7bVar : p;
        if (j7bVar != null) {
            g7b g7bVar = j7bVar.b;
        }
        this.c = -9223372036854775807L;
        this.d = -9223372036854775807L;
        this.e = -9223372036854775807L;
        this.f = z;
        this.g = z2;
        this.h = f7bVar;
        this.j = j;
        this.k = j2;
        this.l = 0;
        this.m = 0;
        this.n = 0L;
        this.i = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !kqh.class.equals(obj.getClass())) {
            return false;
        }
        kqh kqhVar = (kqh) obj;
        return Objects.equals(this.a, kqhVar.a) && Objects.equals(this.b, kqhVar.b) && Objects.equals(this.h, kqhVar.h) && this.c == kqhVar.c && this.d == kqhVar.d && this.e == kqhVar.e && this.f == kqhVar.f && this.g == kqhVar.g && this.i == kqhVar.i && this.j == kqhVar.j && this.k == kqhVar.k && this.l == kqhVar.l && this.m == kqhVar.m && this.n == kqhVar.n;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + ((this.a.hashCode() + 217) * 31)) * 961;
        f7b f7bVar = this.h;
        int iHashCode2 = f7bVar == null ? 0 : f7bVar.hashCode();
        long j = this.c;
        int i = (((iHashCode + iHashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.d;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.e;
        int i3 = (((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.i ? 1 : 0)) * 31;
        long j4 = this.j;
        int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.k;
        int i5 = (((((i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.l) * 31) + this.m) * 31;
        long j6 = this.n;
        return i5 + ((int) (j6 ^ (j6 >>> 32)));
    }
}
