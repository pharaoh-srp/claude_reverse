package defpackage;

import com.anthropic.claude.api.model.ModelSelectorEntry;
import com.anthropic.claude.chat.bottomsheet.model.b;
import com.anthropic.claude.models.organization.configtypes.GroveConfigStrings;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yb2 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ int I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;

    public /* synthetic */ yb2(iqb iqbVar, boolean z, boolean z2, p0h p0hVar, w79 w79Var, e0g e0gVar, int i) {
        this.E = 5;
        this.L = iqbVar;
        this.F = z;
        this.G = z2;
        this.J = p0hVar;
        this.K = w79Var;
        this.H = e0gVar;
        this.I = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        int i2 = this.I;
        Object obj3 = this.K;
        iei ieiVar = iei.a;
        Object obj4 = this.L;
        Object obj5 = this.H;
        Object obj6 = this.J;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(i2 | 1);
                lwj.g((zb0) obj6, (String) obj3, this.F, this.G, (zy7) obj5, (iqb) obj4, (ld4) obj, iP0);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iP02 = x44.p0(i2 | 1);
                rqk.h((s64) obj6, this.K, this.F, this.G, (zy7) obj5, (ta4) obj4, (ld4) obj, iP02);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iP03 = x44.p0(i2 | 1);
                sqk.b(this.F, this.G, (bz7) obj6, (GroveConfigStrings) obj3, (hya) obj5, (iqb) obj4, (ld4) obj, iP03);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iP04 = x44.p0(i2 | 1);
                osk.l((ftc) obj6, (lvh) obj5, this.F, (String) obj3, this.G, (iqb) obj4, (ld4) obj, iP04);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int iP05 = x44.p0(1);
                b.a((ModelSelectorEntry) obj6, this.F, (bz7) obj3, (zy7) obj5, (qnc) obj4, this.G, (ld4) obj, iP05, this.I);
                break;
            case 5:
                ((Integer) obj2).getClass();
                int iP06 = x44.p0(i2 | 1);
                q0h.b((iqb) obj4, this.F, this.G, (p0h) obj6, (w79) obj3, (e0g) obj5, (ld4) obj, iP06);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP07 = x44.p0(i2 | 1);
                yrk.d((String) obj3, (String) obj6, (String) obj5, this.F, this.G, (iqb) obj4, (ld4) obj, iP07);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ yb2(ftc ftcVar, lvh lvhVar, boolean z, String str, boolean z2, iqb iqbVar, int i) {
        this.E = 3;
        this.J = ftcVar;
        this.H = lvhVar;
        this.F = z;
        this.K = str;
        this.G = z2;
        this.L = iqbVar;
        this.I = i;
    }

    public /* synthetic */ yb2(ModelSelectorEntry modelSelectorEntry, boolean z, bz7 bz7Var, zy7 zy7Var, qnc qncVar, boolean z2, int i, int i2) {
        this.E = 4;
        this.J = modelSelectorEntry;
        this.F = z;
        this.K = bz7Var;
        this.H = zy7Var;
        this.L = qncVar;
        this.G = z2;
        this.I = i2;
    }

    public /* synthetic */ yb2(Object obj, Object obj2, boolean z, boolean z2, zy7 zy7Var, Object obj3, int i, int i2) {
        this.E = i2;
        this.J = obj;
        this.K = obj2;
        this.F = z;
        this.G = z2;
        this.H = zy7Var;
        this.L = obj3;
        this.I = i;
    }

    public /* synthetic */ yb2(String str, String str2, String str3, boolean z, boolean z2, iqb iqbVar, int i) {
        this.E = 6;
        this.K = str;
        this.J = str2;
        this.H = str3;
        this.F = z;
        this.G = z2;
        this.L = iqbVar;
        this.I = i;
    }

    public /* synthetic */ yb2(boolean z, boolean z2, bz7 bz7Var, GroveConfigStrings groveConfigStrings, hya hyaVar, iqb iqbVar, int i) {
        this.E = 2;
        this.F = z;
        this.G = z2;
        this.J = bz7Var;
        this.K = groveConfigStrings;
        this.H = hyaVar;
        this.L = iqbVar;
        this.I = i;
    }
}
