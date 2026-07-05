package defpackage;

import com.anthropic.claude.tasks.ui.q;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p22 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ iqb F;
    public final /* synthetic */ List G;
    public final /* synthetic */ bz7 H;
    public final /* synthetic */ int I;

    public /* synthetic */ p22(iqb iqbVar, List list, bz7 bz7Var, int i) {
        this.E = 1;
        this.F = iqbVar;
        this.G = list;
        this.H = bz7Var;
        this.I = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.I;
        iqb iqbVar = this.F;
        bz7 bz7Var = this.H;
        List list = this.G;
        ld4 ld4Var = (ld4) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                q22.a(x44.p0(i2 | 1), ld4Var, bz7Var, iqbVar, list);
                break;
            case 1:
                fuk.c(x44.p0(i2 | 1), ld4Var, bz7Var, iqbVar, list);
                break;
            case 2:
                wb5.d(x44.p0(i2 | 1), ld4Var, bz7Var, iqbVar, list);
                break;
            default:
                q.h(x44.p0(i2 | 1), ld4Var, bz7Var, iqbVar, list);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ p22(List list, bz7 bz7Var, iqb iqbVar, int i, int i2) {
        this.E = i2;
        this.G = list;
        this.H = bz7Var;
        this.F = iqbVar;
        this.I = i;
    }
}
