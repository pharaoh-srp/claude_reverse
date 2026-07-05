package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes.dex */
public abstract class r9f {
    public static final a6f a = new a6f(17);
    public static final o9f b = new o9f();
    public static final n9f c = new n9f();
    public static final p9f d = new p9f();

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.raf r10, long r11, defpackage.vp4 r13) {
        /*
            boolean r0 = r13 instanceof defpackage.q9f
            if (r0 == 0) goto L13
            r0 = r13
            q9f r0 = (defpackage.q9f) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            q9f r0 = new q9f
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.G
            int r1 = r0.H
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2b
            aae r10 = r0.F
            raf r11 = r0.E
            defpackage.sf5.h0(r13)
            r7 = r10
            r10 = r11
            goto L55
        L2b:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r10)
            r10 = 0
            return r10
        L32:
            defpackage.sf5.h0(r13)
            aae r7 = new aae
            r7.<init>()
            p0 r3 = new p0
            r8 = 0
            r9 = 6
            r4 = r10
            r5 = r11
            r3.<init>(r4, r5, r7, r8, r9)
            r0.E = r4
            r0.F = r7
            r0.H = r2
            zwb r10 = defpackage.zwb.E
            java.lang.Object r10 = r4.f(r10, r3, r0)
            m45 r11 = defpackage.m45.E
            if (r10 != r11) goto L54
            return r11
        L54:
            r10 = r4
        L55:
            float r11 = r7.E
            long r10 = r10.h(r11)
            fcc r12 = new fcc
            r12.<init>(r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r9f.a(raf, long, vp4):java.lang.Object");
    }

    public static iqb b(iqb iqbVar, aaf aafVar, ukc ukcVar, boolean z, boolean z2, zub zubVar, int i) {
        return iqbVar.B(new m9f(aafVar, ukcVar, z, z2, null, zubVar));
    }

    public static iqb c(iqb iqbVar, aaf aafVar, boolean z, int i) {
        if ((i & 4) != 0) {
            z = true;
        }
        return b(iqbVar, aafVar, ukc.F, z, true, null, FreeTypeConstants.FT_LOAD_PEDANTIC);
    }
}
