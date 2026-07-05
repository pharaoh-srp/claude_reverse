package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class z91 implements vef {
    public final /* synthetic */ int a;
    public final long b;
    public final Object c;

    public z91(long j, long j2) {
        this.a = 2;
        this.b = j;
        xef xefVar = j2 == 0 ? xef.c : new xef(0L, j2);
        this.c = new uef(xefVar, xefVar);
    }

    @Override // defpackage.vef
    public final boolean b() {
        switch (this.a) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.vef
    public final uef e(long j) {
        int i = this.a;
        int i2 = 1;
        Object obj = this.c;
        switch (i) {
            case 0:
                aa1 aa1Var = (aa1) obj;
                uef uefVarB = aa1Var.i[0].b(j);
                while (true) {
                    wf3[] wf3VarArr = aa1Var.i;
                    if (i2 >= wf3VarArr.length) {
                        return uefVarB;
                    }
                    uef uefVarB2 = wf3VarArr[i2].b(j);
                    if (uefVarB2.a.b < uefVarB.a.b) {
                        uefVarB = uefVarB2;
                    }
                    i2++;
                }
                break;
            case 1:
                zm7 zm7Var = (zm7) obj;
                zm7Var.k.getClass();
                i49 i49Var = zm7Var.k;
                long[] jArr = (long[]) i49Var.F;
                long[] jArr2 = (long[]) i49Var.G;
                int iD = tpi.d(jArr, tpi.h((((long) zm7Var.e) * j) / 1000000, 0L, zm7Var.j - 1), false);
                long j2 = iD == -1 ? 0L : jArr[iD];
                long j3 = iD != -1 ? jArr2[iD] : 0L;
                int i3 = zm7Var.e;
                long j4 = (j2 * 1000000) / ((long) i3);
                long j5 = this.b;
                xef xefVar = new xef(j4, j3 + j5);
                if (j4 == j || iD == jArr.length - 1) {
                    return new uef(xefVar, xefVar);
                }
                int i4 = iD + 1;
                return new uef(xefVar, new xef((jArr[i4] * 1000000) / ((long) i3), j5 + jArr2[i4]));
            default:
                return (uef) obj;
        }
    }

    @Override // defpackage.vef
    public final long g() {
        switch (this.a) {
            case 0:
                return this.b;
            case 1:
                return ((zm7) this.c).b();
            default:
                return this.b;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public z91(long j) {
        this(j, 0L);
        this.a = 2;
    }

    public /* synthetic */ z91(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }
}
