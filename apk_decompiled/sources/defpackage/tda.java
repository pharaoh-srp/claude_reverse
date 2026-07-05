package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class tda {
    public static final fvd a;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        r1 = r1.invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        if ((r1 instanceof defpackage.fvd) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
    
        r1 = (defpackage.fvd) r1;
     */
    static {
        /*
            r0 = 0
            java.lang.Class<m4a> r1 = defpackage.m4a.class
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.lang.Throwable -> L29
            r1.getClass()     // Catch: java.lang.Throwable -> L29
            java.lang.String r2 = "androidx.compose.ui.platform.AndroidCompositionLocals_androidKt"
            java.lang.String r3 = "getLocalLifecycleOwner"
            java.lang.Class r1 = r1.loadClass(r2)     // Catch: java.lang.Throwable -> L29
            java.lang.reflect.Method r1 = r1.getMethod(r3, r0)     // Catch: java.lang.Throwable -> L29
            java.lang.annotation.Annotation[] r2 = r1.getAnnotations()     // Catch: java.lang.Throwable -> L29
            int r3 = r2.length     // Catch: java.lang.Throwable -> L29
            r4 = 0
        L1c:
            if (r4 >= r3) goto L2b
            r5 = r2[r4]     // Catch: java.lang.Throwable -> L29
            boolean r5 = r5 instanceof defpackage.lz5     // Catch: java.lang.Throwable -> L29
            if (r5 == 0) goto L26
        L24:
            r1 = r0
            goto L3c
        L26:
            int r4 = r4 + 1
            goto L1c
        L29:
            r1 = move-exception
            goto L36
        L2b:
            java.lang.Object r1 = r1.invoke(r0, r0)     // Catch: java.lang.Throwable -> L29
            boolean r2 = r1 instanceof defpackage.fvd     // Catch: java.lang.Throwable -> L29
            if (r2 == 0) goto L24
            fvd r1 = (defpackage.fvd) r1     // Catch: java.lang.Throwable -> L29
            goto L3c
        L36:
            hre r2 = new hre
            r2.<init>(r1)
            r1 = r2
        L3c:
            boolean r2 = r1 instanceof defpackage.hre
            if (r2 == 0) goto L42
            goto L43
        L42:
            r0 = r1
        L43:
            fvd r0 = (defpackage.fvd) r0
            if (r0 != 0) goto L54
            q59 r0 = new q59
            r1 = 15
            r0.<init>(r1)
            umg r1 = new umg
            r1.<init>(r0)
            r0 = r1
        L54:
            defpackage.tda.a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tda.<clinit>():void");
    }
}
