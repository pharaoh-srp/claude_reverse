package defpackage;

import android.app.PendingIntent;

/* JADX INFO: loaded from: classes3.dex */
public final class lm0 {
    public final int a;
    public final Integer b;
    public final PendingIntent c;
    public final PendingIntent d;
    public boolean e = false;

    public lm0(int i, Integer num, long j, long j2, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4) {
        this.a = i;
        this.b = num;
        this.c = pendingIntent;
        this.d = pendingIntent2;
    }

    public final Integer a() {
        return this.b;
    }

    public final boolean b() {
        return e(t5l.a(0).a()) != null;
    }

    public final boolean c(t5l t5lVar) {
        return e(t5lVar) != null;
    }

    public final int d() {
        return this.a;
    }

    public final PendingIntent e(t5l t5lVar) {
        PendingIntent pendingIntent;
        int i = t5lVar.a;
        if (i == 0) {
            PendingIntent pendingIntent2 = this.d;
            if (pendingIntent2 != null) {
                return pendingIntent2;
            }
            return null;
        }
        if (i != 1 || (pendingIntent = this.c) == null) {
            return null;
        }
        return pendingIntent;
    }

    public final void f() {
        this.e = true;
    }

    public final boolean g() {
        return this.e;
    }
}
