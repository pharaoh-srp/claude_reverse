package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class d5f implements c5f {
    public final bz7 E;
    public final ewb F;
    public ewb G;

    public d5f(Map map, bz7 bz7Var) {
        ewb ewbVar;
        this.E = bz7Var;
        if (map == null || map.isEmpty()) {
            ewbVar = null;
        } else {
            ewbVar = new ewb(map.size());
            for (Map.Entry entry : map.entrySet()) {
                ewbVar.m(entry.getKey(), entry.getValue());
            }
        }
        this.F = ewbVar;
    }

    @Override // defpackage.c5f
    public final b5f b(zy7 zy7Var, String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!gb9.B(str.charAt(i))) {
                ewb ewbVar = this.G;
                if (ewbVar == null) {
                    long[] jArr = u6f.a;
                    ewbVar = new ewb();
                    this.G = ewbVar;
                }
                Object objG = ewbVar.g(str);
                if (objG == null) {
                    objG = new ArrayList();
                    ewbVar.m(str, objG);
                }
                ((List) objG).add(zy7Var);
                return new w3c(ewbVar, str, zy7Var, 5);
            }
        }
        sz6.p("Registered key is empty or blank");
        return null;
    }

    @Override // defpackage.c5f
    public final boolean d(Object obj) {
        return ((Boolean) this.E.invoke(obj)).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x008e  */
    @Override // defpackage.c5f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map e() {
        /*
            Method dump skipped, instruction units count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d5f.e():java.util.Map");
    }

    @Override // defpackage.c5f
    public final Object f(String str) {
        ewb ewbVar = this.F;
        List list = ewbVar != null ? (List) ewbVar.k(str) : null;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && ewbVar != null) {
            List listSubList = list.subList(1, list.size());
            int iF = ewbVar.f(str);
            if (iF < 0) {
                iF = ~iF;
            }
            Object[] objArr = ewbVar.c;
            Object obj = objArr[iF];
            ewbVar.b[iF] = str;
            objArr[iF] = listSubList;
        }
        return list.get(0);
    }
}
