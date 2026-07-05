package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class jkg {
    static {
        new ww7("java.lang").c(sxb.e("annotation"));
    }

    public static final gh3 a(String str) {
        ww7 ww7Var = ikg.a;
        return new gh3(ikg.a, sxb.e(str));
    }

    public static final gh3 b(String str) {
        ww7 ww7Var = ikg.a;
        return new gh3(ikg.c, sxb.e(str));
    }

    public static final void c(LinkedHashMap linkedHashMap) {
        Set<Map.Entry> setEntrySet = linkedHashMap.entrySet();
        int iD0 = tta.d0(x44.y(setEntrySet, 10));
        if (iD0 < 16) {
            iD0 = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iD0);
        for (Map.Entry entry : setEntrySet) {
            linkedHashMap2.put(entry.getValue(), entry.getKey());
        }
    }

    public static final gh3 d(sxb sxbVar) {
        ww7 ww7Var = ikg.a;
        gh3 gh3Var = ikg.h;
        return new gh3(gh3Var.g(), sxb.e(sxbVar.c().concat(gh3Var.i().c())));
    }

    public static final gh3 e(String str) {
        ww7 ww7Var = ikg.a;
        return new gh3(ikg.b, sxb.e(str));
    }

    public static final gh3 f(gh3 gh3Var) {
        ww7 ww7Var = ikg.a;
        return new gh3(ikg.a, sxb.e("U".concat(gh3Var.i().c())));
    }
}
