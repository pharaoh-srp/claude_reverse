package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.code.remote.c;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c04 implements pz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ c F;
    public final /* synthetic */ zy7 G;
    public final /* synthetic */ bz7 H;
    public final /* synthetic */ String I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;
    public final /* synthetic */ Object O;
    public final /* synthetic */ Object P;
    public final /* synthetic */ Object Q;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object S;

    public /* synthetic */ c04(c cVar, zy7 zy7Var, bz7 bz7Var, zy7 zy7Var2, iqb iqbVar, u3c u3cVar, b1i b1iVar, ysg ysgVar, fk0 fk0Var, rc8 rc8Var, nf7 nf7Var, koi koiVar, qi3 qi3Var, String str, int i) {
        this.F = cVar;
        this.G = zy7Var;
        this.H = bz7Var;
        this.J = zy7Var2;
        this.K = iqbVar;
        this.L = u3cVar;
        this.M = b1iVar;
        this.N = ysgVar;
        this.O = fk0Var;
        this.P = rc8Var;
        this.Q = nf7Var;
        this.R = koiVar;
        this.S = qi3Var;
        this.I = str;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj3 = this.S;
        Object obj4 = this.R;
        Object obj5 = this.Q;
        Object obj6 = this.P;
        Object obj7 = this.O;
        Object obj8 = this.N;
        Object obj9 = this.M;
        Object obj10 = this.L;
        Object obj11 = this.K;
        Object obj12 = this.J;
        switch (i) {
            case 0:
                mnc mncVar = (mnc) obj12;
                x0a x0aVar = (x0a) obj11;
                pz7 pz7Var = (pz7) obj10;
                Context context = (Context) obj9;
                l45 l45Var = (l45) obj8;
                op3 op3Var = (op3) obj7;
                sz7 sz7Var = (sz7) obj6;
                nwb nwbVar = (nwb) obj5;
                nwb nwbVar2 = (nwb) obj4;
                ybg ybgVar = (ybg) obj3;
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    c cVar = this.F;
                    u9a u9aVarY = cVar.Y();
                    boolean zBooleanValue = ((Boolean) cVar.E.getValue()).booleanValue();
                    htf htfVarA0 = cVar.a0();
                    boolean z = (x44.r(u9aVarY, s9a.a) && zBooleanValue) ? false : true;
                    boolean zBooleanValue2 = ((Boolean) cVar.F.getValue()).booleanValue();
                    oz3 oz3Var = cVar.U;
                    vsf vsfVar = (vsf) oz3Var.f.getValue();
                    if (!z) {
                        e18Var.a0(-151054966);
                        boolean zF = e18Var.f(x0aVar) | e18Var.f(cVar);
                        Object objN = e18Var.N();
                        lz1 lz1Var = jd4.a;
                        if (zF || objN == lz1Var) {
                            objN = mpk.w(new ik1(x0aVar, 24, cVar));
                            e18Var.k0(objN);
                        }
                        wlg wlgVar = (wlg) objN;
                        Boolean bool = (Boolean) wlgVar.getValue();
                        bool.getClass();
                        htf htfVarA02 = cVar.a0();
                        boolean zF2 = e18Var.f(wlgVar) | e18Var.f(cVar);
                        Object objN2 = e18Var.N();
                        if (zF2 || objN2 == lz1Var) {
                            objN2 = new lj2(cVar, 9, wlgVar);
                            e18Var.k0(objN2);
                        }
                        mwa.e(bool, htfVarA02, null, (bz7) objN2, e18Var, 64);
                        ho0 ho0Var = new ho0(8.0f, true, new sz6(1));
                        FillElement fillElement = b.c;
                        boolean zF3 = e18Var.f(pz7Var) | e18Var.f(cVar) | e18Var.f(vsfVar) | e18Var.f(oz3Var);
                        bz7 bz7Var = this.H;
                        boolean zF4 = zF3 | e18Var.f(bz7Var) | e18Var.h(context) | e18Var.f(null) | e18Var.h(l45Var) | e18Var.h(op3Var);
                        String str = this.I;
                        boolean zF5 = zF4 | e18Var.f(str);
                        Object objN3 = e18Var.N();
                        if (zF5 || objN3 == lz1Var) {
                            f04 f04Var = new f04(pz7Var, cVar, vsfVar, oz3Var, bz7Var, context, l45Var, op3Var, str, nwbVar, nwbVar2, ybgVar);
                            e18Var.k0(f04Var);
                            objN3 = f04Var;
                        }
                        knk.h(fillElement, x0aVar, mncVar, false, ho0Var, null, null, false, null, (bz7) objN3, e18Var, 24582, 488);
                        e18Var.p(false);
                    } else {
                        e18Var.a0(-157838634);
                        xn5.H(gb9.N(gb9.I(b.c, mncVar), MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, zBooleanValue2 ? MTTypesetterKt.kLineSkipLimitMultiplier : 200.0f, 7), null, false, fd9.q0(-1470700138, new yc2(u9aVarY, htfVarA0, pz7Var, vsfVar, oz3Var, sz7Var, this.G, cVar, 1), e18Var), e18Var, 3072, 6);
                        e18Var.p(false);
                    }
                }
                break;
            default:
                ((Integer) obj2).getClass();
                t3c.c(this.F, this.G, this.H, (zy7) obj12, (iqb) obj11, (u3c) obj10, (b1i) obj9, (ysg) obj8, (fk0) obj7, (rc8) obj6, (nf7) obj5, (koi) obj4, (qi3) obj3, this.I, (ld4) obj, x44.p0(49));
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ c04(c cVar, mnc mncVar, x0a x0aVar, pz7 pz7Var, bz7 bz7Var, Context context, l45 l45Var, op3 op3Var, String str, sz7 sz7Var, zy7 zy7Var, nwb nwbVar, nwb nwbVar2, ybg ybgVar) {
        this.F = cVar;
        this.J = mncVar;
        this.K = x0aVar;
        this.L = pz7Var;
        this.H = bz7Var;
        this.M = context;
        this.N = l45Var;
        this.O = op3Var;
        this.I = str;
        this.P = sz7Var;
        this.G = zy7Var;
        this.Q = nwbVar;
        this.R = nwbVar2;
        this.S = ybgVar;
    }
}
