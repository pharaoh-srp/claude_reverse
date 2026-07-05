package defpackage;

import com.anthropic.claude.tasks.ui.y;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class cah implements pz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ bz7 G;
    public final /* synthetic */ iqb H;
    public final /* synthetic */ boolean I;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ int K;
    public final /* synthetic */ int L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;

    public /* synthetic */ cah(String str, boolean z, bz7 bz7Var, iqb iqbVar, String str2, boolean z2, boolean z3, int i, int i2) {
        this.M = str;
        this.F = z;
        this.G = bz7Var;
        this.H = iqbVar;
        this.N = str2;
        this.I = z2;
        this.J = z3;
        this.K = i;
        this.L = i2;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj3 = this.N;
        Object obj4 = this.M;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(this.L | 1);
                y.a((Map) obj4, this.F, this.I, this.J, this.K, (zy7) obj3, this.G, this.H, (ld4) obj, iP0);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP02 = x44.p0(this.K | 1);
                uik.g((String) obj4, this.F, this.G, this.H, (String) obj3, this.I, this.J, (ld4) obj, iP02, this.L);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ cah(Map map, boolean z, boolean z2, boolean z3, int i, zy7 zy7Var, bz7 bz7Var, iqb iqbVar, int i2) {
        this.M = map;
        this.F = z;
        this.I = z2;
        this.J = z3;
        this.K = i;
        this.N = zy7Var;
        this.G = bz7Var;
        this.H = iqbVar;
        this.L = i2;
    }
}
