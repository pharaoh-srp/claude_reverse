package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class fc2 {
    public static final fc2 b = new fc2();
    public final HashMap a;

    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public fc2() {
        /*
            r4 = this;
            r4.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r4.a = r0
            java.lang.String r4 = "DD_AZURE_APP_SERVICES"
            java.lang.String r4 = java.lang.System.getenv(r4)
            java.lang.String r1 = "WEBSITE_SITE_NAME"
            java.lang.String r1 = java.lang.System.getenv(r1)
            java.lang.String r2 = "true"
            boolean r2 = r2.equalsIgnoreCase(r4)
            if (r2 != 0) goto L26
            java.lang.String r2 = "1"
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L29
        L26:
            if (r1 == 0) goto L29
            goto L6c
        L29:
            java.lang.String r4 = "sun.java.command"
            java.lang.String r4 = java.lang.System.getProperty(r4)
            if (r4 == 0) goto L6b
            java.lang.String r1 = ""
            boolean r2 = r4.equals(r1)
            if (r2 == 0) goto L3a
            goto L6b
        L3a:
            java.lang.String r4 = r4.trim()
            java.lang.String r2 = " "
            java.lang.String[] r4 = r4.split(r2)
            int r2 = r4.length
            if (r2 == 0) goto L6b
            r2 = 0
            r3 = r4[r2]
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L51
            goto L6b
        L51:
            r4 = r4[r2]
            java.lang.String r2 = ".jar"
            boolean r3 = r4.endsWith(r2)
            if (r3 == 0) goto L69
            java.io.File r3 = new java.io.File
            r3.<init>(r4)
            java.lang.String r4 = r3.getName()
            java.lang.String r1 = r4.replace(r2, r1)
            goto L6c
        L69:
            r1 = r4
            goto L6c
        L6b:
            r1 = 0
        L6c:
            java.lang.String r4 = "service.name"
            r0.put(r4, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fc2.<init>():void");
    }
}
