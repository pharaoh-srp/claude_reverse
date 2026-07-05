package defpackage;

import com.anthropic.claude.api.model.ModelSelectorEntry;
import com.anthropic.claude.code.remote.bottomsheet.a;
import com.anthropic.claude.sessions.types.EnvironmentResource;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ey3 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ int H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ qz7 J;
    public final /* synthetic */ Object K;

    public /* synthetic */ ey3(dlb dlbVar, boolean z, boolean z2, zy7 zy7Var, iqb iqbVar, int i) {
        this.E = 3;
        this.I = dlbVar;
        this.F = z;
        this.G = z2;
        this.J = zy7Var;
        this.K = iqbVar;
        this.H = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        int i2 = this.H;
        iei ieiVar = iei.a;
        Object obj3 = this.I;
        Object obj4 = this.K;
        qz7 qz7Var = this.J;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(1);
                a.t((EnvironmentResource) obj3, this.F, this.H, this.G, (zy7) qz7Var, (zy7) obj4, (ld4) obj, iP0);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iP02 = x44.p0(i2 | 1);
                ppk.c((String) obj3, this.F, (bz7) qz7Var, (iqb) obj4, this.G, (ld4) obj, iP02);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iP03 = x44.p0(i2 | 1);
                cvk.h((znd) obj3, this.F, (zy7) qz7Var, (iqb) obj4, this.G, (ld4) obj, iP03);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iP04 = x44.p0(i2 | 1);
                ksk.c((dlb) obj3, this.F, this.G, (zy7) qz7Var, (iqb) obj4, (ld4) obj, iP04);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int iP05 = x44.p0(1);
                kpb.a((ModelSelectorEntry) obj3, this.F, (bz7) qz7Var, (qnc) obj4, this.G, (ld4) obj, iP05, this.H);
                break;
            default:
                ((Integer) obj2).intValue();
                int iP06 = x44.p0(i2 | 1);
                qwk.b(this.F, this.G, (zy7) qz7Var, (zy7) obj4, (i4g) obj3, (ld4) obj, iP06);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ ey3(ModelSelectorEntry modelSelectorEntry, boolean z, bz7 bz7Var, qnc qncVar, boolean z2, int i, int i2) {
        this.E = 4;
        this.I = modelSelectorEntry;
        this.F = z;
        this.J = bz7Var;
        this.K = qncVar;
        this.G = z2;
        this.H = i2;
    }

    public /* synthetic */ ey3(EnvironmentResource environmentResource, boolean z, int i, boolean z2, zy7 zy7Var, zy7 zy7Var2, int i2) {
        this.E = 0;
        this.I = environmentResource;
        this.F = z;
        this.H = i;
        this.G = z2;
        this.J = zy7Var;
        this.K = zy7Var2;
    }

    public /* synthetic */ ey3(Object obj, boolean z, qz7 qz7Var, iqb iqbVar, boolean z2, int i, int i2) {
        this.E = i2;
        this.I = obj;
        this.F = z;
        this.J = qz7Var;
        this.K = iqbVar;
        this.G = z2;
        this.H = i;
    }

    public /* synthetic */ ey3(boolean z, boolean z2, zy7 zy7Var, zy7 zy7Var2, i4g i4gVar, int i) {
        this.E = 5;
        this.F = z;
        this.G = z2;
        this.J = zy7Var;
        this.K = zy7Var2;
        this.I = i4gVar;
        this.H = i;
    }
}
