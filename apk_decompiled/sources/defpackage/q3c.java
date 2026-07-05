package defpackage;

import com.anthropic.claude.analytics.events.CodeEvents$AutoDefaultModeApplied;
import com.anthropic.claude.code.remote.c;
import com.anthropic.claude.sessions.types.PermissionMode;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class q3c implements lp7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Serializable I;
    public final /* synthetic */ Object J;

    public /* synthetic */ q3c(Object obj, Object obj2, Object obj3, Serializable serializable, Object obj4, int i) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
        this.H = obj3;
        this.I = serializable;
        this.J = obj4;
    }

    @Override // defpackage.lp7
    public final Object g(Object obj, tp4 tp4Var) {
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj2 = this.J;
        Object obj3 = this.H;
        Object obj4 = this.F;
        Object obj5 = this.G;
        Serializable serializable = this.I;
        switch (i) {
            case 0:
                if (((Boolean) obj).booleanValue()) {
                    u3c u3cVar = (u3c) obj4;
                    PermissionMode permissionMode = PermissionMode.Auto;
                    u3cVar.getClass();
                    permissionMode.getClass();
                    u3cVar.h.setValue(permissionMode);
                    boolean zBooleanValue = ((Boolean) ((c) obj5).i.i.getValue()).booleanValue();
                    boolean z = !zBooleanValue;
                    if (!zBooleanValue) {
                        ((nwb) obj2).setValue(Boolean.TRUE);
                    }
                    ((qi3) obj3).e(new CodeEvents$AutoDefaultModeApplied((String) serializable, z), CodeEvents$AutoDefaultModeApplied.Companion.serializer());
                }
                break;
            default:
                cpc cpcVar = (cpc) obj;
                dae daeVar = (dae) serializable;
                ec ecVar = (ec) obj5;
                bga bgaVar = (bga) cpcVar.E;
                bga bgaVar2 = (bga) cpcVar.F;
                dae daeVar2 = (dae) obj4;
                if (!x44.r(bgaVar, daeVar2.E)) {
                    ecVar.a(obj3, bgaVar != null ? x44.l(bgaVar) : null);
                    daeVar2.E = bgaVar;
                }
                if (!x44.r(bgaVar2, daeVar.E)) {
                    ecVar.a(obj2, bgaVar2 != null ? x44.l(bgaVar2) : null);
                    daeVar.E = bgaVar2;
                }
                break;
        }
        return ieiVar;
    }
}
