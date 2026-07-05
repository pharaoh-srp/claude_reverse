package defpackage;

import android.view.KeyEvent;

/* JADX INFO: loaded from: classes2.dex */
public final class ym5 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ Object G;

    public /* synthetic */ ym5(boolean z, Object obj, int i) {
        this.E = i;
        this.F = z;
        this.G = obj;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        boolean z = this.F;
        Object obj2 = this.G;
        switch (i) {
            case 0:
                KeyEvent keyEvent = ((so9) obj).a;
                if (z && cn5.q(keyEvent)) {
                    ((zy7) obj2).a();
                }
                break;
            default:
                KeyEvent keyEvent2 = ((so9) obj).a;
                ps7 ps7Var = (ps7) obj2;
                if (z ? cn5.r(keyEvent2) : cn5.s(keyEvent2)) {
                    ps7Var.a(1);
                } else if (z ? cn5.s(keyEvent2) : cn5.r(keyEvent2)) {
                    ps7Var.a(2);
                }
                break;
        }
        return Boolean.FALSE;
    }
}
