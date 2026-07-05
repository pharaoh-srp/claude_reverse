package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pz implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ zy7 F;

    public /* synthetic */ pz(int i, zy7 zy7Var) {
        this.E = i;
        this.F = zy7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.E;
        zy7 zy7Var = this.F;
        switch (i) {
            case 0:
                Class cls = AndroidComposeView.r1;
                zy7Var.a();
                break;
            default:
                zy7Var.a();
                break;
        }
    }
}
