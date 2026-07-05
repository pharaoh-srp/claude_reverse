package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final class oaf extends xzg implements pz7 {
    public raf E;
    public cae F;
    public long G;
    public int H;
    public /* synthetic */ Object I;
    public final /* synthetic */ raf J;
    public final /* synthetic */ cae K;
    public final /* synthetic */ long L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oaf(raf rafVar, cae caeVar, long j, tp4 tp4Var) {
        super(2, tp4Var);
        this.J = rafVar;
        this.K = caeVar;
        this.L = j;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        oaf oafVar = new oaf(this.J, this.K, this.L, tp4Var);
        oafVar.I = obj;
        return oafVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((oaf) create((paf) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        raf rafVar;
        cae caeVar;
        raf rafVar2;
        long j;
        int i = this.H;
        int i2 = 2;
        ukc ukcVar = ukc.F;
        if (i == 0) {
            sf5.h0(obj);
            paf pafVar = (paf) this.I;
            rafVar = this.J;
            iy iyVar = new iy(rafVar, i2, pafVar);
            eo7 eo7Var = rafVar.c;
            cae caeVar2 = this.K;
            long j2 = caeVar2.E;
            ukc ukcVar2 = rafVar.d;
            long j3 = this.L;
            float fD = rafVar.d(ukcVar2 == ukcVar ? qsi.d(j3) : qsi.e(j3));
            this.I = rafVar;
            this.E = rafVar;
            this.F = caeVar2;
            this.G = j2;
            this.H = 1;
            obj = eo7Var.a(iyVar, fD, this);
            m45 m45Var = m45.E;
            if (obj == m45Var) {
                return m45Var;
            }
            caeVar = caeVar2;
            rafVar2 = rafVar;
            j = j2;
        } else {
            if (i != 1) {
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.G;
            caeVar = this.F;
            rafVar = this.E;
            rafVar2 = (raf) this.I;
            sf5.h0(obj);
        }
        float fD2 = rafVar2.d(((Number) obj).floatValue());
        caeVar.E = rafVar.d == ukcVar ? qsi.b(j, fD2, MTTypesetterKt.kLineSkipLimitMultiplier, 2) : qsi.b(j, MTTypesetterKt.kLineSkipLimitMultiplier, fD2, 1);
        return iei.a;
    }
}
