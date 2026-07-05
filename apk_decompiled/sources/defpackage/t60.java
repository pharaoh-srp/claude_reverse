package defpackage;

import android.view.ActionMode;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes.dex */
public final class t60 implements wkh {
    public final AndroidComposeView a;
    public ActionMode b;
    public final ra4 c = new ra4(new l4(4, this));
    public zkh d = zkh.F;

    public t60(AndroidComposeView androidComposeView) {
        this.a = androidComposeView;
    }

    @Override // defpackage.wkh
    public final void a(l9e l9eVar, zy7 zy7Var, zy7 zy7Var2, zy7 zy7Var3, zy7 zy7Var4) {
        b(l9eVar, zy7Var, zy7Var2, zy7Var3, zy7Var4, null);
    }

    @Override // defpackage.wkh
    public final void b(l9e l9eVar, zy7 zy7Var, zy7 zy7Var2, zy7 zy7Var3, zy7 zy7Var4, zy7 zy7Var5) {
        ra4 ra4Var = this.c;
        ra4Var.F = l9eVar;
        ra4Var.G = zy7Var;
        ra4Var.I = zy7Var3;
        ra4Var.H = zy7Var2;
        ra4Var.J = zy7Var4;
        ra4Var.K = zy7Var5;
        ActionMode actionMode = this.b;
        if (actionMode != null) {
            actionMode.invalidate();
            return;
        }
        this.d = zkh.E;
        this.b = gqk.h(this.a, new gp7(ra4Var));
    }

    @Override // defpackage.wkh
    public final void c() {
        this.d = zkh.F;
        ActionMode actionMode = this.b;
        if (actionMode != null) {
            actionMode.finish();
        }
        this.b = null;
    }

    @Override // defpackage.wkh
    public final zkh e() {
        return this.d;
    }
}
