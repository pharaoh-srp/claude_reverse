package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.anthropic.claude.chat.input.draft.DraftMessage;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class fb6 {
    public final Context a;
    public final koi b;
    public final h86 c;
    public final mn5 d;
    public final bg9 e;
    public final SharedPreferences f;

    public fb6(Context context, koi koiVar, doi doiVar, h86 h86Var, mn5 mn5Var, bg9 bg9Var) {
        this.a = context;
        this.b = koiVar;
        this.c = h86Var;
        this.d = mn5Var;
        this.e = bg9Var;
        this.f = doiVar.a("draft_pending_new_chat");
    }

    public static final File a(fb6 fb6Var, String str, String str2) {
        fb6Var.getClass();
        File file = new File(oq5.G(fb6Var.a), "tmp_draft");
        file.mkdirs();
        return new File(file, fb6Var.c(str, str2));
    }

    public final void b(String str) {
        if (str == null) {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        SharedPreferences sharedPreferences = this.f;
        if (sharedPreferences.contains(str)) {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.remove(str);
            editorEdit.apply();
        }
    }

    public final String c(String str, String str2) {
        return str != null ? ij0.j("chat_", str, ".json") : str2 != null ? ij0.j("project_", str2, ".json") : ij0.j("account_", this.b.d, ".json");
    }

    public final Object d(String str, String str2, vp4 vp4Var) {
        return gb9.c0(this.c.b(), new cx(this, str, str2, (tp4) null, 14), vp4Var);
    }

    public final Object e(DraftMessage draftMessage, vp4 vp4Var) {
        return gb9.c0(this.c.b(), new u73(draftMessage, this, null, 18), vp4Var);
    }
}
