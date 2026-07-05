package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final class cc1 extends hqb implements vd6, lbc, ujf {
    public long S;
    public jy1 T;
    public float U;
    public e0g V;
    public long W;
    public fu9 X;
    public knk Y;
    public e0g Z;
    public knk a0;

    @Override // defpackage.lbc
    public final void F0() {
        this.W = 9205357640488583168L;
        this.X = null;
        this.Y = null;
        this.Z = null;
        wd6.t0(this);
    }

    @Override // defpackage.vd6
    public final void I0(cv9 cv9Var) {
        knk knkVar;
        ib2 ib2Var = cv9Var.E;
        if (this.V == zni.b) {
            if (!d54.c(this.S, d54.h)) {
                cv9Var.T0(this.S, 0L, (58 & 4) != 0 ? xd6.h0(cv9Var.g(), 0L) : 0L, (58 & 8) != 0 ? 1.0f : MTTypesetterKt.kLineSkipLimitMultiplier, (58 & 16) != 0 ? qk7.a : null, (58 & 32) != 0 ? null : null, (58 & 64) != 0 ? 3 : 0);
            }
            jy1 jy1Var = this.T;
            if (jy1Var != null) {
                xd6.S0(cv9Var, jy1Var, 0L, 0L, this.U, null, null, 0, 118);
            }
        } else {
            if (k8g.b(ib2Var.g(), this.W) && cv9Var.getLayoutDirection() == this.X && x44.r(this.Z, this.V)) {
                knkVar = this.Y;
                knkVar.getClass();
            } else {
                d4c.a0(this, new l80(this, 4, cv9Var));
                knkVar = this.a0;
                this.a0 = null;
            }
            this.Y = knkVar;
            this.W = ib2Var.g();
            this.X = cv9Var.getLayoutDirection();
            this.Z = this.V;
            knkVar.getClass();
            if (!d54.c(this.S, d54.h)) {
                mpk.A(cv9Var, knkVar, this.S);
            }
            jy1 jy1Var2 = this.T;
            if (jy1Var2 != null) {
                mpk.z(cv9Var, knkVar, jy1Var2, this.U, 56);
            }
        }
        cv9Var.a();
    }

    @Override // defpackage.ujf
    public final void X0(ekf ekfVar) {
        ckf.u(ekfVar, this.V);
    }

    @Override // defpackage.ujf
    public final boolean k() {
        return false;
    }
}
