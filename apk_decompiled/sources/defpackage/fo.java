package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class fo implements so {
    public final String a;
    public final List b;

    public fo(String str, List list) {
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fo)) {
            return false;
        }
        fo foVar = (fo) obj;
        return x44.r(this.a, foVar.a) && x44.r(this.b, foVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return y6a.o("AttachmentsResolved(toolUseId=", this.a, ", attachments=", this.b, ")");
    }
}
