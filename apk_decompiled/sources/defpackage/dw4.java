package defpackage;

import com.anthropic.claude.types.strings.ForkId;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class dw4 {
    public final List a;
    public final String b;
    public final String c;
    public final boolean d;
    public final Map e;

    /* JADX WARN: Illegal instructions before constructor call */
    public dw4(List list, int i) {
        List list2 = (i & 1) != 0 ? lm6.E : list;
        ForkId.Companion.getClass();
        this(ForkId.MAIN, null, list2, nm6.E, false);
    }

    public static dw4 a(dw4 dw4Var, List list, String str, String str2, boolean z, Map map, int i) {
        if ((i & 1) != 0) {
            list = dw4Var.a;
        }
        List list2 = list;
        if ((i & 2) != 0) {
            str = dw4Var.b;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            str2 = dw4Var.c;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            z = dw4Var.d;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            map = dw4Var.e;
        }
        Map map2 = map;
        dw4Var.getClass();
        list2.getClass();
        str3.getClass();
        map2.getClass();
        return new dw4(str3, str4, list2, map2, z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.dw4
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            dw4 r5 = (defpackage.dw4) r5
            java.util.List r1 = r4.a
            java.util.List r3 = r5.a
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.b
            java.lang.String r3 = r5.b
            boolean r1 = com.anthropic.claude.types.strings.ForkId.m1024equalsimpl0(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r5.c
            java.lang.String r3 = r4.c
            if (r3 != 0) goto L2e
            if (r1 != 0) goto L2c
            r1 = r0
            goto L35
        L2c:
            r1 = r2
            goto L35
        L2e:
            if (r1 != 0) goto L31
            goto L2c
        L31:
            boolean r1 = com.anthropic.claude.types.strings.ForkId.m1024equalsimpl0(r3, r1)
        L35:
            if (r1 != 0) goto L38
            return r2
        L38:
            boolean r1 = r4.d
            boolean r3 = r5.d
            if (r1 == r3) goto L3f
            return r2
        L3f:
            java.util.Map r4 = r4.e
            java.util.Map r5 = r5.e
            boolean r4 = defpackage.x44.r(r4, r5)
            if (r4 != 0) goto L4a
            return r2
        L4a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dw4.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iM1025hashCodeimpl = (ForkId.m1025hashCodeimpl(this.b) + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return this.e.hashCode() + fsh.p((iM1025hashCodeimpl + (str == null ? 0 : ForkId.m1025hashCodeimpl(str))) * 31, 31, this.d);
    }

    public final String toString() {
        String strM1027toStringimpl = ForkId.m1027toStringimpl(this.b);
        String str = this.c;
        String strM1027toStringimpl2 = str == null ? "null" : ForkId.m1027toStringimpl(str);
        StringBuilder sb = new StringBuilder("ConwayForksUiState(forks=");
        sb.append(this.a);
        sb.append(", viewingAgentId=");
        sb.append(strM1027toStringimpl);
        sb.append(", expectedAgentId=");
        gid.t(sb, strM1027toStringimpl2, ", creatingFork=", this.d, ", prefixCache=");
        return qy1.i(sb, this.e, ")");
    }

    public dw4(String str, String str2, List list, Map map, boolean z) {
        list.getClass();
        str.getClass();
        this.a = list;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = map;
    }
}
