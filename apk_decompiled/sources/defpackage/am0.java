package defpackage;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes.dex */
public final class am0 {
    public static final oqb i;
    public final SharedPreferences a;
    public final isc b;
    public final isc d;
    public final isc e;
    public final lsc c = mpk.P(a("last_resumed_at"));
    public final lsc f = mpk.P(a("last_message_sent_at"));
    public final lsc g = mpk.P(a("rate_limit_expires_at"));
    public final lsc h = mpk.P(a("review_prompt_shown_at"));

    static {
        b8 b8Var = new b8(25);
        oqb oqbVar = new oqb();
        b8Var.invoke(oqbVar);
        i = oqbVar;
    }

    public am0(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
        this.b = new isc(sharedPreferences.getInt("creation_count", 0));
        this.d = new isc(sharedPreferences.getInt("chat_list_views", 0));
        this.e = new isc(sharedPreferences.getInt("messages_sent", 0));
    }

    public final Long a(String str) {
        long j = this.a.getLong(str, 0L);
        if (j == 0) {
            return null;
        }
        return Long.valueOf(j);
    }

    public final void b(Long l) {
        this.g.setValue(l);
        SharedPreferences.Editor editorEdit = this.a.edit();
        editorEdit.putLong("rate_limit_expires_at", l.longValue());
        editorEdit.apply();
    }
}
