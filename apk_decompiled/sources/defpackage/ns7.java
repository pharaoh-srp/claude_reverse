package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes.dex */
public final class ns7 {
    public final ts7 a;
    public final AndroidComposeView b;
    public final fwb c;
    public final fwb d;
    public boolean e;

    public ns7(ts7 ts7Var, AndroidComposeView androidComposeView) {
        this.a = ts7Var;
        this.b = androidComposeView;
        fwb fwbVar = v6f.a;
        this.c = new fwb();
        this.d = new fwb();
    }

    public final void a() {
        if (this.e) {
            return;
        }
        dm dmVar = new dm(0, this, ns7.class, "invalidateNodes", "invalidateNodes()V", 0, 11);
        qvb qvbVar = this.b.d1;
        if (qvbVar.g(dmVar) < 0) {
            qvbVar.a(dmVar);
        }
        this.e = true;
    }
}
