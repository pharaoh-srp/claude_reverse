package defpackage;

import android.content.Context;
import com.anthropic.claude.code.ui.SessionInputData;
import com.anthropic.claude.types.strings.SessionId;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.List;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes.dex */
public final class psf {
    public final Context a;
    public final h86 b;
    public final bg9 c;
    public final LinkedHashMap d;

    public psf(Context context, h86 h86Var, bg9 bg9Var) {
        this.a = context;
        this.b = h86Var;
        this.c = bg9Var;
        gb9.D(fd9.c(h86Var.b()), null, null, new l6b(this, null, 8), 3);
        this.d = new LinkedHashMap();
    }

    public static final SessionInputData a(psf psfVar, String str) {
        psfVar.getClass();
        File file = new File(oq5.G(psfVar.a), "session_input");
        file.mkdirs();
        File file2 = new File(file, "session_" + str + ".json");
        if (file2.exists()) {
            try {
                return (SessionInputData) psfVar.c.b(nk7.p0(file2, dj2.a), d4c.S(SessionInputData.Companion.serializer()));
            } catch (SerializationException e) {
                List list = xah.a;
                xah.f(e, "Failed to load session input data", null, null, 28);
                try {
                    file2.delete();
                } catch (Exception e2) {
                    List list2 = xah.a;
                    xah.f(e2, "Failed to delete session input data", null, null, 28);
                }
            } catch (Exception e3) {
                List list3 = xah.a;
                xah.f(e3, "Failed to load session input data", null, null, 28);
            }
        }
        return null;
    }

    public static SessionInputData b(String str, qsf qsfVar) {
        return new SessionInputData(str, qsfVar.c(), qsfVar.b(), qsfVar.d(), qsfVar.e(), 0L, 32, (mq5) null);
    }

    public final amg c(String str) {
        SessionId sessionIdM1114boximpl = SessionId.m1114boximpl(str);
        LinkedHashMap linkedHashMap = this.d;
        Object objA = linkedHashMap.get(sessionIdM1114boximpl);
        if (objA == null) {
            objA = bmg.a(new qsf());
            linkedHashMap.put(sessionIdM1114boximpl, objA);
        }
        return (amg) objA;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r6, com.anthropic.claude.code.ui.PendingAskUserQuestionSelections r7, defpackage.vp4 r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.msf
            if (r0 == 0) goto L13
            r0 = r8
            msf r0 = (defpackage.msf) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            msf r0 = new msf
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.E
            int r1 = r0.G
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L26
            defpackage.sf5.h0(r8)
            goto L5d
        L26:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r5)
            return r3
        L2c:
            defpackage.sf5.h0(r8)
            amg r8 = r5.c(r6)
            java.lang.Object r1 = r8.getValue()
            qsf r1 = (defpackage.qsf) r1
            r4 = 11
            qsf r7 = defpackage.qsf.a(r1, r3, r7, r3, r4)
            r8.n(r3, r7)
            com.anthropic.claude.code.ui.SessionInputData r6 = b(r6, r7)
            r0.G = r2
            h86 r7 = r5.b
            e45 r7 = r7.b()
            x1d r8 = new x1d
            r1 = 7
            r8.<init>(r5, r6, r3, r1)
            java.lang.Object r5 = defpackage.gb9.c0(r7, r8, r0)
            m45 r6 = defpackage.m45.E
            if (r5 != r6) goto L5d
            return r6
        L5d:
            iei r5 = defpackage.iei.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.psf.d(java.lang.String, com.anthropic.claude.code.ui.PendingAskUserQuestionSelections, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r6, java.util.List r7, defpackage.vp4 r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.nsf
            if (r0 == 0) goto L13
            r0 = r8
            nsf r0 = (defpackage.nsf) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            nsf r0 = new nsf
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.E
            int r1 = r0.G
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L26
            defpackage.sf5.h0(r8)
            goto L5d
        L26:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r5)
            return r3
        L2c:
            defpackage.sf5.h0(r8)
            amg r8 = r5.c(r6)
            java.lang.Object r1 = r8.getValue()
            qsf r1 = (defpackage.qsf) r1
            r4 = 13
            qsf r7 = defpackage.qsf.a(r1, r7, r3, r3, r4)
            r8.n(r3, r7)
            com.anthropic.claude.code.ui.SessionInputData r6 = b(r6, r7)
            r0.G = r2
            h86 r7 = r5.b
            e45 r7 = r7.b()
            x1d r8 = new x1d
            r1 = 7
            r8.<init>(r5, r6, r3, r1)
            java.lang.Object r5 = defpackage.gb9.c0(r7, r8, r0)
            m45 r6 = defpackage.m45.E
            if (r5 != r6) goto L5d
            return r6
        L5d:
            iei r5 = defpackage.iei.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.psf.e(java.lang.String, java.util.List, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.String r6, java.util.LinkedHashMap r7, defpackage.vp4 r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.osf
            if (r0 == 0) goto L13
            r0 = r8
            osf r0 = (defpackage.osf) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            osf r0 = new osf
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.E
            int r1 = r0.G
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L26
            defpackage.sf5.h0(r8)
            goto L5b
        L26:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r5)
            return r3
        L2c:
            defpackage.sf5.h0(r8)
            amg r8 = r5.c(r6)
            java.lang.Object r1 = r8.getValue()
            qsf r1 = (defpackage.qsf) r1
            r4 = 7
            qsf r7 = defpackage.qsf.a(r1, r3, r3, r7, r4)
            r8.n(r3, r7)
            com.anthropic.claude.code.ui.SessionInputData r6 = b(r6, r7)
            r0.G = r2
            h86 r7 = r5.b
            e45 r7 = r7.b()
            x1d r8 = new x1d
            r8.<init>(r5, r6, r3, r4)
            java.lang.Object r5 = defpackage.gb9.c0(r7, r8, r0)
            m45 r6 = defpackage.m45.E
            if (r5 != r6) goto L5b
            return r6
        L5b:
            iei r5 = defpackage.iei.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.psf.f(java.lang.String, java.util.LinkedHashMap, vp4):java.lang.Object");
    }
}
