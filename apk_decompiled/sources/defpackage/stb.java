package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class stb {
    public zb0 a;
    public wt7 b;
    public int c;
    public boolean d;
    public int e;
    public int f;
    public List g;
    public jkb h;
    public cz5 j;
    public tkh k;
    public el5 l;
    public fu9 m;
    public yjh n;
    public long q;
    public long i = o39.a;
    public int o = -1;
    public int p = -1;

    public stb(zb0 zb0Var, tkh tkhVar, wt7 wt7Var, int i, boolean z, int i2, int i3, List list) {
        this.a = zb0Var;
        this.b = wt7Var;
        this.c = i;
        this.d = z;
        this.e = i2;
        this.f = i3;
        this.g = list;
        this.k = tkhVar;
    }

    public final int a(int i, fu9 fu9Var) {
        int i2 = this.o;
        int i3 = this.p;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        long jA = sl4.a(0, i, 0, Integer.MAX_VALUE);
        if (this.f > 1) {
            jkb jkbVar = this.h;
            tkh tkhVar = this.k;
            cz5 cz5Var = this.j;
            cz5Var.getClass();
            jkb jkbVarE = ksk.e(jkbVar, fu9Var, tkhVar, cz5Var, this.b);
            this.h = jkbVarE;
            jA = jkbVarE.a(this.f, jA);
        }
        int iM = sf5.m(b(jA, fu9Var).e);
        int i4 = rl4.i(jA);
        if (iM < i4) {
            iM = i4;
        }
        this.o = i;
        this.p = iM;
        return iM;
    }

    public final qtb b(long j, fu9 fu9Var) {
        el5 el5VarE = e(fu9Var);
        long jT = iuj.t(j, this.d, this.c, el5VarE.j());
        boolean z = this.d;
        int i = this.c;
        int i2 = this.e;
        return new qtb(el5VarE, jT, ((z || !(i == 2 || i == 4 || i == 5)) && i2 >= 1) ? i2 : 1, i);
    }

    public final boolean c(long j, fu9 fu9Var) {
        this.q = (this.q << 2) | 3;
        if (this.f > 1) {
            jkb jkbVar = this.h;
            tkh tkhVar = this.k;
            cz5 cz5Var = this.j;
            cz5Var.getClass();
            jkb jkbVarE = ksk.e(jkbVar, fu9Var, tkhVar, cz5Var, this.b);
            this.h = jkbVarE;
            j = jkbVarE.a(this.f, j);
        }
        yjh yjhVar = this.n;
        if (yjhVar != null) {
            qtb qtbVar = yjhVar.b;
            xjh xjhVar = yjhVar.a;
            if (!qtbVar.a.c()) {
                fu9 fu9Var2 = xjhVar.h;
                long j2 = xjhVar.j;
                if (fu9Var == fu9Var2 && (rl4.b(j, j2) || (rl4.h(j) == rl4.h(j2) && rl4.j(j) == rl4.j(j2) && rl4.g(j) >= qtbVar.e && !qtbVar.c))) {
                    yjh yjhVar2 = this.n;
                    yjhVar2.getClass();
                    if (rl4.b(j, yjhVar2.a.j)) {
                        return false;
                    }
                    yjh yjhVar3 = this.n;
                    yjhVar3.getClass();
                    this.n = f(fu9Var, j, yjhVar3.b);
                    return true;
                }
            }
        }
        this.n = f(fu9Var, j, b(j, fu9Var));
        return true;
    }

    public final void d(cz5 cz5Var) {
        long jA;
        cz5 cz5Var2 = this.j;
        if (cz5Var != null) {
            int i = o39.b;
            jA = o39.a(cz5Var.getDensity(), cz5Var.k0());
        } else {
            jA = o39.a;
        }
        if (cz5Var2 == null) {
            this.j = cz5Var;
            this.i = jA;
        } else if (cz5Var == null || this.i != jA) {
            this.j = cz5Var;
            this.i = jA;
            this.q = (this.q << 2) | 1;
            this.l = null;
            this.n = null;
            this.p = -1;
            this.o = -1;
        }
    }

    public final el5 e(fu9 fu9Var) {
        el5 el5Var = this.l;
        if (el5Var == null || fu9Var != this.m || el5Var.c()) {
            this.m = fu9Var;
            zb0 zb0Var = this.a;
            tkh tkhVarY = yfd.Y(this.k, fu9Var);
            cz5 cz5Var = this.j;
            cz5Var.getClass();
            wt7 wt7Var = this.b;
            List list = this.g;
            if (list == null) {
                list = lm6.E;
            }
            el5Var = new el5(zb0Var, tkhVarY, list, cz5Var, wt7Var);
        }
        this.l = el5Var;
        return el5Var;
    }

    public final yjh f(fu9 fu9Var, long j, qtb qtbVar) {
        float fMin = Math.min(qtbVar.a.j(), qtbVar.d);
        zb0 zb0Var = this.a;
        tkh tkhVar = this.k;
        List list = this.g;
        if (list == null) {
            list = lm6.E;
        }
        int i = this.e;
        boolean z = this.d;
        int i2 = this.c;
        cz5 cz5Var = this.j;
        cz5Var.getClass();
        return new yjh(new xjh(zb0Var, tkhVar, list, i, z, i2, cz5Var, fu9Var, this.b, j), qtbVar, sl4.d(j, (((long) sf5.m(fMin)) << 32) | (((long) sf5.m(qtbVar.e)) & 4294967295L)));
    }

    public final void g(zb0 zb0Var, tkh tkhVar, wt7 wt7Var, int i, boolean z, int i2, int i3, List list) {
        this.a = zb0Var;
        boolean zE = tkhVar.e(this.k);
        this.k = tkhVar;
        if (!zE) {
            this.q <<= 2;
            this.l = null;
            this.n = null;
            this.p = -1;
            this.o = -1;
        }
        this.b = wt7Var;
        this.c = i;
        this.d = z;
        this.e = i2;
        this.f = i3;
        this.g = list;
        this.q = (this.q << 2) | 2;
        this.l = null;
        this.n = null;
        this.p = -1;
        this.o = -1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiParagraphLayoutCache(textLayoutResult=");
        sb.append(this.n != null ? "<TextLayoutResult>" : "null");
        sb.append(", lastDensity=");
        sb.append((Object) o39.b(this.i));
        sb.append(", history=");
        sb.append(this.q);
        sb.append(", constraints=");
        yjh yjhVar = this.n;
        sb.append(yjhVar != null ? new rl4(yjhVar.a.j) : "null");
        sb.append(')');
        return sb.toString();
    }
}
