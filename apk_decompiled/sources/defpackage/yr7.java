package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class yr7 implements bs7 {
    public final List a;
    public final List b;

    public yr7(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yr7)) {
            return false;
        }
        yr7 yr7Var = (yr7) obj;
        return this.a.equals(yr7Var.a) && this.b.equals(yr7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Lost(activePlaybackUsages=" + this.a + ", activeRecordingSources=" + this.b + ")";
    }
}
