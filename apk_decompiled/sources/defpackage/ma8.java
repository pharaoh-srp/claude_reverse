package defpackage;

import android.view.ViewParent;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes.dex */
public final class ma8 implements mmc {
    public ja8 E;
    public final ga8 F;
    public final AndroidComposeView G;
    public pz7 H;
    public zy7 I;
    public boolean K;
    public float[] M;
    public boolean N;
    public int R;
    public knk T;
    public boolean U;
    public boolean V;
    public boolean X;
    public long J = 9223372034707292159L;
    public final float[] L = nwa.a();
    public cz5 O = dch.h();
    public fu9 P = fu9.E;
    public final ib2 Q = new ib2();
    public long S = d5i.b;
    public boolean W = true;
    public final e0 Y = new e0(18, this);

    public ma8(ja8 ja8Var, ga8 ga8Var, AndroidComposeView androidComposeView, pz7 pz7Var, zy7 zy7Var) {
        this.E = ja8Var;
        this.F = ga8Var;
        this.G = androidComposeView;
        this.H = pz7Var;
        this.I = zy7Var;
    }

    public final float[] a() {
        float[] fArrA = this.M;
        if (fArrA == null) {
            fArrA = nwa.a();
            this.M = fArrA;
        }
        if (this.V) {
            this.V = false;
            float[] fArrB = b();
            if (this.W) {
                return fArrB;
            }
            if (!dgj.H(fArrB, fArrA)) {
                fArrA[0] = Float.NaN;
                return null;
            }
        } else if (Float.isNaN(fArrA[0])) {
            return null;
        }
        return fArrA;
    }

    public final float[] b() {
        boolean z = this.U;
        float[] fArr = this.L;
        if (z) {
            ja8 ja8Var = this.E;
            long jX = ja8Var.v;
            la8 la8Var = ja8Var.a;
            if ((9223372034707292159L & jX) == 9205357640488583168L) {
                jX = eve.x(csg.T(this.J));
            }
            nwa.e(this.L, Float.intBitsToFloat((int) (jX >> 32)), Float.intBitsToFloat((int) (jX & 4294967295L)), la8Var.D(), la8Var.x(), la8Var.F(), la8Var.r(), la8Var.t(), la8Var.c(), la8Var.M(), 1040);
            this.U = false;
            this.W = yfd.H(fArr);
        }
        return fArr;
    }

    public final void c() {
        if (this.N || this.K) {
            return;
        }
        this.G.invalidate();
        f(true);
    }

    public final void d(long j) {
        boolean zO = AndroidComposeView.o();
        AndroidComposeView androidComposeView = this.G;
        if (zO) {
            androidComposeView.M(-4.0f);
        }
        ja8 ja8Var = this.E;
        if (!y69.b(ja8Var.t, j)) {
            ja8Var.t = j;
            ja8Var.a.q((int) (j >> 32), (int) (j & 4294967295L), ja8Var.u);
        }
        ViewParent parent = androidComposeView.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(androidComposeView, androidComposeView);
        }
    }

    public final void e(long j) {
        if (g79.b(j, this.J)) {
            return;
        }
        if (AndroidComposeView.o()) {
            this.G.M(-4.0f);
        }
        this.J = j;
        c();
    }

    public final void f(boolean z) {
        if (z != this.N) {
            this.N = z;
            AndroidComposeView androidComposeView = this.G;
            qvb qvbVar = androidComposeView.l0;
            boolean z2 = androidComposeView.n0;
            if (!z) {
                if (z2) {
                    return;
                }
                qvbVar.j(this);
                qvb qvbVar2 = androidComposeView.m0;
                if (qvbVar2 != null) {
                    qvbVar2.j(this);
                    return;
                }
                return;
            }
            if (!z2) {
                qvbVar.a(this);
                return;
            }
            qvb qvbVar3 = androidComposeView.m0;
            if (qvbVar3 == null) {
                qvbVar3 = new qvb();
                androidComposeView.m0 = qvbVar3;
            }
            qvbVar3.a(this);
        }
    }

    public final void g() {
        AndroidComposeView.o();
        if (this.N) {
            if (!d5i.a(this.S, d5i.b) && !g79.b(this.E.u, this.J)) {
                ja8 ja8Var = this.E;
                float fB = d5i.b(this.S) * ((int) (this.J >> 32));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(d5i.c(this.S) * ((int) (this.J & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fB) << 32);
                if (!fcc.c(ja8Var.v, jFloatToRawIntBits)) {
                    ja8Var.v = jFloatToRawIntBits;
                    ja8Var.a.u(jFloatToRawIntBits);
                }
            }
            this.E.f(this.O, this.P, this.J, this.Y);
            f(false);
        }
    }
}
