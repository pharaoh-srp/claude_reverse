package defpackage;

import androidx.compose.foundation.layout.b;
import com.anthropic.claude.R;
import com.anthropic.claude.code.remote.bottomsheet.a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vy3 implements rz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ String G;
    public final /* synthetic */ bz7 H;
    public final /* synthetic */ nwb I;

    public /* synthetic */ vy3(boolean z, bz7 bz7Var, String str, nwb nwbVar) {
        this.F = z;
        this.H = bz7Var;
        this.G = str;
        this.I = nwbVar;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.E;
        iei ieiVar = iei.a;
        lz1 lz1Var = jd4.a;
        nwb nwbVar = this.I;
        bz7 bz7Var = this.H;
        switch (i) {
            case 0:
                i4g i4gVar = (i4g) obj;
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                i4gVar.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((e18) ld4Var).f(i4gVar) ? 4 : 2;
                }
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 19) != 18)) {
                    e18Var.T();
                } else {
                    String str = (String) nwbVar.getValue();
                    Object objN = e18Var.N();
                    if (objN == lz1Var) {
                        objN = new x40(17, nwbVar);
                        e18Var.k0(objN);
                    }
                    bz7 bz7Var2 = (bz7) objN;
                    boolean z = this.F;
                    boolean zG = e18Var.g(z) | e18Var.f(bz7Var);
                    String str2 = this.G;
                    boolean zF = zG | e18Var.f(str2);
                    Object objN2 = e18Var.N();
                    if (zF || objN2 == lz1Var) {
                        objN2 = new ry3(z, bz7Var, str2, 1);
                        e18Var.k0(objN2);
                    }
                    a.v(str, bz7Var2, i4gVar, (zy7) objN2, e18Var, ((iIntValue << 6) & 896) | 48);
                }
                break;
            default:
                ld4 ld4Var2 = (ld4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((s64) obj).getClass();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    e18Var2.T();
                } else {
                    bpc bpcVarA = com.anthropic.claude.design.icon.a.a(ud0.T0, e18Var2);
                    boolean z2 = this.F;
                    String strJ0 = d4c.j0(z2 ? R.string.project_create_screen_project_visibility_public_description : R.string.project_create_screen_project_visibility_public_disabled_description, e18Var2);
                    boolean zF2 = e18Var2.f(bz7Var);
                    Object objN3 = e18Var2.N();
                    if (zF2 || objN3 == lz1Var) {
                        objN3 = new bi(bz7Var, nwbVar, 6);
                        e18Var2.k0(objN3);
                    }
                    uik.f(bpcVarA, this.G, strJ0, (zy7) objN3, null, z2, null, e18Var2, 8, 80);
                    kxk.g(e18Var2, b.e(fqb.E, 8.0f));
                    bpc bpcVarA2 = com.anthropic.claude.design.icon.a.a(ud0.H0, e18Var2);
                    String strJ02 = d4c.j0(R.string.project_create_screen_project_visibility_private_label, e18Var2);
                    String strJ03 = d4c.j0(R.string.project_create_screen_project_visibility_private_description, e18Var2);
                    boolean zF3 = e18Var2.f(bz7Var);
                    Object objN4 = e18Var2.N();
                    if (zF3 || objN4 == lz1Var) {
                        objN4 = new bi(bz7Var, nwbVar, 7);
                        e18Var2.k0(objN4);
                    }
                    uik.f(bpcVarA2, strJ02, strJ03, (zy7) objN4, null, false, null, e18Var2, 8, 112);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ vy3(boolean z, String str, bz7 bz7Var, nwb nwbVar) {
        this.F = z;
        this.G = str;
        this.H = bz7Var;
        this.I = nwbVar;
    }
}
