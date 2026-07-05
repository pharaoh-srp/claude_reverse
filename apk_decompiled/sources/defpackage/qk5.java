package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class qk5 {
    public final fk0 a;

    public qk5(fk0 fk0Var) {
        this.a = fk0Var;
    }

    public static void a(qk5 qk5Var, String str, String str2, String str3, String str4) {
        str.getClass();
        if (kj5.b()) {
            LinkedHashMap linkedHashMapJ0 = sta.j0(new cpc("account_uuid", str), new cpc("is_ant", Boolean.valueOf(qk5Var.a.m())));
            if (str2 != null) {
                linkedHashMapJ0.put("organization_id", str2);
            }
            if (str4 != null) {
                linkedHashMapJ0.put("subscription_level", str4);
            }
            if (str3 == null || !isg.h0(str3, "@anthropic.com", false)) {
                str3 = null;
            }
            kj5.a(null).c(str, str3, linkedHashMapJ0);
        }
    }
}
