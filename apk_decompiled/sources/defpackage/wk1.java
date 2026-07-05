package defpackage;

import com.anthropic.claude.bell.b;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wk1 implements pz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ qz7 H;
    public final /* synthetic */ zy7 I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ int K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;

    public /* synthetic */ wk1(s51 s51Var, List list, bz7 bz7Var, boolean z, boolean z2, zy7 zy7Var, iqb iqbVar, int i) {
        this.L = s51Var;
        this.M = list;
        this.H = bz7Var;
        this.F = z;
        this.G = z2;
        this.I = zy7Var;
        this.J = iqbVar;
        this.K = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.K;
        Object obj3 = this.J;
        qz7 qz7Var = this.H;
        Object obj4 = this.M;
        Object obj5 = this.L;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(i2 | 1);
                b.c((s51) obj5, (List) obj4, (bz7) qz7Var, this.F, this.G, this.I, (iqb) obj3, (ld4) obj, iP0);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iP02 = x44.p0(i2 | 1);
                pd8.b((String) obj5, (Boolean) obj4, this.F, this.G, (bz7) qz7Var, this.I, (iqb) obj3, (ld4) obj, iP02);
                break;
            default:
                ((Integer) obj2).intValue();
                int iP03 = x44.p0(i2 | 1);
                uhk.c(this.F, this.G, this.I, (zy7) obj5, (zy7) obj4, (zy7) qz7Var, (i4g) obj3, (ld4) obj, iP03);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ wk1(String str, Boolean bool, boolean z, boolean z2, bz7 bz7Var, zy7 zy7Var, iqb iqbVar, int i) {
        this.L = str;
        this.M = bool;
        this.F = z;
        this.G = z2;
        this.H = bz7Var;
        this.I = zy7Var;
        this.J = iqbVar;
        this.K = i;
    }

    public /* synthetic */ wk1(boolean z, boolean z2, zy7 zy7Var, zy7 zy7Var2, zy7 zy7Var3, zy7 zy7Var4, i4g i4gVar, int i) {
        this.F = z;
        this.G = z2;
        this.I = zy7Var;
        this.L = zy7Var2;
        this.M = zy7Var3;
        this.H = zy7Var4;
        this.J = i4gVar;
        this.K = i;
    }
}
