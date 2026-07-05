package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class ogk {
    public static final AtomicReference b = new AtomicReference();
    public static final AtomicReference c = new AtomicReference();
    public static final AtomicReference d = new AtomicReference();
    public final fkk a;

    public ogk(fkk fkkVar) {
        this.a = fkkVar;
    }

    public static String c(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        dgj.v(atomicReference);
        dgj.o(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            if (Objects.equals(str, strArr[i])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        if (strArr3[i] == null) {
                            strArr3[i] = strArr2[i] + "(" + strArr[i] + ")";
                        }
                        str2 = strArr3[i];
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final String a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!this.a.a()) {
            return bundle.toString();
        }
        StringBuilder sbO = ij0.o("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sbO.length() != 8) {
                sbO.append(", ");
            }
            sbO.append(f(str));
            sbO.append("=");
            Object obj = bundle.get(str);
            sbO.append(obj instanceof Bundle ? e(new Object[]{obj}) : obj instanceof Object[] ? e((Object[]) obj) : obj instanceof ArrayList ? e(((ArrayList) obj).toArray()) : String.valueOf(obj));
        }
        sbO.append("}]");
        return sbO.toString();
    }

    public final String b(String str) {
        if (str == null) {
            return null;
        }
        return !this.a.a() ? str : c(str, v40.m, v40.k, b);
    }

    public final String d(rvj rvjVar) {
        fkk fkkVar = this.a;
        if (!fkkVar.a()) {
            return rvjVar.toString();
        }
        StringBuilder sb = new StringBuilder("origin=");
        sb.append(rvjVar.G);
        sb.append(",name=");
        sb.append(b(rvjVar.E));
        sb.append(",params=");
        avj avjVar = rvjVar.F;
        sb.append(avjVar == null ? null : !fkkVar.a() ? avjVar.E.toString() : a(avjVar.x0()));
        return sb.toString();
    }

    public final String e(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sbO = ij0.o("[");
        for (Object obj : objArr) {
            String strA = obj instanceof Bundle ? a((Bundle) obj) : String.valueOf(obj);
            if (strA != null) {
                if (sbO.length() != 1) {
                    sbO.append(", ");
                }
                sbO.append(strA);
            }
        }
        sbO.append("]");
        return sbO.toString();
    }

    public final String f(String str) {
        if (str == null) {
            return null;
        }
        return !this.a.a() ? str : c(str, sik.d, sik.c, c);
    }

    public final String g(String str) {
        if (str == null) {
            return null;
        }
        return !this.a.a() ? str : str.startsWith("_exp_") ? ij0.j("experiment_id(", str, ")") : c(str, tik.d, tik.c, d);
    }
}
