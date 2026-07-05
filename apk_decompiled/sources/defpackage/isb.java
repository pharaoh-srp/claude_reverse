package defpackage;

import android.os.Build;
import android.view.ViewConfiguration;
import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class isb extends i6c {
    public final poj f;
    public final zy1 g;
    public fkg h;

    public isb(raf rafVar, poj pojVar, v9f v9fVar, cz5 cz5Var) {
        super(rafVar, v9fVar, cz5Var);
        this.f = pojVar;
        this.g = wd6.P(Integer.MAX_VALUE, 6, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(defpackage.isb r19, defpackage.raf r20, defpackage.esb r21, float r22, float r23, defpackage.vp4 r24) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.isb.d(isb, raf, esb, float, float, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(defpackage.isb r11, defpackage.dae r12, defpackage.aae r13, defpackage.raf r14, defpackage.dae r15, long r16, defpackage.vp4 r18) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.isb.e(isb, dae, aae, raf, dae, long, vp4):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static esb j(zy1 zy1Var) {
        esb esbVar = null;
        zmf zmfVarV = yb5.v(new f(new ln(zy1Var, 2), 0 == true ? 1 : 0, 6));
        while (zmfVarV.hasNext()) {
            esb esbVarA = (esb) zmfVarV.next();
            if (esbVar != null) {
                esbVarA = esbVar.a(esbVarA);
            }
            esbVar = esbVarA;
        }
        return esbVar;
    }

    public final float f(paf pafVar, float f) {
        raf rafVar = this.a;
        long jH = rafVar.h(rafVar.d(f));
        raf rafVar2 = pafVar.a;
        return rafVar.g(rafVar.e(rafVar2.c(rafVar2.k, jH, 1)));
    }

    public final boolean g(t7d t7dVar) {
        long j;
        cz5 cz5Var = this.c;
        ViewConfiguration viewConfiguration = (ViewConfiguration) this.f.E;
        int i = Build.VERSION.SDK_INT;
        float f = -(i > 26 ? viewConfiguration.getScaledVerticalScrollFactor() : cz5Var.q0(64.0f));
        float f2 = -(i > 26 ? viewConfiguration.getScaledHorizontalScrollFactor() : cz5Var.q0(64.0f));
        List list = t7dVar.a;
        fcc fccVar = new fcc(0L);
        int size = list.size();
        boolean zD = false;
        int i2 = 0;
        while (true) {
            j = fccVar.a;
            if (i2 >= size) {
                break;
            }
            fccVar = new fcc(fcc.i(j, ((z7d) list.get(i2)).j));
            i2++;
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) * f2)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) * f)) & 4294967295L);
        raf rafVar = this.a;
        float fI = rafVar.i(rafVar.e(jFloatToRawIntBits));
        if (fI != MTTypesetterKt.kLineSkipLimitMultiplier) {
            aaf aafVar = rafVar.a;
            zD = fI > MTTypesetterKt.kLineSkipLimitMultiplier ? aafVar.d() : aafVar.b();
        }
        if (zD) {
            return !(this.g.r(new esb(jFloatToRawIntBits, ((z7d) w44.L0(t7dVar.a)).b, false)) instanceof zh2);
        }
        return this.d;
    }

    public final void h(t7d t7dVar, u7d u7dVar, long j) {
        if (t7dVar.f == 6) {
            List list = t7dVar.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (((z7d) list.get(i)).l()) {
                    return;
                }
            }
            if (u7dVar == u7d.E && this.d) {
                g(t7dVar);
                i6c.a(t7dVar);
            }
            if (u7dVar == u7d.F && !this.d && g(t7dVar)) {
                i6c.a(t7dVar);
            }
        }
    }

    public final void i(l45 l45Var) {
        if (this.h == null) {
            this.h = gb9.D(l45Var, null, null, new kza(this, (tp4) null, 4), 3);
        }
    }
}
