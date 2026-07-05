package defpackage;

import com.anthropic.claude.chat.bottomsheet.a1;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i44 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ List F;
    public final /* synthetic */ bz7 G;
    public final /* synthetic */ iqb H;

    public /* synthetic */ i44(List list, bz7 bz7Var, iqb iqbVar, int i, int i2) {
        this.E = i2;
        this.F = list;
        this.G = bz7Var;
        this.H = iqbVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        iqb iqbVar = this.H;
        bz7 bz7Var = this.G;
        List list = this.F;
        ld4 ld4Var = (ld4) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                a1.b(x44.p0(1), ld4Var, bz7Var, iqbVar, list);
                break;
            case 1:
                fs4.e(x44.p0(385), ld4Var, bz7Var, iqbVar, list);
                break;
            default:
                qbb.b(x44.p0(1), ld4Var, bz7Var, iqbVar, list);
                break;
        }
        return ieiVar;
    }
}
