package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class q81 {
    public final String a;
    public final ArrayList b;

    public q81(String str, ArrayList arrayList) {
        if (str == null) {
            mr9.h("Null userAgent");
            throw null;
        }
        this.a = str;
        this.b = arrayList;
    }

    public static q81 a(String str, ArrayList arrayList) {
        return new q81(str, arrayList);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q81)) {
            return false;
        }
        q81 q81Var = (q81) obj;
        return this.a.equals(q81Var.a) && this.b.equals(q81Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.a + ", usedDates=" + this.b + "}";
    }
}
