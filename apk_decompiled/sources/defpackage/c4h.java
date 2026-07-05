package defpackage;

import androidx.health.platform.client.proto.g;
import java.net.URI;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class c4h {
    public static final adi h = adi.a("404");
    public final tk5 a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final HashSet e;
    public final boolean f;
    public final boolean g;

    public c4h(tk5 tk5Var) {
        vf4 vf4Var = vf4.O1;
        boolean z = vf4Var.f;
        String str = (String) fc2.b.a.get("service.name");
        HashSet hashSet = vf4Var.S;
        this.b = z;
        this.d = str;
        this.e = hashSet;
        this.a = tk5Var;
        this.c = hashSet.contains("servlet.context");
        boolean[] zArr = (boolean[]) tk5Var.F;
        boolean z2 = zArr[1];
        this.f = z2 && zArr[2] && zArr[3];
        this.g = z2;
    }

    public static boolean a(Object obj) {
        if (Boolean.TRUE.equals(obj) || "1".equals(obj)) {
            return true;
        }
        return !Boolean.FALSE.equals(obj) && Boolean.parseBoolean(String.valueOf(obj));
    }

    public static void c(df5 df5Var, String str, Object obj) {
        URI uriG = fhk.g(obj.toString());
        String path = uriG == null ? null : uriG.getPath();
        if (path == null) {
            df5Var.x(ks8.d, (byte) 1);
            return;
        }
        dpc dpcVarA = "client".equals(df5Var.M.get("span.kind")) ? ks8.a(str, path) : ks8.b(str, path);
        Object obj2 = dpcVarA.a;
        if (obj2 != null) {
            df5Var.x((CharSequence) obj2, ((Byte) dpcVarA.b).byteValue());
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Number] */
    /* JADX WARN: Type inference failed for: r20v0, types: [df5] */
    public final boolean b(df5 df5Var, String str, Object obj) {
        byte b;
        str.getClass();
        switch (str.hashCode()) {
            case -1600255323:
                b = !str.equals("_dd1.sr.eausr") ? (byte) -1 : (byte) 0;
                break;
            case -1541421527:
                b = !str.equals("peer.service") ? (byte) -1 : (byte) 1;
                break;
            case -688795810:
                b = !str.equals("span.type") ? (byte) -1 : (byte) 2;
                break;
            case -620406091:
                b = !str.equals("_dd.measured") ? (byte) -1 : (byte) 3;
                break;
            case -356226025:
                b = !str.equals("manual.drop") ? (byte) -1 : (byte) 4;
                break;
            case -356030291:
                b = !str.equals("manual.keep") ? (byte) -1 : (byte) 5;
                break;
            case -134204663:
                b = !str.equals("http.url") ? (byte) -1 : (byte) 6;
                break;
            case 96784904:
                b = !str.equals("error") ? (byte) -1 : (byte) 7;
                break;
            case 282739975:
                b = !str.equals("http.method") ? (byte) -1 : (byte) 8;
                break;
            case 314627620:
                b = !str.equals("service.name") ? (byte) -1 : (byte) 9;
                break;
            case 934168683:
                b = !str.equals("resource.name") ? (byte) -1 : (byte) 10;
                break;
            case 960885172:
                b = !str.equals("http.status_code") ? (byte) -1 : (byte) 11;
                break;
            case 1775928319:
                b = !str.equals("db.statement") ? (byte) -1 : (byte) 12;
                break;
            case 1798451925:
                b = !str.equals("_dd.origin") ? (byte) -1 : (byte) 13;
                break;
            case 1984153269:
                b = !str.equals("service") ? (byte) -1 : (byte) 14;
                break;
            case 2146501382:
                b = !str.equals("servlet.context") ? (byte) -1 : (byte) 15;
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                if (obj instanceof Number) {
                    objValueOf = (Number) obj;
                } else if (obj instanceof String) {
                    try {
                        objValueOf = Double.valueOf(Double.parseDouble((String) obj));
                        break;
                    } catch (NumberFormatException unused) {
                    }
                }
                ?? r0 = objValueOf;
                if (r0 != 0) {
                    df5Var.j(r0, "_dd1.sr.eausr");
                }
                return true;
            case 1:
                df5Var.P("_dd.peer.service.source", "peer.service");
                if (!((boolean[]) this.a.F)[sq6.F(8)]) {
                    return false;
                }
                df5Var.K(String.valueOf(obj));
                return true;
            case 2:
                if (obj instanceof CharSequence) {
                    return true;
                }
                String.valueOf(obj);
                return true;
            case 3:
                if (((obj instanceof Number) && ((Number) obj).intValue() > 0) || a(obj)) {
                    if (true != df5Var.T) {
                        df5Var.T = true;
                        return true;
                    }
                    return true;
                }
                return false;
            case 4:
                if (((boolean[]) this.a.F)[sq6.F(6)]) {
                    if (a(obj)) {
                        df5Var.H(-1, 4);
                        return true;
                    }
                    return true;
                }
                return false;
            case 5:
                if (a(obj)) {
                    df5 df5VarD = df5Var.d();
                    if (df5.b0.getAndSet(df5VarD, 2) == -128) {
                        df5VarD.X.d(2, 4);
                        return true;
                    }
                    return true;
                }
                return false;
            case 6:
            case 8:
                if (this.g) {
                    if ("http.method".equals(str)) {
                        Object obj2 = df5Var.M.get("http.url");
                        if (obj2 != null) {
                            c(df5Var, obj.toString(), obj2);
                            return false;
                        }
                    } else if ("http.url".equals(str)) {
                        Object obj3 = df5Var.M.get("http.method");
                        c(df5Var, obj3 != null ? obj3.toString() : null, obj);
                        return false;
                    }
                }
                return false;
            case 7:
                boolean zA = a(obj);
                if (df5Var.S <= 0) {
                    df5Var.R = zA;
                    df5Var.S = (byte) 0;
                    return true;
                }
                return true;
            case 9:
            case 14:
                if (!((boolean[]) this.a.F)[sq6.F(9)]) {
                    return false;
                }
                df5Var.K(String.valueOf(obj));
                return true;
            case 10:
                if (((boolean[]) this.a.F)[0] && obj != null) {
                    if (obj instanceof CharSequence) {
                        df5Var.x((CharSequence) obj, (byte) 5);
                        return true;
                    }
                    df5Var.x(String.valueOf(obj), (byte) 5);
                    return true;
                }
                return false;
            case 11:
                if (!(obj instanceof Number)) {
                    try {
                        df5Var.L = Short.parseShort(String.valueOf(obj));
                        if (this.f && df5Var.L == 404) {
                            df5Var.x(h, (byte) 2);
                            return true;
                        }
                    } catch (Throwable unused2) {
                    }
                    break;
                } else {
                    df5Var.L = ((Number) obj).shortValue();
                    if (this.f && df5Var.L == 404) {
                        df5Var.x(h, (byte) 2);
                        return true;
                    }
                }
                return true;
            case 12:
                if (obj instanceof CharSequence) {
                    CharSequence charSequence = (CharSequence) obj;
                    if (charSequence.length() > 0) {
                        df5Var.x(charSequence, (byte) 5);
                        return true;
                    }
                }
                return true;
            case 13:
                if (obj instanceof CharSequence) {
                    df5Var.n((CharSequence) obj);
                    return true;
                }
                df5Var.n(String.valueOf(obj));
                return true;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                if (this.c || (!this.b && ((boolean[]) this.a.F)[9] && (df5Var.N.isEmpty() || df5Var.N.equals(this.d) || df5Var.N.equals("unnamed-java-app")))) {
                    String strTrim = String.valueOf(obj).trim();
                    if (!strTrim.isEmpty()) {
                        if (strTrim.equals("/")) {
                            df5Var.K(vf4.O1.g);
                            return false;
                        }
                        if (strTrim.charAt(0) != '/') {
                            df5Var.K(strTrim);
                            return false;
                        }
                        if (strTrim.length() > 1) {
                            df5Var.K(strTrim.substring(1));
                            return false;
                        }
                    }
                }
                return false;
            default:
                if (this.e.contains(str)) {
                    df5Var.K(String.valueOf(obj));
                    return true;
                }
                return false;
        }
    }
}
