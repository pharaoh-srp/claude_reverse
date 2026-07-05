package defpackage;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes.dex */
public final class tg7 {
    public final SharedPreferences a;
    public final lsc b;
    public final lsc c;

    public tg7(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
        this.b = mpk.P(sharedPreferences.contains("memory_disabled_for_org") ? Boolean.valueOf(sharedPreferences.getBoolean("memory_disabled_for_org", false)) : null);
        this.c = mpk.P(sharedPreferences.contains("dittos_disabled_for_org") ? Boolean.valueOf(sharedPreferences.getBoolean("dittos_disabled_for_org", false)) : null);
    }
}
