package androidx.compose.ui.graphics.vector;

import defpackage.bb8;
import defpackage.bpc;
import defpackage.cv9;
import defpackage.efe;
import defpackage.fj0;
import defpackage.fu9;
import defpackage.grc;
import defpackage.hr1;
import defpackage.ib2;
import defpackage.iei;
import defpackage.k8g;
import defpackage.lsc;
import defpackage.mdj;
import defpackage.mpk;
import defpackage.nri;
import defpackage.ql8;
import defpackage.x7f;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorPainter;", "Lbpc;", "ui"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final class VectorPainter extends bpc {
    public final lsc J = mpk.P(new k8g(0));
    public final lsc K = mpk.P(Boolean.FALSE);
    public final nri L;
    public final lsc M;
    public float N;
    public hr1 O;

    public VectorPainter(bb8 bb8Var) {
        nri nriVar = new nri(bb8Var);
        nriVar.f = new x7f(7, this);
        this.L = nriVar;
        this.M = new lsc(iei.a, ql8.J);
        this.N = 1.0f;
    }

    @Override // defpackage.bpc
    public final boolean c(float f) {
        this.N = f;
        return true;
    }

    @Override // defpackage.bpc
    public final boolean d(hr1 hr1Var) {
        this.O = hr1Var;
        return true;
    }

    @Override // defpackage.bpc
    /* JADX INFO: renamed from: i */
    public final long getM() {
        return ((k8g) this.J.getValue()).a;
    }

    @Override // defpackage.bpc
    public final void j(cv9 cv9Var) {
        ib2 ib2Var = cv9Var.E;
        hr1 hr1Var = this.O;
        nri nriVar = this.L;
        if (hr1Var == null) {
            hr1Var = (hr1) nriVar.g.getValue();
        }
        if (((Boolean) this.K.getValue()).booleanValue() && cv9Var.getLayoutDirection() == fu9.F) {
            long jP0 = ib2Var.P0();
            fj0 fj0Var = ib2Var.F;
            long jW = fj0Var.w();
            fj0Var.p().g();
            try {
                ((efe) fj0Var.E).C(jP0, -1.0f, 1.0f);
                nriVar.e(cv9Var, this.N, hr1Var);
            } finally {
                grc.y(fj0Var, jW);
            }
        } else {
            nriVar.e(cv9Var, this.N, hr1Var);
        }
        this.M.getValue();
    }
}
