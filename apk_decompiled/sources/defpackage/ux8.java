package defpackage;

import com.anthropic.claude.api.model.ThinkingOption;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ux8 implements pz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ boolean H;
    public final /* synthetic */ boolean I;
    public final /* synthetic */ int J;
    public final /* synthetic */ int K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;
    public final /* synthetic */ Object O;
    public final /* synthetic */ Object P;

    public /* synthetic */ ux8(v4g v4gVar, zy7 zy7Var, String str, iqb iqbVar, z3g z3gVar, boolean z, boolean z2, pz7 pz7Var, ta4 ta4Var, int i, int i2) {
        this.F = v4gVar;
        this.L = zy7Var;
        this.G = str;
        this.O = iqbVar;
        this.M = z3gVar;
        this.H = z;
        this.I = z2;
        this.P = pz7Var;
        this.N = ta4Var;
        this.J = i;
        this.K = i2;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.J;
        Object obj3 = this.P;
        Object obj4 = this.O;
        Object obj5 = this.N;
        Object obj6 = this.M;
        Object obj7 = this.L;
        Object obj8 = this.F;
        Object obj9 = this.G;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(i2 | 1);
                fuk.g((List) obj8, (String) obj9, this.H, (Integer) obj5, (String) obj7, (iqb) obj4, (String) obj6, this.I, (pz7) obj3, (ld4) obj, iP0, this.K);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iP02 = x44.p0(i2 | 1);
                jvk.d((List) obj8, (String) obj9, (ThinkingOption) obj7, this.H, this.I, (bz7) obj6, (bz7) obj5, (i4g) obj4, (pl3) obj3, (ld4) obj, iP02, this.K);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iP03 = x44.p0(i2 | 1);
                otj.g((v4g) obj8, (zy7) obj7, (String) obj9, (iqb) obj4, (z3g) obj6, this.H, this.I, (pz7) obj3, (ta4) obj5, (ld4) obj, iP03, this.K);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP04 = x44.p0(i2 | 1);
                uj5.c(this.H, this.I, (zy7) obj9, (List) obj8, (dwg) obj7, (bz7) obj6, (List) obj5, (iqb) obj4, (j9f) obj3, (ld4) obj, iP04, this.K);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ ux8(List list, String str, ThinkingOption thinkingOption, boolean z, boolean z2, bz7 bz7Var, bz7 bz7Var2, i4g i4gVar, pl3 pl3Var, int i, int i2) {
        this.F = list;
        this.G = str;
        this.L = thinkingOption;
        this.H = z;
        this.I = z2;
        this.M = bz7Var;
        this.N = bz7Var2;
        this.O = i4gVar;
        this.P = pl3Var;
        this.J = i;
        this.K = i2;
    }

    public /* synthetic */ ux8(List list, String str, boolean z, Integer num, String str2, iqb iqbVar, String str3, boolean z2, pz7 pz7Var, int i, int i2) {
        this.F = list;
        this.G = str;
        this.H = z;
        this.N = num;
        this.L = str2;
        this.O = iqbVar;
        this.M = str3;
        this.I = z2;
        this.P = pz7Var;
        this.J = i;
        this.K = i2;
    }

    public /* synthetic */ ux8(boolean z, boolean z2, zy7 zy7Var, List list, dwg dwgVar, bz7 bz7Var, List list2, iqb iqbVar, j9f j9fVar, int i, int i2) {
        this.H = z;
        this.I = z2;
        this.G = zy7Var;
        this.F = list;
        this.L = dwgVar;
        this.M = bz7Var;
        this.N = list2;
        this.O = iqbVar;
        this.P = j9fVar;
        this.J = i;
        this.K = i2;
    }
}
