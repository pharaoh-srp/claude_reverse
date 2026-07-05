package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class lh2 implements r08 {
    public final c45 E;
    public final int F;
    public final py1 G;

    public lh2(c45 c45Var, int i, py1 py1Var) {
        this.E = c45Var;
        this.F = i;
        this.G = py1Var;
    }

    @Override // defpackage.kp7
    public Object a(lp7 lp7Var, tp4 tp4Var) {
        Object objN = fd9.N(new cx(lp7Var, this, (tp4) null, 6), tp4Var);
        return objN == m45.E ? objN : iei.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    @Override // defpackage.r08
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.kp7 b(defpackage.c45 r5, int r6, defpackage.py1 r7) {
        /*
            r4 = this;
            c45 r0 = r4.E
            c45 r5 = r5.r0(r0)
            py1 r1 = defpackage.py1.E
            py1 r2 = r4.G
            int r3 = r4.F
            if (r7 == r1) goto Lf
            goto L26
        Lf:
            r7 = -3
            if (r3 != r7) goto L13
            goto L25
        L13:
            if (r6 != r7) goto L17
        L15:
            r6 = r3
            goto L25
        L17:
            r7 = -2
            if (r3 != r7) goto L1b
            goto L25
        L1b:
            if (r6 != r7) goto L1e
            goto L15
        L1e:
            int r6 = r6 + r3
            if (r6 < 0) goto L22
            goto L25
        L22:
            r6 = 2147483647(0x7fffffff, float:NaN)
        L25:
            r7 = r2
        L26:
            boolean r0 = defpackage.x44.r(r5, r0)
            if (r0 == 0) goto L31
            if (r6 != r3) goto L31
            if (r7 != r2) goto L31
            return r4
        L31:
            lh2 r4 = r4.h(r5, r6, r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lh2.b(c45, int, py1):kp7");
    }

    public String d() {
        return null;
    }

    public abstract Object g(aid aidVar, tp4 tp4Var);

    public abstract lh2 h(c45 c45Var, int i, py1 py1Var);

    public kp7 i() {
        return null;
    }

    public d6e j(l45 l45Var) {
        int i = this.F;
        if (i == -3) {
            i = -2;
        }
        pz7 dxVar = new dx(this, (tp4) null, 8);
        aid aidVar = new aid(zni.P(l45Var, this.E), wd6.P(i, 4, this.G));
        aidVar.w0(o45.G, aidVar, dxVar);
        return aidVar;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strD = d();
        if (strD != null) {
            arrayList.add(strD);
        }
        im6 im6Var = im6.E;
        c45 c45Var = this.E;
        if (c45Var != im6Var) {
            arrayList.add("context=" + c45Var);
        }
        int i = this.F;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        py1 py1Var = py1.E;
        py1 py1Var2 = this.G;
        if (py1Var2 != py1Var) {
            arrayList.add("onBufferOverflow=" + py1Var2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        return vb7.s(sb, w44.S0(arrayList, ", ", null, null, null, 62), ']');
    }
}
