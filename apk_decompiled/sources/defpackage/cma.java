package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class cma implements cz5 {
    public boolean E;
    public long F = 9223372034707292159L;
    public long G = 0;
    public final /* synthetic */ fma H;

    public cma(fma fmaVar) {
        this.H = fmaVar;
    }

    public final cu9 a() {
        this.E = true;
        fma fmaVar = this.H;
        cu9 cu9VarS0 = fmaVar.s0();
        if (y69.b(this.F, 9223372034707292159L)) {
            this.F = yfd.a0(cu9VarS0.q(0L));
            this.G = cu9VarS0.k();
        }
        fmaVar.v0().t().b();
        return cu9VarS0;
    }

    /* JADX WARN: Type inference failed for: r2v14, types: [byte[], java.io.Serializable] */
    public final void b(uo8 uo8Var, float f) {
        fma fmaVar = this.H;
        vr8 vr8Var = fmaVar.Q;
        if (vr8Var == null) {
            vr8Var = new vr8();
            fmaVar.Q = vr8Var;
        }
        int iJ0 = mp0.J0(uo8Var, (uo8[]) vr8Var.b);
        if (iJ0 >= 0) {
            float[] fArr = (float[]) vr8Var.c;
            if (fArr[iJ0] != f) {
                fArr[iJ0] = f;
                ((byte[]) vr8Var.d)[iJ0] = 1;
                return;
            } else {
                byte[] bArr = (byte[]) vr8Var.d;
                if (bArr[iJ0] == 2) {
                    bArr[iJ0] = 0;
                    return;
                }
                return;
            }
        }
        int i = vr8Var.a;
        uo8[] uo8VarArr = (uo8[]) vr8Var.b;
        if (i == uo8VarArr.length) {
            int i2 = i * 2;
            vr8Var.b = (uo8[]) Arrays.copyOf(uo8VarArr, i2);
            vr8Var.c = Arrays.copyOf((float[]) vr8Var.c, i2);
            vr8Var.d = Arrays.copyOf((byte[]) vr8Var.d, i2);
        }
        ((uo8[]) vr8Var.b)[i] = uo8Var;
        ((byte[]) vr8Var.d)[i] = 3;
        ((float[]) vr8Var.c)[i] = f;
        vr8Var.a++;
    }

    @Override // defpackage.cz5
    public final float getDensity() {
        return this.H.getDensity();
    }

    @Override // defpackage.cz5
    public final float k0() {
        return this.H.k0();
    }
}
