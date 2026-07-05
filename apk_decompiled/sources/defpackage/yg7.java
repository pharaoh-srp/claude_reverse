package defpackage;

import com.anthropic.claude.analytics.events.MobileAppFeedbackEvents$FeedbackType;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yg7 implements rz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ bz7 F;
    public final /* synthetic */ nwb G;

    public /* synthetic */ yg7(bz7 bz7Var, nwb nwbVar, int i) {
        this.E = i;
        this.F = bz7Var;
        this.G = nwbVar;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.E;
        iei ieiVar = iei.a;
        lz1 lz1Var = jd4.a;
        nwb nwbVar = this.G;
        bz7 bz7Var = this.F;
        int i2 = 1;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((s64) obj).getClass();
                e18 e18Var = (e18) ld4Var;
                if (e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    for (MobileAppFeedbackEvents$FeedbackType mobileAppFeedbackEvents$FeedbackType : MobileAppFeedbackEvents$FeedbackType.getEntries()) {
                        ta4 ta4VarQ0 = fd9.q0(50391210, new mk4(15, mobileAppFeedbackEvents$FeedbackType), e18Var);
                        boolean zF = e18Var.f(bz7Var) | e18Var.d(mobileAppFeedbackEvents$FeedbackType.ordinal());
                        Object objN = e18Var.N();
                        if (zF || objN == lz1Var) {
                            objN = new yg4(bz7Var, mobileAppFeedbackEvents$FeedbackType, nwbVar, 18);
                            e18Var.k0(objN);
                        }
                        t30.b(ta4VarQ0, (zy7) objN, null, null, null, false, null, null, e18Var, 6, 508);
                    }
                } else {
                    e18Var.T();
                }
                break;
            default:
                ld4 ld4Var2 = (ld4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((s64) obj).getClass();
                e18 e18Var2 = (e18) ld4Var2;
                if (e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    for (g4j g4jVar : g4j.J) {
                        ta4 ta4VarQ02 = fd9.q0(262993996, new jsg(11, g4jVar), e18Var2);
                        boolean zF2 = e18Var2.f(bz7Var) | e18Var2.d(g4jVar.ordinal());
                        Object objN2 = e18Var2.N();
                        if (zF2 || objN2 == lz1Var) {
                            objN2 = new fui(bz7Var, g4jVar, nwbVar, i2);
                            e18Var2.k0(objN2);
                        }
                        t30.b(ta4VarQ02, (zy7) objN2, null, null, null, false, null, null, e18Var2, 6, 508);
                    }
                } else {
                    e18Var2.T();
                }
                break;
        }
        return ieiVar;
    }
}
