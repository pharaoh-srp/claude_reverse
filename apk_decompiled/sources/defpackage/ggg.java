package defpackage;

import io.sentry.j7;
import io.sentry.l6;
import io.sentry.n0;
import io.sentry.protocol.e0;
import io.sentry.protocol.z;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ggg implements l6 {
    public final fk0 a;

    static {
        oqb oqbVar = fk0.K;
    }

    public ggg(fk0 fk0Var) {
        this.a = fk0Var;
    }

    @Override // io.sentry.l6
    public final e0 a(e0 e0Var, n0 n0Var) {
        fk0 fk0Var = this.a;
        lsc lscVar = fk0Var.t;
        lsc lscVar2 = fk0Var.A;
        j7 j7VarI = e0Var.F.i();
        if (j7VarI != null) {
            String str = (String) lscVar2.getValue();
            if (str != null) {
                j7VarI.b("subscription_level", str);
            }
            j7VarI.b("has_last_account_id", String.valueOf(fk0Var.e() != null));
            j7VarI.b("has_logged_in_before", String.valueOf(((Boolean) lscVar.getValue()).booleanValue()));
            j7VarI.b("is_ant", String.valueOf(fk0Var.m()));
        }
        ArrayList<z> arrayList = e0Var.W;
        arrayList.getClass();
        for (z zVar : arrayList) {
            Map map = zVar.O;
            LinkedHashMap linkedHashMap = map != null ? new LinkedHashMap(map) : new LinkedHashMap();
            String str2 = (String) lscVar2.getValue();
            if (str2 != null) {
                linkedHashMap.put("subscription_level", str2);
            }
            linkedHashMap.put("has_last_account_id", String.valueOf(fk0Var.e() != null));
            linkedHashMap.put("has_logged_in_before", String.valueOf(((Boolean) lscVar.getValue()).booleanValue()));
            linkedHashMap.put("is_ant", String.valueOf(fk0Var.m()));
            zVar.O = linkedHashMap;
        }
        return e0Var;
    }
}
