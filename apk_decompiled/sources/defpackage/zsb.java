package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zsb implements wd7 {
    public long A;
    public yd7 B;
    public ysb[] C;
    public long[][] D;
    public int E;
    public xrb F;
    public final bxg a;
    public final int b;
    public final boolean c;
    public final ssc d;
    public final ssc e;
    public final ssc f;
    public final ssc g;
    public final ArrayDeque h;
    public final kff i;
    public final ArrayList j;
    public vde k;
    public int l;
    public int m;
    public long n;
    public int o;
    public ssc p;
    public int q;
    public int r;
    public int s;
    public int t;
    public boolean u;
    public boolean v;
    public boolean w;
    public long x;
    public boolean y;
    public boolean z;

    public zsb(bxg bxgVar, int i) {
        this.a = bxgVar;
        this.b = i;
        this.c = (i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0;
        iz8 iz8Var = nz8.F;
        this.k = vde.I;
        this.l = (i & 4) != 0 ? 3 : 0;
        this.i = new kff();
        this.j = new ArrayList();
        this.g = new ssc(16);
        this.h = new ArrayDeque();
        this.d = new ssc(stj.b);
        this.e = new ssc(6);
        this.f = new ssc();
        this.q = -1;
        this.B = yd7.j;
        this.C = new ysb[0];
    }

    @Override // defpackage.wd7
    public final void a() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x057f  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x058b  */
    @Override // defpackage.wd7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(defpackage.xd7 r40, defpackage.xm7 r41) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instruction units count: 1970
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zsb.b(xd7, xm7):int");
    }

    @Override // defpackage.wd7
    public final boolean c(xd7 xd7Var) {
        vde vdeVarU;
        qdg qdgVarM = gwj.m(xd7Var, false, (this.b & 2) != 0);
        if (qdgVarM != null) {
            vdeVarU = nz8.u(qdgVarM);
        } else {
            iz8 iz8Var = nz8.F;
            vdeVarU = vde.I;
        }
        this.k = vdeVarU;
        return qdgVarM == null;
    }

    @Override // defpackage.wd7
    public final void d(long j, long j2) {
        this.h.clear();
        this.o = 0;
        this.q = -1;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = false;
        this.z = false;
        if (j == 0) {
            if (this.l != 3) {
                this.l = 0;
                this.o = 0;
                return;
            } else {
                kff kffVar = this.i;
                kffVar.a.clear();
                kffVar.b = 0;
                this.j.clear();
                return;
            }
        }
        for (ysb ysbVar : this.C) {
            b4i b4iVar = ysbVar.b;
            int iA = b4iVar.a(j2);
            if (iA == -1) {
                iA = b4iVar.b(j2);
            }
            ysbVar.e = iA;
            t7i t7iVar = ysbVar.d;
            if (t7iVar != null) {
                t7iVar.b = false;
                t7iVar.c = 0;
            }
        }
    }

    @Override // defpackage.wd7
    public final List e() {
        return this.k;
    }

    @Override // defpackage.wd7
    public final void f(yd7 yd7Var) {
        if ((this.b & 16) == 0) {
            yd7Var = new s31(yd7Var, this.a);
        }
        this.B = yd7Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0134 A[EDGE_INSN: B:264:0x0134->B:74:0x0134 BREAK  A[LOOP:9: B:62:0x0102->B:72:0x012c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x012c A[LOOP:9: B:62:0x0102->B:72:0x012c, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(long r44) {
        /*
            Method dump skipped, instruction units count: 1128
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zsb.g(long):void");
    }
}
