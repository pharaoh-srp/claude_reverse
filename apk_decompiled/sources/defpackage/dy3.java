package defpackage;

import com.anthropic.claude.code.remote.bottomsheet.a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class dy3 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ yih F;
    public final /* synthetic */ iqb G;

    public /* synthetic */ dy3(yih yihVar, iqb iqbVar, int i, int i2) {
        this.E = i2;
        this.F = yihVar;
        this.G = iqbVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        iqb iqbVar = this.G;
        yih yihVar = this.F;
        ld4 ld4Var = (ld4) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                a.x(yihVar, iqbVar, ld4Var, x44.p0(7));
                break;
            default:
                a.c(yihVar, iqbVar, ld4Var, x44.p0(7));
                break;
        }
        return ieiVar;
    }
}
