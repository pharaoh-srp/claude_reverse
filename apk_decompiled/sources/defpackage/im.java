package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.api.account.AccountSettings;
import com.anthropic.claude.sessions.types.SessionResource;
import com.anthropic.claude.types.strings.SessionId;
import com.anthropic.claude.types.strings.ToolSearchMode;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class im implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;

    public /* synthetic */ im(int i, Object obj) {
        this.E = i;
        this.F = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [qvb] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, uo9] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v3, types: [qvb] */
    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj = this.F;
        switch (i) {
            case 0:
                SessionResource sessionResourceD = ((vm) obj).d();
                String strM875getIdOcx55TE = sessionResourceD != null ? sessionResourceD.m875getIdOcx55TE() : null;
                if (strM875getIdOcx55TE != null) {
                    return SessionId.m1114boximpl(strM875getIdOcx55TE);
                }
                return null;
            case 1:
                m2i m2iVar = ((a8g) obj).k;
                float f = MTTypesetterKt.kLineSkipLimitMultiplier;
                if (MTTypesetterKt.kLineSkipLimitMultiplier > 0.01f) {
                    f = 1.0f;
                }
                return new d54(d4c.Y(wi6.c.a(f), m2iVar.a, m2iVar.b));
            case 2:
                ArrayList arrayList = ((h18) obj).a;
                ewb ewbVar = new ewb(arrayList.size());
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ?? r5 = (uo9) arrayList.get(i2);
                    Object obj2 = r5.b;
                    int i3 = r5.a;
                    Object xf9Var = obj2 != null ? new xf9(Integer.valueOf(i3), r5.b) : Integer.valueOf(i3);
                    int iF = ewbVar.f(xf9Var);
                    boolean z = iF < 0;
                    Object obj3 = z ? null : ewbVar.c[iF];
                    if (obj3 != null) {
                        if (obj3 instanceof qvb) {
                            ?? r9 = (qvb) obj3;
                            r9.a(r5);
                            r5 = r9;
                        } else {
                            Object[] objArr = wac.a;
                            ?? qvbVar = new qvb(2);
                            qvbVar.a(obj3);
                            qvbVar.a(r5);
                            r5 = qvbVar;
                        }
                    }
                    if (z) {
                        int i4 = ~iF;
                        ewbVar.b[i4] = xf9Var;
                        ewbVar.c[i4] = r5;
                    } else {
                        ewbVar.c[iF] = r5;
                    }
                }
                return new ytb(ewbVar);
            case 3:
                dae daeVar = (dae) obj;
                lf9 lf9Var = (lf9) daeVar.E;
                if (lf9Var != null) {
                    lf9Var.d(null);
                }
                daeVar.E = null;
                return ieiVar;
            case 4:
                ((ua2) obj).resumeWith(ieiVar);
                return ieiVar;
            default:
                AccountSettings settings = ((koi) obj).b.a().getSettings();
                String strM112getTool_search_modeOP4DWQA = settings != null ? settings.m112getTool_search_modeOP4DWQA() : null;
                if (strM112getTool_search_modeOP4DWQA != null) {
                    return ToolSearchMode.m1150boximpl(strM112getTool_search_modeOP4DWQA);
                }
                return null;
        }
    }
}
