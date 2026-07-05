package defpackage;

import com.anthropic.claude.types.strings.ModelId;
import com.anthropic.claude.types.strings.ThinkingEffort;

/* JADX INFO: loaded from: classes2.dex */
public final class wff implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ r93 F;
    public final /* synthetic */ t4g G;

    public /* synthetic */ wff(r93 r93Var, t4g t4gVar, int i) {
        this.E = i;
        this.F = r93Var;
        this.G = t4gVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        t4g t4gVar = this.G;
        tp4 tp4Var = null;
        r93 r93Var = this.F;
        switch (i) {
            case 0:
                String strM1141unboximpl = ((ThinkingEffort) obj).m1141unboximpl();
                strM1141unboximpl.getClass();
                r93Var.getClass();
                gb9.D(r93Var.h, null, null, new o93(r93Var, strM1141unboximpl, tp4Var, 1), 3);
                if (!((Boolean) r93Var.l.getValue()).booleanValue()) {
                    t4gVar.c();
                } else {
                    t4gVar.a();
                }
                break;
            default:
                String strM1064unboximpl = ((ModelId) obj).m1064unboximpl();
                strM1064unboximpl.getClass();
                gb9.D(r93Var.h, null, null, new o93(r93Var, strM1064unboximpl, tp4Var, 0), 3);
                t4gVar.c();
                break;
        }
        return ieiVar;
    }
}
