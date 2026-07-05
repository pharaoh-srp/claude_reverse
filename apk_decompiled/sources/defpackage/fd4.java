package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes.dex */
public final class fd4 extends ts9 implements pz7 {
    public final /* synthetic */ int F = 0;
    public final /* synthetic */ hd4 G;
    public final /* synthetic */ AndroidComposeView H;
    public final /* synthetic */ pz7 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fd4(hd4 hd4Var, AndroidComposeView androidComposeView, pz7 pz7Var, int i) {
        super(2);
        this.G = hd4Var;
        this.H = androidComposeView;
        this.I = pz7Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.F;
        iei ieiVar = iei.a;
        pz7 pz7Var = this.I;
        AndroidComposeView androidComposeView = this.H;
        hd4 hd4Var = this.G;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Number) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    e18Var.a0(866651995);
                    ve4.a(androidComposeView, hd4Var.k, pz7Var, e18Var, 0);
                    e18Var.p(false);
                }
                break;
            default:
                ((Number) obj2).intValue();
                hd4Var.a(androidComposeView, pz7Var, (ld4) obj, x44.p0(1));
                break;
        }
        return ieiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fd4(AndroidComposeView androidComposeView, hd4 hd4Var, pz7 pz7Var) {
        super(2);
        this.H = androidComposeView;
        this.G = hd4Var;
        this.I = pz7Var;
    }
}
