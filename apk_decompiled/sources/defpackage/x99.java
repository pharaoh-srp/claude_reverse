package defpackage;

import com.anthropic.claude.settings.internal.e;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class x99 implements rz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ fk0 F;
    public final /* synthetic */ rwe G;

    public /* synthetic */ x99(fk0 fk0Var, rwe rweVar, zy7 zy7Var) {
        this.F = fk0Var;
        this.G = rweVar;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.E;
        iei ieiVar = iei.a;
        lz1 lz1Var = jd4.a;
        rwe rweVar = this.G;
        fk0 fk0Var = this.F;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((s64) obj).getClass();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    e18Var.T();
                } else {
                    boolean zH = e18Var.h(rweVar);
                    Object objN = e18Var.N();
                    if (zH || objN == lz1Var) {
                        objN = new av(rweVar, 14);
                        e18Var.k0(objN);
                    }
                    e.c(6, e18Var, (zy7) objN, null, "Override feature flag");
                    boolean zBooleanValue = ((Boolean) fk0Var.J.getValue()).booleanValue();
                    boolean zH2 = e18Var.h(fk0Var);
                    Object objN2 = e18Var.N();
                    if (zH2 || objN2 == lz1Var) {
                        objN2 = new rn6(fk0Var, 2);
                        e18Var.k0(objN2);
                    }
                    e.f("Force Octopus (bypass GrowthBook)", zBooleanValue, (bz7) objN2, null, null, null, null, e18Var, 6, 120);
                }
                break;
            default:
                ld4 ld4Var2 = (ld4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((s64) obj).getClass();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    e18Var2.T();
                } else {
                    boolean zBooleanValue2 = ((Boolean) fk0Var.h.getValue()).booleanValue();
                    boolean zH3 = e18Var2.h(fk0Var);
                    Object objN3 = e18Var2.N();
                    if (zH3 || objN3 == lz1Var) {
                        objN3 = new rn6(fk0Var, 1);
                        e18Var2.k0(objN3);
                    }
                    e.f("Show Internal Settings bubble", zBooleanValue2, (bz7) objN3, null, "Floating shortcut that opens this screen from anywhere in the app. Tap to open, drag to reposition.", null, null, e18Var2, 6, 104);
                    oqb oqbVar = fk0.K;
                    e.b(fk0Var, null, e18Var2, 8);
                    boolean zH4 = e18Var2.h(rweVar);
                    Object objN4 = e18Var2.N();
                    if (zH4 || objN4 == lz1Var) {
                        objN4 = new av(rweVar, 13);
                        e18Var2.k0(objN4);
                    }
                    e.c(6, e18Var2, (zy7) objN4, null, "Push Notifications");
                    e18Var2.a0(-1562966570);
                    e18Var2.p(false);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ x99(rwe rweVar, fk0 fk0Var) {
        this.G = rweVar;
        this.F = fk0Var;
    }
}
