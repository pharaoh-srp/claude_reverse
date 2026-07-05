package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ev9 {
    public final av9 a;
    public boolean b;
    public boolean c;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public int l;
    public boolean m;
    public boolean n;
    public int o;
    public lma q;
    public vu9 d = vu9.I;
    public final n5b p = new n5b(this);

    public ev9(av9 av9Var) {
        this.a = av9Var;
    }

    public final m5c a() {
        return (m5c) this.a.k0.I;
    }

    public final void b() {
        vu9 vu9VarW = this.a.w();
        vu9 vu9Var = vu9.G;
        vu9 vu9Var2 = vu9.H;
        if (vu9VarW == vu9Var || vu9VarW == vu9Var2) {
            if (this.p.f0) {
                g(true);
            } else {
                f(true);
            }
        }
        if (vu9VarW == vu9Var2) {
            lma lmaVar = this.q;
            if (lmaVar == null || !lmaVar.Z) {
                h(true);
            } else {
                i(true);
            }
        }
    }

    public final void c(long j) {
        lma lmaVar = this.q;
        if (lmaVar != null) {
            ev9 ev9Var = lmaVar.J;
            ev9Var.d = vu9.F;
            av9 av9Var = ev9Var.a;
            ev9Var.e = false;
            lmaVar.d0 = j;
            omc snapshotObserver = dv9.a(av9Var).getSnapshotObserver();
            kma kmaVar = lmaVar.e0;
            snapshotObserver.a.d(av9Var, snapshotObserver.b, kmaVar);
            ev9Var.f = true;
            ev9Var.g = true;
            boolean zG0 = fd9.g0(av9Var);
            n5b n5bVar = ev9Var.p;
            if (zG0) {
                n5bVar.a0 = true;
                n5bVar.b0 = true;
            } else {
                n5bVar.Z = true;
            }
            ev9Var.d = vu9.I;
        }
    }

    public final void d(int i) {
        int i2 = this.l;
        this.l = i;
        if ((i2 == 0) != (i == 0)) {
            av9 av9VarG = this.a.G();
            ev9 ev9VarT = av9VarG != null ? av9VarG.t() : null;
            if (ev9VarT != null) {
                int i3 = ev9VarT.l;
                if (i == 0) {
                    ev9VarT.d(i3 - 1);
                } else {
                    ev9VarT.d(i3 + 1);
                }
            }
        }
    }

    public final void e(int i) {
        int i2 = this.o;
        this.o = i;
        if ((i2 == 0) != (i == 0)) {
            av9 av9VarG = this.a.G();
            ev9 ev9VarT = av9VarG != null ? av9VarG.t() : null;
            if (ev9VarT != null) {
                int i3 = ev9VarT.o;
                if (i == 0) {
                    ev9VarT.e(i3 - 1);
                } else {
                    ev9VarT.e(i3 + 1);
                }
            }
        }
    }

    public final void f(boolean z) {
        if (this.k != z) {
            this.k = z;
            if (z && !this.j) {
                d(this.l + 1);
            } else {
                if (z || this.j) {
                    return;
                }
                d(this.l - 1);
            }
        }
    }

    public final void g(boolean z) {
        if (this.j != z) {
            this.j = z;
            if (z && !this.k) {
                d(this.l + 1);
            } else {
                if (z || this.k) {
                    return;
                }
                d(this.l - 1);
            }
        }
    }

    public final void h(boolean z) {
        if (this.n != z) {
            this.n = z;
            if (z && !this.m) {
                e(this.o + 1);
            } else {
                if (z || this.m) {
                    return;
                }
                e(this.o - 1);
            }
        }
    }

    public final void i(boolean z) {
        if (this.m != z) {
            this.m = z;
            if (z && !this.n) {
                e(this.o + 1);
            } else {
                if (z || this.n) {
                    return;
                }
                e(this.o - 1);
            }
        }
    }

    public final void j() {
        n5b n5bVar = this.p;
        ev9 ev9Var = n5bVar.J;
        Object obj = n5bVar.W;
        av9 av9Var = this.a;
        if ((obj != null || ev9Var.a().z() != null) && n5bVar.V) {
            n5bVar.V = false;
            n5bVar.W = ev9Var.a().z();
            av9 av9VarG = av9Var.G();
            if (av9VarG != null) {
                av9.v0(av9VarG, false, 7);
            }
        }
        lma lmaVar = this.q;
        if (lmaVar != null) {
            ev9 ev9Var2 = lmaVar.J;
            if (lmaVar.c0 == null) {
                hma hmaVarF1 = ev9Var2.a().f1();
                hmaVarF1.getClass();
                if (hmaVarF1.S.z() == null) {
                    return;
                }
            }
            if (lmaVar.b0) {
                lmaVar.b0 = false;
                hma hmaVarF12 = ev9Var2.a().f1();
                hmaVarF12.getClass();
                lmaVar.c0 = hmaVarF12.S.z();
                if (fd9.g0(av9Var)) {
                    av9 av9VarG2 = av9Var.G();
                    if (av9VarG2 != null) {
                        av9.v0(av9VarG2, false, 7);
                        return;
                    }
                    return;
                }
                av9 av9VarG3 = av9Var.G();
                if (av9VarG3 != null) {
                    av9.t0(av9VarG3, false, 7);
                }
            }
        }
    }
}
