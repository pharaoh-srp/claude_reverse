package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final class f77 implements yzb {
    public final /* synthetic */ g77 E;

    public f77(g77 g77Var) {
        this.E = g77Var;
    }

    @Override // defpackage.yzb
    public final long F(long j, int i, long j2) {
        g77 g77Var = this.E;
        s2i s2iVar = g77Var.a;
        if (!((Boolean) g77Var.d.a()).booleanValue()) {
            return 0L;
        }
        int i2 = (int) (j & 4294967295L);
        s2iVar.b.i(Float.intBitsToFloat(i2) + s2iVar.b.h());
        int i3 = (int) (j2 & 4294967295L);
        if (Float.intBitsToFloat(i3) < MTTypesetterKt.kLineSkipLimitMultiplier || Float.intBitsToFloat(i2) < MTTypesetterKt.kLineSkipLimitMultiplier) {
            float fH = s2iVar.c.h();
            s2iVar.d(Float.intBitsToFloat(i2) + s2iVar.c.h());
            return (((long) Float.floatToRawIntBits(s2iVar.c.h() - fH)) & 4294967295L) | (Float.floatToRawIntBits(MTTypesetterKt.kLineSkipLimitMultiplier) << 32);
        }
        if (Float.intBitsToFloat(i3) <= MTTypesetterKt.kLineSkipLimitMultiplier) {
            return 0L;
        }
        float fH2 = s2iVar.c.h();
        s2iVar.d(Float.intBitsToFloat(i3) + s2iVar.c.h());
        return (((long) Float.floatToRawIntBits(MTTypesetterKt.kLineSkipLimitMultiplier)) << 32) | (((long) Float.floatToRawIntBits(s2iVar.c.h() - fH2)) & 4294967295L);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // defpackage.yzb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object G(long r7, long r9, defpackage.tp4 r11) {
        /*
            r6 = this;
            g77 r7 = r6.E
            s2i r8 = r7.a
            boolean r0 = r11 instanceof defpackage.e77
            if (r0 == 0) goto L17
            r0 = r11
            e77 r0 = (defpackage.e77) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L17
            int r1 = r1 - r2
            r0.H = r1
            goto L1e
        L17:
            e77 r0 = new e77
            vp4 r11 = (defpackage.vp4) r11
            r0.<init>(r6, r11)
        L1e:
            java.lang.Object r6 = r0.F
            int r11 = r0.H
            r1 = 2
            r2 = 1
            m45 r3 = defpackage.m45.E
            if (r11 == 0) goto L3f
            if (r11 == r2) goto L39
            if (r11 != r1) goto L32
            long r7 = r0.E
            defpackage.sf5.h0(r6)
            goto L76
        L32:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r6)
            r6 = 0
            return r6
        L39:
            long r9 = r0.E
            defpackage.sf5.h0(r6)
            goto L5e
        L3f:
            defpackage.sf5.h0(r6)
            float r6 = defpackage.qsi.e(r9)
            r11 = 0
            int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r6 <= 0) goto L50
            hsc r6 = r8.b
            r6.i(r11)
        L50:
            r0.E = r9
            r0.H = r2
            qsi r6 = new qsi
            r4 = 0
            r6.<init>(r4)
            if (r6 != r3) goto L5e
            goto L74
        L5e:
            qsi r6 = (defpackage.qsi) r6
            long r4 = r6.a
            float r6 = defpackage.qsi.e(r9)
            zn5 r9 = r7.c
            yig r7 = r7.b
            r0.E = r4
            r0.H = r1
            java.lang.Object r6 = defpackage.eg0.g(r8, r6, r9, r7, r0)
            if (r6 != r3) goto L75
        L74:
            return r3
        L75:
            r7 = r4
        L76:
            qsi r6 = (defpackage.qsi) r6
            long r9 = r6.a
            long r6 = defpackage.qsi.g(r7, r9)
            qsi r8 = new qsi
            r8.<init>(r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f77.G(long, long, tp4):java.lang.Object");
    }

    @Override // defpackage.yzb
    public final long X(int i, long j) {
        g77 g77Var = this.E;
        s2i s2iVar = g77Var.a;
        if (!((Boolean) g77Var.d.a()).booleanValue()) {
            return 0L;
        }
        int i2 = (int) (4294967295L & j);
        if (Float.intBitsToFloat(i2) > MTTypesetterKt.kLineSkipLimitMultiplier) {
            return 0L;
        }
        float fH = s2iVar.c.h();
        s2iVar.d(Float.intBitsToFloat(i2) + s2iVar.c.h());
        if (fH == s2iVar.c.h()) {
            return 0L;
        }
        return fcc.a(j, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
    }
}
