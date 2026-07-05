package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class tvb extends gre implements pz7 {
    public uvb F;
    public vvb G;
    public long[] H;
    public int I;
    public int J;
    public /* synthetic */ Object K;
    public final /* synthetic */ vvb L;
    public final /* synthetic */ uvb M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tvb(vvb vvbVar, uvb uvbVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.L = vvbVar;
        this.M = uvbVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        tvb tvbVar = new tvb(this.L, this.M, tp4Var);
        tvbVar.K = obj;
        return tvbVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((tvb) create((zmf) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        zmf zmfVar;
        vvb vvbVar;
        long[] jArr;
        int i;
        uvb uvbVar;
        int i2 = this.J;
        if (i2 == 0) {
            sf5.h0(obj);
            zmfVar = (zmf) this.K;
            vvbVar = this.L;
            svb svbVar = vvbVar.F;
            jArr = svbVar.c;
            i = svbVar.e;
            uvbVar = this.M;
        } else {
            if (i2 != 1) {
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.I;
            jArr = this.H;
            vvbVar = this.G;
            uvbVar = this.F;
            zmfVar = (zmf) this.K;
            sf5.h0(obj);
        }
        if (i == Integer.MAX_VALUE) {
            return iei.a;
        }
        int i3 = (int) ((jArr[i] >> 31) & 2147483647L);
        uvbVar.F = i;
        Object obj2 = vvbVar.F.b[i];
        this.K = zmfVar;
        this.F = uvbVar;
        this.G = vvbVar;
        this.H = jArr;
        this.I = i3;
        this.J = 1;
        zmfVar.d(this, obj2);
        return m45.E;
    }
}
