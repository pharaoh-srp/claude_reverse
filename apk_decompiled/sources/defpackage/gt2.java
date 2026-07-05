package defpackage;

import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class gt2 {
    public final ww2 a;

    public gt2(ww2 ww2Var) {
        ww2Var.getClass();
        this.a = ww2Var;
    }

    public final ww2 a() {
        return this.a;
    }

    public final UUID b() {
        return this.a.j();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gt2) && x44.r(this.a, ((gt2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "File(file=" + this.a + ")";
    }
}
