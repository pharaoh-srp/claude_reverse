package defpackage;

import androidx.compose.foundation.layout.b;
import com.anthropic.claude.design.icon.a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class w93 implements pz7 {
    public final /* synthetic */ int E = 2;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ Object H;

    public /* synthetic */ w93(boolean z, nxf nxfVar, boolean z2) {
        this.F = z;
        this.H = nxfVar;
        this.G = z2;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        fqb fqbVar = fqb.E;
        iei ieiVar = iei.a;
        boolean z = this.G;
        Object obj3 = this.H;
        boolean z2 = this.F;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                nai.b(z2, z, (iqb) obj3, (ld4) obj, x44.p0(1));
                break;
            case 1:
                zy7 zy7Var = (zy7) obj3;
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    lnk.d(zy7Var, b.c(fqbVar, 1.0f), (z2 || z) ? false : true, null, null, null, null, nkk.a, e18Var, 805306416, 504);
                }
                break;
            default:
                nxf nxfVar = (nxf) obj3;
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                } else if (!z2) {
                    e18Var2.a0(1359939093);
                    kxk.g(e18Var2, b.p(mpk.d(csg.z(24.0f, e18Var2), csg.z(24.0f, e18Var2)), fqbVar));
                    e18Var2.p(false);
                } else {
                    e18Var2.a0(1359622614);
                    cv8.b(a.a(ud0.L, e18Var2), null, b.p(mpk.d(csg.z(24.0f, e18Var2), csg.z(24.0f, e18Var2)), fqbVar), nxfVar.b(z), e18Var2, 56, 0);
                    e18Var2.p(false);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ w93(boolean z, boolean z2, zy7 zy7Var) {
        this.F = z;
        this.G = z2;
        this.H = zy7Var;
    }

    public /* synthetic */ w93(boolean z, boolean z2, iqb iqbVar, int i) {
        this.F = z;
        this.G = z2;
        this.H = iqbVar;
    }
}
