package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class yu6 extends av6 {
    public final int a;
    public final int b;
    public final /* synthetic */ int c;

    public yu6(int i, int i2, int i3) {
        this.c = i3;
        this.a = i;
        this.b = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0091 A[RETURN] */
    @Override // defpackage.av6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(defpackage.yj6 r9, defpackage.yj6 r10) {
        /*
            r8 = this;
            yj6 r9 = r10.E
            r0 = 0
            if (r9 == 0) goto L92
            boolean r9 = r9 instanceof defpackage.o96
            if (r9 == 0) goto Lb
            goto L92
        Lb:
            int r9 = r8.c
            r1 = 1
            switch(r9) {
                case 0: goto L7a;
                case 1: goto L5c;
                case 2: goto L3c;
                default: goto L11;
            }
        L11:
            yj6 r9 = r10.E
            if (r9 != 0) goto L18
        L15:
            r4 = r0
            goto L80
        L18:
            xj6 r2 = r9.I
            int r2 = r2.size()
            r3 = r0
            r4 = r3
        L20:
            if (r3 >= r2) goto L80
            c5c r5 = r9.m(r3)
            java.lang.String r6 = r5.C()
            z3h r7 = r10.H
            java.lang.String r7 = r7.G
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L36
            int r4 = r4 + 1
        L36:
            if (r5 != r10) goto L39
            goto L80
        L39:
            int r3 = r3 + 1
            goto L20
        L3c:
            yj6 r9 = r10.E
            if (r9 != 0) goto L41
            goto L15
        L41:
            r9 = r10
            r2 = r0
        L43:
            if (r9 == 0) goto L5a
            z3h r3 = r9.H
            java.lang.String r3 = r3.G
            z3h r4 = r10.H
            java.lang.String r4 = r4.G
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L55
            int r2 = r2 + 1
        L55:
            yj6 r9 = r9.y()
            goto L43
        L5a:
            r4 = r2
            goto L80
        L5c:
            yj6 r9 = r10.E
            if (r9 != 0) goto L61
            goto L15
        L61:
            xj6 r2 = r9.I
            int r2 = r2.size()
            if (r2 != 0) goto L6b
            r9 = r0
            goto L73
        L6b:
            java.util.List r9 = r9.W()
            int r9 = r9.size()
        L73:
            int r10 = r10.Z()
            int r9 = r9 - r10
            r4 = r9
            goto L80
        L7a:
            int r9 = r10.Z()
            int r4 = r9 + 1
        L80:
            int r9 = r8.a
            int r8 = r8.b
            if (r9 != 0) goto L89
            if (r4 != r8) goto L92
            goto L91
        L89:
            int r4 = r4 - r8
            int r8 = r4 * r9
            if (r8 < 0) goto L92
            int r4 = r4 % r9
            if (r4 != 0) goto L92
        L91:
            return r1
        L92:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yu6.b(yj6, yj6):boolean");
    }

    public String toString() {
        String str;
        int i = this.b;
        int i2 = this.a;
        String str2 = i2 == 0 ? ":%s(%3$d)" : i == 0 ? ":%s(%2$dn)" : ":%s(%2$dn%3$+d)";
        switch (this.c) {
            case 0:
                str = "nth-child";
                break;
            case 1:
                str = "nth-last-child";
                break;
            case 2:
                str = "nth-last-of-type";
                break;
            default:
                str = "nth-of-type";
                break;
        }
        return String.format(str2, str, Integer.valueOf(i2), Integer.valueOf(i));
    }
}
