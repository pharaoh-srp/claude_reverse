package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.anthropic.claude.types.strings.AccountId;
import com.anthropic.claude.types.strings.OrganizationId;

/* JADX INFO: loaded from: classes.dex */
public final class doi {
    public final Context a;
    public final String b;

    public doi(Context context, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = context;
        this.b = kgh.p(AccountId.m948toStringimpl(str), "_", OrganizationId.m1070toStringimpl(str2), "_");
    }

    public final SharedPreferences a(String str) {
        SharedPreferences sharedPreferences = this.a.getSharedPreferences("user_prefs_" + this.b + str, 0);
        sharedPreferences.getClass();
        return sharedPreferences;
    }
}
