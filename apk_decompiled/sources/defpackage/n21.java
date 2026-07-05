package defpackage;

import androidx.compose.foundation.layout.b;
import com.anthropic.claude.R;
import com.anthropic.claude.design.icon.a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class n21 implements pz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ float F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ Object H;

    public /* synthetic */ n21(iqb iqbVar, float f, boolean z, int i) {
        this.H = iqbVar;
        this.F = f;
        this.G = z;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        boolean z = this.G;
        float f = this.F;
        Object obj3 = this.H;
        switch (i) {
            case 0:
                nxf nxfVar = (nxf) obj3;
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    cv8.b(a.a(ud0.L, e18Var), d4c.j0(R.string.generic_selected, e18Var), b.o(fqb.E, f), nxfVar.b(z), e18Var, 8, 0);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                hl3.a((iqb) obj3, f, z, (ld4) obj, x44.p0(1));
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ n21(nxf nxfVar, boolean z, float f) {
        this.H = nxfVar;
        this.G = z;
        this.F = f;
    }
}
