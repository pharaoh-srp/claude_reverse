package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes.dex */
public final class xre implements cz5 {
    public int E;
    public float F = 1.0f;
    public float G = 1.0f;
    public float H = 1.0f;
    public float I;
    public float J;
    public float K;
    public long L;
    public long M;
    public float N;
    public float O;
    public float P;
    public float Q;
    public long R;
    public e0g S;
    public boolean T;
    public int U;
    public long V;
    public cz5 W;
    public fu9 X;
    public vfe Y;
    public int Z;
    public knk a0;

    public xre() {
        long j = na8.a;
        this.L = j;
        this.M = j;
        this.Q = 8.0f;
        this.R = d5i.b;
        this.S = zni.b;
        this.U = 0;
        this.V = 9205357640488583168L;
        this.W = dch.h();
        this.X = fu9.E;
        this.Z = 3;
    }

    public final void a() {
        l(1.0f);
        m(1.0f);
        b(1.0f);
        v(MTTypesetterKt.kLineSkipLimitMultiplier);
        w(MTTypesetterKt.kLineSkipLimitMultiplier);
        n(MTTypesetterKt.kLineSkipLimitMultiplier);
        long j = na8.a;
        c(j);
        q(j);
        h(MTTypesetterKt.kLineSkipLimitMultiplier);
        j(MTTypesetterKt.kLineSkipLimitMultiplier);
        k(MTTypesetterKt.kLineSkipLimitMultiplier);
        if (this.Q != 8.0f) {
            this.E |= FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM;
            this.Q = 8.0f;
        }
        u(d5i.b);
        o(zni.b);
        d(false);
        f(null);
        if (this.Z != 3) {
            this.E |= 524288;
            this.Z = 3;
        }
        e(0);
        this.V = 9205357640488583168L;
        this.a0 = null;
        this.E = 0;
    }

    public final void b(float f) {
        if (this.H == f) {
            return;
        }
        this.E |= 4;
        this.H = f;
    }

    public final void c(long j) {
        if (d54.c(this.L, j)) {
            return;
        }
        this.E |= 64;
        this.L = j;
    }

    public final void d(boolean z) {
        if (this.T != z) {
            this.E |= 16384;
            this.T = z;
        }
    }

    public final void e(int i) {
        if (this.U == i) {
            return;
        }
        this.E |= FreeTypeConstants.FT_LOAD_NO_AUTOHINT;
        this.U = i;
    }

    public final void f(vfe vfeVar) {
        if (x44.r(this.Y, vfeVar)) {
            return;
        }
        this.E |= 131072;
        this.Y = vfeVar;
    }

    @Override // defpackage.cz5
    public final float getDensity() {
        return this.W.getDensity();
    }

    public final void h(float f) {
        if (this.N == f) {
            return;
        }
        this.E |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
        this.N = f;
    }

    public final void j(float f) {
        if (this.O == f) {
            return;
        }
        this.E |= 512;
        this.O = f;
    }

    public final void k(float f) {
        if (this.P == f) {
            return;
        }
        this.E |= FreeTypeConstants.FT_LOAD_NO_RECURSE;
        this.P = f;
    }

    @Override // defpackage.cz5
    public final float k0() {
        return this.W.k0();
    }

    public final void l(float f) {
        if (this.F == f) {
            return;
        }
        this.E |= 1;
        this.F = f;
    }

    public final void m(float f) {
        if (this.G == f) {
            return;
        }
        this.E |= 2;
        this.G = f;
    }

    public final void n(float f) {
        if (this.K == f) {
            return;
        }
        this.E |= 32;
        this.K = f;
    }

    public final void o(e0g e0gVar) {
        if (x44.r(this.S, e0gVar)) {
            return;
        }
        this.E |= FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        this.S = e0gVar;
    }

    public final void q(long j) {
        if (d54.c(this.M, j)) {
            return;
        }
        this.E |= FreeTypeConstants.FT_LOAD_PEDANTIC;
        this.M = j;
    }

    public final void u(long j) {
        if (d5i.a(this.R, j)) {
            return;
        }
        this.E |= FreeTypeConstants.FT_LOAD_MONOCHROME;
        this.R = j;
    }

    public final void v(float f) {
        if (this.I == f) {
            return;
        }
        this.E |= 8;
        this.I = f;
    }

    public final void w(float f) {
        if (this.J == f) {
            return;
        }
        this.E |= 16;
        this.J = f;
    }
}
