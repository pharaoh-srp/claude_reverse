package defpackage;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes.dex */
public final class m26 {
    public final SharedPreferences a;

    public m26(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    public final String a() {
        SharedPreferences sharedPreferences = this.a;
        String string = sharedPreferences.getString("device_id", null);
        if (string != null) {
            return string;
        }
        String strI = vb7.i();
        kgh.t(sharedPreferences, "device_id", strI);
        return strI;
    }
}
