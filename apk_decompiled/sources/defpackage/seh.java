package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class seh {
    public final zb0 a;
    public final tkh b;
    public final boolean e;
    public final cz5 g;
    public final wt7 h;
    public el5 j;
    public fu9 k;
    public final int c = Integer.MAX_VALUE;
    public final int d = 1;
    public final int f = 1;
    public final List i = lm6.E;

    public seh(zb0 zb0Var, tkh tkhVar, boolean z, cz5 cz5Var, wt7 wt7Var, int i) {
        this.a = zb0Var;
        this.b = tkhVar;
        this.e = z;
        this.g = cz5Var;
        this.h = wt7Var;
    }

    public final void a(fu9 fu9Var) {
        el5 el5Var = this.j;
        if (el5Var == null || fu9Var != this.k || el5Var.c()) {
            this.k = fu9Var;
            el5Var = new el5(this.a, yfd.Y(this.b, fu9Var), this.i, this.g, this.h);
        }
        this.j = el5Var;
    }
}
