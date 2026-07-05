package defpackage;

import androidx.compose.ui.graphics.shadow.DropShadowPainter;
import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final class mr1 extends hqb implements vd6, lbc, cz5 {
    public cz5 S;
    public tzf T;
    public DropShadowPainter U;
    public boolean V;
    public e0g W;
    public bz7 X;
    public float Y;
    public long Z;
    public long a0;
    public float b0;
    public int c0;

    @Override // defpackage.lbc
    public final void F0() {
        this.V = false;
        p1();
    }

    @Override // defpackage.vd6
    public final void I0(cv9 cv9Var) {
        if (!this.V) {
            this.V = true;
            s1(MTTypesetterKt.kLineSkipLimitMultiplier);
            r1(0L);
            q1(d54.b);
            if (this.b0 != 1.0f) {
                this.b0 = 1.0f;
                p1();
            }
            if (this.c0 != 3) {
                this.c0 = 3;
                p1();
            }
            d4c.a0(this, new v01(3, this));
        }
        tzf tzfVar = this.T;
        DropShadowPainter dropShadowPainter = this.U;
        float density = this.Y / getDensity();
        float density2 = MTTypesetterKt.kLineSkipLimitMultiplier / getDensity();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.Z >> 32)) / getDensity();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.Z & 4294967295L)) / getDensity();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
        if (dropShadowPainter == null || tzfVar == null || !va6.b(tzfVar.a, density) || !va6.b(tzfVar.b, density2) || !d54.c(tzfVar.e, this.a0) || !x44.r(tzfVar.f, null) || tzfVar.g != this.b0 || tzfVar.d != this.c0 || tzfVar.c != jFloatToRawIntBits) {
            tzf tzfVar2 = new tzf(density, this.a0, density2, jFloatToRawIntBits, this.b0, this.c0);
            this.T = tzfVar2;
            xv8 xv8VarB = yfd.X(this).getGraphicsContext().b();
            e0g e0gVar = this.W;
            xv8VarB.getClass();
            dropShadowPainter = new DropShadowPainter(e0gVar, tzfVar2, xv8VarB);
            this.U = dropShadowPainter;
        }
        bpc.h(dropShadowPainter, cv9Var, cv9Var.E.g(), null, 6);
        cv9Var.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof mr1)) {
            return false;
        }
        mr1 mr1Var = (mr1) obj;
        return this.b0 == mr1Var.b0 && x44.r(this.W, mr1Var.W) && this.X == mr1Var.X && this.Y == mr1Var.Y && fcc.c(this.Z, mr1Var.Z) && d54.c(this.a0, mr1Var.a0) && this.c0 == mr1Var.c0;
    }

    @Override // defpackage.nw5
    public final void f() {
        if (this.R) {
            cz5 cz5Var = yfd.W(this).d0;
            if (x44.r(this.S, cz5Var)) {
                return;
            }
            this.S = cz5Var;
            this.V = false;
            p1();
        }
    }

    @Override // defpackage.cz5
    public final float getDensity() {
        cz5 cz5Var = this.S;
        if (cz5Var != null) {
            return cz5Var.getDensity();
        }
        return 1.0f;
    }

    @Override // defpackage.hqb
    public final void h1() {
        cz5 cz5Var = yfd.W(this).d0;
        if (x44.r(this.S, cz5Var)) {
            return;
        }
        this.S = cz5Var;
        this.V = false;
        p1();
    }

    public final int hashCode() {
        int iE = vb7.e(vb7.b(MTTypesetterKt.kLineSkipLimitMultiplier, vb7.b(this.Y, qy1.e(this.X, (this.W.hashCode() + (Float.hashCode(this.b0) * 31)) * 31, 31), 31), 31), 31, this.Z);
        long j = this.a0;
        int i = d54.i;
        return Integer.hashCode(this.c0) + vb7.e(iE, 961, j);
    }

    @Override // defpackage.cz5
    public final float k0() {
        cz5 cz5Var = this.S;
        if (cz5Var != null) {
            return cz5Var.k0();
        }
        return 1.0f;
    }

    public final void p1() {
        this.T = null;
        this.U = null;
        wd6.t0(this);
    }

    public final void q1(long j) {
        if (j == 16) {
            int i = d54.i;
            j = d54.b;
        }
        if (d54.c(this.a0, j)) {
            return;
        }
        this.a0 = j;
        p1();
    }

    public final void r1(long j) {
        if (fcc.c(this.Z, j)) {
            return;
        }
        this.Z = j;
        wd6.t0(this);
    }

    public final void s1(float f) {
        if (this.Y == f) {
            return;
        }
        this.Y = f;
        p1();
    }
}
