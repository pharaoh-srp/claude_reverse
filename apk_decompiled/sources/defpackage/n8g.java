package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class n8g extends ts9 implements bz7 {
    public final /* synthetic */ long F;
    public final /* synthetic */ int G;
    public final /* synthetic */ int H;
    public final /* synthetic */ q5b I;
    public final /* synthetic */ c3d J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n8g(o8g o8gVar, long j, int i, int i2, q5b q5bVar, c3d c3dVar) {
        super(1);
        this.F = j;
        this.G = i;
        this.H = i2;
        this.I = q5bVar;
        this.J = c3dVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        b3d b3dVar = (b3d) obj;
        long j = (((long) this.G) << 32) | (((long) this.H) & 4294967295L);
        fu9 layoutDirection = this.I.getLayoutDirection();
        long j2 = this.F;
        float f = (((int) (j >> 32)) - ((int) (j2 >> 32))) / 2.0f;
        float f2 = (((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L))) / 2.0f;
        float f3 = layoutDirection == fu9.E ? -1.0f : (-1.0f) * (-1.0f);
        float f4 = (1.0f - 1.0f) * f2;
        int iRound = Math.round((f3 + 1.0f) * f);
        b3d.j(b3dVar, this.J, (((long) Math.round(f4)) & 4294967295L) | (((long) iRound) << 32));
        return iei.a;
    }
}
