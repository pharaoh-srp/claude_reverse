package defpackage;

import android.content.Context;
import com.agog.mathdisplay.render.MTTypesetterKt;
import io.sentry.e0;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import okio.Buffer;

/* JADX INFO: loaded from: classes.dex */
public final class zp3 implements b45, fdg, ia4, ro7, d22, m6e, xp3, lp3, emi, neg {
    public static er9 J;
    public static zp3 b0;
    public final /* synthetic */ int E;
    public static final zp3 F = new zp3(1);
    public static final /* synthetic */ zp3 G = new zp3(2);
    public static final zp3 H = new zp3(3);
    public static final zp3 I = new zp3(4);
    public static final zp3 K = new zp3(6);
    public static final dqc L = new dqc("NoMotion", 0);
    public static final dqc M = new dqc("AnimateBounds", 3);
    public static final dqc N = new dqc("EnterFromLeft", 2);
    public static final dqc O = new dqc("EnterFromRight", 2);
    public static final dqc P = new dqc("EnterFromLeftDelayed", 2);
    public static final dqc Q = new dqc("EnterFromRightDelayed", 2);
    public static final dqc R = new dqc("ExitToLeft", 1);
    public static final dqc S = new dqc("ExitToRight", 1);
    public static final dqc T = new dqc("EnterWithExpand", 2);
    public static final dqc U = new dqc("ExitWithShrink", 1);
    public static final dqc V = new dqc("EnterAsModal", 6);
    public static final dqc W = new dqc("ExitAsModal", 5);
    public static final zp3 X = new zp3(8);
    public static final zp3 Y = new zp3(9);
    public static final zp3 Z = new zp3(10);
    public static final /* synthetic */ zp3 a0 = new zp3(11);

    public zp3(bh5 bh5Var, k99 k99Var) {
        this.E = 27;
    }

    public static final float e(float f, float[] fArr, float[] fArr2) {
        float f2;
        float f3;
        float f4;
        float fAbs = Math.abs(f);
        float fSignum = Math.signum(f);
        int iBinarySearch = Arrays.binarySearch(fArr, fAbs);
        if (iBinarySearch >= 0) {
            return fSignum * fArr2[iBinarySearch];
        }
        int i = -(iBinarySearch + 1);
        int i2 = i - 1;
        int length = fArr.length - 1;
        float f5 = MTTypesetterKt.kLineSkipLimitMultiplier;
        if (i2 >= length) {
            float f6 = fArr[fArr.length - 1];
            return f6 == MTTypesetterKt.kLineSkipLimitMultiplier ? MTTypesetterKt.kLineSkipLimitMultiplier : (fArr2[fArr.length - 1] / f6) * f;
        }
        if (i2 == -1) {
            f2 = fArr[0];
            f3 = fArr2[0];
            f4 = 0.0f;
        } else {
            float f7 = fArr[i2];
            f2 = fArr[i];
            f5 = fArr2[i2];
            f3 = fArr2[i];
            f4 = f7;
        }
        return lnk.g(f5, f3, f4, f2, fAbs) * fSignum;
    }

    public static ArrayList h(List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((bvd) obj) != bvd.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(x44.y(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((bvd) it.next()).E);
        }
        return arrayList2;
    }

    public static byte[] j(List list) {
        list.getClass();
        Buffer buffer = new Buffer();
        for (String str : h(list)) {
            buffer.B0(str.length());
            buffer.T0(str);
        }
        return buffer.K(buffer.F);
    }

    public static qqb l(qqb qqbVar) {
        xw7 xw7VarG = m06.g(qqbVar);
        String str = ue9.a;
        ww7 ww7Var = (ww7) ue9.k.get(xw7VarG);
        if (ww7Var != null) {
            return o06.e(qqbVar).i(ww7Var);
        }
        e0.d(qqbVar, " is not a read-only collection", "Given class ");
        return null;
    }

    public static ek0 m(String str) {
        Object next;
        str.getClass();
        Iterator<E> it = ek0.I.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            ek0 ek0Var = (ek0) next;
            if (ek0Var.E.equals(str) || x44.r(ek0Var.name(), str)) {
                break;
            }
        }
        ek0 ek0Var2 = (ek0) next;
        return ek0Var2 == null ? ek0.G : ek0Var2;
    }

    @Override // defpackage.m4i
    public void a(Context context) {
    }

    @Override // defpackage.d22
    public byte[] b(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    @Override // defpackage.xp3
    public c69 c() {
        Instant instantNow = Instant.now();
        instantNow.getClass();
        c69 c69Var = c69.G;
        return d4c.P(instantNow.getNano(), instantNow.getEpochSecond());
    }

    @Override // defpackage.ro7
    public float f() {
        return MTTypesetterKt.kLineSkipLimitMultiplier;
    }

    @Override // defpackage.ro7
    public float g(float f, long j) {
        return MTTypesetterKt.kLineSkipLimitMultiplier;
    }

    @Override // defpackage.m6e
    public yr9 getType() {
        throw new IllegalStateException("This method should not be called");
    }

    @Override // defpackage.ro7
    public long i(float f) {
        return 0L;
    }

    @Override // defpackage.m4i
    public void k(k99 k99Var, Context context) {
        k99Var.getClass();
        context.getClass();
    }

    @Override // defpackage.ro7
    public float o(float f, float f2) {
        return MTTypesetterKt.kLineSkipLimitMultiplier;
    }

    @Override // defpackage.fdg
    public boolean q(Object obj, Object obj2) {
        return obj == obj2;
    }

    @Override // defpackage.ia4
    public Object s(el5 el5Var) {
        return new l57(el5Var.e(xkb.class));
    }

    @Override // defpackage.ro7
    public float t(long j, float f, float f2) {
        return MTTypesetterKt.kLineSkipLimitMultiplier;
    }

    public String toString() {
        switch (this.E) {
            case 8:
                return "ReferentialEqualityPolicy";
            case 28:
                return "NO_SOURCE";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.lp3
    public Object w(Context context, Object obj, String str, cxh cxhVar) {
        return pyk.E0("Map displayed.");
    }

    public /* synthetic */ zp3(int i) {
        this.E = i;
    }
}
