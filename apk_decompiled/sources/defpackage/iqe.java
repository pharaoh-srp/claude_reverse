package defpackage;

import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class iqe {
    public static final ThreadLocal a = new ThreadLocal();
    public static final WeakHashMap b = new WeakHashMap(0);
    public static final Object c = new Object();

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
    
        if (r4.c == r9.hashCode()) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.res.ColorStateList a(android.content.res.Resources r7, int r8, android.content.res.Resources.Theme r9) {
        /*
            hqe r0 = new hqe
            r0.<init>(r7, r9)
            java.lang.Object r1 = defpackage.iqe.c
            monitor-enter(r1)
            java.util.WeakHashMap r2 = defpackage.iqe.b     // Catch: java.lang.Throwable -> L34
            java.lang.Object r2 = r2.get(r0)     // Catch: java.lang.Throwable -> L34
            android.util.SparseArray r2 = (android.util.SparseArray) r2     // Catch: java.lang.Throwable -> L34
            r3 = 0
            if (r2 == 0) goto L48
            int r4 = r2.size()     // Catch: java.lang.Throwable -> L34
            if (r4 <= 0) goto L48
            java.lang.Object r4 = r2.get(r8)     // Catch: java.lang.Throwable -> L34
            gqe r4 = (defpackage.gqe) r4     // Catch: java.lang.Throwable -> L34
            if (r4 == 0) goto L48
            android.content.res.Configuration r5 = r4.b     // Catch: java.lang.Throwable -> L34
            android.content.res.Configuration r6 = r7.getConfiguration()     // Catch: java.lang.Throwable -> L34
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> L34
            if (r5 == 0) goto L45
            if (r9 != 0) goto L37
            int r5 = r4.c     // Catch: java.lang.Throwable -> L34
            if (r5 == 0) goto L41
            goto L37
        L34:
            r7 = move-exception
            goto Lb0
        L37:
            if (r9 == 0) goto L45
            int r5 = r4.c     // Catch: java.lang.Throwable -> L34
            int r6 = r9.hashCode()     // Catch: java.lang.Throwable -> L34
            if (r5 != r6) goto L45
        L41:
            android.content.res.ColorStateList r2 = r4.a     // Catch: java.lang.Throwable -> L34
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L34
            goto L4a
        L45:
            r2.remove(r8)     // Catch: java.lang.Throwable -> L34
        L48:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L34
            r2 = r3
        L4a:
            if (r2 == 0) goto L4d
            return r2
        L4d:
            java.lang.ThreadLocal r1 = defpackage.iqe.a
            java.lang.Object r2 = r1.get()
            android.util.TypedValue r2 = (android.util.TypedValue) r2
            if (r2 != 0) goto L5f
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            r1.set(r2)
        L5f:
            r1 = 1
            r7.getValue(r8, r2, r1)
            int r1 = r2.type
            r2 = 28
            if (r1 < r2) goto L6e
            r2 = 31
            if (r1 > r2) goto L6e
            goto L7f
        L6e:
            android.content.res.XmlResourceParser r1 = r7.getXml(r8)
            android.content.res.ColorStateList r3 = defpackage.u54.a(r7, r1, r9)     // Catch: java.lang.Exception -> L77
            goto L7f
        L77:
            r1 = move-exception
            java.lang.String r2 = "ResourcesCompat"
            java.lang.String r4 = "Failed to inflate ColorStateList, leaving it to the framework"
            android.util.Log.w(r2, r4, r1)
        L7f:
            if (r3 == 0) goto Lab
            java.lang.Object r1 = defpackage.iqe.c
            monitor-enter(r1)
            java.util.WeakHashMap r7 = defpackage.iqe.b     // Catch: java.lang.Throwable -> L97
            java.lang.Object r2 = r7.get(r0)     // Catch: java.lang.Throwable -> L97
            android.util.SparseArray r2 = (android.util.SparseArray) r2     // Catch: java.lang.Throwable -> L97
            if (r2 != 0) goto L99
            android.util.SparseArray r2 = new android.util.SparseArray     // Catch: java.lang.Throwable -> L97
            r2.<init>()     // Catch: java.lang.Throwable -> L97
            r7.put(r0, r2)     // Catch: java.lang.Throwable -> L97
            goto L99
        L97:
            r7 = move-exception
            goto La9
        L99:
            gqe r7 = new gqe     // Catch: java.lang.Throwable -> L97
            android.content.res.Resources r0 = r0.a     // Catch: java.lang.Throwable -> L97
            android.content.res.Configuration r0 = r0.getConfiguration()     // Catch: java.lang.Throwable -> L97
            r7.<init>(r3, r0, r9)     // Catch: java.lang.Throwable -> L97
            r2.append(r8, r7)     // Catch: java.lang.Throwable -> L97
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L97
            return r3
        La9:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L97
            throw r7
        Lab:
            android.content.res.ColorStateList r7 = r7.getColorStateList(r8, r9)
            return r7
        Lb0:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L34
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iqe.a(android.content.res.Resources, int, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }
}
