package defpackage;

import com.anthropic.claude.api.chat.ModelSelection;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class tbc implements pz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ String F;
    public final /* synthetic */ String G;
    public final /* synthetic */ bz7 H;
    public final /* synthetic */ zy7 I;
    public final /* synthetic */ iqb J;
    public final /* synthetic */ int K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;
    public final /* synthetic */ Object O;

    public /* synthetic */ tbc(String str, hdc hdcVar, String str2, Set set, o3f o3fVar, iqb iqbVar, Long l, zy7 zy7Var, bz7 bz7Var, int i) {
        this.F = str;
        this.L = hdcVar;
        this.G = str2;
        this.M = set;
        this.N = o3fVar;
        this.J = iqbVar;
        this.O = l;
        this.I = zy7Var;
        this.H = bz7Var;
        this.K = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.K;
        Object obj3 = this.O;
        Object obj4 = this.N;
        Object obj5 = this.M;
        Object obj6 = this.L;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(i2 | 1);
                xb5.a(this.F, (hdc) obj6, this.G, (Set) obj5, (o3f) obj4, this.J, (Long) obj3, this.I, this.H, (ld4) obj, iP0);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP02 = x44.p0(i2 | 1);
                dlk.h(this.F, (ModelSelection) obj6, this.G, this.H, this.I, (zy7) obj5, this.J, (String) obj4, (qi3) obj3, (ld4) obj, iP02);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ tbc(String str, ModelSelection modelSelection, String str2, bz7 bz7Var, zy7 zy7Var, zy7 zy7Var2, iqb iqbVar, String str3, qi3 qi3Var, int i) {
        this.F = str;
        this.L = modelSelection;
        this.G = str2;
        this.H = bz7Var;
        this.I = zy7Var;
        this.M = zy7Var2;
        this.J = iqbVar;
        this.N = str3;
        this.O = qi3Var;
        this.K = i;
    }
}
