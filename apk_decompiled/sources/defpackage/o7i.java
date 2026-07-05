package defpackage;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class o7i {
    public static final String[] l = {"INSERT", "UPDATE", "DELETE"};
    public final cve a;
    public final LinkedHashMap b;
    public final LinkedHashMap c;
    public final boolean d;
    public final n0 e;
    public final String[] g;
    public final ibc h;
    public final efe i;
    public final AtomicBoolean j = new AtomicBoolean(false);
    public zy7 k = new zcd(15);
    public final LinkedHashMap f = new LinkedHashMap();

    public o7i(cve cveVar, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, String[] strArr, boolean z, n0 n0Var) {
        String lowerCase;
        this.a = cveVar;
        this.b = linkedHashMap;
        this.c = linkedHashMap2;
        this.d = z;
        this.e = n0Var;
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            Locale locale = Locale.ROOT;
            String lowerCase2 = str.toLowerCase(locale);
            lowerCase2.getClass();
            this.f.put(lowerCase2, Integer.valueOf(i));
            String str2 = (String) this.b.get(strArr[i]);
            if (str2 != null) {
                lowerCase = str2.toLowerCase(locale);
                lowerCase.getClass();
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                lowerCase2 = lowerCase;
            }
            strArr2[i] = lowerCase2;
        }
        this.g = strArr2;
        for (Map.Entry entry : this.b.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.ROOT;
            String lowerCase3 = str3.toLowerCase(locale2);
            lowerCase3.getClass();
            if (this.f.containsKey(lowerCase3)) {
                String lowerCase4 = ((String) entry.getKey()).toLowerCase(locale2);
                lowerCase4.getClass();
                LinkedHashMap linkedHashMap3 = this.f;
                linkedHashMap3.put(lowerCase4, sta.f0(lowerCase3, linkedHashMap3));
            }
        }
        this.h = new ibc(this.g.length);
        this.i = new efe(this.g.length);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.o7i r4, defpackage.e9d r5, defpackage.vp4 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.g7i
            if (r0 == 0) goto L13
            r0 = r6
            g7i r0 = (defpackage.g7i) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            g7i r0 = new g7i
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r4 = r0.F
            int r6 = r0.H
            r1 = 2
            r2 = 1
            m45 r3 = defpackage.m45.E
            if (r6 == 0) goto L3d
            if (r6 == r2) goto L35
            if (r6 != r1) goto L2e
            java.lang.Object r5 = r0.E
            java.util.Set r5 = (java.util.Set) r5
            defpackage.sf5.h0(r4)
            return r5
        L2e:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            r4 = 0
            return r4
        L35:
            java.lang.Object r5 = r0.E
            e9d r5 = (defpackage.e9d) r5
            defpackage.sf5.h0(r4)
            goto L54
        L3d:
            defpackage.sf5.h0(r4)
            yeg r4 = new yeg
            r6 = 29
            r4.<init>(r6)
            r0.E = r5
            r0.H = r2
            java.lang.String r6 = "SELECT * FROM room_table_modification_log WHERE invalidated = 1"
            java.lang.Object r4 = r5.b(r6, r4, r0)
            if (r4 != r3) goto L54
            goto L6b
        L54:
            java.util.Set r4 = (java.util.Set) r4
            r6 = r4
            java.util.Collection r6 = (java.util.Collection) r6
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L6c
            r0.E = r4
            r0.H = r1
            java.lang.String r6 = "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1"
            java.lang.Object r5 = defpackage.kxk.s(r5, r6, r0)
            if (r5 != r3) goto L6c
        L6b:
            return r3
        L6c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o7i.a(o7i, e9d, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.o7i r11, defpackage.vp4 r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o7i.b(o7i, vp4):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0078, code lost:
    
        if (defpackage.kxk.s(r1, r3, r4) == r8) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d8, code lost:
    
        if (defpackage.kxk.s(r11, r3, r4) == r8) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00da, code lost:
    
        return r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00d8 -> B:28:0x00db). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(defpackage.o7i r17, defpackage.y4i r18, int r19, defpackage.vp4 r20) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o7i.c(o7i, y4i, int, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0081 -> B:19:0x0084). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(defpackage.o7i r7, defpackage.y4i r8, int r9, defpackage.vp4 r10) {
        /*
            r7.getClass()
            boolean r0 = r10 instanceof defpackage.l7i
            if (r0 == 0) goto L16
            r0 = r10
            l7i r0 = (defpackage.l7i) r0
            int r1 = r0.L
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.L = r1
            goto L1b
        L16:
            l7i r0 = new l7i
            r0.<init>(r7, r10)
        L1b:
            java.lang.Object r10 = r0.J
            int r1 = r0.L
            r2 = 1
            if (r1 == 0) goto L3b
            if (r1 != r2) goto L34
            int r7 = r0.I
            int r8 = r0.H
            java.lang.String[] r9 = r0.G
            java.lang.String r1 = r0.F
            e9d r3 = r0.E
            defpackage.sf5.h0(r10)
            r10 = r9
            r9 = r3
            goto L84
        L34:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r7)
            r7 = 0
            return r7
        L3b:
            defpackage.sf5.h0(r10)
            java.lang.String[] r7 = r7.g
            r7 = r7[r9]
            java.lang.String[] r9 = defpackage.o7i.l
            r10 = 0
            r1 = 3
            r6 = r1
            r1 = r7
            r7 = r6
            r6 = r9
            r9 = r8
            r8 = r10
            r10 = r6
        L4d:
            if (r8 >= r7) goto L86
            r3 = r10[r8]
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "room_table_modification_trigger_"
            r4.<init>(r5)
            r4.append(r1)
            r5 = 95
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.String r4 = "DROP TRIGGER IF EXISTS `"
            r5 = 96
            java.lang.String r3 = defpackage.grc.n(r5, r4, r3)
            r0.E = r9
            r0.F = r1
            r0.G = r10
            r0.H = r8
            r0.I = r7
            r0.L = r2
            java.lang.Object r3 = defpackage.kxk.s(r9, r3, r0)
            m45 r4 = defpackage.m45.E
            if (r3 != r4) goto L84
            return r4
        L84:
            int r8 = r8 + r2
            goto L4d
        L86:
            iei r7 = defpackage.iei.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o7i.d(o7i, y4i, int, vp4):java.lang.Object");
    }

    public final void e(zy7 zy7Var, zy7 zy7Var2) {
        zy7Var.getClass();
        zy7Var2.getClass();
        if (this.j.compareAndSet(false, true)) {
            zy7Var.a();
            mp4 mp4Var = this.a.a;
            tp4 tp4Var = null;
            if (mp4Var != null) {
                gb9.D(mp4Var, new h45("Room Invalidation Tracker Refresh"), null, new rrb(this, zy7Var2, tp4Var, 18), 2);
            } else {
                x44.o0("coroutineScope");
                throw null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.vp4 r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.m7i
            if (r0 == 0) goto L13
            r0 = r7
            m7i r0 = (defpackage.m7i) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            m7i r0 = new m7i
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.F
            int r1 = r0.H
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L2a
            fj0 r6 = r0.E
            defpackage.sf5.h0(r7)     // Catch: java.lang.Throwable -> L28
            goto L52
        L28:
            r7 = move-exception
            goto L58
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r6)
            return r2
        L30:
            defpackage.sf5.h0(r7)
            cve r7 = r6.a
            fj0 r1 = r7.g
            boolean r4 = r1.f()
            if (r4 == 0) goto L5c
            wmf r4 = new wmf     // Catch: java.lang.Throwable -> L56
            r5 = 5
            r4.<init>(r6, r2, r5)     // Catch: java.lang.Throwable -> L56
            r0.E = r1     // Catch: java.lang.Throwable -> L56
            r0.H = r3     // Catch: java.lang.Throwable -> L56
            r6 = 0
            java.lang.Object r6 = r7.q(r6, r4, r0)     // Catch: java.lang.Throwable -> L56
            m45 r7 = defpackage.m45.E
            if (r6 != r7) goto L51
            return r7
        L51:
            r6 = r1
        L52:
            r6.R()
            goto L5c
        L56:
            r7 = move-exception
            r6 = r1
        L58:
            r6.R()
            throw r7
        L5c:
            iei r6 = defpackage.iei.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o7i.f(vp4):java.lang.Object");
    }
}
