package defpackage;

import android.window.OnBackInvokedCallback;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class pe0 implements OnBackInvokedCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pe0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void onBackInvoked() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                zy7 zy7Var = (zy7) obj;
                if (zy7Var != null) {
                    zy7Var.a();
                }
                break;
            case 1:
                ((ah0) obj).s();
                break;
            default:
                ((Runnable) obj).run();
                break;
        }
    }
}
