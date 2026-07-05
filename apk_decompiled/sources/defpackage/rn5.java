package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class rn5 implements m54 {
    public final long a;
    public final long b;

    public rn5(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    @Override // defpackage.m54
    public final long a(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32 ? this.b : this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rn5)) {
            return false;
        }
        rn5 rn5Var = (rn5) obj;
        return d54.c(this.a, rn5Var.a) && d54.c(this.b, rn5Var.b);
    }

    public final int hashCode() {
        int i = d54.i;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DayNightColorProvider(day=");
        y6a.q(this.a, ", night=", sb);
        sb.append((Object) d54.i(this.b));
        sb.append(')');
        return sb.toString();
    }
}
