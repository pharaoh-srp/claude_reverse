package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes.dex */
public final class gma extends b3d {
    public final /* synthetic */ int F;
    public final Object G;

    public /* synthetic */ gma(int i, Object obj) {
        this.F = i;
        this.G = obj;
    }

    @Override // defpackage.b3d
    public float b(uo8 uo8Var) {
        float fIntBitsToFloat;
        int iJ0;
        switch (this.F) {
            case 0:
                pz7 pz7Var = uo8Var.a;
                if (pz7Var != null) {
                    return ((Number) pz7Var.invoke(this, Float.valueOf(Float.NaN))).floatValue();
                }
                fma fmaVar = (fma) this.G;
                if (fmaVar.O) {
                    return Float.NaN;
                }
                fma fmaVar2 = fmaVar;
                while (true) {
                    vr8 vr8Var = fmaVar2.Q;
                    float f = (vr8Var == null || (iJ0 = mp0.J0(uo8Var, (uo8[]) vr8Var.b)) < 0) ? Float.NaN : ((float[]) vr8Var.c)[iJ0];
                    if (!Float.isNaN(f)) {
                        fmaVar2.f0(fmaVar.v0(), uo8Var);
                        cu9 cu9VarS0 = fmaVar2.s0();
                        cu9 cu9VarS02 = fmaVar.s0();
                        switch (uo8Var.b) {
                            case 0:
                                fIntBitsToFloat = Float.intBitsToFloat((int) (cu9VarS02.G(cu9VarS0, (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (((long) Float.floatToRawIntBits(((int) (cu9VarS0.k() >> 32)) / 2.0f)) << 32)) & 4294967295L));
                                break;
                            default:
                                fIntBitsToFloat = Float.intBitsToFloat((int) (cu9VarS02.G(cu9VarS0, (((long) Float.floatToRawIntBits(f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(((int) (cu9VarS0.k() & 4294967295L)) / 2.0f)))) >> 32));
                                break;
                        }
                        return fIntBitsToFloat;
                    }
                    fma fmaVarA0 = fmaVar2.A0();
                    if (fmaVarA0 == null) {
                        fmaVar2.f0(fmaVar.v0(), uo8Var);
                        return Float.NaN;
                    }
                    fmaVar2 = fmaVarA0;
                }
                break;
            default:
                return super.b(uo8Var);
        }
    }

    @Override // defpackage.b3d
    public final cu9 c() {
        int i = this.F;
        Object obj = this.G;
        switch (i) {
            case 0:
                fma fmaVar = (fma) obj;
                cu9 cu9VarS0 = fmaVar.O ? null : fmaVar.s0();
                if (cu9VarS0 == null) {
                    fmaVar.v0().t().b();
                }
                return cu9VarS0;
            default:
                return (m5c) ((AndroidComposeView) obj).getRoot().k0.I;
        }
    }

    @Override // defpackage.b3d
    public final fu9 d() {
        int i = this.F;
        Object obj = this.G;
        switch (i) {
            case 0:
                return ((fma) obj).getLayoutDirection();
            default:
                return ((AndroidComposeView) obj).getLayoutDirection();
        }
    }

    @Override // defpackage.b3d
    public final int e() {
        int i = this.F;
        Object obj = this.G;
        switch (i) {
            case 0:
                return ((fma) obj).X();
            default:
                return ((AndroidComposeView) obj).getRoot().J();
        }
    }

    @Override // defpackage.cz5
    public final float getDensity() {
        int i = this.F;
        Object obj = this.G;
        switch (i) {
            case 0:
                return ((fma) obj).getDensity();
            default:
                return ((AndroidComposeView) obj).getDensity().getDensity();
        }
    }

    @Override // defpackage.cz5
    public final float k0() {
        int i = this.F;
        Object obj = this.G;
        switch (i) {
            case 0:
                return ((fma) obj).k0();
            default:
                return ((AndroidComposeView) obj).getDensity().k0();
        }
    }
}
