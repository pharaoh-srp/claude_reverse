package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class nv2 implements mv2 {
    public final String a;
    public final List b;
    public final List c;

    public nv2(List list, List list2, String str) {
        str.getClass();
        list2.getClass();
        this.a = str;
        this.b = list;
        this.c = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nv2)) {
            return false;
        }
        nv2 nv2Var = (nv2) obj;
        return x44.r(this.a, nv2Var.a) && x44.r(this.b, nv2Var.b) && x44.r(this.c, nv2Var.c);
    }

    @Override // defpackage.mv2
    public final List getAttachments() {
        return this.c;
    }

    @Override // defpackage.mv2
    public final List getFiles() {
        return this.b;
    }

    @Override // defpackage.mv2
    public final String getText() {
        return this.a;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        List list = this.b;
        return this.c.hashCode() + ((iHashCode + (list == null ? 0 : list.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChatInputContentImpl(text=");
        sb.append(this.a);
        sb.append(", files=");
        sb.append(this.b);
        sb.append(", attachments=");
        return gid.q(sb, this.c, ")");
    }
}
