package io.sentry.util;

import defpackage.vb7;
import io.sentry.a1;
import io.sentry.android.core.w0;
import io.sentry.n0;
import io.sentry.p2;
import io.sentry.t5;
import java.io.Serializable;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    public static n0 a(Object obj) {
        n0 n0Var = new n0();
        n0Var.d("sentry:typeCheckHint", obj);
        return n0Var;
    }

    public static io.sentry.internal.debugmeta.c b(byte[] bArr, String str, String str2, a1 a1Var) {
        if (bArr.length == 0) {
            return null;
        }
        if (str != null) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            if (lowerCase.contains("image/") || lowerCase.contains("video/") || lowerCase.contains("audio/") || lowerCase.contains("application/octet-stream") || lowerCase.contains("application/pdf") || lowerCase.contains("application/zip") || lowerCase.contains("application/gzip")) {
                return new io.sentry.internal.debugmeta.c("[Binary data, " + bArr.length + " bytes, type: " + str + "]", 5, (Object) null);
            }
        }
        try {
            return h(new String(bArr, 0, Math.min(bArr.length, 153600), str2), str, bArr.length > 153600, a1Var);
        } catch (UnsupportedEncodingException e) {
            a1Var.h(t5.WARNING, "Failed to decode bytes: " + e.getMessage(), new Object[0]);
            return new io.sentry.internal.debugmeta.c(vb7.l(bArr.length, " bytes]", new StringBuilder("[Failed to decode bytes, ")), 5, Collections.singletonList(io.sentry.util.network.a.BODY_PARSE_ERROR));
        }
    }

    public static io.sentry.hints.e c(n0 n0Var) {
        return (io.sentry.hints.e) n0Var.c(io.sentry.hints.e.class, "sentry:eventDropReason");
    }

    public static Object d(n0 n0Var) {
        return n0Var.b("sentry:typeCheckHint");
    }

    public static boolean e(n0 n0Var, Class cls) {
        return cls.isInstance(n0Var.b("sentry:typeCheckHint"));
    }

    public static boolean f(n0 n0Var) {
        return Boolean.TRUE.equals(n0Var.c(Boolean.class, "sentry:isFromHybridSdk"));
    }

    public static void g(Class cls, Object obj, a1 a1Var) {
        a1Var.h(t5.DEBUG, "%s is not %s", obj != null ? obj.getClass().getCanonicalName() : "Hint", cls.getCanonicalName());
    }

    public static io.sentry.internal.debugmeta.c h(String str, String str2, boolean z, a1 a1Var) {
        if (str.isEmpty()) {
            return null;
        }
        if (str2 != null) {
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            if (lowerCase.contains("application/x-www-form-urlencoded")) {
                try {
                    HashMap map = new HashMap();
                    for (String str3 : str.split("&", -1)) {
                        int iIndexOf = str3.indexOf("=");
                        if (iIndexOf > 0) {
                            String strDecode = URLDecoder.decode(str3.substring(0, iIndexOf), "UTF-8");
                            String strDecode2 = iIndexOf < str3.length() + (-1) ? URLDecoder.decode(str3.substring(iIndexOf + 1), "UTF-8") : "";
                            if (map.containsKey(strDecode)) {
                                Object obj = map.get(strDecode);
                                if (obj instanceof List) {
                                    ((List) obj).add(strDecode2);
                                } else {
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add((String) obj);
                                    arrayList.add(strDecode2);
                                    map.put(strDecode, arrayList);
                                }
                            } else {
                                map.put(strDecode, strDecode2);
                            }
                        }
                    }
                    return new io.sentry.internal.debugmeta.c(map, 5, z ? Collections.singletonList(io.sentry.util.network.a.TEXT_TRUNCATED) : null);
                } catch (UnsupportedEncodingException e) {
                    a1Var.h(t5.WARNING, "Failed to parse form data: " + e.getMessage(), new Object[0]);
                    return new io.sentry.internal.debugmeta.c((Object) null, 5, Collections.singletonList(io.sentry.util.network.a.BODY_PARSE_ERROR));
                }
            }
            if (lowerCase.contains("application/json")) {
                try {
                    io.sentry.vendor.gson.stream.a aVar = new io.sentry.vendor.gson.stream.a(new StringReader(str));
                    try {
                        p2 p2Var = new p2(5);
                        io.sentry.util.network.c cVar = (io.sentry.util.network.c) p2Var.b;
                        Serializable serializableE = p2Var.e(aVar, 0);
                        if (serializableE != null || z || cVar.b || cVar.a) {
                            io.sentry.internal.debugmeta.c cVar2 = new io.sentry.internal.debugmeta.c(serializableE, 5, (z || cVar.a) ? Collections.singletonList(io.sentry.util.network.a.JSON_TRUNCATED) : cVar.b ? Collections.singletonList(io.sentry.util.network.a.INVALID_JSON) : null);
                            aVar.close();
                            return cVar2;
                        }
                        io.sentry.internal.debugmeta.c cVar3 = new io.sentry.internal.debugmeta.c((Object) null, 5, (Object) null);
                        aVar.close();
                        return cVar3;
                    } finally {
                    }
                } catch (Exception e2) {
                    a1Var.h(t5.WARNING, "Failed to parse JSON: " + e2.getMessage(), new Object[0]);
                    return new io.sentry.internal.debugmeta.c((Object) null, 5, Collections.singletonList(io.sentry.util.network.a.INVALID_JSON));
                }
            }
        }
        return new io.sentry.internal.debugmeta.c(str, 5, z ? Collections.singletonList(io.sentry.util.network.a.TEXT_TRUNCATED) : null);
    }

    public static void i(n0 n0Var, Class cls, b bVar) {
        Object objB = n0Var.b("sentry:typeCheckHint");
        if (!cls.isInstance(n0Var.b("sentry:typeCheckHint")) || objB == null) {
            return;
        }
        bVar.accept(objB);
    }

    public static void j(n0 n0Var, Class cls, a1 a1Var, b bVar) {
        Object objB = n0Var.b("sentry:typeCheckHint");
        if (!cls.isInstance(n0Var.b("sentry:typeCheckHint")) || objB == null) {
            g(cls, objB, a1Var);
        } else {
            bVar.accept(objB);
        }
    }

    public static void k(n0 n0Var, io.sentry.hints.e eVar) {
        n0Var.d("sentry:eventDropReason", eVar);
    }

    public static void l(n0 n0Var, String str) {
        if (str.startsWith("sentry.javascript") || str.startsWith("sentry.dart") || str.startsWith("sentry.dotnet")) {
            n0Var.d("sentry:isFromHybridSdk", Boolean.TRUE);
        }
    }

    public static boolean m(n0 n0Var) {
        return !(io.sentry.hints.d.class.isInstance(n0Var.b("sentry:typeCheckHint")) || io.sentry.hints.b.class.isInstance(n0Var.b("sentry:typeCheckHint"))) || w0.class.isInstance(n0Var.b("sentry:typeCheckHint"));
    }
}
