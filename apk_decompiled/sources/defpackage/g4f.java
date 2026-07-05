package defpackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class g4f extends h4f {
    public final pva b;
    public final pva c;
    public final pva d;
    public final hz4 e;

    public g4f(String str, String str2, String str3, Map map, d26 d26Var) {
        super(d26Var);
        this.b = vlk.d(str);
        this.c = vlk.d(str2);
        this.d = vlk.d(str3);
        Set<Map.Entry> setEntrySet = map.entrySet();
        HashMap map2 = new HashMap();
        for (Map.Entry entry : setEntrySet) {
            String str4 = (String) entry.getKey();
            String str5 = (String) entry.getValue();
            if (str5.indexOf(42) == -1 && str5.indexOf(63) == -1) {
                map2.put(str4, new pva(0, str5));
            } else {
                map2.put(str4, new pva(1, aqk.m(str5)));
            }
        }
        this.e = new hz4(map2);
    }

    @Override // defpackage.h4f
    public final boolean a(cf5 cf5Var) {
        pva pvaVar = this.b;
        String str = cf5Var.c.N;
        if (pvaVar != null && !pvaVar.b(str)) {
            return false;
        }
        pva pvaVar2 = this.c;
        CharSequence charSequence = cf5Var.c.Q;
        if (pvaVar2 != null && !pvaVar2.a(charSequence)) {
            return false;
        }
        pva pvaVar3 = this.d;
        CharSequence charSequenceC = cf5Var.c.c();
        if (pvaVar3 != null && !pvaVar3.a(charSequenceC)) {
            return false;
        }
        hz4 hz4Var = this.e;
        hz4Var.getClass();
        for (Map.Entry entry : new HashSet(hz4Var.a.entrySet())) {
            Object objB = cf5Var.b(String.valueOf((CharSequence) entry.getKey()));
            if (objB == null) {
                objB = null;
            }
            String str2 = (String) objB;
            if (str2 == null || !((pva) entry.getValue()).b(str2)) {
                return false;
            }
        }
        return true;
    }
}
