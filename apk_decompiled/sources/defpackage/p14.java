package defpackage;

import com.anthropic.claude.code.remote.i;
import com.anthropic.claude.types.strings.SessionId;

/* JADX INFO: loaded from: classes2.dex */
public final class p14 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ i F;

    public /* synthetic */ p14(i iVar, int i) {
        this.E = i;
        this.F = iVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        i iVar = this.F;
        switch (i) {
            case 0:
                String strE0 = iVar.E0();
                if (strE0 != null) {
                    return SessionId.m1114boximpl(strE0);
                }
                return null;
            case 1:
                String strE02 = iVar.E0();
                if (strE02 != null) {
                    return SessionId.m1114boximpl(strE02);
                }
                return null;
            case 2:
                String strE03 = iVar.E0();
                if (strE03 != null) {
                    return SessionId.m1114boximpl(strE03);
                }
                return null;
            default:
                String strE04 = iVar.E0();
                if (strE04 != null) {
                    return SessionId.m1114boximpl(strE04);
                }
                return null;
        }
    }
}
