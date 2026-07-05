package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class mj implements oj {
    public final String a;
    public final List b;

    public mj(String str, List list) {
        str.getClass();
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mj)) {
            return false;
        }
        mj mjVar = (mj) obj;
        return x44.r(this.a, mjVar.a) && this.b.equals(mjVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return y6a.o("Resolved(toolUseId=", this.a, ", attachments=", this.b, ")");
    }
}
