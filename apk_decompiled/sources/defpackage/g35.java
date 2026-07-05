package defpackage;

import android.view.autofill.AutofillValue;

/* JADX INFO: loaded from: classes.dex */
public final class g35 extends qw5 implements ujf {
    public f5i U;
    public cjh V;
    public m2a W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public occ a0;
    public zhh b0;
    public xy8 c0;
    public bt7 d0;

    public static void s1(m2a m2aVar, String str, boolean z, boolean z2) {
        if (z || !z2) {
            return;
        }
        njh njhVar = m2aVar.e;
        u25 u25Var = m2aVar.v;
        if (njhVar == null) {
            int length = str.length();
            u25Var.invoke(new cjh(str, mwa.m(length, length), 4));
        } else {
            cjh cjhVarI = m2aVar.d.i(x44.X(new ux5(), new n74(str, 1)));
            njhVar.a(null, cjhVarI);
            u25Var.invoke(cjhVarI);
        }
    }

    @Override // defpackage.ujf
    public final void X0(ekf ekfVar) {
        boolean z = this.Z;
        zb0 zb0Var = this.V.a;
        wn9[] wn9VarArr = ckf.a;
        dkf dkfVar = akf.F;
        wn9[] wn9VarArr2 = ckf.a;
        wn9 wn9Var = wn9VarArr2[18];
        ekfVar.a(dkfVar, zb0Var);
        zb0 zb0Var2 = this.U.a;
        dkf dkfVar2 = akf.G;
        wn9 wn9Var2 = wn9VarArr2[19];
        ekfVar.a(dkfVar2, zb0Var2);
        long j = this.V.b;
        dkf dkfVar3 = akf.H;
        wn9 wn9Var3 = wn9VarArr2[20];
        ekfVar.a(dkfVar3, new kkh(j));
        ckf.k(ekfVar, lz1.H);
        ckf.o(ekfVar, new g20(AutofillValue.forText(this.V.a)));
        ckf.h(ekfVar, new f35(this, 0));
        int i = this.c0.d;
        if (i == 6) {
            ro4.a.getClass();
            ckf.m(ekfVar, qo4.c);
        } else if (i == 7 || i == 8) {
            ro4.a.getClass();
            ckf.m(ekfVar, qo4.b);
        } else if (i == 4) {
            ro4.a.getClass();
            ckf.m(ekfVar, qo4.d);
        }
        if (!this.Y) {
            ckf.b(ekfVar);
        }
        if (z) {
            ekfVar.a(akf.N, iei.a);
        }
        boolean z2 = this.Y && !this.X;
        dkf dkfVar4 = akf.Q;
        wn9 wn9Var4 = wn9VarArr2[28];
        ekfVar.a(dkfVar4, Boolean.valueOf(z2));
        ckf.d(ekfVar, new f35(this, 1));
        if (z2) {
            ekfVar.a(ojf.k, new e5(null, new f35(this, 2)));
            ekfVar.a(ojf.o, new e5(null, new f35(this, ekfVar)));
        }
        ekfVar.a(ojf.j, new e5(null, new cb0(2, this)));
        ckf.i(ekfVar, this.c0.e, new e35(this, 5));
        ckf.g(ekfVar, null, new e35(this, 6));
        ckf.j(ekfVar, null, new e35(this, 0));
        if (!kkh.d(this.V.b) && !z) {
            ekfVar.a(ojf.q, new e5(null, new e35(this, 1)));
            if (this.Y && !this.X) {
                ekfVar.a(ojf.r, new e5(null, new e35(this, 2)));
            }
        }
        if (!this.Y || this.X) {
            return;
        }
        ekfVar.a(ojf.s, new e5(null, new e35(this, 4)));
    }

    @Override // defpackage.ujf
    public final boolean Z0() {
        return true;
    }
}
