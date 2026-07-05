package defpackage;

import com.anthropic.claude.api.project.Project;
import com.anthropic.claude.code.remote.bottomsheet.a;
import com.anthropic.claude.code.remote.e;
import com.anthropic.claude.conway.ConwayAppScreen;
import com.anthropic.claude.project.menu.f;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class de3 implements pz7 {
    public final /* synthetic */ int E = 10;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ int I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;

    public /* synthetic */ de3(bpc bpcVar, String str, String str2, zy7 zy7Var, iqb iqbVar, boolean z, mnc mncVar, int i, int i2) {
        this.J = bpcVar;
        this.K = str;
        this.L = str2;
        this.G = zy7Var;
        this.H = iqbVar;
        this.F = z;
        this.M = mncVar;
        this.I = i2;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        int i2 = this.I;
        iei ieiVar = iei.a;
        Object obj3 = this.M;
        Object obj4 = this.H;
        Object obj5 = this.G;
        Object obj6 = this.L;
        Object obj7 = this.K;
        Object obj8 = this.J;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(i2 | 1);
                ckk.f((wrh) obj8, (zy7) obj5, (ksg) obj7, (ksg) obj6, (iqb) obj4, this.F, (ce3) obj3, (ld4) obj, iP0);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iP02 = x44.p0(i2 | 1);
                jlk.a(this.F, (zy7) obj5, (iqb) obj4, (mxd) obj8, (mnc) obj7, (nxd) obj6, (ta4) obj3, (ld4) obj, iP02);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iP03 = x44.p0(i2 | 1);
                a.y((xhe) obj8, (i4g) obj5, (LinkedHashSet) obj7, (bz7) obj6, (bz7) obj4, (x0a) obj3, this.F, (ld4) obj, iP03);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iP04 = x44.p0(i2 | 1);
                e.e(this.F, (zy7) obj5, (mnc) obj8, (f77) obj7, (nxd) obj6, (iqb) obj4, (ta4) obj3, (ld4) obj, iP04);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int iP05 = x44.p0(i2 | 1);
                iv4.a((ConwayAppScreen.Extension) obj8, (hsf) obj7, (String) obj6, this.F, (bz7) obj3, (zy7) obj5, (iqb) obj4, (ld4) obj, iP05);
                break;
            case 5:
                ((Integer) obj2).getClass();
                int iP06 = x44.p0(i2 | 1);
                fuk.i((List) obj8, (String) obj5, (iqb) obj4, (String) obj7, this.F, (pz7) obj6, (yw8) obj3, (ld4) obj, iP06);
                break;
            case 6:
                ((Integer) obj2).getClass();
                int iP07 = x44.p0(i2 | 1);
                ryb.c((ta4) obj8, (ta4) obj7, (ta4) obj6, (pz7) obj4, this.F, (zy7) obj5, (zy7) obj3, (ld4) obj, iP07);
                break;
            case 7:
                ((Integer) obj2).getClass();
                int iP08 = x44.p0(i2 | 1);
                f.a((Project) obj8, this.F, (zy7) obj5, (zy7) obj7, (bz7) obj6, (zy7) obj3, (iqb) obj4, (ld4) obj, iP08);
                break;
            case 8:
                ((Integer) obj2).getClass();
                int iP09 = x44.p0(i2 | 1);
                lag.c((mag) obj8, (iqb) obj4, this.F, (v9g) obj5, (zub) obj7, (ta4) obj6, (rz7) obj3, (ld4) obj, iP09);
                break;
            case 9:
                ((Integer) obj2).getClass();
                int iP010 = x44.p0(i2 | 1);
                ((myh) obj8).a((String) obj5, (String) obj7, (dlb) obj6, this.F, (e5h) obj3, (iqb) obj4, (ld4) obj, iP010);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP011 = x44.p0(9);
                uik.f((bpc) obj8, (String) obj7, (String) obj6, (zy7) obj5, (iqb) obj4, this.F, (mnc) obj3, (ld4) obj, iP011, this.I);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ de3(ta4 ta4Var, ta4 ta4Var2, ta4 ta4Var3, pz7 pz7Var, boolean z, zy7 zy7Var, zy7 zy7Var2, int i) {
        this.J = ta4Var;
        this.K = ta4Var2;
        this.L = ta4Var3;
        this.H = pz7Var;
        this.F = z;
        this.G = zy7Var;
        this.M = zy7Var2;
        this.I = i;
    }

    public /* synthetic */ de3(xhe xheVar, i4g i4gVar, LinkedHashSet linkedHashSet, bz7 bz7Var, bz7 bz7Var2, x0a x0aVar, boolean z, int i) {
        this.J = xheVar;
        this.G = i4gVar;
        this.K = linkedHashSet;
        this.L = bz7Var;
        this.H = bz7Var2;
        this.M = x0aVar;
        this.F = z;
        this.I = i;
    }

    public /* synthetic */ de3(mag magVar, iqb iqbVar, boolean z, v9g v9gVar, zub zubVar, ta4 ta4Var, rz7 rz7Var, int i) {
        this.J = magVar;
        this.H = iqbVar;
        this.F = z;
        this.G = v9gVar;
        this.K = zubVar;
        this.L = ta4Var;
        this.M = rz7Var;
        this.I = i;
    }

    public /* synthetic */ de3(wrh wrhVar, zy7 zy7Var, ksg ksgVar, ksg ksgVar2, iqb iqbVar, boolean z, ce3 ce3Var, int i) {
        this.J = wrhVar;
        this.G = zy7Var;
        this.K = ksgVar;
        this.L = ksgVar2;
        this.H = iqbVar;
        this.F = z;
        this.M = ce3Var;
        this.I = i;
    }

    public /* synthetic */ de3(myh myhVar, String str, String str2, dlb dlbVar, boolean z, e5h e5hVar, iqb iqbVar, int i) {
        this.J = myhVar;
        this.G = str;
        this.K = str2;
        this.L = dlbVar;
        this.F = z;
        this.M = e5hVar;
        this.H = iqbVar;
        this.I = i;
    }

    public /* synthetic */ de3(Project project, boolean z, zy7 zy7Var, zy7 zy7Var2, bz7 bz7Var, zy7 zy7Var3, iqb iqbVar, int i) {
        this.J = project;
        this.F = z;
        this.G = zy7Var;
        this.K = zy7Var2;
        this.L = bz7Var;
        this.M = zy7Var3;
        this.H = iqbVar;
        this.I = i;
    }

    public /* synthetic */ de3(ConwayAppScreen.Extension extension, hsf hsfVar, String str, boolean z, bz7 bz7Var, zy7 zy7Var, iqb iqbVar, int i) {
        this.J = extension;
        this.K = hsfVar;
        this.L = str;
        this.F = z;
        this.M = bz7Var;
        this.G = zy7Var;
        this.H = iqbVar;
        this.I = i;
    }

    public /* synthetic */ de3(List list, String str, iqb iqbVar, String str2, boolean z, pz7 pz7Var, yw8 yw8Var, int i) {
        this.J = list;
        this.G = str;
        this.H = iqbVar;
        this.K = str2;
        this.F = z;
        this.L = pz7Var;
        this.M = yw8Var;
        this.I = i;
    }

    public /* synthetic */ de3(boolean z, zy7 zy7Var, iqb iqbVar, mxd mxdVar, mnc mncVar, nxd nxdVar, ta4 ta4Var, int i) {
        this.F = z;
        this.G = zy7Var;
        this.H = iqbVar;
        this.J = mxdVar;
        this.K = mncVar;
        this.L = nxdVar;
        this.M = ta4Var;
        this.I = i;
    }

    public /* synthetic */ de3(boolean z, zy7 zy7Var, mnc mncVar, f77 f77Var, nxd nxdVar, iqb iqbVar, ta4 ta4Var, int i) {
        this.F = z;
        this.G = zy7Var;
        this.J = mncVar;
        this.K = f77Var;
        this.L = nxdVar;
        this.H = iqbVar;
        this.M = ta4Var;
        this.I = i;
    }
}
