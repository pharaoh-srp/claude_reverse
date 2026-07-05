package defpackage;

import android.util.Pair;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class t7b {
    public final s7b a;
    public final Object b;
    public final b4f[] c;
    public boolean d;
    public boolean e;
    public boolean f;
    public u7b g;
    public boolean h;
    public final boolean[] i;
    public final pe1[] j;
    public final gv5 k;
    public final o8b l;
    public t7b m;
    public w3i n;
    public f4i o;
    public long p;

    public t7b(pe1[] pe1VarArr, long j, gv5 gv5Var, xv8 xv8Var, o8b o8bVar, u7b u7bVar, f4i f4iVar) {
        this.j = pe1VarArr;
        this.p = j;
        this.k = gv5Var;
        this.l = o8bVar;
        z7b z7bVar = u7bVar.a;
        this.b = z7bVar.a;
        this.g = u7bVar;
        this.n = w3i.d;
        this.o = f4iVar;
        this.c = new b4f[pe1VarArr.length];
        this.i = new boolean[pe1VarArr.length];
        long j2 = u7bVar.b;
        long j3 = u7bVar.e;
        boolean z = u7bVar.g;
        o8bVar.getClass();
        Object obj = z7bVar.a;
        int i = l7d.k;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        z7b z7bVarA = z7bVar.a(pair.second);
        n8b n8bVar = (n8b) ((HashMap) o8bVar.e).get(obj2);
        n8bVar.getClass();
        ((HashSet) o8bVar.h).add(n8bVar);
        m8b m8bVar = (m8b) ((HashMap) o8bVar.f).get(n8bVar);
        if (m8bVar != null) {
            m8bVar.a.d(m8bVar.b);
        }
        n8bVar.c.add(z7bVarA);
        s7b s7bVarA = n8bVar.a.a(z7bVarA, xv8Var, j2);
        ((IdentityHashMap) o8bVar.d).put(s7bVarA, n8bVar);
        o8bVar.d();
        if (j3 != -9223372036854775807L) {
            s7bVarA = new sp3(s7bVarA, !z, 0L, j3, 0);
        }
        this.a = s7bVarA;
    }

    public final long a(f4i f4iVar, long j, boolean z, boolean[] zArr) {
        pe1[] pe1VarArr;
        b4f[] b4fVarArr;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= f4iVar.E) {
                break;
            }
            if (z || !f4iVar.d(this.o, i)) {
                z2 = false;
            }
            this.i[i] = z2;
            i++;
        }
        int i2 = 0;
        while (true) {
            pe1VarArr = this.j;
            int length = pe1VarArr.length;
            b4fVarArr = this.c;
            if (i2 >= length) {
                break;
            }
            if (pe1VarArr[i2].F == -2) {
                b4fVarArr[i2] = null;
            }
            i2++;
        }
        b();
        this.o = f4iVar;
        c();
        long jC = this.a.c((f87[]) f4iVar.G, this.i, this.c, zArr, j);
        for (int i3 = 0; i3 < pe1VarArr.length; i3++) {
            if (pe1VarArr[i3].F == -2 && this.o.e(i3)) {
                b4fVarArr[i3] = new yl4();
            }
        }
        this.f = false;
        for (int i4 = 0; i4 < b4fVarArr.length; i4++) {
            if (b4fVarArr[i4] != null) {
                fd9.M(f4iVar.e(i4));
                if (pe1VarArr[i4].F != -2) {
                    this.f = true;
                }
            } else {
                fd9.M(((f87[]) f4iVar.G)[i4] == null);
            }
        }
        return jC;
    }

    public final void b() {
        if (this.m != null) {
            return;
        }
        int i = 0;
        while (true) {
            f4i f4iVar = this.o;
            if (i >= f4iVar.E) {
                return;
            }
            boolean zE = f4iVar.e(i);
            f87 f87Var = ((f87[]) this.o.G)[i];
            if (zE && f87Var != null) {
                f87Var.f();
            }
            i++;
        }
    }

    public final void c() {
        if (this.m != null) {
            return;
        }
        int i = 0;
        while (true) {
            f4i f4iVar = this.o;
            if (i >= f4iVar.E) {
                return;
            }
            boolean zE = f4iVar.e(i);
            f87 f87Var = ((f87[]) this.o.G)[i];
            if (zE && f87Var != null) {
                f87Var.d();
            }
            i++;
        }
    }

    public final long d() {
        if (!this.e) {
            return this.g.b;
        }
        long jP = this.f ? this.a.p() : Long.MIN_VALUE;
        return jP == Long.MIN_VALUE ? this.g.f : jP;
    }

    public final long e() {
        return this.g.b + this.p;
    }

    public final void f(float f, mqh mqhVar, boolean z) {
        this.e = true;
        this.n = this.a.m();
        f4i f4iVarJ = j(f, mqhVar, z);
        u7b u7bVar = this.g;
        long jMax = u7bVar.b;
        long j = u7bVar.f;
        if (j != -9223372036854775807L && jMax >= j) {
            jMax = Math.max(0L, j - 1);
        }
        long jA = a(f4iVarJ, jMax, false, new boolean[this.j.length]);
        long j2 = this.p;
        u7b u7bVar2 = this.g;
        this.p = (u7bVar2.b - jA) + j2;
        this.g = u7bVar2.b(jA, u7bVar2.c);
    }

    public final boolean g() {
        if (this.e) {
            return !this.f || this.a.p() == Long.MIN_VALUE;
        }
        return false;
    }

    public final boolean h() {
        if (this.e) {
            return g() || d() - this.g.b >= -9223372036854775807L;
        }
        return false;
    }

    public final void i() {
        b();
        s7b s7bVar = this.a;
        try {
            boolean z = s7bVar instanceof sp3;
            o8b o8bVar = this.l;
            if (z) {
                o8bVar.h(((sp3) s7bVar).E);
            } else {
                o8bVar.h(s7bVar);
            }
        } catch (RuntimeException e) {
            ysj.k("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x02fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.f4i j(float r33, defpackage.mqh r34, boolean r35) {
        /*
            Method dump skipped, instruction units count: 2088
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t7b.j(float, mqh, boolean):f4i");
    }

    public final void k() {
        s7b s7bVar = this.a;
        if (s7bVar instanceof sp3) {
            long j = this.g.e;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            sp3 sp3Var = (sp3) s7bVar;
            sp3Var.J = 0L;
            sp3Var.K = j;
        }
    }
}
