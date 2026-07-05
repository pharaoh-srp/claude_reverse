package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class cp3 {
    public int a;
    public int b;
    public boolean c;
    public boolean d;
    public Object e;
    public Object f;

    public static void b(pe1 pe1Var) {
        int i = pe1Var.L;
        if (i == 2) {
            fd9.M(i == 2);
            pe1Var.L = 1;
            pe1Var.v();
        }
    }

    public static boolean h(pe1 pe1Var) {
        return pe1Var.L != 0;
    }

    public static void l(pe1 pe1Var, long j) {
        pe1Var.R = true;
        if (pe1Var instanceof mkh) {
            mkh mkhVar = (mkh) pe1Var;
            fd9.M(mkhVar.R);
            mkhVar.o0 = j;
        }
    }

    public void a(pe1 pe1Var, ks5 ks5Var) {
        fd9.M(((pe1) this.e) == pe1Var || ((pe1) this.f) == pe1Var);
        if (h(pe1Var)) {
            if (pe1Var == ks5Var.G) {
                ks5Var.H = null;
                ks5Var.G = null;
                ks5Var.I = true;
            }
            b(pe1Var);
            fd9.M(pe1Var.L == 1);
            pe1Var.G.i();
            pe1Var.L = 0;
            pe1Var.M = null;
            pe1Var.N = null;
            pe1Var.R = false;
            pe1Var.p();
            pe1Var.U = null;
        }
    }

    public int c() {
        boolean zH = h((pe1) this.e);
        pe1 pe1Var = (pe1) this.f;
        return (zH ? 1 : 0) + ((pe1Var == null || !h(pe1Var)) ? 0 : 1);
    }

    public pe1 d(t7b t7bVar) {
        b4f b4fVar;
        if (t7bVar != null && (b4fVar = t7bVar.c[this.a]) != null) {
            pe1 pe1Var = (pe1) this.e;
            if (pe1Var.M == b4fVar) {
                return pe1Var;
            }
            pe1 pe1Var2 = (pe1) this.f;
            if (pe1Var2 != null && pe1Var2.M == b4fVar) {
                return pe1Var2;
            }
        }
        return null;
    }

    public boolean e(t7b t7bVar, pe1 pe1Var) {
        int i = this.a;
        if (pe1Var == null) {
            return true;
        }
        b4f b4fVar = t7bVar.c[i];
        b4f b4fVar2 = pe1Var.M;
        if (b4fVar2 == null) {
            return true;
        }
        if (b4fVar2 == b4fVar) {
            if (b4fVar == null || pe1Var.l()) {
                return true;
            }
            t7b t7bVar2 = t7bVar.m;
            if (t7bVar.g.h && t7bVar2 != null && t7bVar2.e && ((pe1Var instanceof mkh) || (pe1Var instanceof rjb) || pe1Var.Q >= t7bVar2.e())) {
                return true;
            }
        }
        t7b t7bVar3 = t7bVar.m;
        return t7bVar3 != null && t7bVar3.c[i] == pe1Var.M;
    }

    public boolean f() {
        int i = this.b;
        return i == 2 || i == 4 || i == 3;
    }

    public boolean g() {
        int i = this.b;
        if (i == 0 || i == 2 || i == 4) {
            return h((pe1) this.e);
        }
        pe1 pe1Var = (pe1) this.f;
        pe1Var.getClass();
        return pe1Var.L != 0;
    }

    public void i(boolean z) {
        if (z) {
            if (this.c) {
                pe1 pe1Var = (pe1) this.e;
                fd9.M(pe1Var.L == 0);
                pe1Var.G.i();
                pe1Var.t();
                this.c = false;
                return;
            }
            return;
        }
        if (this.d) {
            pe1 pe1Var2 = (pe1) this.f;
            pe1Var2.getClass();
            fd9.M(pe1Var2.L == 0);
            pe1Var2.G.i();
            pe1Var2.t();
            this.d = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int j(pe1 pe1Var, t7b t7bVar, f4i f4iVar, ks5 ks5Var) {
        int i;
        pe1 pe1Var2 = (pe1) this.e;
        int i2 = this.a;
        if (pe1Var == null || pe1Var.L == 0 || (pe1Var == pe1Var2 && ((i = this.b) == 2 || i == 4))) {
            return 1;
        }
        if (pe1Var == ((pe1) this.f) && this.b == 3) {
            return 1;
        }
        Object[] objArr = pe1Var.M != t7bVar.c[i2];
        boolean zE = f4iVar.e(i2);
        if (!zE || objArr != false) {
            if (!pe1Var.R) {
                f87 f87Var = ((f87[]) f4iVar.G)[i2];
                int length = f87Var != null ? f87Var.length() : 0;
                jw7[] jw7VarArr = new jw7[length];
                for (int i3 = 0; i3 < length; i3++) {
                    f87Var.getClass();
                    jw7VarArr[i3] = f87Var.c(i3);
                }
                b4f b4fVar = t7bVar.c[i2];
                b4fVar.getClass();
                pe1Var.A(jw7VarArr, b4fVar, t7bVar.e(), t7bVar.p, t7bVar.g.a);
                return 3;
            }
            if (!pe1Var.m()) {
                return 0;
            }
            a(pe1Var, ks5Var);
            if (!zE || f()) {
                i(pe1Var == pe1Var2);
                return 1;
            }
        }
        return 1;
    }

    public void k() {
        if (!h((pe1) this.e)) {
            i(true);
        }
        pe1 pe1Var = (pe1) this.f;
        if (pe1Var == null || pe1Var.L != 0) {
            return;
        }
        i(false);
    }

    public void m() {
        int i;
        pe1 pe1Var = (pe1) this.e;
        int i2 = pe1Var.L;
        if (i2 == 1 && this.b != 4) {
            fd9.M(i2 == 1);
            pe1Var.L = 2;
            pe1Var.u();
            return;
        }
        pe1 pe1Var2 = (pe1) this.f;
        if (pe1Var2 == null || (i = pe1Var2.L) != 1 || this.b == 3) {
            return;
        }
        fd9.M(i == 1);
        pe1Var2.L = 2;
        pe1Var2.u();
    }

    public synchronized Integer n(int i) {
        int i2;
        Integer num = (Integer) this.f;
        if (num == null) {
            return null;
        }
        int iIntValue = num.intValue();
        if (this.d) {
            i2 = this.b;
        } else {
            i2 = i - iIntValue;
            if (i2 < 0) {
                i2 = 0;
            }
        }
        return Integer.valueOf(i2);
    }
}
