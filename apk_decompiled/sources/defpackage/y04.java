package defpackage;

import com.anthropic.claude.code.remote.e;
import com.anthropic.claude.sessions.types.SessionResource;

/* JADX INFO: loaded from: classes2.dex */
public final class y04 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ SessionResource F;
    public final /* synthetic */ nwb G;

    public /* synthetic */ y04(SessionResource sessionResource, nwb nwbVar, int i) {
        this.E = i;
        this.F = sessionResource;
        this.G = nwbVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        SessionResource sessionResource = this.F;
        nwb nwbVar = this.G;
        switch (i) {
            case 0:
                ad9 ad9Var = e.a;
                nwbVar.setValue(sessionResource);
                break;
            default:
                ad9 ad9Var2 = e.a;
                nwbVar.setValue(sessionResource);
                break;
        }
        return ieiVar;
    }
}
