package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class tlc implements pz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ iqb F;
    public final /* synthetic */ ffh G;
    public final /* synthetic */ bz7 H;
    public final /* synthetic */ boolean I;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ tkh K;
    public final /* synthetic */ mp9 L;
    public final /* synthetic */ kp9 M;
    public final /* synthetic */ boolean N;
    public final /* synthetic */ int O;
    public final /* synthetic */ int P;
    public final /* synthetic */ pzi Q;
    public final /* synthetic */ zub R;
    public final /* synthetic */ pz7 S;
    public final /* synthetic */ pz7 T;
    public final /* synthetic */ pz7 U;
    public final /* synthetic */ pz7 V;
    public final /* synthetic */ e0g W;
    public final /* synthetic */ Object X;

    public /* synthetic */ tlc(iqb iqbVar, pz7 pz7Var, boolean z, ffh ffhVar, cjh cjhVar, bz7 bz7Var, boolean z2, tkh tkhVar, mp9 mp9Var, kp9 kp9Var, boolean z3, int i, int i2, pzi pziVar, zub zubVar, pz7 pz7Var2, pz7 pz7Var3, pz7 pz7Var4, e0g e0gVar) {
        this.F = iqbVar;
        this.S = pz7Var;
        this.I = z;
        this.G = ffhVar;
        this.X = cjhVar;
        this.H = bz7Var;
        this.J = z2;
        this.K = tkhVar;
        this.L = mp9Var;
        this.M = kp9Var;
        this.N = z3;
        this.O = i;
        this.P = i2;
        this.Q = pziVar;
        this.R = zubVar;
        this.T = pz7Var2;
        this.U = pz7Var3;
        this.V = pz7Var4;
        this.W = e0gVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj3 = this.X;
        iqb iqbVar = this.F;
        switch (i) {
            case 0:
                cjh cjhVar = (cjh) obj3;
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    iqb iqbVarN = fqb.E;
                    pz7 pz7Var = this.S;
                    if (pz7Var != null) {
                        e18Var.a0(-1901539802);
                        Object objN = e18Var.N();
                        if (objN == jd4.a) {
                            objN = new f9c(7);
                            e18Var.k0(objN);
                        }
                        iqbVarN = gb9.N(tjf.b(iqbVarN, true, (bz7) objN), MTTypesetterKt.kLineSkipLimitMultiplier, xn5.n0(e18Var), MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 13);
                        e18Var.p(false);
                    } else {
                        e18Var.a0(-1901156115);
                        e18Var.p(false);
                    }
                    iqb iqbVarB = iqbVar.B(iqbVarN);
                    String strE = dch.E(R.string.default_error_message, e18Var);
                    boolean z = this.I;
                    iqb iqbVarA = b.a(xn5.Z(iqbVarB, strE, z), 280.0f, 56.0f);
                    ffh ffhVar = this.G;
                    eeg eegVar = new eeg(z ? ffhVar.j : ffhVar.i);
                    boolean z2 = this.J;
                    boolean z3 = this.N;
                    pzi pziVar = this.Q;
                    zub zubVar = this.R;
                    bg1.b(cjhVar, this.H, iqbVarA, z2, this.K, this.L, this.M, z3, this.O, this.P, pziVar, null, zubVar, eegVar, fd9.q0(674541106, new bc2(cjhVar, z2, z3, pziVar, zubVar, z, pz7Var, this.T, this.U, this.V, ffhVar, this.W), e18Var), e18Var, 0, 196608, FreeTypeConstants.FT_LOAD_MONOCHROME);
                }
                break;
            default:
                final String str = (String) obj3;
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                } else {
                    dch.E(R.string.default_error_message, e18Var2);
                    iqb iqbVarA2 = b.a(iqbVar, 280.0f, 56.0f);
                    final ffh ffhVar2 = this.G;
                    eeg eegVar2 = new eeg(ffhVar2.i);
                    final boolean z4 = this.I;
                    final boolean z5 = this.N;
                    final pzi pziVar2 = this.Q;
                    final zub zubVar2 = this.R;
                    final pz7 pz7Var2 = this.S;
                    final pz7 pz7Var3 = this.T;
                    final pz7 pz7Var4 = this.U;
                    final pz7 pz7Var5 = this.V;
                    final e0g e0gVar = this.W;
                    bg1.c(str, this.H, iqbVarA2, z4, this.J, this.K, this.L, this.M, z5, this.O, this.P, pziVar2, null, zubVar2, eegVar2, fd9.q0(1451491557, new rz7() { // from class: sgh
                        @Override // defpackage.rz7
                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                            pz7 pz7Var6 = (pz7) obj4;
                            ld4 ld4Var3 = (ld4) obj5;
                            int iIntValue3 = ((Integer) obj6).intValue();
                            if ((iIntValue3 & 6) == 0) {
                                iIntValue3 |= ((e18) ld4Var3).h(pz7Var6) ? 4 : 2;
                            }
                            e18 e18Var3 = (e18) ld4Var3;
                            if (e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                                vz8.L.y(str, pz7Var6, z4, z5, pziVar2, zubVar2, pz7Var2, pz7Var3, pz7Var4, pz7Var5, e0gVar, ffhVar2, null, null, e18Var3, (iIntValue3 << 3) & 112);
                            } else {
                                e18Var3.T();
                            }
                            return iei.a;
                        }
                    }, e18Var2), e18Var2, 0, FreeTypeConstants.FT_LOAD_MONOCHROME);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ tlc(iqb iqbVar, ffh ffhVar, String str, bz7 bz7Var, boolean z, boolean z2, tkh tkhVar, mp9 mp9Var, kp9 kp9Var, boolean z3, int i, int i2, pzi pziVar, zub zubVar, pz7 pz7Var, pz7 pz7Var2, pz7 pz7Var3, pz7 pz7Var4, e0g e0gVar) {
        this.F = iqbVar;
        this.G = ffhVar;
        this.X = str;
        this.H = bz7Var;
        this.I = z;
        this.J = z2;
        this.K = tkhVar;
        this.L = mp9Var;
        this.M = kp9Var;
        this.N = z3;
        this.O = i;
        this.P = i2;
        this.Q = pziVar;
        this.R = zubVar;
        this.S = pz7Var;
        this.T = pz7Var2;
        this.U = pz7Var3;
        this.V = pz7Var4;
        this.W = e0gVar;
    }
}
