package defpackage;

import android.graphics.Path;
import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes3.dex */
public final class y35 implements d0g {
    public static final y35 I;
    public final u35 E;
    public final u35 F;
    public final u35 G;
    public final u35 H;

    static {
        x35.g.getClass();
        yve yveVar = w35.b;
        I = new y35(new u35(50, yveVar), new u35(50, yveVar), new u35(50, yveVar), new u35(50, yveVar));
    }

    public y35(u35 u35Var, u35 u35Var2, u35 u35Var3, u35 u35Var4) {
        this.E = u35Var;
        this.F = u35Var2;
        this.G = u35Var3;
        this.H = u35Var4;
    }

    @Override // defpackage.d0g
    public final void a(w5b w5bVar, Path path, float f, float f2, float f3, float f4) {
        w5bVar.getClass();
        path.getClass();
        float density = w5bVar.getDensity();
        float f5 = f3 - f;
        float f6 = f4 - f2;
        if (f5 == MTTypesetterKt.kLineSkipLimitMultiplier || f6 == MTTypesetterKt.kLineSkipLimitMultiplier) {
            return;
        }
        float fAbs = Math.abs(Math.min(f5, f6));
        float fMin = Math.min(f5, f6);
        u35 u35Var = this.E;
        float fA = u35Var.a(fMin, density);
        u35 u35Var2 = this.F;
        float fA2 = u35Var2.a(fMin, density);
        u35 u35Var3 = this.G;
        float fA3 = u35Var3.a(fMin, density);
        u35 u35Var4 = this.H;
        float fA4 = u35Var4.a(fMin, density);
        float f7 = fA + fA2;
        if (f7 == MTTypesetterKt.kLineSkipLimitMultiplier) {
            f7 = 1.0f;
        }
        float f8 = f5 / f7;
        float f9 = fA4 + fA3;
        if (f9 == MTTypesetterKt.kLineSkipLimitMultiplier) {
            f9 = 1.0f;
        }
        float f10 = f5 / f9;
        float f11 = fA + fA4;
        if (f11 == MTTypesetterKt.kLineSkipLimitMultiplier) {
            f11 = 1.0f;
        }
        float f12 = f6 / f11;
        float f13 = fA2 + fA3;
        if (f13 == MTTypesetterKt.kLineSkipLimitMultiplier) {
            f13 = 1.0f;
        }
        float fU = nai.U(f8, f10, f12, f6 / f13);
        float f14 = fU <= 1.0f ? fU : 1.0f;
        float fA5 = u35Var.a(fAbs, density) * f14;
        float fA6 = u35Var2.a(fAbs, density) * f14;
        float fA7 = u35Var3.a(fAbs, density) * f14;
        float fA8 = u35Var4.a(fAbs, density) * f14;
        float f15 = f2 + fA5;
        path.moveTo(f, f15);
        u35Var.a.a(path, v35.E, f, f15, fA5 + f, f2);
        float f16 = f3 - fA6;
        path.lineTo(f16, f2);
        u35Var2.a.a(path, v35.F, f16, f2, f3, f2 + fA6);
        float f17 = f4 - fA7;
        path.lineTo(f3, f17);
        u35Var3.a.a(path, v35.G, f3, f17, f3 - fA7, f4);
        float f18 = f + fA8;
        path.lineTo(f18, f4);
        u35Var4.a.a(path, v35.H, f18, f4, f, f4 - fA8);
        path.close();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y35)) {
            return false;
        }
        y35 y35Var = (y35) obj;
        return this.E == y35Var.E && this.F == y35Var.F && this.G == y35Var.G && this.H == y35Var.H;
    }

    public final int hashCode() {
        return this.H.hashCode() + ((this.G.hashCode() + ((this.F.hashCode() + (this.E.hashCode() * 31)) * 31)) * 31);
    }
}
