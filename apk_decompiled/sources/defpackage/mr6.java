package defpackage;

import com.anthropic.claude.code.remote.stores.b;

/* JADX INFO: loaded from: classes2.dex */
public final class mr6 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ b G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mr6(b bVar, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = bVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        b bVar = this.G;
        switch (i) {
            case 0:
                return new mr6(bVar, tp4Var, 0);
            case 1:
                return new mr6(bVar, tp4Var, 1);
            default:
                return new mr6(bVar, tp4Var, 2);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        l45 l45Var = (l45) obj;
        tp4 tp4Var = (tp4) obj2;
        switch (i) {
        }
        return ((mr6) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        b bVar = this.G;
        m45 m45Var = m45.E;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    jwf jwfVar = bVar.a;
                    this.F = 1;
                    Object objH = jwf.h(jwfVar, null, null, null, this, 15);
                    if (objH == m45Var) {
                    }
                } else if (i2 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            case 1:
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    jwf jwfVar2 = bVar.a;
                    Integer num = new Integer(100);
                    this.F = 1;
                    Object objJ = jwf.j(jwfVar2, null, num, null, false, this, 27);
                    if (objJ == m45Var) {
                    }
                } else if (i3 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            default:
                int i4 = this.F;
                if (i4 == 0) {
                    sf5.h0(obj);
                    jwf jwfVar3 = bVar.a;
                    this.F = 1;
                    Object objN = jwfVar3.a.N(this);
                    if (objN == m45Var) {
                    }
                } else if (i4 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
        }
        return m45Var;
    }
}
