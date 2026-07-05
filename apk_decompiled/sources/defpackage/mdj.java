package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class mdj {
    public static final int a = 9;
    public static final int b = 6;
    public static final int c = 10;
    public static final int d = 5;
    public static final int e = 15;
    public static final int f = 48;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0068, code lost:
    
        r3.add(r11);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.wvi a(defpackage.qh9 r13) {
        /*
            java.lang.String r0 = "Unable to parse json into type Connectivity"
            r1 = 0
            java.lang.String r2 = "status"
            bh9 r2 = r13.s(r2)     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            java.lang.String r2 = r2.m()     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            r2.getClass()     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            r3 = 3
            int[] r3 = defpackage.sq6.H(r3)     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            int r4 = r3.length     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            r5 = 0
            r6 = r5
        L18:
            java.lang.String r7 = "Array contains no element matching the predicate."
            if (r6 >= r4) goto Laa
            r8 = r3[r6]     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            java.lang.String r9 = defpackage.kgh.c(r8)     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            boolean r9 = r9.equals(r2)     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            if (r9 == 0) goto La6
            java.lang.String r2 = "interfaces"
            bh9 r2 = r13.s(r2)     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            if (r2 == 0) goto L7b
            ig9 r2 = r2.e()     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            java.util.ArrayList r2 = r2.E     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            int r4 = r2.size()     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            r3.<init>(r4)     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
        L43:
            boolean r4 = r2.hasNext()     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            if (r4 == 0) goto L7c
            java.lang.Object r4 = r2.next()     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            bh9 r4 = (defpackage.bh9) r4     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            java.lang.String r4 = r4.m()     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            r4.getClass()     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            rwi[] r6 = defpackage.rwi.values()     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            int r9 = r6.length     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            r10 = r5
        L5c:
            if (r10 >= r9) goto L75
            r11 = r6[r10]     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            java.lang.String r12 = r11.E     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            boolean r12 = r12.equals(r4)     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            if (r12 == 0) goto L72
            r3.add(r11)     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            goto L43
        L6c:
            r13 = move-exception
            goto Lb0
        L6e:
            r13 = move-exception
            goto Lb4
        L70:
            r13 = move-exception
            goto Lb8
        L72:
            int r10 = r10 + 1
            goto L5c
        L75:
            java.util.NoSuchElementException r13 = new java.util.NoSuchElementException     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            r13.<init>(r7)     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            throw r13     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
        L7b:
            r3 = r1
        L7c:
            java.lang.String r2 = "effective_type"
            bh9 r2 = r13.s(r2)     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            if (r2 == 0) goto L8e
            java.lang.String r2 = r2.m()     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            if (r2 == 0) goto L8e
            int r5 = defpackage.owj.h(r2)     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
        L8e:
            java.lang.String r2 = "cellular"
            bh9 r13 = r13.s(r2)     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            if (r13 == 0) goto L9f
            qh9 r13 = r13.g()     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            tvi r13 = defpackage.fwj.c(r13)     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            goto La0
        L9f:
            r13 = r1
        La0:
            wvi r2 = new wvi     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            r2.<init>(r8, r3, r5, r13)     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            return r2
        La6:
            int r6 = r6 + 1
            goto L18
        Laa:
            java.util.NoSuchElementException r13 = new java.util.NoSuchElementException     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            r13.<init>(r7)     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
            throw r13     // Catch: java.lang.NullPointerException -> L6c java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L70
        Lb0:
            defpackage.pmf.j(r0, r13)
            return r1
        Lb4:
            defpackage.pmf.j(r0, r13)
            return r1
        Lb8:
            defpackage.pmf.j(r0, r13)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mdj.a(qh9):wvi");
    }

    public static final void b(StringBuilder sb, String str) {
        if (sb.length() > 0) {
            sb.append('+');
        }
        sb.append(str);
    }
}
