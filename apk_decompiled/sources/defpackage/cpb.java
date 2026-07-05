package defpackage;

import com.anthropic.claude.api.model.Badge;
import com.anthropic.claude.chat.bottomsheet.model.b;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class cpb implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Badge F;
    public final /* synthetic */ iqb G;

    public /* synthetic */ cpb(Badge badge, iqb iqbVar, int i, int i2) {
        this.E = i2;
        this.F = badge;
        this.G = iqbVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        iqb iqbVar = this.G;
        Badge badge = this.F;
        ld4 ld4Var = (ld4) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                kpb.b(badge, iqbVar, ld4Var, x44.p0(1));
                break;
            default:
                b.b(badge, iqbVar, ld4Var, x44.p0(1));
                break;
        }
        return ieiVar;
    }
}
