package defpackage;

import android.graphics.Path;
import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes3.dex */
public final class of5 implements d0g {
    public final d0g E;
    public final nf5 F;
    public float G = 4.0f;
    public float H = 2.0f;

    public of5(d0g d0gVar, nf5 nf5Var) {
        this.E = d0gVar;
        this.F = nf5Var;
    }

    @Override // defpackage.d0g
    public final void a(w5b w5bVar, Path path, float f, float f2, float f3, float f4) {
        d0g d0gVar;
        float f5;
        d0g d0gVar2;
        float f6;
        w5bVar.getClass();
        path.getClass();
        float f7 = f3 - f;
        float f8 = f4 - f2;
        d0g d0gVar3 = this.E;
        if (f7 > f8) {
            b(w5bVar, f7);
            int i = 0;
            float f9 = 0.0f;
            while (f7 - f9 > MTTypesetterKt.kLineSkipLimitMultiplier) {
                if (i % 2 == 0) {
                    float f10 = f + f9;
                    d0gVar3.a(w5bVar, path, f10, f2, f10 + this.G, f4);
                    d0gVar2 = d0gVar3;
                    f6 = this.G;
                } else {
                    d0gVar2 = d0gVar3;
                    f6 = this.H;
                }
                f9 += f6;
                i++;
                d0gVar3 = d0gVar2;
            }
            return;
        }
        d0g d0gVar4 = d0gVar3;
        b(w5bVar, f8);
        int i2 = 0;
        float f11 = 0.0f;
        while (f8 - f11 > MTTypesetterKt.kLineSkipLimitMultiplier) {
            if (i2 % 2 == 0) {
                float f12 = f2 + f11;
                d0gVar = d0gVar4;
                d0gVar.a(w5bVar, path, f, f12, f3, f12 + this.G);
                f5 = this.G;
            } else {
                d0gVar = d0gVar4;
                f5 = this.H;
            }
            f11 += f5;
            i2++;
            d0gVar4 = d0gVar;
        }
    }

    public final void b(w5b w5bVar, float f) {
        float fB = w5bVar.b(4.0f);
        float fB2 = w5bVar.b(2.0f);
        if (fB == MTTypesetterKt.kLineSkipLimitMultiplier && fB2 == MTTypesetterKt.kLineSkipLimitMultiplier) {
            this.G = f;
            return;
        }
        int iOrdinal = this.F.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                wg6.i();
                return;
            } else {
                this.G = fB;
                this.H = fB2;
                return;
            }
        }
        float f2 = fB + fB2;
        if (f < f2) {
            this.G = f;
            this.H = MTTypesetterKt.kLineSkipLimitMultiplier;
        } else {
            float fCeil = f / ((((float) Math.ceil(f / f2)) * f2) + fB);
            this.G = fB * fCeil;
            this.H = fB2 * fCeil;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof of5)) {
            return false;
        }
        of5 of5Var = (of5) obj;
        return this.E.equals(of5Var.E) && this.F == of5Var.F;
    }

    public final int hashCode() {
        return this.F.hashCode() + vb7.b(2.0f, vb7.b(4.0f, this.E.hashCode() * 31, 31), 31);
    }
}
