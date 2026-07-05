package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ew1 implements bz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ int F;
    public final /* synthetic */ int G;
    public final /* synthetic */ q5b H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;

    public /* synthetic */ ew1(c3d c3dVar, h5b h5bVar, q5b q5bVar, int i, int i2, fw1 fw1Var) {
        this.I = c3dVar;
        this.J = h5bVar;
        this.H = q5bVar;
        this.F = i;
        this.G = i2;
        this.K = fw1Var;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj2 = this.K;
        q5b q5bVar = this.H;
        Object obj3 = this.J;
        Object obj4 = this.I;
        switch (i) {
            case 0:
                dw1.b((b3d) obj, (c3d) obj4, (h5b) obj3, q5bVar.getLayoutDirection(), this.F, this.G, ((fw1) obj2).a);
                break;
            default:
                c3d[] c3dVarArr = (c3d[]) obj4;
                q64 q64Var = (q64) obj3;
                int[] iArr = (int[]) obj2;
                b3d b3dVar = (b3d) obj;
                int length = c3dVarArr.length;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    c3d c3dVar = c3dVarArr[i2];
                    int i4 = i3 + 1;
                    c3dVar.getClass();
                    Object objZ = c3dVar.z();
                    ywe yweVar = objZ instanceof ywe ? (ywe) objZ : null;
                    fu9 layoutDirection = q5bVar.getLayoutDirection();
                    iuj iujVar = yweVar != null ? yweVar.c : null;
                    int i5 = this.F;
                    b3dVar.f(c3dVar, iujVar != null ? iujVar.l(i5, c3dVar.E, layoutDirection, c3dVar, this.G) : q64Var.b.a(c3dVar.E, i5, layoutDirection), iArr[i3], MTTypesetterKt.kLineSkipLimitMultiplier);
                    i2++;
                    i3 = i4;
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ ew1(c3d[] c3dVarArr, q64 q64Var, int i, int i2, q5b q5bVar, int[] iArr) {
        this.I = c3dVarArr;
        this.J = q64Var;
        this.F = i;
        this.G = i2;
        this.H = q5bVar;
        this.K = iArr;
    }
}
