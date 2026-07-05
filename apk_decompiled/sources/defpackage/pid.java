package defpackage;

import android.content.pm.PackageInfo;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class pid {
    public static final vz8 a = new vz8(25);

    public static void a(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(android.content.Context r16, java.util.concurrent.Executor r17, defpackage.oid r18, boolean r19) {
        /*
            r1 = r16
            r5 = r18
            android.content.Context r0 = r1.getApplicationContext()
            java.lang.String r2 = r0.getPackageName()
            android.content.pm.ApplicationInfo r3 = r0.getApplicationInfo()
            android.content.res.AssetManager r4 = r0.getAssets()
            java.io.File r0 = new java.io.File
            java.lang.String r3 = r3.sourceDir
            r0.<init>(r3)
            java.lang.String r6 = r0.getName()
            android.content.pm.PackageManager r0 = r1.getPackageManager()
            r8 = 0
            android.content.pm.PackageInfo r9 = r0.getPackageInfo(r2, r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Laf
            java.io.File r10 = r1.getFilesDir()
            r11 = 1
            if (r19 != 0) goto L75
            java.io.File r0 = new java.io.File
            java.lang.String r3 = "profileinstaller_profileWrittenFor_lastUpdateTime.dat"
            r0.<init>(r10, r3)
            boolean r3 = r0.exists()
            if (r3 != 0) goto L3e
        L3c:
            r0 = r8
            goto L6b
        L3e:
            java.io.DataInputStream r3 = new java.io.DataInputStream     // Catch: java.io.IOException -> L3c
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch: java.io.IOException -> L3c
            r7.<init>(r0)     // Catch: java.io.IOException -> L3c
            r3.<init>(r7)     // Catch: java.io.IOException -> L3c
            long r12 = r3.readLong()     // Catch: java.lang.Throwable -> L60
            r3.close()     // Catch: java.io.IOException -> L3c
            long r14 = r9.lastUpdateTime
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 != 0) goto L57
            r0 = r11
            goto L58
        L57:
            r0 = r8
        L58:
            if (r0 == 0) goto L6b
            r3 = 2
            r7 = 0
            r5.n(r3, r7)
            goto L6b
        L60:
            r0 = move-exception
            r7 = r0
            r3.close()     // Catch: java.lang.Throwable -> L66
            goto L6a
        L66:
            r0 = move-exception
            r7.addSuppressed(r0)     // Catch: java.io.IOException -> L3c
        L6a:
            throw r7     // Catch: java.io.IOException -> L3c
        L6b:
            if (r0 != 0) goto L6e
            goto L75
        L6e:
            r1.getPackageName()
            defpackage.zid.c(r1, r8)
            goto Lae
        L75:
            r1.getPackageName()
            java.io.File r7 = new java.io.File
            java.io.File r0 = new java.io.File
            java.lang.String r3 = "/data/misc/profiles/cur/0"
            r0.<init>(r3, r2)
            java.lang.String r2 = "primary.prof"
            r7.<init>(r0, r2)
            s26 r2 = new s26
            r3 = r4
            r4 = r17
            r2.<init>(r3, r4, r5, r6, r7)
            boolean r0 = r2.a()
            if (r0 != 0) goto L96
            r0 = r8
            goto La6
        L96:
            s26 r0 = r2.c()
            r0.e()
            boolean r0 = r0.f()
            if (r0 == 0) goto La6
            a(r9, r10)
        La6:
            if (r0 == 0) goto Lab
            if (r19 == 0) goto Lab
            r8 = r11
        Lab:
            defpackage.zid.c(r1, r8)
        Lae:
            return
        Laf:
            r0 = move-exception
            r2 = 7
            r5.n(r2, r0)
            defpackage.zid.c(r1, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pid.b(android.content.Context, java.util.concurrent.Executor, oid, boolean):void");
    }
}
