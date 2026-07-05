package defpackage;

import com.anthropic.claude.code.remote.e;
import com.anthropic.claude.conway.h;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class mx3 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ String F;
    public final /* synthetic */ int G;
    public final /* synthetic */ boolean H;
    public final /* synthetic */ zy7 I;
    public final /* synthetic */ iqb J;

    public /* synthetic */ mx3(String str, int i, boolean z, zy7 zy7Var, iqb iqbVar, int i2) {
        this.E = 1;
        this.F = str;
        this.G = i;
        this.H = z;
        this.I = zy7Var;
        this.J = iqbVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        int i2 = this.G;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                cmk.a(x44.p0(i2 | 1), (ld4) obj, this.I, this.J, this.F, this.H);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(1);
                e.g(this.G, iP0, (ld4) obj, this.I, this.J, this.F, this.H);
                break;
            case 2:
                ((Integer) obj2).getClass();
                ypk.a(x44.p0(i2 | 1), (ld4) obj, this.I, this.J, this.F, this.H);
                break;
            default:
                ((Integer) obj2).getClass();
                h.a(x44.p0(i2 | 1), (ld4) obj, this.I, this.J, this.F, this.H);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ mx3(String str, zy7 zy7Var, iqb iqbVar, boolean z, int i) {
        this.E = 0;
        this.H = z;
        this.F = str;
        this.I = zy7Var;
        this.J = iqbVar;
        this.G = i;
    }

    public /* synthetic */ mx3(String str, boolean z, zy7 zy7Var, iqb iqbVar, int i, int i2) {
        this.E = i2;
        this.F = str;
        this.H = z;
        this.I = zy7Var;
        this.J = iqbVar;
        this.G = i;
    }
}
