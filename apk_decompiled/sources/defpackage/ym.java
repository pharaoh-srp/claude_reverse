package defpackage;

import com.anthropic.claude.sessions.types.SessionResource;

/* JADX INFO: loaded from: classes2.dex */
public final class ym extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ an G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ym(an anVar, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = anVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        an anVar = this.G;
        switch (i) {
            case 0:
                return new ym(anVar, tp4Var, 0);
            case 1:
                return new ym(anVar, tp4Var, 1);
            default:
                return new ym(anVar, tp4Var, 2);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.E;
        iei ieiVar = iei.a;
        l45 l45Var = (l45) obj;
        tp4 tp4Var = (tp4) obj2;
        switch (i) {
            case 0:
                ((ym) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
        }
        return ((ym) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) throws Throwable {
        SessionResource sessionResourceF;
        int i = this.E;
        iei ieiVar = iei.a;
        an anVar = this.G;
        m45 m45Var = m45.E;
        int i2 = 1;
        switch (i) {
            case 0:
                int i3 = this.F;
                if (i3 != 0) {
                    if (i3 == 1) {
                        throw sq6.y(obj);
                    }
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sf5.h0(obj);
                y3e y3eVar = ((vm) anVar.b).H;
                i7 i7Var = new i7(i2, anVar);
                this.F = 1;
                y3eVar.E.a(i7Var, this);
                return m45Var;
            case 1:
                int i4 = this.F;
                if (i4 == 0) {
                    sf5.h0(obj);
                    sl slVar = anVar.b;
                    this.F = 1;
                    if (((vm) slVar).h(this) != m45Var) {
                    }
                    return m45Var;
                }
                if (i4 != 1) {
                    if (i4 == 2) {
                        sf5.h0(obj);
                        return ieiVar;
                    }
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sf5.h0(obj);
                qzb qzbVar = anVar.c;
                sl slVar2 = anVar.b;
                if (qzbVar.b() || (sessionResourceF = ((vm) slVar2).f()) == null) {
                    return ieiVar;
                }
                String strM875getIdOcx55TE = sessionResourceF.m875getIdOcx55TE();
                this.F = 2;
                if (((vm) slVar2).n(strM875getIdOcx55TE, this) != m45Var) {
                    return ieiVar;
                }
                return m45Var;
            default:
                int i5 = this.F;
                if (i5 == 0) {
                    sf5.h0(obj);
                    sl slVar3 = anVar.b;
                    this.F = 1;
                    return ((vm) slVar3).m(this) == m45Var ? m45Var : ieiVar;
                }
                if (i5 == 1) {
                    sf5.h0(obj);
                    return ieiVar;
                }
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
