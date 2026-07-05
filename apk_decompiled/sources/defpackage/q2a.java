package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes.dex */
public final class q2a {
    public final SharedPreferences a;

    public q2a(Context context, String str) {
        str.getClass();
        SharedPreferences sharedPreferences = context.getSharedPreferences("legal_assurances_preferences_".concat(str), 0);
        sharedPreferences.getClass();
        this.a = sharedPreferences;
    }
}
