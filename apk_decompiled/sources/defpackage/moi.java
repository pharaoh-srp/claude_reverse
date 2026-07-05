package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class moi {
    public final String a;
    public final q7 b;

    public moi(String str, q7 q7Var) {
        str.getClass();
        this.a = str;
        this.b = q7Var;
    }

    public final koi a(String str) {
        str.getClass();
        ooi ooiVar = new ooi(this.a, str);
        LinkedHashMap linkedHashMap = noi.a;
        Object koiVar = linkedHashMap.get(ooiVar);
        if (koiVar == null) {
            koiVar = new koi(ooiVar, this.b, new fs5(0));
            linkedHashMap.put(ooiVar, koiVar);
        }
        return (koi) koiVar;
    }
}
