package defpackage;

import android.content.SharedPreferences;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class om2 {
    public final SharedPreferences a;

    public om2(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    public final void a(String str) {
        SharedPreferences sharedPreferences = this.a;
        String string = sharedPreferences.getString("seen_message_ids", null);
        ArrayList arrayList = new ArrayList(string == null ? lm6.E : bsg.Y0(string, new String[]{","}, 6));
        if (!arrayList.contains(str)) {
            arrayList.add(str);
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString("seen_message_ids", w44.S0(w44.k1(50, arrayList), ",", null, null, null, 62));
        editorEdit.apply();
    }
}
