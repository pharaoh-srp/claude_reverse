package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class yf0 implements pz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ float F;
    public final /* synthetic */ float G;
    public final /* synthetic */ ta4 H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;

    public /* synthetic */ yf0(ta4 ta4Var, iqb iqbVar, ta4 ta4Var2, rz7 rz7Var, float f, float f2, wbj wbjVar, m2i m2iVar, q2i q2iVar, int i) {
        this.H = ta4Var;
        this.J = iqbVar;
        this.I = ta4Var2;
        this.K = rz7Var;
        this.F = f;
        this.G = f2;
        this.L = wbjVar;
        this.M = m2iVar;
        this.N = q2iVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj3 = this.N;
        Object obj4 = this.M;
        Object obj5 = this.L;
        Object obj6 = this.K;
        Object obj7 = this.J;
        Object obj8 = this.I;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                eg0.b(this.H, (iqb) obj7, (ta4) obj8, (rz7) obj6, this.F, this.G, (wbj) obj5, (m2i) obj4, (q2i) obj3, (ld4) obj, x44.p0(7));
                break;
            default:
                swb swbVar = (swb) obj8;
                final e0g e0gVar = (e0g) obj7;
                final jl3 jl3Var = (jl3) obj6;
                final List list = (List) obj5;
                final bz7 bz7Var = (bz7) obj4;
                final bz7 bz7Var2 = (bz7) obj3;
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    wp6 wp6VarE = gp6.e(kxk.N(150, 0, null, 6), 2);
                    z8i z8iVarN = kxk.N(150, 0, null, 6);
                    long j = w49.a;
                    wp6 wp6VarA = wp6VarE.a(new wp6(new b6i((he7) null, (s9g) null, (dh2) null, new l6f(0.95f, j, z8iVarN), (LinkedHashMap) null, 119)));
                    d77 d77VarA = gp6.f(kxk.N(150, 0, null, 6), 2).a(new d77(new b6i((he7) null, (s9g) null, (dh2) null, new l6f(0.95f, j, kxk.N(150, 0, null, 6)), (LinkedHashMap) null, 119)));
                    final float f = this.F;
                    final float f2 = this.G;
                    final ta4 ta4Var = this.H;
                    wd6.I(swbVar, null, wp6VarA, d77VarA, null, fd9.q0(911084897, new rz7() { // from class: v49
                        @Override // defpackage.rz7
                        public final Object invoke(Object obj9, Object obj10, Object obj11) {
                            ld4 ld4Var2 = (ld4) obj10;
                            int iIntValue2 = ((Integer) obj11).intValue();
                            ((ia0) obj9).getClass();
                            e18 e18Var2 = (e18) ld4Var2;
                            if (e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                iqb iqbVarI = gb9.i(b.g(b.t(fqb.E, f), MTTypesetterKt.kLineSkipLimitMultiplier, f2, 1), kxk.N(150, 0, null, 6), 2);
                                e0g e0gVar2 = e0gVar;
                                iqb iqbVarT0 = xn5.t0(iqbVarI, 3.0f, e0gVar2, 0L, 0L, 28);
                                jl3 jl3Var2 = jl3Var;
                                iqb iqbVarP = yfd.p(xn5.V(ez1.t(iqbVarT0, MTTypesetterKt.kLineSkipLimitMultiplier, jl3Var2.v, e0gVar2), e0gVar2), jl3Var2.n, zni.b);
                                List list2 = list;
                                boolean zH = e18Var2.h(list2);
                                bz7 bz7Var3 = bz7Var;
                                boolean zF = zH | e18Var2.f(bz7Var3);
                                bz7 bz7Var4 = bz7Var2;
                                boolean zF2 = zF | e18Var2.f(bz7Var4);
                                ta4 ta4Var2 = ta4Var;
                                boolean zF3 = e18Var2.f(ta4Var2) | zF2;
                                Object objN = e18Var2.N();
                                if (zF3 || objN == jd4.a) {
                                    fe feVar = new fe(list2, bz7Var3, bz7Var4, ta4Var2, 21);
                                    e18Var2.k0(feVar);
                                    objN = feVar;
                                }
                                knk.h(iqbVarP, null, null, false, null, null, null, false, null, (bz7) objN, e18Var2, 0, 510);
                            } else {
                                e18Var2.T();
                            }
                            return iei.a;
                        }
                    }, e18Var), e18Var, 200064);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ yf0(swb swbVar, float f, float f2, e0g e0gVar, jl3 jl3Var, List list, bz7 bz7Var, bz7 bz7Var2, ta4 ta4Var) {
        this.I = swbVar;
        this.F = f;
        this.G = f2;
        this.J = e0gVar;
        this.K = jl3Var;
        this.L = list;
        this.M = bz7Var;
        this.N = bz7Var2;
        this.H = ta4Var;
    }
}
