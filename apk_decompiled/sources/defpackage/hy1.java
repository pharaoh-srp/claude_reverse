package defpackage;

import com.anthropic.claude.tool.ui.chat.f;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hy1 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ zy7 F;
    public final /* synthetic */ zy7 G;
    public final /* synthetic */ iqb H;
    public final /* synthetic */ int I;

    public /* synthetic */ hy1(int i, zy7 zy7Var, zy7 zy7Var2, iqb iqbVar) {
        this.E = 2;
        this.F = zy7Var;
        this.H = iqbVar;
        this.G = zy7Var2;
        this.I = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.I;
        zy7 zy7Var = this.G;
        iqb iqbVar = this.H;
        zy7 zy7Var2 = this.F;
        ld4 ld4Var = (ld4) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                ybi.a(x44.p0(i2 | 1), ld4Var, zy7Var2, zy7Var, iqbVar);
                break;
            case 1:
                f.c(x44.p0(i2 | 1), ld4Var, zy7Var2, zy7Var, iqbVar);
                break;
            default:
                aok.a(x44.p0(i2 | 1), ld4Var, zy7Var2, zy7Var, iqbVar);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ hy1(int i, int i2, zy7 zy7Var, zy7 zy7Var2, iqb iqbVar) {
        this.E = i2;
        this.F = zy7Var;
        this.G = zy7Var2;
        this.H = iqbVar;
        this.I = i;
    }
}
