package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;
import com.squareup.wire.internal.MathMethodsKt;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class yj5 implements is8 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ yj5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public static void b(StringBuilder sb, String str, String str2, int i) {
        if (str2.length() + str.length() + sb.length() + 2 <= i) {
            sb.append(';');
            sb.append(str);
            sb.append('=');
            sb.append(str2);
        }
    }

    @Override // defpackage.is8
    public final void a(df5 df5Var, jie jieVar, cd cdVar) {
        String strA;
        switch (this.a) {
            case 0:
                cdVar.k(jieVar, "x-datadog-trace-id", df5Var.G.toString());
                cdVar.k(jieVar, "x-datadog-parent-id", Long.toUnsignedString(df5Var.H));
                if (df5Var.f()) {
                    cdVar.k(jieVar, "x-datadog-sampling-priority", String.valueOf(df5Var.d().U));
                }
                CharSequence charSequence = df5Var.d().V;
                if (charSequence != null) {
                    cdVar.k(jieVar, "x-datadog-origin", charSequence.toString());
                }
                long j = df5Var.E.p;
                if (j > 0) {
                    cdVar.k(jieVar, "ot-baggage-t0", Long.toString(j / 1000000));
                }
                for (Map.Entry entry : df5Var.F.entrySet()) {
                    String str = (String) ((Map) this.b).get(entry.getKey());
                    if (str == null) {
                        str = "ot-baggage-" + ((String) entry.getKey());
                    }
                    String strEncode = (String) entry.getValue();
                    try {
                        strEncode = URLEncoder.encode(strEncode, "UTF-8");
                    } catch (UnsupportedEncodingException unused) {
                    }
                    cdVar.k(jieVar, str, strEncode.replace("+", "%20"));
                }
                String strC = df5Var.d().X.c(brd.E);
                if (strC != null) {
                    cdVar.k(jieVar, "x-datadog-tags", strC);
                }
                uc1 uc1VarH = d4c.H(df5Var);
                if (!uc1VarH.a.isEmpty()) {
                    cdVar.k(jieVar, "baggage", uc1VarH.toString());
                }
                break;
            case 1:
                try {
                    Iterator it = df5Var.F.entrySet().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Map.Entry entry2 = (Map.Entry) it.next();
                            if ("Haystack-Trace-ID".equalsIgnoreCase((String) entry2.getKey())) {
                                strA = (String) entry2.getValue();
                            }
                        } else {
                            strA = null;
                        }
                    }
                    if (strA == null || !ef5.a(oq5.b(strA)).equals(df5Var.G)) {
                        strA = oq5.a(df5Var.G.e());
                    }
                    cdVar.k(jieVar, "Trace-ID", strA);
                    df5Var.P("Haystack-Trace-ID", strA);
                    String string = df5Var.G.toString();
                    try {
                        string = URLEncoder.encode(string, "UTF-8");
                        break;
                    } catch (UnsupportedEncodingException unused2) {
                    }
                    cdVar.k(jieVar, "Baggage-Datadog-Trace-Id", string);
                    cdVar.k(jieVar, "Span-ID", oq5.a(df5Var.H));
                    String unsignedString = Long.toUnsignedString(df5Var.H);
                    try {
                        unsignedString = URLEncoder.encode(unsignedString, "UTF-8");
                        break;
                    } catch (UnsupportedEncodingException unused3) {
                    }
                    cdVar.k(jieVar, "Baggage-Datadog-Span-Id", unsignedString);
                    cdVar.k(jieVar, "Parent-ID", oq5.a(0L));
                    String unsignedString2 = Long.toUnsignedString(0L);
                    try {
                        unsignedString2 = URLEncoder.encode(unsignedString2, "UTF-8");
                        break;
                    } catch (UnsupportedEncodingException unused4) {
                    }
                    cdVar.k(jieVar, "Baggage-Datadog-Parent-Id", unsignedString2);
                    for (Map.Entry entry3 : df5Var.F.entrySet()) {
                        String str2 = (String) ((Map) this.b).get(entry3.getKey());
                        if (str2 == null) {
                            str2 = "Baggage-" + ((String) entry3.getKey());
                        }
                        String strEncode2 = (String) entry3.getValue();
                        try {
                            strEncode2 = URLEncoder.encode(strEncode2, "UTF-8");
                        } catch (UnsupportedEncodingException unused5) {
                        }
                        cdVar.k(jieVar, str2, strEncode2.replace("+", "%20"));
                        break;
                    }
                } catch (NumberFormatException unused6) {
                    return;
                }
                break;
            case 2:
                StringBuilder sb = new StringBuilder(55);
                sb.append("00-");
                sb.append(df5Var.G.b());
                sb.append("-");
                sb.append(j8.j0(16, df5Var.H));
                sb.append(df5Var.d().U > 0 ? "-01" : "-00");
                cdVar.k(jieVar, "traceparent", sb.toString());
                String strC2 = df5Var.d().X.c(brd.F);
                if (strC2 != null && !strC2.isEmpty()) {
                    cdVar.k(jieVar, "tracestate", strC2);
                }
                long j2 = df5Var.E.p;
                if (j2 > 0) {
                    cdVar.k(jieVar, "ot-baggage-t0", Long.toString(j2 / 1000000));
                }
                for (Map.Entry entry4 : df5Var.F.entrySet()) {
                    String str3 = (String) ((Map) this.b).get(entry4.getKey());
                    if (str3 == null) {
                        str3 = "ot-baggage-" + ((String) entry4.getKey());
                    }
                    String strEncode3 = (String) entry4.getValue();
                    try {
                        strEncode3 = URLEncoder.encode(strEncode3, "UTF-8");
                    } catch (UnsupportedEncodingException unused7) {
                    }
                    cdVar.k(jieVar, str3, strEncode3.replace("+", "%20"));
                }
                uc1 uc1VarH2 = d4c.H(df5Var);
                if (!uc1VarH2.a.isEmpty()) {
                    cdVar.k(jieVar, "baggage", uc1VarH2.toString());
                }
                break;
            case 3:
                long j3 = df5Var.E.p;
                StringBuilder sbO = ij0.o("Root=1-");
                sbO.append(String.format("%08x", Long.valueOf(j3 > 0 ? j3 / MathMethodsKt.NANOS_PER_SECOND : System.currentTimeMillis() / 1000)));
                sbO.append("-00000000");
                sbO.append(df5Var.G.c());
                sbO.append(";Parent=");
                sbO.append(j8.j0(16, df5Var.H));
                if (df5Var.f()) {
                    sbO.append(";Sampled=");
                    sbO.append(df5Var.d().U > 0 ? '1' : '0');
                }
                int length = sbO.length() + FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                CharSequence charSequence2 = df5Var.d().V;
                if (charSequence2 != null) {
                    b(sbO, "_dd.origin", charSequence2.toString(), length);
                }
                if (j3 > 0) {
                    b(sbO, "t0", Long.toString(j3 / 1000000), length);
                }
                for (Map.Entry entry5 : df5Var.F.entrySet()) {
                    String str4 = (String) ((Map) this.b).get(entry5.getKey());
                    if (str4 == null) {
                        str4 = (String) entry5.getKey();
                    }
                    if (!"Root".equals(str4) && !"Parent".equals(str4) && !"Sampled".equals(str4) && !"Self".equals(str4)) {
                        String strEncode4 = (String) entry5.getValue();
                        try {
                            strEncode4 = URLEncoder.encode(strEncode4, "UTF-8");
                            break;
                        } catch (UnsupportedEncodingException unused8) {
                        }
                        b(sbO, str4, strEncode4, length);
                    }
                }
                cdVar.k(jieVar, "X-Amzn-Trace-Id", sbO.toString());
                break;
            default:
                String str5 = (String) df5Var.e().get("session_id");
                if (str5 != null) {
                    umc umcVar = df5Var.d().X;
                    if (!Objects.equals(umcVar.i, str5)) {
                        umcVar.i = str5;
                        g4h.d(umcVar.i);
                        umcVar.a(brd.E);
                        umcVar.a(brd.F);
                    }
                }
                Iterator it2 = ((ArrayList) this.b).iterator();
                while (it2.hasNext()) {
                    ((is8) it2.next()).a(df5Var, jieVar, cdVar);
                }
                break;
        }
    }
}
