package defpackage;

import android.content.SharedPreferences;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class bpg implements lvg, oog {
    public final n78 E;
    public final fj0 F;
    public final lpg G;
    public final String H;
    public final String I;
    public final e45 J;
    public final jkf K;
    public final String L;
    public final String M;

    public bpg(n78 n78Var, fj0 fj0Var, lpg lpgVar, String str, String str2, e45 e45Var) {
        lpgVar.getClass();
        e45Var.getClass();
        this.E = n78Var;
        this.F = fj0Var;
        this.G = lpgVar;
        this.H = str;
        this.I = str2;
        this.J = e45Var;
        int i = kkf.a;
        this.K = new jkf(1);
        this.L = "{\"batch\":[";
        this.M = "tmp";
    }

    public static final String b(bpg bpgVar) {
        return bpgVar.H + '-' + bpgVar.E.J(0, bpgVar.I) + '.' + bpgVar.M;
    }

    public static final void c(bpg bpgVar) {
        fj0 fj0Var = bpgVar.F;
        if (((File) fj0Var.G) == null || ((FileOutputStream) fj0Var.F) == null) {
            return;
        }
        StringBuilder sb = new StringBuilder("],\"sentAt\":\"");
        sff.Companion.getClass();
        sb.append(rff.a());
        sb.append("\",\"writeKey\":\"");
        sb.append(bpgVar.H);
        sb.append("\"}");
        fj0Var.U(sb.toString());
        FileOutputStream fileOutputStream = (FileOutputStream) fj0Var.F;
        if (fileOutputStream != null) {
            fileOutputStream.close();
        }
        fj0Var.F = null;
        File file = (File) fj0Var.G;
        if (file != null) {
            File file2 = (File) fj0Var.E;
            String name = file.getName();
            name.getClass();
            int iK0 = bsg.K0(name, '.', 0, 6);
            if (iK0 != -1 && iK0 > 0) {
                name = name.substring(0, iK0);
            }
            file.renameTo(new File(file2, name));
        }
        fj0Var.G = null;
        n78 n78Var = bpgVar.E;
        String str = bpgVar.I;
        ((SharedPreferences) n78Var.F).edit().putInt(str, n78Var.J(0, str) + 1).commit();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0099, code lost:
    
        if (r3.f(r15, r5, true, r7, r13, r6) == r12) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object d(defpackage.bpg r21, defpackage.vp4 r22) {
        /*
            r1 = r21
            r0 = r22
            boolean r2 = r0 instanceof defpackage.xog
            if (r2 == 0) goto L18
            r2 = r0
            xog r2 = (defpackage.xog) r2
            int r3 = r2.H
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.H = r3
        L16:
            r9 = r2
            goto L1e
        L18:
            xog r2 = new xog
            r2.<init>(r1, r0)
            goto L16
        L1e:
            java.lang.Object r0 = r9.F
            int r2 = r9.H
            r8 = 0
            r10 = 2
            r11 = 1
            m45 r12 = defpackage.m45.E
            if (r2 == 0) goto L40
            if (r2 == r11) goto L38
            if (r2 != r10) goto L32
            defpackage.sf5.h0(r0)
            goto L9c
        L32:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r0)
            return r8
        L38:
            bpg r1 = r9.E
            defpackage.sf5.h0(r0)
            r15 = r1
            r6 = r9
            goto L71
        L40:
            defpackage.sf5.h0(r0)
            lpg r13 = r1.G
            wv2 r0 = new wv2
            r6 = 0
            r7 = 6
            r1 = 2
            java.lang.Class<bpg> r3 = defpackage.bpg.class
            java.lang.String r4 = "userInfoUpdate"
            java.lang.String r5 = "userInfoUpdate(Lcom/segment/analytics/kotlin/core/UserInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"
            r2 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r1 = r2
            e45 r4 = r1.J
            java.lang.Class<wmi> r2 = defpackage.wmi.class
            kce r3 = defpackage.jce.a
            pl9 r2 = r3.b(r2)
            r9.E = r1
            r9.H = r11
            r3 = 1
            r5 = r0
            r6 = r9
            r0 = r13
            java.lang.Object r0 = r0.f(r1, r2, r3, r4, r5, r6)
            if (r0 != r12) goto L6f
            goto L9b
        L6f:
            r15 = r21
        L71:
            lpg r3 = r15.G
            wv2 r13 = new wv2
            r19 = 0
            r20 = 7
            r14 = 2
            java.lang.Class<bpg> r16 = defpackage.bpg.class
            java.lang.String r17 = "systemUpdate"
            java.lang.String r18 = "systemUpdate(Lcom/segment/analytics/kotlin/core/System;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            e45 r7 = r15.J
            java.lang.Class<a1h> r0 = defpackage.a1h.class
            kce r1 = defpackage.jce.a
            pl9 r5 = r1.b(r0)
            r6.E = r8
            r6.H = r10
            r9 = r6
            r6 = 1
            r8 = r13
            r4 = r15
            java.lang.Object r0 = r3.f(r4, r5, r6, r7, r8, r9)
            if (r0 != r12) goto L9c
        L9b:
            return r12
        L9c:
            iei r0 = defpackage.iei.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bpg.d(bpg, vp4):java.lang.Object");
    }

    @Override // defpackage.oog
    public String a(int i) {
        sq6.a(i);
        if (wog.a[sq6.F(i)] != 1) {
            String strL = grc.l(i);
            strL.getClass();
            String string = ((SharedPreferences) this.E.F).getString(strL, null);
            if (string == null) {
                return null;
            }
            return string;
        }
        File[] fileArrListFiles = ((File) this.F.E).listFiles();
        if (fileArrListFiles == null) {
            fileArrListFiles = new File[0];
        }
        ArrayList arrayList = new ArrayList(fileArrListFiles.length);
        for (File file : fileArrListFiles) {
            arrayList.add(file.getAbsolutePath());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!isg.h0((String) obj, "." + this.M, false)) {
                arrayList2.add(obj);
            }
        }
        return w44.S0(arrayList2, null, null, null, null, 63);
    }

    public final void e(int i) {
        sq6.a(i);
        if (wog.a[sq6.F(i)] == 1) {
            return;
        }
        String strL = grc.l(i);
        strL.getClass();
        ((SharedPreferences) this.E.F).edit().remove(strL).commit();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.a1h r5, defpackage.tp4 r6) throws java.lang.Exception {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.yog
            if (r0 == 0) goto L13
            r0 = r6
            yog r0 = (defpackage.yog) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            yog r0 = new yog
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.E
            int r1 = r0.G
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.sf5.h0(r6)
            goto L50
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.sf5.h0(r6)
            com.segment.analytics.kotlin.core.Settings r5 = r5.b
            r6 = 4
            if (r5 == 0) goto L4d
            ag9 r1 = defpackage.bg9.d
            com.segment.analytics.kotlin.core.Settings$Companion r3 = com.segment.analytics.kotlin.core.Settings.INSTANCE
            kotlinx.serialization.KSerializer r3 = r3.serializer()
            znf r3 = (defpackage.znf) r3
            java.lang.String r5 = r1.d(r5, r3)
            r0.G = r2
            java.lang.Object r4 = r4.i(r6, r5, r0)
            m45 r5 = defpackage.m45.E
            if (r4 != r5) goto L50
            return r5
        L4d:
            r4.e(r6)
        L50:
            iei r4 = defpackage.iei.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bpg.f(a1h, tp4):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x008e, code lost:
    
        if (r8.i(2, r9, r0) == r6) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.wmi r9, defpackage.tp4 r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.zog
            if (r0 == 0) goto L13
            r0 = r10
            zog r0 = (defpackage.zog) r0
            int r1 = r0.I
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.I = r1
            goto L18
        L13:
            zog r0 = new zog
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.G
            int r1 = r0.I
            r2 = 0
            r3 = 2
            r4 = 1
            r5 = 3
            m45 r6 = defpackage.m45.E
            if (r1 == 0) goto L45
            if (r1 == r4) goto L3d
            if (r1 == r3) goto L35
            if (r1 != r5) goto L2f
            defpackage.sf5.h0(r10)
            goto L94
        L2f:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r8)
            return r2
        L35:
            wmi r8 = r0.F
            bpg r9 = r0.E
            defpackage.sf5.h0(r10)
            goto L6b
        L3d:
            wmi r9 = r0.F
            bpg r8 = r0.E
            defpackage.sf5.h0(r10)
            goto L57
        L45:
            defpackage.sf5.h0(r10)
            java.lang.String r10 = r9.a
            r0.E = r8
            r0.F = r9
            r0.I = r4
            java.lang.Object r10 = r8.i(r5, r10, r0)
            if (r10 != r6) goto L57
            goto L90
        L57:
            java.lang.String r10 = r9.b
            if (r10 == 0) goto L6f
            r0.E = r8
            r0.F = r9
            r0.I = r3
            java.lang.Object r10 = r8.i(r4, r10, r0)
            if (r10 != r6) goto L68
            goto L90
        L68:
            r7 = r9
            r9 = r8
            r8 = r7
        L6b:
            r7 = r9
            r9 = r8
            r8 = r7
            goto L72
        L6f:
            r8.e(r4)
        L72:
            kotlinx.serialization.json.JsonObject r9 = r9.c
            if (r9 == 0) goto L91
            ag9 r10 = defpackage.bg9.d
            kotlinx.serialization.json.JsonObject$Companion r1 = kotlinx.serialization.json.JsonObject.INSTANCE
            kotlinx.serialization.KSerializer r1 = r1.serializer()
            znf r1 = (defpackage.znf) r1
            java.lang.String r9 = r10.d(r9, r1)
            r0.E = r8
            r0.F = r2
            r0.I = r5
            java.lang.Object r8 = r8.i(r3, r9, r0)
            if (r8 != r6) goto L94
        L90:
            return r6
        L91:
            r8.e(r3)
        L94:
            iei r8 = defpackage.iei.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bpg.g(wmi, tp4):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.zy7 r5, defpackage.vp4 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.apg
            if (r0 == 0) goto L13
            r0 = r6
            apg r0 = (defpackage.apg) r0
            int r1 = r0.I
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.I = r1
            goto L18
        L13:
            apg r0 = new apg
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.G
            int r1 = r0.I
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2c
            ts9 r4 = r0.F
            r5 = r4
            zy7 r5 = (defpackage.zy7) r5
            bpg r4 = r0.E
            defpackage.sf5.h0(r6)
            goto L4a
        L2c:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            r4 = 0
            return r4
        L33:
            defpackage.sf5.h0(r6)
            r0.E = r4
            r6 = r5
            ts9 r6 = (defpackage.ts9) r6
            r0.F = r6
            r0.I = r2
            jkf r6 = r4.K
            java.lang.Object r6 = r6.a(r0)
            m45 r0 = defpackage.m45.E
            if (r6 != r0) goto L4a
            return r0
        L4a:
            r5.a()
            jkf r4 = r4.K
            r4.e()
            iei r4 = defpackage.iei.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bpg.h(zy7, vp4):java.lang.Object");
    }

    public final Object i(int i, String str, vp4 vp4Var) throws Exception {
        int i2 = wog.a[sq6.F(i)];
        iei ieiVar = iei.a;
        if (i2 != 1) {
            str.getClass();
            String strL = grc.l(i);
            strL.getClass();
            str.getClass();
            ((SharedPreferences) this.E.F).edit().putString(strL, str).commit();
            return ieiVar;
        }
        if (str.length() >= 32000) {
            throw new Exception("enqueued payload is too large");
        }
        Object objH = h(new mx1(this, 16, str), vp4Var);
        m45 m45Var = m45.E;
        if (objH != m45Var) {
            objH = ieiVar;
        }
        return objH == m45Var ? objH : ieiVar;
    }
}
