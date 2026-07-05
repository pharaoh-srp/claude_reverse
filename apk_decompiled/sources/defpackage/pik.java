package defpackage;

import com.anthropic.claude.api.chat.MoveChatsRequest;
import com.anthropic.claude.api.result.ApiResult;
import com.anthropic.claude.types.strings.ChatId;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class pik {
    public static final ta4 a = new ta4(431065604, false, new jb4(0));
    public static final jf7 b;
    public static final jf7 c;
    public static final jf7[] d;

    static {
        jf7 jf7Var = new jf7("GET_CREDENTIAL", 1L);
        b = jf7Var;
        jf7 jf7Var2 = new jf7("CREDENTIAL_REGISTRY", 1L);
        jf7 jf7Var3 = new jf7("CLEAR_REGISTRY", 2L);
        jf7 jf7Var4 = new jf7("CLEAR_CREATION_OPTIONS", 1L);
        jf7 jf7Var5 = new jf7("CLEAR_CREDENTIAL_STATE", 1L);
        c = jf7Var5;
        d = new jf7[]{jf7Var, jf7Var2, jf7Var3, jf7Var4, jf7Var5, new jf7("CREATE_CREDENTIAL", 3L), new jf7("REGISTER_CREATION_OPTIONS", 1L), new jf7("REGISTER_EXPORT", 1L), new jf7("IMPORT_CREDENTIALS", 1L), new jf7("SIGNAL_CREDENTIAL_STATE", 1L), new jf7("CLEAR_EXPORT", 1L), new jf7("IMPORT_CREDENTIALS_FOR_DEVICE_SETUP", 3L), new jf7("EXPORT_CREDENTIALS_TO_DEVICE_SETUP", 3L), new jf7("GET_CREDENTIAL_TRANSFER_CAPABILITIES", 3L)};
    }

    public static jyi a(String str) {
        str.getClass();
        return new jyi(bsg.k1(str).toString());
    }

    public static p75 b(String str, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        return new p75(str, str2, str3, str4);
    }

    public static pji c(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        return new pji(str, str2, str3);
    }

    public static it6 d(qh9 qh9Var) {
        try {
            bh9 bh9VarS = qh9Var.s("id");
            String strM = bh9VarS != null ? bh9VarS.m() : null;
            bh9 bh9VarS2 = qh9Var.s("name");
            String strM2 = bh9VarS2 != null ? bh9VarS2.m() : null;
            bh9 bh9VarS3 = qh9Var.s("email");
            String strM3 = bh9VarS3 != null ? bh9VarS3.m() : null;
            bh9 bh9VarS4 = qh9Var.s("anonymous_id");
            String strM4 = bh9VarS4 != null ? bh9VarS4.m() : null;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = ((m7a) qh9Var.E.entrySet()).iterator();
            while (((o7a) it).hasNext()) {
                p7a p7aVarA = ((l7a) it).a();
                if (!mp0.o0(p7aVarA.getKey(), it6.f)) {
                    Object key = p7aVarA.getKey();
                    key.getClass();
                    linkedHashMap.put(key, p7aVarA.getValue());
                }
            }
            return new it6(strM, strM2, strM3, strM4, linkedHashMap);
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type Usr", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type Usr", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type Usr", e3);
            return null;
        }
    }

    public static cla e(qh9 qh9Var) {
        try {
            String strM = qh9Var.s("id").m();
            bh9 bh9VarS = qh9Var.s("current_locale");
            String strM2 = bh9VarS != null ? bh9VarS.m() : null;
            strM.getClass();
            return new cla(strM, strM2);
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type Application", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type Application", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type Application", e3);
            return null;
        }
    }

    public static final Object f(dl2 dl2Var, String str, String str2, String str3, kd3 kd3Var) {
        return dl2Var.f(str, new MoveChatsRequest(x44.W(ChatId.m978boximpl(str2)), str3, null), kd3Var);
    }

    public static final void g(fk0 fk0Var, String str, ApiResult apiResult) {
        int i;
        boolean z = apiResult instanceof of0;
        if (z) {
            if (x44.r(str, fk0Var.f())) {
                fk0Var.v(false);
            }
        } else if (!(apiResult instanceof nf0)) {
            wg6.i();
            return;
        }
        if (z) {
            return;
        }
        if (!(apiResult instanceof nf0)) {
            wg6.i();
            return;
        }
        nf0 nf0Var = (nf0) apiResult;
        if (!(nf0Var instanceof lf0) || 400 > (i = ((lf0) nf0Var).a) || i >= 500) {
            return;
        }
        fk0Var.v(false);
    }
}
