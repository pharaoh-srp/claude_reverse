package defpackage;

import android.net.Uri;
import com.anthropic.claude.mcpapps.DomainValidationException;
import com.anthropic.claude.mcpapps.transport.UiResourceCsp;
import com.anthropic.claude.mcpapps.transport.UiResourceMeta;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public abstract class sya {
    public static final List a = x44.W("https://assets.claude.ai");

    public static void a(Uri.Builder builder, UiResourceMeta uiResourceMeta, boolean z) {
        UiResourceCsp csp;
        List<String> resourceDomains;
        UiResourceCsp csp2;
        List<String> connectDomains;
        builder.appendQueryParameter("appVersion", "1.260618.10");
        if (uiResourceMeta != null && (csp2 = uiResourceMeta.getCsp()) != null && (connectDomains = csp2.getConnectDomains()) != null) {
            if (connectDomains.isEmpty()) {
                connectDomains = null;
            }
            if (connectDomains != null) {
                builder.appendQueryParameter("connect-src", w44.S0(connectDomains, " ", null, null, null, 62));
            }
        }
        d8a d8aVarE = x44.E();
        d8aVarE.addAll(a);
        if (uiResourceMeta != null && (csp = uiResourceMeta.getCsp()) != null && (resourceDomains = csp.getResourceDomains()) != null) {
            d8aVarE.addAll(resourceDomains);
        }
        builder.appendQueryParameter("resource-src", w44.S0(w44.H0(x44.v(d8aVarE)), " ", null, null, null, 62));
        if (z) {
            builder.appendQueryParameter("dev", "true");
        }
    }

    public static String b(String str, String str2, boolean z, boolean z2) {
        str.getClass();
        str2.getClass();
        if (!z2) {
            vs8 vs8VarC = null;
            try {
                us8 us8Var = new us8();
                us8Var.h(null, str);
                vs8VarC = us8Var.c();
            } catch (IllegalArgumentException unused) {
            }
            if (vs8VarC != null) {
                ArrayList arrayList = new ArrayList(bsg.Y0(vs8VarC.d, new String[]{"."}, 6));
                if (arrayList.size() >= 2) {
                    if (z) {
                        str2 = "staging-".concat(str2);
                    }
                    arrayList.set(0, str2);
                    us8 us8VarF = vs8VarC.f();
                    us8VarF.f(w44.S0(arrayList, ".", null, null, null, 62));
                    return us8VarF.c().i;
                }
            }
        }
        return str;
    }

    public static String c(String str) throws NoSuchAlgorithmException {
        str.getClass();
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = str.getBytes(dj2.a);
        bytes.getClass();
        byte[] bArrDigest = messageDigest.digest(bytes);
        bArrDigest.getClass();
        return bsg.j1(32, mp0.L0(bArrDigest, "", new a6f(26), 30));
    }

    public static String d(String str, String str2, String str3) {
        if (str == null || str.length() == 0) {
            return c(str3);
        }
        if (str2 == null || str2.length() == 0) {
            throw new DomainValidationException(ij0.j("Cannot validate ui.domain '", str, "': connector URL is missing"));
        }
        String strC = c(str2);
        String strConcat = strC.concat(".claudemcpcontent.com");
        ide ideVar = tya.a;
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        ova ovaVarE = ideVar.e(lowerCase);
        if (ovaVarE == null) {
            throw new DomainValidationException(ij0.l("Invalid ui.domain format: '", str, "' (expected '", strConcat, "')"));
        }
        String str4 = (String) ((mva) ovaVarE.a()).get(1);
        if (x44.r(str4, strC)) {
            return str4;
        }
        throw new DomainValidationException(ij0.l("ui.domain hash mismatch: got '", str, "', expected '", strConcat, "'"));
    }
}
