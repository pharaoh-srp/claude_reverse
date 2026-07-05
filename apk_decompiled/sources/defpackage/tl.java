package defpackage;

import com.anthropic.claude.sessions.types.SessionResource;
import com.anthropic.claude.types.strings.SessionId;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class tl implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ vm F;
    public final /* synthetic */ String G;

    public /* synthetic */ tl(vm vmVar, String str, int i) {
        this.E = i;
        this.F = vmVar;
        this.G = str;
    }

    @Override // defpackage.zy7
    public final Object a() {
        String strM875getIdOcx55TE;
        int i = this.E;
        String str = this.G;
        vm vmVar = this.F;
        switch (i) {
            case 0:
                SessionResource sessionResourceD = vmVar.d();
                strM875getIdOcx55TE = sessionResourceD != null ? sessionResourceD.m875getIdOcx55TE() : null;
                return Boolean.valueOf(strM875getIdOcx55TE != null ? SessionId.m1117equalsimpl0(strM875getIdOcx55TE, str) : false);
            case 1:
                SessionResource sessionResourceD2 = vmVar.d();
                strM875getIdOcx55TE = sessionResourceD2 != null ? sessionResourceD2.m875getIdOcx55TE() : null;
                return Boolean.valueOf(strM875getIdOcx55TE != null ? SessionId.m1117equalsimpl0(strM875getIdOcx55TE, str) : false);
            case 2:
                return Boolean.valueOf(x44.r(vmVar.O, str));
            case 3:
                SessionResource sessionResourceD3 = vmVar.d();
                strM875getIdOcx55TE = sessionResourceD3 != null ? sessionResourceD3.m875getIdOcx55TE() : null;
                return Boolean.valueOf(strM875getIdOcx55TE != null ? SessionId.m1117equalsimpl0(strM875getIdOcx55TE, str) : false);
            case 4:
                SessionResource sessionResourceD4 = vmVar.d();
                strM875getIdOcx55TE = sessionResourceD4 != null ? sessionResourceD4.m875getIdOcx55TE() : null;
                return Boolean.valueOf(strM875getIdOcx55TE != null ? SessionId.m1117equalsimpl0(strM875getIdOcx55TE, str) : false);
            default:
                vmVar.s(str, true);
                return iei.a;
        }
    }
}
