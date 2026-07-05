package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class eg8 implements bz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ mg8 F;

    public /* synthetic */ eg8(gg8 gg8Var, mg8 mg8Var) {
        this.F = mg8Var;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        mg8 mg8Var = this.F;
        switch (i) {
            case 0:
                bg8 bg8Var = (bg8) obj;
                bg8Var.getClass();
                return Boolean.valueOf(mg8Var == null || bg8Var.c.h() < MTTypesetterKt.kLineSkipLimitMultiplier);
            default:
                ((Long) obj).getClass();
                Iterator it = mg8Var.S.e.iterator();
                while (true) {
                    lmg lmgVar = (lmg) it;
                    if (!lmgVar.hasNext()) {
                        return iei.a;
                    }
                    wd6.t0(((fg8) lmgVar.next()).E);
                }
                break;
        }
    }

    public /* synthetic */ eg8(mg8 mg8Var) {
        this.F = mg8Var;
    }
}
