package defpackage;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final class b20 {
    public final cz5 a;
    public long b = 9205357640488583168L;
    public final zi6 c;
    public final lsc d;
    public final boolean e;
    public boolean f;
    public long g;
    public long h;
    public final qw5 i;

    public b20(Context context, cz5 cz5Var, long j, mnc mncVar) {
        this.a = cz5Var;
        zi6 zi6Var = new zi6(context, d4c.n0(j));
        this.c = zi6Var;
        this.d = new lsc(iei.a, ql8.J);
        this.e = true;
        this.g = 0L;
        this.h = -1L;
        a20 a20Var = new a20(0, this);
        t7d t7dVar = a0h.a;
        e0h e0hVar = new e0h(null, null, null, a20Var);
        this.i = Build.VERSION.SDK_INT >= 31 ? new vqg(e0hVar, this, zi6Var) : new a88(e0hVar, this, zi6Var, mncVar);
    }

    public final void a() {
        boolean z;
        zi6 zi6Var = this.c;
        EdgeEffect edgeEffect = zi6Var.d;
        boolean z2 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = !edgeEffect.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = zi6Var.e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z = !edgeEffect2.isFinished() || z;
        }
        EdgeEffect edgeEffect3 = zi6Var.f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z = !edgeEffect3.isFinished() || z;
        }
        EdgeEffect edgeEffect4 = zi6Var.g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z) {
                z2 = false;
            }
            z = z2;
        }
        if (z) {
            d();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r17, defpackage.pz7 r19, defpackage.vp4 r20) {
        /*
            Method dump skipped, instruction units count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b20.b(long, pz7, vp4):java.lang.Object");
    }

    public final long c() {
        long jX = this.b;
        if ((9223372034707292159L & jX) == 9205357640488583168L) {
            jX = eve.x(this.g);
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jX >> 32)) / Float.intBitsToFloat((int) (this.g >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jX & 4294967295L)) / Float.intBitsToFloat((int) (this.g & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public final void d() {
        if (this.e) {
            this.d.setValue(iei.a);
        }
    }

    public final float e(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() >> 32));
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        EdgeEffect edgeEffectB = this.c.b();
        return cvj.e(edgeEffectB) == MTTypesetterKt.kLineSkipLimitMultiplier ? Float.intBitsToFloat((int) (this.g & 4294967295L)) * (-cvj.k(edgeEffectB, -fIntBitsToFloat2, 1.0f - fIntBitsToFloat)) : Float.intBitsToFloat(i);
    }

    public final float f(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() & 4294967295L));
        int i = (int) (j >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g >> 32));
        EdgeEffect edgeEffectC = this.c.c();
        return cvj.e(edgeEffectC) == MTTypesetterKt.kLineSkipLimitMultiplier ? Float.intBitsToFloat((int) (this.g >> 32)) * cvj.k(edgeEffectC, fIntBitsToFloat2, 1.0f - fIntBitsToFloat) : Float.intBitsToFloat(i);
    }

    public final float g(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() & 4294967295L));
        int i = (int) (j >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g >> 32));
        EdgeEffect edgeEffectD = this.c.d();
        return cvj.e(edgeEffectD) == MTTypesetterKt.kLineSkipLimitMultiplier ? Float.intBitsToFloat((int) (this.g >> 32)) * (-cvj.k(edgeEffectD, -fIntBitsToFloat2, fIntBitsToFloat)) : Float.intBitsToFloat(i);
    }

    public final float h(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() >> 32));
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        EdgeEffect edgeEffectE = this.c.e();
        return cvj.e(edgeEffectE) == MTTypesetterKt.kLineSkipLimitMultiplier ? Float.intBitsToFloat((int) (this.g & 4294967295L)) * cvj.k(edgeEffectE, fIntBitsToFloat2, fIntBitsToFloat) : Float.intBitsToFloat(i);
    }

    public final void i(long j) {
        boolean zB = k8g.b(this.g, 0L);
        boolean zB2 = k8g.b(j, this.g);
        this.g = j;
        if (!zB2) {
            int iL = mwa.L(Float.intBitsToFloat((int) (j >> 32)));
            long jL = (((long) mwa.L(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iL) << 32);
            zi6 zi6Var = this.c;
            zi6Var.c = jL;
            EdgeEffect edgeEffect = zi6Var.d;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (jL >> 32), (int) (jL & 4294967295L));
            }
            EdgeEffect edgeEffect2 = zi6Var.e;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (jL >> 32), (int) (jL & 4294967295L));
            }
            EdgeEffect edgeEffect3 = zi6Var.f;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (jL & 4294967295L), (int) (jL >> 32));
            }
            EdgeEffect edgeEffect4 = zi6Var.g;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (jL & 4294967295L), (int) (jL >> 32));
            }
            EdgeEffect edgeEffect5 = zi6Var.h;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (jL >> 32), (int) (jL & 4294967295L));
            }
            EdgeEffect edgeEffect6 = zi6Var.i;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (jL >> 32), (int) (jL & 4294967295L));
            }
            EdgeEffect edgeEffect7 = zi6Var.j;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (jL & 4294967295L), (int) (jL >> 32));
            }
            EdgeEffect edgeEffect8 = zi6Var.k;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (4294967295L & jL), (int) (jL >> 32));
            }
        }
        if (zB || zB2) {
            return;
        }
        a();
    }
}
