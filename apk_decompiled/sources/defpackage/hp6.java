package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final class hp6 extends ts9 implements bz7 {
    public final /* synthetic */ c3d F;
    public final /* synthetic */ long G;
    public final /* synthetic */ long H;
    public final /* synthetic */ v80 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hp6(c3d c3dVar, long j, long j2, v80 v80Var) {
        super(1);
        this.F = c3dVar;
        this.G = j;
        this.H = j2;
        this.I = v80Var;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        b3d b3dVar = (b3d) obj;
        long j = this.G;
        long j2 = this.H;
        b3dVar.getClass();
        c3d c3dVar = this.F;
        b3d.a(b3dVar, c3dVar);
        c3dVar.Z(y69.d((((long) (((int) (j >> 32)) + ((int) (j2 >> 32)))) << 32) | (((long) (((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L)))) & 4294967295L), c3dVar.I), MTTypesetterKt.kLineSkipLimitMultiplier, this.I);
        return iei.a;
    }
}
