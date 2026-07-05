package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class uu7 {
    public static final float[] a = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
    public static volatile jgg b = new jgg(0);
    public static final Object[] c;

    static {
        Object[] objArr = new Object[0];
        c = objArr;
        synchronized (objArr) {
            b.c(115, new vu7(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            b.c(130, new vu7(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            b.c(150, new vu7(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            b.c(180, new vu7(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            b.c(200, new vu7(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((b.b(0) / 100.0f) - 0.01f > 1.03f) {
            return;
        }
        d39.b("You should only apply non-linear scaling to font scales > 1");
    }

    public static tu7 a(float f) {
        float fB;
        tu7 vu7Var;
        float[] fArr = a;
        if (f < 1.03f) {
            return null;
        }
        jgg jggVar = b;
        int i = (int) (f * 100.0f);
        jggVar.getClass();
        tu7 tu7Var = (tu7) jwj.f(jggVar, i);
        if (tu7Var != null) {
            return tu7Var;
        }
        jgg jggVar2 = b;
        int iH = sf5.h(jggVar2.G, i, jggVar2.E);
        if (iH >= 0) {
            return (tu7) b.d(iH);
        }
        int i2 = -(iH + 1);
        int i3 = i2 - 1;
        if (i2 >= b.G) {
            vu7 vu7Var2 = new vu7(new float[]{1.0f}, new float[]{f});
            b(f, vu7Var2);
            return vu7Var2;
        }
        if (i3 < 0) {
            vu7Var = new vu7(fArr, fArr);
            fB = 1.0f;
        } else {
            fB = b.b(i3) / 100.0f;
            vu7Var = (tu7) b.d(i3);
        }
        float fG = lnk.g(MTTypesetterKt.kLineSkipLimitMultiplier, 1.0f, fB, b.b(i2) / 100.0f, f);
        tu7 tu7Var2 = (tu7) b.d(i2);
        float[] fArr2 = new float[9];
        for (int i4 = 0; i4 < 9; i4++) {
            float f2 = fArr[i4];
            fArr2[i4] = lnk.i(vu7Var.b(f2), tu7Var2.b(f2), fG);
        }
        vu7 vu7Var3 = new vu7(fArr, fArr2);
        b(f, vu7Var3);
        return vu7Var3;
    }

    public static void b(float f, vu7 vu7Var) {
        synchronized (c) {
            jgg jggVarClone = b.clone();
            jggVarClone.c((int) (f * 100.0f), vu7Var);
            b = jggVarClone;
        }
    }
}
