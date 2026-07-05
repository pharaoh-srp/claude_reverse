package defpackage;

import androidx.compose.foundation.layout.b;
import com.anthropic.claude.login.MagicLinkIntentData;
import com.anthropic.claude.login.OverlayScreens;
import com.anthropic.claude.models.organization.configtypes.CoworkStarterChip;
import com.anthropic.claude.models.organization.configtypes.CoworkStarterChipsConfig;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ij3 implements sz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;

    public /* synthetic */ ij3(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
        this.H = obj3;
        this.I = obj4;
    }

    @Override // defpackage.sz7
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2 = this.E;
        int i3 = 3;
        lz1 lz1Var = jd4.a;
        iei ieiVar = iei.a;
        Object obj5 = this.I;
        Object obj6 = this.H;
        Object obj7 = this.G;
        Object obj8 = this.F;
        switch (i2) {
            case 0:
                rc8 rc8Var = (rc8) obj8;
                qi3 qi3Var = (qi3) obj7;
                zqc zqcVar = (zqc) obj6;
                nwb nwbVar = (nwb) obj5;
                iqb iqbVar = (iqb) obj2;
                ld4 ld4Var = (ld4) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                ((zy7) obj).getClass();
                iqbVar.getClass();
                if ((iIntValue & 48) == 0) {
                    iIntValue |= ((e18) ld4Var).f(iqbVar) ? 32 : 16;
                }
                e18 e18Var = (e18) ld4Var;
                if (e18Var.Q(iIntValue & 1, (iIntValue & 145) != 144)) {
                    boolean zF = e18Var.f(rc8Var);
                    Object objN = e18Var.N();
                    if (zF || objN == lz1Var) {
                        objN = rc8Var.f(CoworkStarterChipsConfig.CONFIG_NAME, CoworkStarterChipsConfig.Companion.serializer());
                        e18Var.k0(objN);
                    }
                    CoworkStarterChipsConfig coworkStarterChipsConfig = (CoworkStarterChipsConfig) ((wlg) objN).getValue();
                    List<CoworkStarterChip> validChips = coworkStarterChipsConfig != null ? coworkStarterChipsConfig.getValidChips() : null;
                    if (validChips == null) {
                        validChips = lm6.E;
                    }
                    boolean zH = e18Var.h(qi3Var) | e18Var.h(zqcVar);
                    Object objN2 = e18Var.N();
                    if (zH || objN2 == lz1Var) {
                        objN2 = new l6(qi3Var, zqcVar, nwbVar, 15);
                        e18Var.k0(objN2);
                    }
                    fuk.c((iIntValue >> 3) & 14, e18Var, (bz7) objN2, iqbVar, validChips);
                } else {
                    e18Var.T();
                }
                return ieiVar;
            case 1:
                OverlayScreens overlayScreens = (OverlayScreens) obj8;
                rz7 rz7Var = (rz7) obj7;
                rwe rweVar = (rwe) obj6;
                rwe rweVar2 = (rwe) obj5;
                mnc mncVar = (mnc) obj;
                ybg ybgVar = (ybg) obj2;
                ld4 ld4Var2 = (ld4) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                mncVar.getClass();
                ybgVar.getClass();
                if ((iIntValue2 & 6) == 0) {
                    i = (((e18) ld4Var2).f(mncVar) ? 4 : 2) | iIntValue2;
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= ((e18) ld4Var2).f(ybgVar) ? 32 : 16;
                }
                e18 e18Var2 = (e18) ld4Var2;
                if (e18Var2.Q(i & 1, (i & 147) != 146)) {
                    MagicLinkIntentData intentData = ((OverlayScreens.MagicLinkVerify) overlayScreens).getIntentData();
                    iqb iqbVarP = yfd.p(b.c, ((gwa) e18Var2.j(jwa.a)).a.n, zni.b);
                    boolean zH2 = e18Var2.h(rweVar) | e18Var2.h(rweVar2);
                    Object objN3 = e18Var2.N();
                    if (zH2 || objN3 == lz1Var) {
                        objN3 = new ft9(rweVar, i3, rweVar2);
                        e18Var2.k0(objN3);
                    }
                    nkk.a(intentData, rz7Var, (zy7) objN3, ybgVar, iqbVarP, null, mncVar, e18Var2, ((i << 6) & 7168) | ((i << 18) & 3670016));
                } else {
                    e18Var2.T();
                }
                return ieiVar;
            default:
                iqb iqbVar2 = (iqb) obj8;
                rwe rweVar3 = (rwe) obj7;
                rz7 rz7Var2 = (rz7) obj6;
                rwe rweVar4 = (rwe) obj5;
                OverlayScreens overlayScreens2 = (OverlayScreens) obj2;
                ld4 ld4Var3 = (ld4) obj3;
                int iIntValue3 = ((Integer) obj4).intValue();
                ((ia0) obj).getClass();
                overlayScreens2.getClass();
                if ((iIntValue3 & 48) == 0) {
                    iIntValue3 |= (iIntValue3 & 64) == 0 ? ((e18) ld4Var3).f(overlayScreens2) : ((e18) ld4Var3).h(overlayScreens2) ? 32 : 16;
                }
                e18 e18Var3 = (e18) ld4Var3;
                if (!e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 145) != 144)) {
                    e18Var3.T();
                } else if (overlayScreens2 instanceof OverlayScreens.None) {
                    e18Var3.a0(-8409389);
                    e18Var3.p(false);
                } else {
                    if (!(overlayScreens2 instanceof OverlayScreens.MagicLinkVerify)) {
                        throw kgh.s(e18Var3, 1800843319, false);
                    }
                    e18Var3.a0(-8321876);
                    com.anthropic.claude.login.b.c(fd9.q0(60454018, new x13(rweVar3, 8), e18Var3), iqbVar2, false, fd9.q0(946584564, new ij3(overlayScreens2, rz7Var2, rweVar3, rweVar4, 1), e18Var3), e18Var3, 3078, 4);
                    e18Var3.p(false);
                }
                return ieiVar;
        }
    }
}
