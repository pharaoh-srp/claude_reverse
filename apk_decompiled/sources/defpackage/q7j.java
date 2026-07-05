package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class q7j {
    public static boolean a(String str) {
        bf0 bf0Var = t7j.a;
        Set<cf0> setUnmodifiableSet = Collections.unmodifiableSet(cf0.c);
        HashSet<cf0> hashSet = new HashSet();
        for (cf0 cf0Var : setUnmodifiableSet) {
            if (cf0Var.a.equals(str)) {
                hashSet.add(cf0Var);
            }
        }
        if (hashSet.isEmpty()) {
            pmf.o("Unknown feature ".concat(str));
            return false;
        }
        for (cf0 cf0Var2 : hashSet) {
            if (cf0Var2.a() || cf0Var2.b()) {
                return true;
            }
        }
        return false;
    }

    public static String b(String str, String[] strArr, String[] strArr2) {
        int iMin = Math.min(strArr.length, strArr2.length);
        for (int i = 0; i < iMin; i++) {
            String str2 = strArr[i];
            if ((str == null && str2 == null) ? true : str == null ? false : str.equals(str2)) {
                return strArr2[i];
            }
        }
        return null;
    }
}
