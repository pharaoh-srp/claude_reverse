package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.text.TextUtils;
import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class x30 {
    public final b40 a;
    public final int b;
    public final long c;
    public final wjh d;
    public final CharSequence e;
    public final List f;

    /* JADX WARN: Removed duplicated region for block: B:104:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01dd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0340 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public x30(defpackage.b40 r22, int r23, int r24, long r25) {
        /*
            Method dump skipped, instruction units count: 978
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x30.<init>(b40, int, int, long):void");
    }

    public final wjh a(int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7, CharSequence charSequence) {
        i5d i5dVar;
        float fD = d();
        b40 b40Var = this.a;
        s60 s60Var = b40Var.K;
        int i8 = b40Var.P;
        lu9 lu9Var = b40Var.M;
        tkh tkhVar = b40Var.F;
        y30 y30Var = z30.a;
        z5d z5dVar = tkhVar.c;
        return new wjh(charSequence, fD, s60Var, i, truncateAt, i8, (z5dVar == null || (i5dVar = z5dVar.b) == null) ? false : i5dVar.a, i3, i5, i6, i7, i4, i2, lu9Var);
    }

    public final float b() {
        return this.d.a();
    }

    public final long c(l9e l9eVar, int i, poc pocVar) {
        int[] iArrG;
        RectF rectFR = mwa.R(l9eVar);
        int i2 = (!ppk.e(i, 0) && ppk.e(i, 1)) ? 1 : 0;
        fp fpVar = new fp(4, pocVar);
        int i3 = Build.VERSION.SDK_INT;
        wjh wjhVar = this.d;
        if (i3 >= 34) {
            wjhVar.getClass();
            iArrG = aqk.l(wjhVar, rectFR, i2, fpVar);
        } else {
            iArrG = wpk.g(wjhVar, wjhVar.f, wjhVar.c(), rectFR, i2, fpVar);
        }
        return iArrG == null ? kkh.b : mwa.m(iArrG[0], iArrG[1]);
    }

    public final float d() {
        return rl4.h(this.c);
    }

    public final void e(fb2 fb2Var) {
        Canvas canvasB = jz.b(fb2Var);
        wjh wjhVar = this.d;
        if (wjhVar.d) {
            canvasB.save();
            canvasB.clipRect(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, d(), b());
        }
        int i = wjhVar.h;
        if (canvasB.getClipBounds(wjhVar.p)) {
            if (i != 0) {
                canvasB.translate(MTTypesetterKt.kLineSkipLimitMultiplier, i);
            }
            ThreadLocal threadLocal = bkh.a;
            Object hdhVar = threadLocal.get();
            if (hdhVar == null) {
                hdhVar = new hdh();
                threadLocal.set(hdhVar);
            }
            hdh hdhVar2 = (hdh) hdhVar;
            hdhVar2.a = canvasB;
            try {
                wjhVar.f.draw(hdhVar2);
                if (i != 0) {
                    canvasB.translate(MTTypesetterKt.kLineSkipLimitMultiplier, (-1.0f) * i);
                }
            } finally {
                hdhVar2.a = null;
            }
        }
        if (wjhVar.d) {
            canvasB.restore();
        }
    }

    public final void f(fb2 fb2Var, long j, uzf uzfVar, qeh qehVar, yd6 yd6Var) {
        s60 s60Var = this.a.K;
        int i = s60Var.c;
        s60Var.d(j);
        s60Var.f(uzfVar);
        s60Var.g(qehVar);
        s60Var.e(yd6Var);
        s60Var.b(3);
        e(fb2Var);
        s60Var.b(i);
    }

    public final void g(fb2 fb2Var, jy1 jy1Var, float f, uzf uzfVar, qeh qehVar, yd6 yd6Var) {
        s60 s60Var = this.a.K;
        int i = s60Var.c;
        float fD = d();
        s60Var.c(jy1Var, (((long) Float.floatToRawIntBits(b())) & 4294967295L) | (Float.floatToRawIntBits(fD) << 32), f);
        s60Var.f(uzfVar);
        s60Var.g(qehVar);
        s60Var.e(yd6Var);
        s60Var.b(3);
        e(fb2Var);
        s60Var.b(i);
    }
}
