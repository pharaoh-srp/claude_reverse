package defpackage;

import android.view.KeyEvent;

/* JADX INFO: loaded from: classes2.dex */
public final class jag implements bz7 {
    public final /* synthetic */ boolean E;
    public final /* synthetic */ fq3 F;
    public final /* synthetic */ int G;
    public final /* synthetic */ boolean H;
    public final /* synthetic */ bz7 I;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ float K;
    public final /* synthetic */ zy7 L;

    public jag(boolean z, fq3 fq3Var, int i, boolean z2, bz7 bz7Var, boolean z3, float f, zy7 zy7Var) {
        this.E = z;
        this.F = fq3Var;
        this.G = i;
        this.H = z2;
        this.I = bz7Var;
        this.J = z3;
        this.K = f;
        this.L = zy7Var;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        KeyEvent keyEvent = ((so9) obj).a;
        fq3 fq3Var = this.F;
        float f = fq3Var.E;
        float f2 = fq3Var.F;
        if (!this.E) {
            return Boolean.FALSE;
        }
        int iJ = ssj.j(keyEvent);
        boolean z = this.J;
        if (iJ != 2) {
            if (iJ != 1) {
                return Boolean.FALSE;
            }
            zy7 zy7Var = this.L;
            if (z) {
                long jB = zsj.b(keyEvent.getKeyCode());
                if (!no9.a(jB, no9.d) && !no9.a(jB, no9.e) && !no9.a(jB, no9.v) && !no9.a(jB, no9.w) && !no9.a(jB, no9.C) && !no9.a(jB, no9.D)) {
                    return Boolean.FALSE;
                }
                if (zy7Var != null) {
                    zy7Var.a();
                }
                return Boolean.TRUE;
            }
            long jB2 = zsj.b(keyEvent.getKeyCode());
            if (!no9.a(jB2, no9.g) && !no9.a(jB2, no9.f) && !no9.a(jB2, no9.v) && !no9.a(jB2, no9.w) && !no9.a(jB2, no9.C) && !no9.a(jB2, no9.D)) {
                return Boolean.FALSE;
            }
            if (zy7Var != null) {
                zy7Var.a();
            }
            return Boolean.TRUE;
        }
        float fAbs = Math.abs(Float.valueOf(f2).floatValue() - Float.valueOf(f).floatValue());
        int i = this.G;
        float f3 = fAbs / (i > 0 ? i + 1 : 100);
        int i2 = this.H ? -1 : 1;
        boolean zA = no9.a(zsj.b(keyEvent.getKeyCode()), no9.v);
        bz7 bz7Var = this.I;
        if (zA) {
            bz7Var.invoke(Float.valueOf(f));
            return Boolean.TRUE;
        }
        if (no9.a(zsj.b(keyEvent.getKeyCode()), no9.w)) {
            bz7Var.invoke(Float.valueOf(f2));
            return Boolean.TRUE;
        }
        float f4 = this.K;
        if (z) {
            long jB3 = zsj.b(keyEvent.getKeyCode());
            if (no9.a(jB3, no9.d)) {
                bz7Var.invoke(wd6.i0(Float.valueOf(f4 - (i2 * f3)), fq3Var));
                return Boolean.TRUE;
            }
            if (no9.a(jB3, no9.e)) {
                bz7Var.invoke(wd6.i0(Float.valueOf((i2 * f3) + f4), fq3Var));
                return Boolean.TRUE;
            }
            if (no9.a(jB3, no9.C)) {
                bz7Var.invoke(wd6.i0(Float.valueOf(f4 - ((wd6.e0(r4 / 10, 1, 10) * i2) * f3)), fq3Var));
                return Boolean.TRUE;
            }
            if (!no9.a(jB3, no9.D)) {
                return Boolean.FALSE;
            }
            bz7Var.invoke(wd6.i0(Float.valueOf((wd6.e0(r4 / 10, 1, 10) * i2 * f3) + f4), fq3Var));
            return Boolean.TRUE;
        }
        long jB4 = zsj.b(keyEvent.getKeyCode());
        if (no9.a(jB4, no9.g)) {
            bz7Var.invoke(wd6.i0(Float.valueOf((i2 * f3) + f4), fq3Var));
            return Boolean.TRUE;
        }
        if (no9.a(jB4, no9.f)) {
            bz7Var.invoke(wd6.i0(Float.valueOf(f4 - (i2 * f3)), fq3Var));
            return Boolean.TRUE;
        }
        if (no9.a(jB4, no9.C)) {
            bz7Var.invoke(wd6.i0(Float.valueOf((wd6.e0(r4 / 10, 1, 10) * f3) + f4), fq3Var));
            return Boolean.TRUE;
        }
        if (!no9.a(jB4, no9.D)) {
            return Boolean.FALSE;
        }
        bz7Var.invoke(wd6.i0(Float.valueOf(f4 - (wd6.e0(r4 / 10, 1, 10) * f3)), fq3Var));
        return Boolean.TRUE;
    }
}
