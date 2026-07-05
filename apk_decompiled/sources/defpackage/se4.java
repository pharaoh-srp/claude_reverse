package defpackage;

import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes.dex */
public final class se4 extends ts9 implements pz7 {
    public final /* synthetic */ int F = 0;
    public final /* synthetic */ pz7 G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public se4(gij gijVar, hd4 hd4Var, pz7 pz7Var) {
        super(2);
        this.H = gijVar;
        this.I = hd4Var;
        this.G = pz7Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.F;
        iei ieiVar = iei.a;
        pz7 pz7Var = this.G;
        Object obj3 = this.I;
        Object obj4 = this.H;
        int i2 = 1;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                ve4.a((Owner) obj4, (eli) obj3, pz7Var, (ld4) obj, x44.p0(1));
                break;
            default:
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Number) obj2).intValue();
                gij gijVar = (gij) obj4;
                int i3 = 0;
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    AndroidComposeView androidComposeView = gijVar.E;
                    boolean zH = e18Var.h(gijVar);
                    Object objN = e18Var.N();
                    tp4 tp4Var = null;
                    lz1 lz1Var = jd4.a;
                    if (zH || objN == lz1Var) {
                        objN = new fij(gijVar, tp4Var, i3);
                        e18Var.k0(objN);
                    }
                    fd9.i(e18Var, (pz7) objN, androidComposeView);
                    boolean zH2 = e18Var.h(gijVar);
                    Object objN2 = e18Var.N();
                    if (zH2 || objN2 == lz1Var) {
                        objN2 = new fij(gijVar, tp4Var, i2);
                        e18Var.k0(objN2);
                    }
                    fd9.i(e18Var, (pz7) objN2, androidComposeView);
                    ((hd4) obj3).a(androidComposeView, pz7Var, e18Var, 0);
                }
                break;
        }
        return ieiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public se4(Owner owner, eli eliVar, pz7 pz7Var, int i) {
        super(2);
        this.H = owner;
        this.I = eliVar;
        this.G = pz7Var;
    }
}
