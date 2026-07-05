package defpackage;

import com.anthropic.claude.artifact.model.ArtifactMetadata;
import com.anthropic.claude.models.organization.configtypes.GroveConfigStrings;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class s22 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ int H;
    public final /* synthetic */ int I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;

    public /* synthetic */ s22(int i, int i2, zy7 zy7Var, zy7 zy7Var2, iqb iqbVar, boolean z) {
        this.E = 5;
        this.K = zy7Var;
        this.J = zy7Var2;
        this.G = iqbVar;
        this.F = z;
        this.H = i;
        this.I = i2;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.H;
        Object obj3 = this.G;
        Object obj4 = this.K;
        Object obj5 = this.J;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj;
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(i2 | 1);
                int i3 = this.I;
                otj.b(iP0, i3, ld4Var, (zy7) obj4, (iqb) obj3, (String) obj5, this.F);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iP02 = x44.p0(i2 | 1);
                ppk.b((zb0) obj5, this.F, (bz7) obj4, (iqb) obj3, (ld4) obj, iP02, this.I);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iP03 = x44.p0(i2 | 1);
                kkk.a(this.F, (bz7) obj5, (iqb) obj3, (ta4) obj4, (ld4) obj, iP03, this.I);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iP04 = x44.p0(i2 | 1);
                bhk.a((String) obj5, this.F, (zy7) obj4, (n02) obj3, (ld4) obj, iP04, this.I);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int iP05 = x44.p0(i2 | 1);
                jwk.n((iqb) obj3, (tt) obj5, this.F, (pz7) obj4, (ld4) obj, iP05, this.I);
                break;
            case 5:
                ((Integer) obj2).getClass();
                int iP06 = x44.p0(i2 | 1);
                uuj.c((zy7) obj4, (zy7) obj5, (iqb) obj3, this.F, (ld4) obj, iP06, this.I);
                break;
            case 6:
                ((Integer) obj2).getClass();
                int iP07 = x44.p0(i2 | 1);
                kgd.b((jgd) obj5, (GroveConfigStrings) obj4, (iqb) obj3, this.F, (ld4) obj, iP07, this.I);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP08 = x44.p0(i2 | 1);
                xuj.e((ArtifactMetadata) obj5, (zy7) obj4, (iqb) obj3, this.F, (ld4) obj, iP08, this.I);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ s22(iqb iqbVar, tt ttVar, boolean z, pz7 pz7Var, int i, int i2) {
        this.E = 4;
        this.G = iqbVar;
        this.J = ttVar;
        this.F = z;
        this.K = pz7Var;
        this.H = i;
        this.I = i2;
    }

    public /* synthetic */ s22(CharSequence charSequence, boolean z, qz7 qz7Var, Object obj, int i, int i2, int i3) {
        this.E = i3;
        this.J = charSequence;
        this.F = z;
        this.K = qz7Var;
        this.G = obj;
        this.H = i;
        this.I = i2;
    }

    public /* synthetic */ s22(Object obj, Object obj2, iqb iqbVar, boolean z, int i, int i2, int i3) {
        this.E = i3;
        this.J = obj;
        this.K = obj2;
        this.G = iqbVar;
        this.F = z;
        this.H = i;
        this.I = i2;
    }

    public /* synthetic */ s22(boolean z, bz7 bz7Var, iqb iqbVar, ta4 ta4Var, int i, int i2) {
        this.E = 2;
        this.F = z;
        this.J = bz7Var;
        this.G = iqbVar;
        this.K = ta4Var;
        this.H = i;
        this.I = i2;
    }
}
