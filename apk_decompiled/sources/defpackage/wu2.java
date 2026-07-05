package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.api.model.ThinkingOption;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class wu2 implements pz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ String F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ boolean H;
    public final /* synthetic */ int I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ qz7 L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;
    public final /* synthetic */ Object O;

    public /* synthetic */ wu2(hw2 hw2Var, zy7 zy7Var, String str, zy7 zy7Var2, bt7 bt7Var, boolean z, boolean z2, int i, zub zubVar, j9f j9fVar) {
        this.J = hw2Var;
        this.K = zy7Var;
        this.F = str;
        this.L = zy7Var2;
        this.M = bt7Var;
        this.G = z;
        this.H = z2;
        this.I = i;
        this.N = zubVar;
        this.O = j9fVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        bz7 bz7Var;
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj3 = this.O;
        Object obj4 = this.N;
        Object obj5 = this.M;
        qz7 qz7Var = this.L;
        Object obj6 = this.K;
        Object obj7 = this.J;
        switch (i) {
            case 0:
                hw2 hw2Var = (hw2) obj7;
                zy7 zy7Var = (zy7) obj6;
                zy7 zy7Var2 = (zy7) qz7Var;
                bt7 bt7Var = (bt7) obj5;
                zub zubVar = (zub) obj4;
                j9f j9fVar = (j9f) obj3;
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    yih yihVar = hw2Var.D;
                    lz1 lz1Var = jd4.a;
                    jm9 jm9Var = null;
                    if (zy7Var == null) {
                        e18Var.a0(-825511538);
                        e18Var.p(false);
                        bz7Var = null;
                    } else {
                        e18Var.a0(-825511537);
                        boolean zH = e18Var.h(hw2Var);
                        Object objN = e18Var.N();
                        if (zH || objN == lz1Var) {
                            objN = new st2(hw2Var, 4);
                            e18Var.k0(objN);
                        }
                        bz7Var = (bz7) objN;
                        e18Var.p(false);
                    }
                    if (zy7Var == null) {
                        e18Var.a0(-825332017);
                    } else {
                        e18Var.a0(-825332016);
                        boolean zH2 = e18Var.h(hw2Var);
                        Object objN2 = e18Var.N();
                        if (zH2 || objN2 == lz1Var) {
                            objN2 = new ub2(1, hw2Var, hw2.class, "addPastedText", "addPastedText(Ljava/lang/String;)Z", 0, 4);
                            e18Var.k0(objN2);
                        }
                        jm9Var = (jm9) objN2;
                    }
                    e18Var.p(false);
                    iqb iqbVarC = b.c(gb9.L(fqb.E, MTTypesetterKt.kLineSkipLimitMultiplier, 6.0f, 1), 1.0f);
                    bz7 bz7Var2 = (bz7) jm9Var;
                    boolean zH3 = e18Var.h(hw2Var) | e18Var.f(zy7Var2);
                    Object objN3 = e18Var.N();
                    if (zH3 || objN3 == lz1Var) {
                        objN3 = new tt2(hw2Var, zy7Var2, 1);
                        e18Var.k0(objN3);
                    }
                    ev2.f(yihVar, this.F, bz7Var, bz7Var2, (zy7) objN3, bt7Var, this.G, iqbVarC, this.H, null, null, this.I, zubVar, j9fVar, e18Var, 12582912);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                kpb.f((List) obj7, this.F, (ThinkingOption) obj6, this.G, this.H, (bz7) qz7Var, (bz7) obj5, (i4g) obj4, (pl3) obj3, (ld4) obj, x44.p0(this.I | 1));
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ wu2(List list, String str, ThinkingOption thinkingOption, boolean z, boolean z2, bz7 bz7Var, bz7 bz7Var2, i4g i4gVar, pl3 pl3Var, int i) {
        this.J = list;
        this.F = str;
        this.K = thinkingOption;
        this.G = z;
        this.H = z2;
        this.L = bz7Var;
        this.M = bz7Var2;
        this.N = i4gVar;
        this.O = pl3Var;
        this.I = i;
    }
}
