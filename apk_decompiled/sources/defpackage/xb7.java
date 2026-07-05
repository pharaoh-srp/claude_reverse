package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class xb7 implements u9d {
    public final int a;
    public final nwb b;
    public final jj2 c;
    public final tx d;
    public final tx e;
    public final ebj f;
    public final ebj g;
    public final ux h;
    public final ux i;
    public final fbj j;
    public final fbj k;

    public xb7(cz5 cz5Var, int i, nwb nwbVar, jj2 jj2Var) {
        qnc qncVar = ldb.a;
        int iM0 = cz5Var.M0(48.0f);
        this.a = i;
        this.b = nwbVar;
        this.c = jj2Var;
        vo1 vo1Var = lja.S;
        this.d = new tx(vo1Var, vo1Var, 0);
        vo1 vo1Var2 = lja.U;
        this.e = new tx(vo1Var2, vo1Var2, 0);
        this.f = new ebj(ac1.d);
        this.g = new ebj(ac1.e);
        wo1 wo1Var = lja.P;
        wo1 wo1Var2 = lja.R;
        this.h = new ux(wo1Var, wo1Var2, 0);
        this.i = new ux(wo1Var2, wo1Var, 0);
        this.j = new fbj(wo1Var, iM0);
        this.k = new fbj(wo1Var2, iM0);
    }

    @Override // defpackage.u9d
    public final long a(c79 c79Var, long j, fu9 fu9Var, long j2) {
        c79 c79Var2;
        char c;
        long j3;
        int iA;
        nwb nwbVar = this.b;
        if (nwbVar != null) {
            nwbVar.getValue();
        }
        char c2 = ' ';
        long j4 = 4294967295L;
        long j5 = (((long) ((int) (j >> 32))) << 32) | (((long) (((int) (j & 4294967295L)) + this.a)) & 4294967295L);
        int i = (int) (j5 >> 32);
        int i2 = 0;
        List listX = x44.X(this.d, this.e, ((int) (c79Var.b() >> 32)) < i / 2 ? this.f : this.g);
        int size = listX.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                c79Var2 = c79Var;
                c = c2;
                j3 = j4;
                iA = 0;
                break;
            }
            c = c2;
            j3 = j4;
            int i4 = (int) (j2 >> c);
            int i5 = size;
            int i6 = i3;
            c79Var2 = c79Var;
            List list = listX;
            iA = ((tdb) listX.get(i3)).a(c79Var2, j5, i4, fu9Var);
            if (i6 == list.size() - 1 || (iA >= 0 && i4 + iA <= i)) {
                break;
            }
            i3 = i6 + 1;
            listX = list;
            size = i5;
            c2 = c;
            j4 = j3;
        }
        int i7 = (int) (j5 & j3);
        List listX2 = x44.X(this.h, this.i, ((int) (c79Var2.b() & j3)) < i7 / 2 ? this.j : this.k);
        int size2 = listX2.size();
        for (int i8 = 0; i8 < size2; i8++) {
            int i9 = (int) (j2 & j3);
            int iA2 = ((udb) listX2.get(i8)).a(c79Var2, j5, i9);
            if (i8 == listX2.size() - 1 || (iA2 >= 0 && i9 + iA2 <= i7)) {
                i2 = iA2;
                break;
            }
        }
        long j6 = (((long) iA) << c) | (((long) i2) & j3);
        this.c.invoke(c79Var2, eve.f(j6, j2));
        return j6;
    }
}
