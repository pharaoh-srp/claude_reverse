package defpackage;

import com.anthropic.claude.analytics.events.AppStorePromotionEvents$AppStorePromotionDismiss;
import com.anthropic.claude.analytics.events.AppStorePromotionEvents$AppStorePromotionView;

/* JADX INFO: loaded from: classes2.dex */
public final class ja7 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ ha7 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ja7(ha7 ha7Var, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = ha7Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        ha7 ha7Var = this.G;
        switch (i) {
            case 0:
                return new ja7(ha7Var, tp4Var, 0);
            default:
                return new ja7(ha7Var, tp4Var, 1);
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
        return ((ja7) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        Object objJ;
        int i = this.E;
        iei ieiVar = iei.a;
        ha7 ha7Var = this.G;
        m45 m45Var = m45.E;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    String str = ha7Var.b;
                    this.F = 1;
                    if (ha7Var.e.getAndSet(true)) {
                        objJ = ieiVar;
                    } else {
                        ha7Var.c.e(new AppStorePromotionEvents$AppStorePromotionView(str), iv1.J(jce.b(AppStorePromotionEvents$AppStorePromotionView.class)));
                        objJ = x97.j(ha7Var.d, str, this);
                    }
                    if (objJ == m45Var) {
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
                    String str2 = ha7Var.b;
                    this.F = 1;
                    ha7Var.c.e(new AppStorePromotionEvents$AppStorePromotionDismiss(str2), iv1.J(jce.b(AppStorePromotionEvents$AppStorePromotionDismiss.class)));
                    x97 x97Var = ha7Var.d;
                    if (x97Var.f(x97Var.j, "android-spotlight", str2, this) == m45Var) {
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
