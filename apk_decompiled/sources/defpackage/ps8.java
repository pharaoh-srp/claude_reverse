package defpackage;

import io.sentry.l6;
import io.sentry.n0;
import io.sentry.protocol.e0;
import io.sentry.protocol.z;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ps8 implements l6 {
    @Override // io.sentry.l6
    public final e0 a(e0 e0Var, n0 n0Var) {
        ArrayList<z> arrayList = e0Var.W;
        arrayList.getClass();
        for (z zVar : arrayList) {
            Map map = zVar.O;
            if (map != null) {
                Object obj = map.get("http.query");
                String str = obj instanceof String ? (String) obj : null;
                Object obj2 = map.get("http.fragment");
                String strA = obj2 instanceof String ? (String) obj2 : null;
                if ((str != null && !bsg.I0(str)) || (strA != null && !bsg.I0(strA))) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                    if (str != null && !bsg.I0(str)) {
                        linkedHashMap.put("http.query", v9e.b(str));
                    }
                    if (strA != null && !bsg.I0(strA)) {
                        List list = v9e.a;
                        if (!bsg.I0(strA)) {
                            strA = v9e.a(strA);
                        }
                        linkedHashMap.put("http.fragment", strA);
                    }
                    zVar.O = linkedHashMap;
                }
            }
        }
        return e0Var;
    }
}
