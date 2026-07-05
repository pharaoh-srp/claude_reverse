package defpackage;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes.dex */
public final class oa3 {
    public final SharedPreferences a;
    public final isc b;

    public oa3(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
        this.b = new isc(sharedPreferences.getInt("completion_notification_count", 0));
    }
}
