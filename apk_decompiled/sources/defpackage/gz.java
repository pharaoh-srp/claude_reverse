package defpackage;

import android.graphics.Rect;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes.dex */
public final class gz extends m91 implements os7 {
    public final n78 E;
    public final zjf F;
    public final AndroidComposeView G;
    public final n9e H;
    public final String I;
    public final Rect J = new Rect();
    public final AutofillId K;
    public final yub L;
    public boolean M;

    public gz(n78 n78Var, zjf zjfVar, AndroidComposeView androidComposeView, n9e n9eVar, String str) {
        this.E = n78Var;
        this.F = zjfVar;
        this.G = androidComposeView;
        this.H = n9eVar;
        this.I = str;
        androidComposeView.setImportantForAutofill(1);
        AutofillId autofillId = androidComposeView.getAutofillId();
        if (autofillId == null) {
            throw sq6.z("Required value was null.");
        }
        this.K = autofillId;
        this.L = new yub();
    }

    @Override // defpackage.os7
    public final void a(jt7 jt7Var, jt7 jt7Var2) {
        av9 av9VarW;
        qjf qjfVarI;
        av9 av9VarW2;
        qjf qjfVarI2;
        if (jt7Var != null && (av9VarW2 = yfd.W(jt7Var)) != null && (qjfVarI2 = av9VarW2.I()) != null) {
            ewb ewbVar = qjfVarI2.E;
            if (ewbVar.b(ojf.g) || ewbVar.b(ojf.h)) {
                ((AutofillManager) this.E.F).notifyViewExited(this.G, av9VarW2.F);
            }
        }
        if (jt7Var2 == null || (av9VarW = yfd.W(jt7Var2)) == null || (qjfVarI = av9VarW.I()) == null) {
            return;
        }
        ewb ewbVar2 = qjfVarI.E;
        if (ewbVar2.b(ojf.g) || ewbVar2.b(ojf.h)) {
            int i = av9VarW.F;
            this.H.b.k(i, new ez(this, i));
        }
    }
}
