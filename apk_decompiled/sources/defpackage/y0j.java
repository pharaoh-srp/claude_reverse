package defpackage;

import com.anthropic.claude.types.strings.MessageId;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class y0j implements c1j {
    public final String a;
    public final String b;
    public final boolean c;
    public final List d;
    public final List e;

    public y0j(String str, String str2, boolean z, List list, List list2) {
        str.getClass();
        str2.getClass();
        list.getClass();
        list2.getClass();
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = list;
        this.e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0j)) {
            return false;
        }
        y0j y0jVar = (y0j) obj;
        return x44.r(this.a, y0jVar.a) && MessageId.m1054equalsimpl0(this.b, y0jVar.b) && this.c == y0jVar.c && x44.r(this.d, y0jVar.d) && x44.r(this.e, y0jVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + kgh.m(fsh.p((MessageId.m1055hashCodeimpl(this.b) + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbR = kgh.r("Assistant(text=", this.a, ", messageId=", MessageId.m1056toStringimpl(this.b), ", isComplete=");
        sbR.append(this.c);
        sbR.append(", citations=");
        sbR.append(this.d);
        sbR.append(", otherSources=");
        return gid.q(sbR, this.e, ")");
    }
}
