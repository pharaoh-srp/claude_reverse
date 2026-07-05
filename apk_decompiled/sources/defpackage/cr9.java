package defpackage;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class cr9 {
    public final SharedPreferences a;

    public cr9(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    public final List a() {
        int iK0;
        Long lT0;
        String string = this.a.getString("known_terminal_error_conversation_ids", null);
        if (string == null) {
            return lm6.E;
        }
        List<String> listY0 = bsg.Y0(string, new String[]{","}, 6);
        ArrayList arrayList = new ArrayList();
        for (String str : listY0) {
            br9 br9Var = (str.length() == 0 || (iK0 = bsg.K0(str, '|', 0, 6)) <= 0 || (lT0 = isg.t0(str.substring(iK0 + 1))) == null) ? null : new br9(str.substring(0, iK0), lT0.longValue());
            if (br9Var != null) {
                arrayList.add(br9Var);
            }
        }
        return arrayList;
    }

    public final void b(List list) {
        SharedPreferences.Editor editorEdit = this.a.edit();
        if (list.isEmpty()) {
            editorEdit.remove("known_terminal_error_conversation_ids");
        } else {
            editorEdit.putString("known_terminal_error_conversation_ids", w44.S0(list, ",", null, null, new e69(4), 30));
        }
        editorEdit.apply();
    }
}
