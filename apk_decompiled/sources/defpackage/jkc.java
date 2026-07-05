package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.anthropic.claude.types.strings.AccountId;
import com.anthropic.claude.types.strings.OrganizationId;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class jkc extends iwe {
    public final q7 b;
    public final koi c;
    public final dkc d;
    public final w7 e;
    public final fk0 f;
    public final Context g;
    public final LinkedHashMap h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jkc(q7 q7Var, koi koiVar, dkc dkcVar, w7 w7Var, fk0 fk0Var, Context context, h86 h86Var) {
        super(h86Var);
        context.getClass();
        this.b = q7Var;
        this.c = koiVar;
        this.d = dkcVar;
        this.e = w7Var;
        this.f = fk0Var;
        this.g = context;
        x44.a();
        this.h = new LinkedHashMap();
    }

    public final String O(String str) {
        str.getClass();
        AccountId accountIdM943boximpl = AccountId.m943boximpl(str);
        LinkedHashMap linkedHashMap = this.h;
        Object obj = linkedHashMap.get(accountIdM943boximpl);
        if (obj == null) {
            Context context = this.g;
            context.getClass();
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences("account_prefs".concat(str), 0);
            sharedPreferences.getClass();
            String string = sharedPreferences.getString("selected_org_id", null);
            String strM1066constructorimpl = string != null ? OrganizationId.m1066constructorimpl(string) : null;
            mpk.P(strM1066constructorimpl != null ? OrganizationId.m1065boximpl(strM1066constructorimpl) : null);
            lsc lscVarP = mpk.P(sharedPreferences.getString("display_email", null));
            mpk.P(sharedPreferences.getString("conway_saved_client_id", null));
            new mdg();
            new mdg();
            String str2 = (String) lscVarP.getValue();
            if (str2 != null) {
                str = str2;
            }
            linkedHashMap.put(accountIdM943boximpl, str);
            obj = str;
        }
        return (String) obj;
    }
}
