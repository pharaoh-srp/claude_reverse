package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class v7b {
    public final hp5 c;
    public final k1h d;
    public final do0 e;
    public long f;
    public int g;
    public boolean h;
    public t7b i;
    public t7b j;
    public t7b k;
    public t7b l;
    public t7b m;
    public int n;
    public Object o;
    public long p;
    public final jqh a = new jqh();
    public final kqh b = new kqh();
    public ArrayList q = new ArrayList();

    public v7b(hp5 hp5Var, k1h k1hVar, do0 do0Var) {
        this.c = hp5Var;
        this.d = k1hVar;
        this.e = do0Var;
    }

    public static z7b o(mqh mqhVar, Object obj, long j, long j2, kqh kqhVar, jqh jqhVar) {
        mqhVar.g(obj, jqhVar);
        mqhVar.n(jqhVar.c, kqhVar);
        mqhVar.b(obj);
        int i = jqhVar.g.a;
        if (i != 0) {
            if (i == 1) {
                jqhVar.f(0);
            }
            jqhVar.g.getClass();
            jqhVar.g(0);
        }
        mqhVar.g(obj, jqhVar);
        int iC = jqhVar.c(j);
        return iC == -1 ? new z7b(obj, j2, jqhVar.b(j)) : new z7b(obj, iC, jqhVar.e(iC), j2, -1);
    }

    public final t7b a() {
        t7b t7bVar = this.i;
        if (t7bVar == null) {
            return null;
        }
        if (t7bVar == this.j) {
            this.j = t7bVar.m;
        }
        if (t7bVar == this.k) {
            this.k = t7bVar.m;
        }
        t7bVar.i();
        int i = this.n - 1;
        this.n = i;
        if (i == 0) {
            this.l = null;
            t7b t7bVar2 = this.i;
            this.o = t7bVar2.b;
            this.p = t7bVar2.g.a.d;
        }
        this.i = this.i.m;
        l();
        return this.i;
    }

    public final void b() {
        if (this.n == 0) {
            return;
        }
        t7b t7bVar = this.i;
        t7bVar.getClass();
        this.o = t7bVar.b;
        this.p = t7bVar.g.a.d;
        while (t7bVar != null) {
            t7bVar.i();
            t7bVar = t7bVar.m;
        }
        this.i = null;
        this.l = null;
        this.j = null;
        this.k = null;
        this.n = 0;
        l();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.u7b c(defpackage.mqh r21, defpackage.t7b r22, long r23) {
        /*
            Method dump skipped, instruction units count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v7b.c(mqh, t7b, long):u7b");
    }

    public final u7b d(mqh mqhVar, z7b z7bVar, long j, long j2, long j3) {
        mqhVar.g(z7bVar.a, this.a);
        boolean zB = z7bVar.b();
        Object obj = z7bVar.a;
        return zB ? e(mqhVar, obj, z7bVar.b, z7bVar.c, j, z7bVar.d, false) : f(mqhVar, obj, j2, j3, j, z7bVar.d, false);
    }

    public final u7b e(mqh mqhVar, Object obj, int i, int i2, long j, long j2, boolean z) {
        z7b z7bVar = new z7b(obj, i, i2, j2, -1);
        jqh jqhVar = this.a;
        long jA = mqhVar.g(obj, jqhVar).a(i, i2);
        if (i2 == jqhVar.e(i)) {
            jqhVar.g.getClass();
        }
        jqhVar.g(i);
        long jMax = 0;
        if (jA != -9223372036854775807L && 0 >= jA) {
            jMax = Math.max(0L, jA - 1);
        }
        return new u7b(z7bVar, jMax, -9223372036854775807L, j, -9223372036854775807L, jA, z, false, false, false, false);
    }

    public final u7b f(mqh mqhVar, Object obj, long j, long j2, long j3, long j4, boolean z) {
        long j5;
        jqh jqhVar = this.a;
        mqhVar.g(obj, jqhVar);
        int iB = jqhVar.b(j);
        boolean z2 = false;
        if (iB != -1) {
            jqhVar.g(iB);
        } else if (jqhVar.g.a > 0) {
            jqhVar.g(0);
        }
        z7b z7bVar = new z7b(obj, j4, iB);
        if (!z7bVar.b() && iB == -1) {
            z2 = true;
        }
        boolean zJ = j(mqhVar, z7bVar);
        boolean zI = i(mqhVar, z7bVar, z2);
        if (iB != -1) {
            jqhVar.g(iB);
        }
        if (iB != -1) {
            jqhVar.f(iB);
        }
        if (iB != -1) {
            jqhVar.d(iB);
            j5 = 0;
        } else {
            j5 = -9223372036854775807L;
        }
        long j6 = (j5 == -9223372036854775807L || j5 == Long.MIN_VALUE) ? jqhVar.d : j5;
        return new u7b(z7bVar, (j6 == -9223372036854775807L || j < j6) ? j : Math.max(0L, j6 - 1), j2, j3, j5, j6, z, false, z2, zJ, zI);
    }

    public final t7b g() {
        return this.k;
    }

    public final u7b h(mqh mqhVar, u7b u7bVar) {
        long j;
        z7b z7bVar = u7bVar.a;
        boolean zB = z7bVar.b();
        int i = z7bVar.e;
        boolean z = !zB && i == -1;
        int i2 = z7bVar.b;
        boolean zJ = j(mqhVar, z7bVar);
        boolean zI = i(mqhVar, z7bVar, z);
        Object obj = z7bVar.a;
        jqh jqhVar = this.a;
        mqhVar.g(obj, jqhVar);
        if (z7bVar.b() || i == -1) {
            j = -9223372036854775807L;
        } else {
            jqhVar.d(i);
            j = 0;
        }
        long jA = z7bVar.b() ? jqhVar.a(i2, z7bVar.c) : (j == -9223372036854775807L || j == Long.MIN_VALUE) ? jqhVar.d : j;
        if (z7bVar.b()) {
            jqhVar.g(i2);
        } else if (i != -1) {
            jqhVar.g(i);
        }
        return new u7b(z7bVar, u7bVar.b, u7bVar.c, u7bVar.d, j, jA, u7bVar.g, false, z, zJ, zI);
    }

    public final boolean i(mqh mqhVar, z7b z7bVar, boolean z) {
        int iB = mqhVar.b(z7bVar.a);
        if (!mqhVar.m(mqhVar.f(iB, this.a, false).c, this.b, 0L).g) {
            if (mqhVar.d(iB, this.a, this.b, this.g, this.h) == -1 && z) {
                return true;
            }
        }
        return false;
    }

    public final boolean j(mqh mqhVar, z7b z7bVar) {
        boolean z = !z7bVar.b() && z7bVar.e == -1;
        Object obj = z7bVar.a;
        if (z) {
            if (mqhVar.m(mqhVar.g(obj, this.a).c, this.b, 0L).m == mqhVar.b(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void k() {
        t7b t7bVar = this.m;
        if (t7bVar == null || t7bVar.h()) {
            this.m = null;
            for (int i = 0; i < this.q.size(); i++) {
                t7b t7bVar2 = (t7b) this.q.get(i);
                if (!t7bVar2.h()) {
                    this.m = t7bVar2;
                    return;
                }
            }
        }
    }

    public final void l() {
        hz8 hz8VarO = nz8.o();
        for (t7b t7bVar = this.i; t7bVar != null; t7bVar = t7bVar.m) {
            hz8VarO.b(t7bVar.g.a);
        }
        t7b t7bVar2 = this.j;
        this.d.d(new f60(this, hz8VarO, t7bVar2 == null ? null : t7bVar2.g.a, 7));
    }

    public final void m(long j) {
        t7b t7bVar = this.l;
        if (t7bVar != null) {
            fd9.M(t7bVar.m == null);
            if (t7bVar.e) {
                t7bVar.a.r(j - t7bVar.p);
            }
        }
    }

    public final int n(t7b t7bVar) {
        t7bVar.getClass();
        int i = 0;
        if (t7bVar != this.l) {
            this.l = t7bVar;
            while (true) {
                t7bVar = t7bVar.m;
                if (t7bVar == null) {
                    break;
                }
                if (t7bVar == this.j) {
                    t7b t7bVar2 = this.i;
                    this.j = t7bVar2;
                    this.k = t7bVar2;
                    i = 3;
                }
                if (t7bVar == this.k) {
                    this.k = this.j;
                    i |= 2;
                }
                t7bVar.i();
                this.n--;
            }
            t7b t7bVar3 = this.l;
            t7bVar3.getClass();
            if (t7bVar3.m != null) {
                t7bVar3.b();
                t7bVar3.m = null;
                t7bVar3.c();
            }
            l();
        }
        return i;
    }

    public final z7b p(mqh mqhVar, Object obj, long j) {
        long jQ;
        int iB;
        Object obj2 = obj;
        jqh jqhVar = this.a;
        int i = mqhVar.g(obj2, jqhVar).c;
        Object obj3 = this.o;
        if (obj3 == null || (iB = mqhVar.b(obj3)) == -1 || mqhVar.f(iB, jqhVar, false).c != i) {
            t7b t7bVar = this.i;
            while (true) {
                if (t7bVar == null) {
                    t7b t7bVar2 = this.i;
                    while (true) {
                        if (t7bVar2 != null) {
                            int iB2 = mqhVar.b(t7bVar2.b);
                            if (iB2 != -1 && mqhVar.f(iB2, jqhVar, false).c == i) {
                                jQ = t7bVar2.g.a.d;
                                break;
                            }
                            t7bVar2 = t7bVar2.m;
                        } else {
                            jQ = q(obj2);
                            if (jQ == -1) {
                                jQ = this.f;
                                this.f = 1 + jQ;
                                if (this.i == null) {
                                    this.o = obj2;
                                    this.p = jQ;
                                }
                            }
                        }
                    }
                } else {
                    if (t7bVar.b.equals(obj2)) {
                        jQ = t7bVar.g.a.d;
                        break;
                    }
                    t7bVar = t7bVar.m;
                }
            }
        } else {
            jQ = this.p;
        }
        mqhVar.g(obj2, jqhVar);
        int i2 = jqhVar.c;
        kqh kqhVar = this.b;
        mqhVar.n(i2, kqhVar);
        boolean z = false;
        for (int iB3 = mqhVar.b(obj); iB3 >= kqhVar.l; iB3--) {
            mqhVar.f(iB3, jqhVar, true);
            boolean z2 = jqhVar.g.a > 0;
            z |= z2;
            if (jqhVar.c(jqhVar.d) != -1) {
                obj2 = jqhVar.b;
                obj2.getClass();
            }
            if (z && (!z2 || jqhVar.d != 0)) {
                break;
            }
        }
        return o(mqhVar, obj2, j, jQ, this.b, this.a);
    }

    public final long q(Object obj) {
        for (int i = 0; i < this.q.size(); i++) {
            t7b t7bVar = (t7b) this.q.get(i);
            if (t7bVar.b.equals(obj)) {
                return t7bVar.g.a.d;
            }
        }
        return -1L;
    }

    public final int r(mqh mqhVar) {
        mqh mqhVar2;
        t7b t7bVar;
        t7b t7bVar2 = this.i;
        if (t7bVar2 == null) {
            return 0;
        }
        int iB = mqhVar.b(t7bVar2.b);
        while (true) {
            mqhVar2 = mqhVar;
            iB = mqhVar2.d(iB, this.a, this.b, this.g, this.h);
            while (true) {
                t7bVar = t7bVar2.m;
                if (t7bVar == null || t7bVar2.g.i) {
                    break;
                }
                t7bVar2 = t7bVar;
            }
            if (iB == -1 || t7bVar == null || mqhVar2.b(t7bVar.b) != iB) {
                break;
            }
            t7bVar2 = t7bVar;
            mqhVar = mqhVar2;
        }
        int iN = n(t7bVar2);
        t7bVar2.g = h(mqhVar2, t7bVar2.g);
        return iN;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int s(defpackage.mqh r23, long r24, long r26, long r28) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v7b.s(mqh, long, long, long):int");
    }
}
