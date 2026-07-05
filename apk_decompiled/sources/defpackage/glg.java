package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class glg extends uw7 {
    public final /* synthetic */ vef b;
    public final /* synthetic */ xg8 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public glg(xg8 xg8Var, vef vefVar, vef vefVar2) {
        super(vefVar);
        this.c = xg8Var;
        this.b = vefVar2;
    }

    @Override // defpackage.uw7, defpackage.vef
    public final uef e(long j) {
        uef uefVarE = this.b.e(j);
        xef xefVar = uefVarE.a;
        long j2 = xefVar.a;
        long j3 = xefVar.b;
        long j4 = this.c.E;
        xef xefVar2 = new xef(j2, j3 + j4);
        xef xefVar3 = uefVarE.b;
        return new uef(xefVar2, new xef(xefVar3.a, xefVar3.b + j4));
    }
}
