package defpackage;

import android.widget.FrameLayout;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g7 implements pz7 {
    public final /* synthetic */ int E = 2;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ zy7 G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;

    public /* synthetic */ g7(lu luVar, iqb iqbVar, rwe rweVar, ml3 ml3Var, boolean z, qi3 qi3Var, zy7 zy7Var, pz7 pz7Var, bz7 bz7Var) {
        this.I = luVar;
        this.J = iqbVar;
        this.K = rweVar;
        this.L = ml3Var;
        this.F = z;
        this.M = qi3Var;
        this.G = zy7Var;
        this.N = pz7Var;
        this.H = bz7Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj3 = this.N;
        Object obj4 = this.M;
        Object obj5 = this.L;
        Object obj6 = this.H;
        Object obj7 = this.K;
        Object obj8 = this.J;
        Object obj9 = this.I;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                mkk.b((m8j) obj9, (FrameLayout.LayoutParams) obj8, this.G, this.F, (z7j) obj7, (bz7) obj6, (bz7) obj5, (lfa) obj3, (bz7) obj4, (ld4) obj, x44.p0(3073));
                break;
            case 1:
                lu luVar = (lu) obj9;
                iqb iqbVar = (iqb) obj8;
                rwe rweVar = (rwe) obj7;
                ml3 ml3Var = (ml3) obj5;
                qi3 qi3Var = (qi3) obj4;
                pz7 pz7Var = (pz7) obj3;
                bz7 bz7Var = (bz7) obj6;
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    Object objN = e18Var.N();
                    lz1 lz1Var = jd4.a;
                    if (objN == lz1Var) {
                        objN = mpk.P(Boolean.FALSE);
                        e18Var.k0(objN);
                    }
                    nwb nwbVar = (nwb) objN;
                    Object objN2 = e18Var.N();
                    if (objN2 == lz1Var) {
                        objN2 = sq6.p(e18Var);
                    }
                    ybg ybgVar = (ybg) objN2;
                    x0a x0aVarA = a1a.a(0, 3, e18Var);
                    qnc qncVar = n2i.a;
                    g77 g77VarA = n2i.a(eg0.h(e18Var), e18Var, 14);
                    boolean zBooleanValue = ((Boolean) luVar.o.getValue()).booleanValue();
                    boolean zF = e18Var.f(luVar);
                    Object objN3 = e18Var.N();
                    if (zF || objN3 == lz1Var) {
                        objN3 = new gu(luVar, 12);
                        e18Var.k0(objN3);
                    }
                    yb5.c(0, 0, e18Var, (zy7) objN3, zBooleanValue);
                    v40.b(iqbVar, null, fd9.q0(728499686, new uo(ml3Var, g77VarA, luVar, rweVar, nwbVar, 1), e18Var), null, fd9.q0(-60307992, new rn(ybgVar, 1), e18Var), fd9.q0(-454711831, new bv(this.F, luVar, qi3Var, this.G, x0aVarA), e18Var), 0, 0L, 0L, null, MTTypesetterKt.kLineSkipLimitMultiplier, fd9.q0(1137293785, new gn(luVar, ybgVar, g77VarA, x0aVarA, pz7Var, bz7Var, 3), e18Var), e18Var, 221568, 1994);
                    if (((Boolean) nwbVar.getValue()).booleanValue()) {
                        e18Var.a0(-545408567);
                        iu iuVar = luVar.t;
                        boolean zF2 = e18Var.f(luVar);
                        Object objN4 = e18Var.N();
                        if (zF2 || objN4 == lz1Var) {
                            objN4 = new k6(luVar, 12, nwbVar);
                            e18Var.k0(objN4);
                        }
                        zy7 zy7Var = (zy7) objN4;
                        Object objN5 = e18Var.N();
                        if (objN5 == lz1Var) {
                            objN5 = new ve(7, nwbVar);
                            e18Var.k0(objN5);
                        }
                        rwk.d(iuVar, zy7Var, (zy7) objN5, d4c.k0(R.string.chat_list_delete_selected_title, new Object[]{Integer.valueOf(luVar.Q().size())}, e18Var), d4c.j0(R.string.chat_menu_delete, e18Var), d4c.j0(R.string.chat_list_delete_selected_subtitle, e18Var), 0, e18Var, 384, 64);
                        e18Var.p(false);
                    } else {
                        e18Var.a0(-544741633);
                        e18Var.p(false);
                    }
                    Object objN6 = e18Var.N();
                    if (objN6 == lz1Var) {
                        objN6 = new q6(28);
                        e18Var.k0(objN6);
                    }
                    kxk.h(rweVar, "all_chats_list.bottom_sheet", null, null, (bz7) objN6, fd9.q0(-2038564819, new xu(luVar, 0, rweVar), e18Var), e18Var, 221232, 12);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                npf.a((String) obj9, (buf) obj8, this.F, this.G, (ta4) obj7, (iqb) obj6, (String) obj5, (zy7) obj4, (pz7) obj3, (ld4) obj, x44.p0(24577));
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ g7(m8j m8jVar, FrameLayout.LayoutParams layoutParams, zy7 zy7Var, boolean z, z7j z7jVar, bz7 bz7Var, bz7 bz7Var2, lfa lfaVar, bz7 bz7Var3, int i) {
        this.I = m8jVar;
        this.J = layoutParams;
        this.G = zy7Var;
        this.F = z;
        this.K = z7jVar;
        this.H = bz7Var;
        this.L = bz7Var2;
        this.N = lfaVar;
        this.M = bz7Var3;
    }

    public /* synthetic */ g7(String str, buf bufVar, boolean z, zy7 zy7Var, ta4 ta4Var, iqb iqbVar, String str2, zy7 zy7Var2, pz7 pz7Var, int i) {
        this.I = str;
        this.J = bufVar;
        this.F = z;
        this.G = zy7Var;
        this.K = ta4Var;
        this.H = iqbVar;
        this.L = str2;
        this.M = zy7Var2;
        this.N = pz7Var;
    }
}
