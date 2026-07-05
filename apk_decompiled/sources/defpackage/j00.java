package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: loaded from: classes.dex */
public final class j00 extends ts9 implements bz7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ k00 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j00(k00 k00Var, int i) {
        super(1);
        this.F = i;
        this.G = k00Var;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.F;
        k00 k00Var = this.G;
        switch (i) {
            case 0:
                View view = k00Var.H;
                return Boolean.valueOf(view.getParent().requestSendAccessibilityEvent(view, (AccessibilityEvent) obj));
            default:
                g9f g9fVar = (g9f) obj;
                if (g9fVar.v()) {
                    omc snapshotObserver = k00Var.H.getSnapshotObserver();
                    snapshotObserver.a.d(g9fVar, k00Var.q0, new xz(g9fVar, 2, k00Var));
                }
                return iei.a;
        }
    }
}
