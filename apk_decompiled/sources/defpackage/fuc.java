package defpackage;

import java.util.LinkedHashMap;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: loaded from: classes2.dex */
public final class fuc {
    public static final fuc a = new fuc();
    public static final LinkedHashMap b = new LinkedHashMap();

    public static String a(String str) {
        return !bsg.v0(str, '\\') ? str : isg.n0(isg.n0(isg.n0(isg.n0(isg.n0(isg.n0(isg.n0(str, "\\\\", WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, false), "\\n", "\n", false), "\\t", "\t", false), "\\r", "\r", false), "\\\"", "\"", false), "\\/", "/", false), WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, "\\", false);
    }

    public final String b(String str, String str2) {
        str.getClass();
        if (bsg.I0(str)) {
            return null;
        }
        try {
            LinkedHashMap linkedHashMap = b;
            ide ideVar = (ide) linkedHashMap.get(str2);
            if (ideVar == null) {
                ide ideVar2 = new ide(ij0.j("\"", str2, "\"\\s*:\\s*\"((?:[^\"\\\\]|\\\\.)*?)(?:\"|$)"), jde.DOT_MATCHES_ALL);
                synchronized (this) {
                    linkedHashMap.put(str2, ideVar2);
                }
                ideVar = ideVar2;
            }
            ova ovaVarB = ideVar.b(str);
            if (ovaVarB != null) {
                return a((String) ((mva) ovaVarB.a()).get(1));
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
