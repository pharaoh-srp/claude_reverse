package defpackage;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes.dex */
public final class kjk {
    public final String a;
    public final long b;
    public boolean c;
    public long d;
    public final /* synthetic */ vik e;

    public kjk(vik vikVar, String str, long j) {
        this.e = vikVar;
        dgj.s(str);
        this.a = str;
        this.b = j;
    }

    public final long a() {
        if (!this.c) {
            this.c = true;
            this.d = this.e.T0().getLong(this.a, this.b);
        }
        return this.d;
    }

    public final void b(long j) {
        SharedPreferences.Editor editorEdit = this.e.T0().edit();
        editorEdit.putLong(this.a, j);
        editorEdit.apply();
        this.d = j;
    }
}
