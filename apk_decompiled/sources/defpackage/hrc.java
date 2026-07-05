package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hrc {
    public String a;
    public tkh b;
    public wt7 c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public cz5 i;
    public x30 j;
    public boolean k;
    public jkb m;
    public frc n;
    public fu9 o;
    public long s;
    public long h = o39.a;
    public long l = 0;
    public long p = sl4.h(0, 0, 0, 0);
    public int q = -1;
    public int r = -1;

    public hrc(String str, tkh tkhVar, wt7 wt7Var, int i, boolean z, int i2, int i3) {
        this.a = str;
        this.b = tkhVar;
        this.c = wt7Var;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
    }

    public static long g(hrc hrcVar, long j, fu9 fu9Var) {
        tkh tkhVar = hrcVar.b;
        jkb jkbVar = hrcVar.m;
        cz5 cz5Var = hrcVar.i;
        cz5Var.getClass();
        jkb jkbVarE = ksk.e(jkbVar, fu9Var, tkhVar, cz5Var, hrcVar.c);
        hrcVar.m = jkbVarE;
        return jkbVarE.a(hrcVar.g, j);
    }

    public final int a(int i, fu9 fu9Var) {
        int i2 = this.q;
        int i3 = this.r;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        long jA = sl4.a(0, i, 0, Integer.MAX_VALUE);
        if (this.g > 1) {
            jA = g(this, jA, fu9Var);
        }
        frc frcVarE = e(fu9Var);
        long jT = iuj.t(jA, this.e, this.d, frcVarE.j());
        boolean z = this.e;
        int i4 = this.d;
        int i5 = this.f;
        int iM = sf5.m(new x30((b40) frcVarE, ((z || !(i4 == 2 || i4 == 4 || i4 == 5)) && i5 >= 1) ? i5 : 1, i4, jT).b());
        int i6 = rl4.i(jA);
        if (iM < i6) {
            iM = i6;
        }
        this.q = i;
        this.r = iM;
        return iM;
    }

    public final boolean b(long j, fu9 fu9Var) {
        frc frcVar;
        this.s = (this.s << 2) | 3;
        boolean z = true;
        long jG = this.g > 1 ? g(this, j, fu9Var) : j;
        x30 x30Var = this.j;
        boolean z2 = false;
        if (x30Var != null && (frcVar = this.n) != null && !frcVar.c() && fu9Var == this.o && (rl4.b(jG, this.p) || (rl4.h(jG) == rl4.h(this.p) && rl4.j(jG) == rl4.j(this.p) && rl4.g(jG) >= x30Var.b() && !x30Var.d.d))) {
            if (!rl4.b(jG, this.p)) {
                x30 x30Var2 = this.j;
                x30Var2.getClass();
                this.l = sl4.d(jG, (((long) sf5.m(Math.min(x30Var2.a.M.c(), x30Var2.d()))) << 32) | (((long) sf5.m(x30Var2.b())) & 4294967295L));
                if (this.d == 3 || (((int) (r12 >> 32)) >= x30Var2.d() && ((int) (4294967295L & r12)) >= x30Var2.b())) {
                    z = false;
                }
                this.k = z;
                this.p = jG;
            }
            return false;
        }
        frc frcVarE = e(fu9Var);
        long jT = iuj.t(jG, this.e, this.d, frcVarE.j());
        boolean z3 = this.e;
        int i = this.d;
        int i2 = this.f;
        x30 x30Var3 = new x30((b40) frcVarE, ((z3 || !(i == 2 || i == 4 || i == 5)) && i2 >= 1) ? i2 : 1, i, jT);
        this.p = jG;
        this.l = sl4.d(jG, (((long) sf5.m(x30Var3.b())) & 4294967295L) | (((long) sf5.m(x30Var3.d())) << 32));
        if (this.d != 3 && (((int) (r1 >> 32)) < x30Var3.d() || ((int) (r1 & 4294967295L)) < x30Var3.b())) {
            z2 = true;
        }
        this.k = z2;
        this.j = x30Var3;
        return true;
    }

    public final void c() {
        this.j = null;
        this.n = null;
        this.o = null;
        this.q = -1;
        this.r = -1;
        this.p = sl4.h(0, 0, 0, 0);
        this.l = 0L;
        this.k = false;
    }

    public final void d(cz5 cz5Var) {
        long jA;
        cz5 cz5Var2 = this.i;
        if (cz5Var != null) {
            int i = o39.b;
            jA = o39.a(cz5Var.getDensity(), cz5Var.k0());
        } else {
            jA = o39.a;
        }
        if (cz5Var2 == null) {
            this.i = cz5Var;
            this.h = jA;
        } else if (cz5Var == null || this.h != jA) {
            this.i = cz5Var;
            this.h = jA;
            this.s = (this.s << 2) | 1;
            c();
        }
    }

    public final frc e(fu9 fu9Var) {
        frc b40Var = this.n;
        if (b40Var == null || fu9Var != this.o || b40Var.c()) {
            this.o = fu9Var;
            String str = this.a;
            tkh tkhVarY = yfd.Y(this.b, fu9Var);
            cz5 cz5Var = this.i;
            cz5Var.getClass();
            wt7 wt7Var = this.c;
            lm6 lm6Var = lm6.E;
            b40Var = new b40(str, tkhVarY, lm6Var, lm6Var, wt7Var, cz5Var);
        }
        this.n = b40Var;
        return b40Var;
    }

    public final void f(String str, tkh tkhVar, wt7 wt7Var, int i, boolean z, int i2, int i3) {
        this.a = str;
        this.b = tkhVar;
        this.c = wt7Var;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
        this.s = (this.s << 2) | 2;
        c();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphLayoutCache(paragraph=");
        sb.append(this.j != null ? "<paragraph>" : "null");
        sb.append(", lastDensity=");
        sb.append((Object) o39.b(this.h));
        sb.append(", history=");
        return grc.r(this.s, ", constraints=$)", sb);
    }
}
