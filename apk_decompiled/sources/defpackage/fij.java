package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes.dex */
public final class fij extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ gij G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fij(gij gijVar, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = gijVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        gij gijVar = this.G;
        switch (i) {
            case 0:
                return new fij(gijVar, tp4Var, 0);
            default:
                return new fij(gijVar, tp4Var, 1);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        l45 l45Var = (l45) obj;
        tp4 tp4Var = (tp4) obj2;
        switch (i) {
        }
        return ((fij) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        gij gijVar = this.G;
        m45 m45Var = m45.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    AndroidComposeView androidComposeView = gijVar.E;
                    this.F = 1;
                    Object objG = androidComposeView.g0.g(this);
                    if (objG != m45Var) {
                        objG = ieiVar;
                    }
                    if (objG == m45Var) {
                    }
                } else if (i2 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            default:
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    AndroidComposeView androidComposeView2 = gijVar.E;
                    this.F = 1;
                    Object objA = androidComposeView2.contentCaptureManager.a(this);
                    if (objA != m45Var) {
                        objA = ieiVar;
                    }
                    if (objA == m45Var) {
                    }
                } else if (i3 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
        }
        return m45Var;
    }
}
