package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bxe implements bz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ int F;
    public final /* synthetic */ int G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;

    public /* synthetic */ bxe(eij eijVar, int i, c3d c3dVar, int i2, q5b q5bVar) {
        this.H = eijVar;
        this.F = i;
        this.I = c3dVar;
        this.G = i2;
        this.J = q5bVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj2 = this.J;
        Object obj3 = this.I;
        Object obj4 = this.H;
        switch (i) {
            case 0:
                c3d[] c3dVarArr = (c3d[]) obj4;
                cxe cxeVar = (cxe) obj3;
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
                    iuj iujVar = yweVar != null ? yweVar.c : null;
                    int i5 = this.F;
                    b3dVar.f(c3dVar, iArr[i3], iujVar != null ? iujVar.l(i5, c3dVar.F, fu9.E, c3dVar, this.G) : cxeVar.b.a(c3dVar.F, i5), MTTypesetterKt.kLineSkipLimitMultiplier);
                    i2++;
                    i3 = i4;
                }
                break;
            default:
                c3d c3dVar2 = (c3d) obj3;
                b3d.j((b3d) obj, c3dVar2, ((y69) ((eij) obj4).U.invoke(new g79((((long) (this.F - c3dVar2.E)) << 32) | (((long) (this.G - c3dVar2.F)) & 4294967295L)), ((q5b) obj2).getLayoutDirection())).a);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ bxe(c3d[] c3dVarArr, cxe cxeVar, int i, int i2, int[] iArr) {
        this.H = c3dVarArr;
        this.I = cxeVar;
        this.F = i;
        this.G = i2;
        this.J = iArr;
    }
}
