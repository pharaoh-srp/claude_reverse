package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;
import com.anthropic.claude.R;

/* JADX INFO: loaded from: classes.dex */
public final class gij implements fe4, i4a {
    public final AndroidComposeView E;
    public final le4 F;
    public boolean G;
    public c4a H;
    public pz7 I = mc4.a;

    public gij(AndroidComposeView androidComposeView, le4 le4Var) {
        this.E = androidComposeView;
        this.F = le4Var;
    }

    @Override // defpackage.fe4
    public final void a() {
        if (!this.G) {
            this.G = true;
            this.E.getView().setTag(R.id.wrapped_composition_tag, null);
            c4a c4aVar = this.H;
            if (c4aVar != null) {
                c4aVar.c(this);
            }
            this.H = null;
        }
        this.F.a();
    }

    public final void b(pz7 pz7Var) {
        this.E.setOnReadyForComposition(new j40(this, 10, pz7Var));
    }

    @Override // defpackage.i4a
    public final void d(m4a m4aVar, y3a y3aVar) {
        if (y3aVar == y3a.ON_DESTROY) {
            a();
        } else {
            if (y3aVar != y3a.ON_CREATE || this.G) {
                return;
            }
            b(this.I);
        }
    }
}
