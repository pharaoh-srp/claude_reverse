package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class aph {
    public static final List a = x44.X("JSON input: ", "Current input: ", "Current output: ");
    public static final ide b = new ide("Failed to parse literal '.*' as (an?) (\\w+) value");

    public static final String a(String str) {
        return grc.u("<redacted: ", str.length(), " chars>");
    }

    public static final cpc b(String str) {
        Object next;
        Integer numValueOf;
        List list = a;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int iIntValue = 0;
            if (isg.q0(str, str2, false)) {
                numValueOf = Integer.valueOf(iIntValue);
            } else {
                int iG0 = bsg.G0(str, "\n".concat(str2), 0, false, 6);
                Integer numValueOf2 = Integer.valueOf(iG0);
                if (iG0 < 0) {
                    numValueOf2 = null;
                }
                if (numValueOf2 != null) {
                    iIntValue = numValueOf2.intValue() + 1;
                    numValueOf = Integer.valueOf(iIntValue);
                } else {
                    numValueOf = null;
                }
            }
            next = numValueOf != null ? new cpc(Integer.valueOf(numValueOf.intValue()), str2) : null;
            if (next != null) {
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                int iIntValue2 = ((Number) ((cpc) next).E).intValue();
                do {
                    Object next2 = it2.next();
                    int iIntValue3 = ((Number) ((cpc) next2).E).intValue();
                    if (iIntValue2 > iIntValue3) {
                        next = next2;
                        iIntValue2 = iIntValue3;
                    }
                } while (it2.hasNext());
            }
        }
        return (cpc) next;
    }

    public static final cpc c(String str) {
        Object next;
        List list = a;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int iG0 = bsg.G0(str, str2, 0, false, 6);
            Integer numValueOf = Integer.valueOf(iG0);
            if (iG0 < 0) {
                numValueOf = null;
            }
            next = numValueOf != null ? new cpc(Integer.valueOf(numValueOf.intValue()), str2) : null;
            if (next != null) {
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                int iIntValue = ((Number) ((cpc) next).E).intValue();
                do {
                    Object next2 = it2.next();
                    int iIntValue2 = ((Number) ((cpc) next2).E).intValue();
                    if (iIntValue > iIntValue2) {
                        next = next2;
                        iIntValue = iIntValue2;
                    }
                } while (it2.hasNext());
            }
        }
        return (cpc) next;
    }

    public static final String d(String str) {
        cpc cpcVarB = b(str);
        if (cpcVarB != null) {
            return g(str, cpcVarB, woh.E);
        }
        String strF = f(str);
        cpc cpcVarC = c(strF);
        return cpcVarC == null ? strF : g(strF, cpcVarC, xoh.E);
    }

    public static final String e(String str) {
        str.getClass();
        cpc cpcVarB = b(str);
        if (cpcVarB != null) {
            return g(str, cpcVarB, yoh.E);
        }
        String strF = f(str);
        cpc cpcVarC = c(strF);
        return cpcVarC == null ? strF : g(strF, cpcVarC, zoh.E);
    }

    public static final String f(String str) {
        if (!bsg.u0(str, "Failed to parse literal '", false)) {
            return str;
        }
        return b.g(str, new x2h(23));
    }

    public static final String g(String str, cpc cpcVar, bz7 bz7Var) {
        int iIntValue = ((Number) cpcVar.E).intValue();
        String str2 = (String) cpcVar.F;
        String strConcat = bsg.T0(str2, ": ").concat(" (redacted): ");
        String strSubstring = str.substring(str2.length() + iIntValue);
        return f(str.substring(0, iIntValue)) + strConcat + bz7Var.invoke(strSubstring);
    }
}
