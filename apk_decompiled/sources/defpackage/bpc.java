package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class bpc {
    public v30 E;
    public boolean F;
    public hr1 G;
    public float H = 1.0f;
    public fu9 I = fu9.E;

    public static /* synthetic */ void h(bpc bpcVar, cv9 cv9Var, long j, hr1 hr1Var, int i) {
        if ((i & 4) != 0) {
            hr1Var = null;
        }
        bpcVar.f(cv9Var, j, 1.0f, hr1Var);
    }

    public boolean c(float f) {
        return false;
    }

    public boolean d(hr1 hr1Var) {
        return false;
    }

    public void e(fu9 fu9Var) {
    }

    public final void f(cv9 cv9Var, long j, float f, hr1 hr1Var) {
        ib2 ib2Var = cv9Var.E;
        if (this.H != f) {
            if (!c(f)) {
                v30 v30VarJ = this.E;
                if (f == 1.0f) {
                    if (v30VarJ != null) {
                        v30VarJ.c(f);
                    }
                    this.F = false;
                } else {
                    if (v30VarJ == null) {
                        v30VarJ = dch.j();
                        this.E = v30VarJ;
                    }
                    v30VarJ.c(f);
                    this.F = true;
                }
            }
            this.H = f;
        }
        if (!x44.r(this.G, hr1Var)) {
            if (!d(hr1Var)) {
                v30 v30VarJ2 = this.E;
                if (hr1Var == null) {
                    if (v30VarJ2 != null) {
                        v30VarJ2.f(null);
                    }
                    this.F = false;
                } else {
                    if (v30VarJ2 == null) {
                        v30VarJ2 = dch.j();
                        this.E = v30VarJ2;
                    }
                    v30VarJ2.f(hr1Var);
                    this.F = true;
                }
            }
            this.G = hr1Var;
        }
        fu9 layoutDirection = cv9Var.getLayoutDirection();
        if (this.I != layoutDirection) {
            e(layoutDirection);
            this.I = layoutDirection;
        }
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (ib2Var.g() >> 32)) - Float.intBitsToFloat(i);
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (ib2Var.g() & 4294967295L)) - Float.intBitsToFloat(i2);
        ((efe) ib2Var.F.E).v(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, fIntBitsToFloat, fIntBitsToFloat2);
        if (f > MTTypesetterKt.kLineSkipLimitMultiplier) {
            try {
                if (Float.intBitsToFloat(i) > MTTypesetterKt.kLineSkipLimitMultiplier && Float.intBitsToFloat(i2) > MTTypesetterKt.kLineSkipLimitMultiplier) {
                    if (this.F) {
                        float fIntBitsToFloat3 = Float.intBitsToFloat(i);
                        l9e l9eVarX = d4c.x(0L, (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i2))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat3) << 32));
                        fb2 fb2VarP = ib2Var.F.p();
                        v30 v30VarJ3 = this.E;
                        if (v30VarJ3 == null) {
                            v30VarJ3 = dch.j();
                            this.E = v30VarJ3;
                        }
                        try {
                            fb2VarP.r(l9eVarX, v30VarJ3);
                            j(cv9Var);
                            fb2VarP.p();
                        } catch (Throwable th) {
                            fb2VarP.p();
                            throw th;
                        }
                    } else {
                        j(cv9Var);
                    }
                }
            } catch (Throwable th2) {
                ((efe) ib2Var.F.E).v(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
                throw th2;
            }
        }
        ((efe) ib2Var.F.E).v(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
    }

    public abstract long i();

    public abstract void j(cv9 cv9Var);
}
