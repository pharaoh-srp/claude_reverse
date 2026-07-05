package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class k19 extends qw5 implements oe4 {
    public boolean U;
    public w79 V;
    public float W = 2.0f;
    public float X = 1.0f;
    public boolean Y;
    public fkg Z;
    public ffh a0;
    public a80 b0;
    public e0g c0;
    public final a80 d0;
    public final z42 e0;

    public k19(boolean z, w79 w79Var, ffh ffhVar, e0g e0gVar) {
        this.U = z;
        this.V = w79Var;
        this.a0 = ffhVar;
        this.c0 = e0gVar;
        this.d0 = new a80(new va6((this.Y && z) ? 2.0f : 1.0f), dgj.h, null, 12);
        z42 z42Var = new z42(new b52(), new tl8(2, this));
        p1(z42Var);
        this.e0 = z42Var;
    }

    public static final Object s1(k19 k19Var, xzg xzgVar) {
        k19Var.Y = false;
        Object objA = k19Var.V.a().a(new um(new ArrayList(), 10, k19Var), xzgVar);
        return objA == m45.E ? objA : iei.a;
    }

    @Override // defpackage.hqb
    public final boolean e1() {
        return false;
    }

    @Override // defpackage.hqb
    public final void h1() {
        this.Z = gb9.D(d1(), null, null, new j19(this, null, 2), 3);
        if (this.b0 == null) {
            ffh ffhVarC = this.a0;
            if (ffhVarC == null) {
                ffhVarC = vz8.C(((gwa) yb5.o(this, jwa.a)).a, (nkh) yb5.o(this, okh.a));
            }
            long jD = ffhVarC.d(this.U, false, this.Y);
            this.b0 = new a80(new d54(jD), new d9i(bx.V, new e0(10, d54.f(jD))), null, 12);
        }
    }

    public final void t1() {
        gb9.D(d1(), null, null, new j19(this, null, 0), 3);
        gb9.D(d1(), null, null, new j19(this, null, 1), 3);
    }
}
