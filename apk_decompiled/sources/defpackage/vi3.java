package defpackage;

import java.util.LinkedHashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class vi3 {
    public static final tqh F;
    public static final LinkedHashMap G;
    public static final vi3 H;
    public static final vi3 I;
    public static final vi3 J;
    public static final vi3 K;
    public static final /* synthetic */ vi3[] L;
    public final String E;

    static {
        vi3 vi3Var = new vi3("DEFAULT_UNKNOWN_ERROR", 0, "default_unknown_error");
        H = vi3Var;
        vi3 vi3Var2 = new vi3("SIGNUPS_DISABLED", 1, "signups_disabled");
        vi3 vi3Var3 = new vi3("REGION_MISSING", 2, "region_missing");
        vi3 vi3Var4 = new vi3("SIGNUPS_DISABLED_IN_REGION", 3, "signups_disabled_in_region");
        vi3 vi3Var5 = new vi3("SIGNIN_TEMPORARILY_DISABLED", 4, "signin_temporarily_disabled");
        vi3 vi3Var6 = new vi3("NO_CONSOLE_ACCOUNT", 5, "no_console_account");
        vi3 vi3Var7 = new vi3("INVALID_RECAPTCHA", 6, "invalid_recaptcha");
        vi3 vi3Var8 = new vi3("ACCOUNT_NEEDS_VERIFICATION", 7, "account_needs_verification");
        vi3 vi3Var9 = new vi3("ACCOUNT_BANNED", 8, "account_banned");
        I = vi3Var9;
        vi3 vi3Var10 = new vi3("INVALID_AUTHORIZATION", 9, "Invalid authorization");
        J = vi3Var10;
        vi3 vi3Var11 = new vi3("ACCOUNT_SESSION_INVALID", 10, "account_session_invalid");
        K = vi3Var11;
        vi3[] vi3VarArr = {vi3Var, vi3Var2, vi3Var3, vi3Var4, vi3Var5, vi3Var6, vi3Var7, vi3Var8, vi3Var9, vi3Var10, vi3Var11, new vi3("EMAIL_AUTH_DISABLED", 11, "email_auth_disabled")};
        L = vi3VarArr;
        gq6 gq6Var = new gq6(vi3VarArr);
        F = new tqh(28);
        int iD0 = tta.d0(x44.y(gq6Var, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iD0 < 16 ? 16 : iD0);
        for (Object obj : gq6Var) {
            linkedHashMap.put(((vi3) obj).E, obj);
        }
        G = linkedHashMap;
    }

    public vi3(String str, int i, String str2) {
        this.E = str2;
    }

    public static vi3 valueOf(String str) {
        return (vi3) Enum.valueOf(vi3.class, str);
    }

    public static vi3[] values() {
        return (vi3[]) L.clone();
    }
}
