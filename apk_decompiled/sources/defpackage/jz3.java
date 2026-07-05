package defpackage;

import com.anthropic.claude.sessions.types.SessionResource;
import com.anthropic.claude.types.strings.SessionId;

/* JADX INFO: loaded from: classes2.dex */
public final class jz3 implements zy7 {
    public final /* synthetic */ SessionResource E;
    public final /* synthetic */ pz7 F;
    public final /* synthetic */ nwb G;
    public final /* synthetic */ nwb H;
    public final /* synthetic */ nwb I;

    public jz3(SessionResource sessionResource, pz7 pz7Var, nwb nwbVar, nwb nwbVar2, nwb nwbVar3) {
        this.E = sessionResource;
        this.F = pz7Var;
        this.G = nwbVar;
        this.H = nwbVar2;
        this.I = nwbVar3;
    }

    @Override // defpackage.zy7
    public final Object a() {
        nwb nwbVar = this.G;
        nwbVar.setValue(null);
        nwb nwbVar2 = this.H;
        nwbVar2.setValue(null);
        SessionResource sessionResource = this.E;
        String strM875getIdOcx55TE = sessionResource.m875getIdOcx55TE();
        SessionId sessionIdM1114boximpl = strM875getIdOcx55TE != null ? SessionId.m1114boximpl(strM875getIdOcx55TE) : null;
        nwb nwbVar3 = this.I;
        nwbVar3.setValue(sessionIdM1114boximpl);
        this.F.invoke(SessionId.m1114boximpl(sessionResource.m875getIdOcx55TE()), new jo3(sessionResource, nwbVar3, nwbVar, nwbVar2));
        return iei.a;
    }
}
