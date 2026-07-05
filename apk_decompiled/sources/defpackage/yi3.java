package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class yi3 {
    public static final pyk G;
    public static final Map H;
    public static final yi3 I;
    public static final yi3 J;
    public static final yi3 K;
    public static final yi3 L;
    public static final yi3 M;
    public static final yi3 N;
    public static final /* synthetic */ yi3[] O;
    public final String E;
    public final List F;

    static {
        yi3 yi3Var = new yi3("DEFAULT_UNKNOWN_ERROR", 0, "default_unknown_error");
        I = yi3Var;
        yi3 yi3Var2 = new yi3("INVALID_PHONE_NUMBER", 1, "invalid_phone_number");
        yi3 yi3Var3 = new yi3("UNSUPPORTED_PHONE_NUMBER_GEO", 2, "unsupported_phone_number_geo");
        yi3 yi3Var4 = new yi3("PHONE_NUMBER_TEMP_BLOCKED", 3, "phone_number_temp_blocked");
        yi3 yi3Var5 = new yi3("EXPIRED_VERIFICATION", 4, "expired_verification");
        yi3 yi3Var6 = new yi3("VERIFICATION_FAILED", 5, "verification_failed");
        yi3 yi3Var7 = new yi3("ALREADY_USED", 6, "already_used");
        yi3 yi3Var8 = new yi3("MUST_UPGRADE", 7, "must_upgrade");
        J = yi3Var8;
        yi3 yi3Var9 = new yi3("INVALID_CODE", 8, "invalid_code");
        yi3 yi3Var10 = new yi3("INVALID_EMAIL", 9, "email_address");
        yi3 yi3Var11 = new yi3("EMAIL_ALREADY_REGISTERED", 10, "email_already_registered");
        yi3 yi3Var12 = new yi3("PROMPT_TOO_LONG", 11, "prompt is too long");
        K = yi3Var12;
        yi3 yi3Var13 = new yi3("PURCHASE_TOKEN_ALREADY_USED", 12, "purchase_token_already_used");
        L = yi3Var13;
        yi3 yi3Var14 = new yi3("MAGIC_LINK_ALREADY_USED", 13, "login_link_already_used");
        yi3 yi3Var15 = new yi3("MAGIC_LINK_EXPIRED", 14, "login_link_expired");
        yi3 yi3Var16 = new yi3("MAGIC_LINK_INVALID", 15, "login_link_not_found");
        yi3 yi3Var17 = new yi3(16, x44.W("Exceeded upload limit per chat"), "EXCEEDED_MAX_IMAGE_LIMIT_PER_CHAT", "exceeded_max_image_limit_per_chat");
        M = yi3Var17;
        yi3 yi3Var18 = new yi3("WIGGLE_CONTAINER_IN_USE", 17, "wiggle_container_in_use");
        N = yi3Var18;
        yi3[] yi3VarArr = {yi3Var, yi3Var2, yi3Var3, yi3Var4, yi3Var5, yi3Var6, yi3Var7, yi3Var8, yi3Var9, yi3Var10, yi3Var11, yi3Var12, yi3Var13, yi3Var14, yi3Var15, yi3Var16, yi3Var17, yi3Var18};
        O = yi3VarArr;
        gq6<yi3> gq6Var = new gq6(yi3VarArr);
        G = new pyk(28);
        ArrayList arrayList = new ArrayList();
        for (yi3 yi3Var19 : gq6Var) {
            ArrayList arrayListA1 = w44.a1(x44.W(yi3Var19.E), yi3Var19.F);
            ArrayList arrayList2 = new ArrayList(x44.y(arrayListA1, 10));
            Iterator it = arrayListA1.iterator();
            while (it.hasNext()) {
                arrayList2.add(new cpc((String) it.next(), yi3Var19));
            }
            b54.t0(arrayList, arrayList2);
        }
        H = sta.p0(arrayList);
    }

    public yi3(int i, List list, String str, String str2) {
        this.E = str2;
        this.F = list;
    }

    public static yi3 valueOf(String str) {
        return (yi3) Enum.valueOf(yi3.class, str);
    }

    public static yi3[] values() {
        return (yi3[]) O.clone();
    }

    public /* synthetic */ yi3(String str, int i, String str2) {
        this(i, lm6.E, str, str2);
    }
}
