package defpackage;

import com.anthropic.claude.api.chat.InputMode;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ys8 implements pz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ String F;
    public final /* synthetic */ InputMode G;

    public /* synthetic */ ys8(String str, InputMode inputMode) {
        this.F = str;
        this.G = inputMode;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        InputMode inputMode = this.G;
        String str = this.F;
        ld4 ld4Var = (ld4) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int iIntValue = num.intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    dtk.e(str, inputMode, e18Var, 0);
                }
                break;
            default:
                num.getClass();
                dtk.e(str, inputMode, ld4Var, x44.p0(1));
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ ys8(String str, InputMode inputMode, int i) {
        this.F = str;
        this.G = inputMode;
    }
}
