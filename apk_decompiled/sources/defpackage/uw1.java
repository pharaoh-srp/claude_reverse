package defpackage;

import com.anthropic.claude.types.strings.MessageId;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class uw1 {
    public final List a;
    public final cw7 b;
    public final String c;

    public uw1(List list, cw7 cw7Var, String str) {
        this.a = list;
        this.b = cw7Var;
        this.c = str;
    }

    public final String a() {
        return this.c;
    }

    public final cw7 b() {
        return this.b;
    }

    public final List c() {
        return this.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            goto L34
        L4:
            boolean r1 = r5 instanceof defpackage.uw1
            r2 = 0
            if (r1 != 0) goto La
            goto L33
        La:
            uw1 r5 = (defpackage.uw1) r5
            java.util.List r1 = r4.a
            java.util.List r3 = r5.a
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L17
            goto L33
        L17:
            cw7 r1 = r4.b
            cw7 r3 = r5.b
            if (r1 == r3) goto L1e
            goto L33
        L1e:
            java.lang.String r5 = r5.c
            java.lang.String r4 = r4.c
            if (r4 != 0) goto L2a
            if (r5 != 0) goto L28
            r4 = r0
            goto L31
        L28:
            r4 = r2
            goto L31
        L2a:
            if (r5 != 0) goto L2d
            goto L28
        L2d:
            boolean r4 = com.anthropic.claude.types.strings.MessageId.m1054equalsimpl0(r4, r5)
        L31:
            if (r4 != 0) goto L34
        L33:
            return r2
        L34:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uw1.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return iHashCode + (str == null ? 0 : MessageId.m1055hashCodeimpl(str));
    }

    public final String toString() {
        String str = this.c;
        String strM1056toStringimpl = str == null ? "null" : MessageId.m1056toStringimpl(str);
        StringBuilder sb = new StringBuilder("PriorBranch(messages=");
        sb.append(this.a);
        sb.append(", forkedAt=");
        sb.append(this.b);
        sb.append(", forkParentUuid=");
        return ij0.m(sb, strM1056toStringimpl, ")");
    }
}
