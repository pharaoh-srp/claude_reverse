package defpackage;

import android.webkit.MimeTypeMap;
import java.io.IOException;
import java.util.Map;
import okio.FileSystem;
import okio.Okio;
import okio.Path;
import okio.RealBufferedSource;

/* JADX INFO: loaded from: classes2.dex */
public final class ts8 implements ih7 {
    public static final y42 f = new y42(true, true, -1, -1, false, false, false, -1, -1, false, false, false, null);
    public static final y42 g = new y42(true, false, -1, -1, false, false, false, -1, -1, true, false, false, null);
    public final String a;
    public final rjc b;
    public final u0h c;
    public final u0h d;
    public final boolean e;

    public ts8(String str, rjc rjcVar, u0h u0hVar, u0h u0hVar2, boolean z) {
        this.a = str;
        this.b = rjcVar;
        this.c = u0hVar;
        this.d = u0hVar2;
        this.e = z;
    }

    public static String d(String str, p8b p8bVar) {
        String strB;
        String str2 = p8bVar != null ? p8bVar.a : null;
        if ((str2 == null || isg.q0(str2, "text/plain", false)) && (strB = l.b(MimeTypeMap.getSingleton(), str)) != null) {
            return strB;
        }
        if (str2 != null) {
            return bsg.g1(str2, ';');
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009f A[Catch: Exception -> 0x005f, TRY_ENTER, TryCatch #0 {Exception -> 0x005f, blocks: (B:20:0x0054, B:60:0x014d, B:105:0x0209, B:106:0x020e, B:33:0x009f, B:35:0x00a9, B:42:0x00d3, B:44:0x00d7, B:47:0x00f0, B:57:0x0138, B:49:0x0106, B:51:0x0112, B:52:0x011b, B:38:0x00bd, B:40:0x00c5, B:54:0x0123, B:55:0x012a, B:56:0x012b), top: B:110:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012b A[Catch: Exception -> 0x005f, TryCatch #0 {Exception -> 0x005f, blocks: (B:20:0x0054, B:60:0x014d, B:105:0x0209, B:106:0x020e, B:33:0x009f, B:35:0x00a9, B:42:0x00d3, B:44:0x00d7, B:47:0x00f0, B:57:0x0138, B:49:0x0106, B:51:0x0112, B:52:0x011b, B:38:0x00bd, B:40:0x00c5, B:54:0x0123, B:55:0x012a, B:56:0x012b), top: B:110:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01cf A[Catch: Exception -> 0x01f5, TryCatch #3 {Exception -> 0x01f5, blocks: (B:87:0x01c9, B:89:0x01cf, B:93:0x01f1, B:97:0x01f8, B:98:0x01fd), top: B:115:0x01c9 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01f8 A[Catch: Exception -> 0x01f5, TryCatch #3 {Exception -> 0x01f5, blocks: (B:87:0x01c9, B:89:0x01cf, B:93:0x01f1, B:97:0x01f8, B:98:0x01fd), top: B:115:0x01c9 }] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v23 */
    @Override // defpackage.ih7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.tp4 r18) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 533
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ts8.a(tp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.kie r5, defpackage.vp4 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.rs8
            if (r0 == 0) goto L13
            r0 = r6
            rs8 r0 = (defpackage.rs8) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            rs8 r0 = new rs8
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.E
            int r1 = r0.G
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.sf5.h0(r6)
            goto L8f
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.sf5.h0(r6)
            android.graphics.Bitmap$Config[] r6 = defpackage.l.a
            android.os.Looper r6 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            boolean r6 = defpackage.x44.r(r6, r1)
            u0h r1 = r4.c
            if (r6 == 0) goto L60
            rjc r4 = r4.b
            f52 r4 = r4.m
            boolean r4 = r4.E
            if (r4 != 0) goto L5a
            java.lang.Object r4 = r1.getValue()
            t82 r4 = (defpackage.t82) r4
            v82 r4 = r4.a(r5)
            f4e r4 = (defpackage.f4e) r4
            pqe r4 = r4.f()
            goto L92
        L5a:
            android.os.NetworkOnMainThreadException r4 = new android.os.NetworkOnMainThreadException
            r4.<init>()
            throw r4
        L60:
            java.lang.Object r4 = r1.getValue()
            t82 r4 = (defpackage.t82) r4
            v82 r4 = r4.a(r5)
            r0.G = r2
            ua2 r5 = new ua2
            tp4 r6 = defpackage.zni.I(r0)
            r5.<init>(r2, r6)
            r5.t()
            z04 r6 = new z04
            r0 = 5
            r6.<init>(r4, r0, r5)
            f4e r4 = (defpackage.f4e) r4
            r4.d(r6)
            r5.w(r6)
            java.lang.Object r6 = r5.r()
            m45 r4 = defpackage.m45.E
            if (r6 != r4) goto L8f
            return r4
        L8f:
            r4 = r6
            pqe r4 = (defpackage.pqe) r4
        L92:
            boolean r5 = r4.U
            int r6 = r4.H
            if (r5 != 0) goto Lba
            r5 = 304(0x130, float:4.26E-43)
            if (r6 == r5) goto Lba
            rqe r5 = r4.K
            if (r5 == 0) goto La3
            defpackage.l.a(r5)
        La3:
            coil.network.HttpException r5 = new coil.network.HttpException
            java.lang.String r0 = "HTTP "
            java.lang.String r1 = ": "
            java.lang.StringBuilder r6 = defpackage.vb7.u(r0, r6, r1)
            java.lang.String r4 = r4.G
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r5.<init>(r4)
            throw r5
        Lba:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ts8.b(kie, vp4):java.lang.Object");
    }

    public final FileSystem c() {
        Object value = this.d.getValue();
        value.getClass();
        return ((l4e) ((n66) value)).a;
    }

    public final kie e() {
        jie jieVar = new jie();
        jieVar.g(this.a);
        rjc rjcVar = this.b;
        wg8 wg8Var = rjcVar.h;
        wg8Var.getClass();
        jieVar.c = wg8Var.g();
        for (Map.Entry entry : rjcVar.i.a.entrySet()) {
            Object key = entry.getKey();
            key.getClass();
            jieVar.f((Class) key, entry.getValue());
        }
        f52 f52Var = rjcVar.l;
        boolean z = f52Var.E;
        boolean z2 = rjcVar.m.E;
        if (!z2 && z) {
            jieVar.b(y42.o);
        } else if (!z2 || z) {
            if (!z2 && !z) {
                jieVar.b(g);
            }
        } else if (f52Var.F) {
            jieVar.b(y42.n);
        } else {
            jieVar.b(f);
        }
        return new kie(jieVar);
    }

    public final h52 f(j4e j4eVar) throws Throwable {
        Throwable th;
        h52 h52Var;
        try {
            FileSystem fileSystemC = c();
            r66 r66Var = j4eVar.E;
            if (r66Var.F) {
                throw new IllegalStateException("snapshot is closed");
            }
            RealBufferedSource realBufferedSourceC = Okio.c(fileSystemC.T((Path) r66Var.E.c.get(0)));
            try {
                h52Var = new h52(realBufferedSourceC);
                try {
                    realBufferedSourceC.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                try {
                    realBufferedSourceC.close();
                } catch (Throwable th4) {
                    mwa.p(th3, th4);
                }
                th = th3;
                h52Var = null;
            }
            if (th != null) {
                throw th;
            }
            h52Var.getClass();
            return h52Var;
        } catch (IOException unused) {
            return null;
        }
    }

    public final ri7 g(j4e j4eVar) {
        r66 r66Var = j4eVar.E;
        if (r66Var.F) {
            sz6.j("snapshot is closed");
            return null;
        }
        Path path = (Path) r66Var.E.c.get(1);
        FileSystem fileSystemC = c();
        this.b.getClass();
        return new ri7(path, fileSystemC, this.a, j4eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.j4e h(defpackage.j4e r6, defpackage.kie r7, defpackage.pqe r8, defpackage.h52 r9) {
        /*
            Method dump skipped, instruction units count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ts8.h(j4e, kie, pqe, h52):j4e");
    }
}
