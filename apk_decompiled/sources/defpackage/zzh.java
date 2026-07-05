package defpackage;

import com.anthropic.claude.types.strings.ChatId;

/* JADX INFO: loaded from: classes.dex */
public final class zzh extends xzg implements rz7 {
    public final /* synthetic */ int E;
    public /* synthetic */ boolean F;
    public /* synthetic */ Object G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zzh(q0i q0iVar, tp4 tp4Var, int i) {
        super(3, tp4Var);
        this.E = i;
        this.G = q0iVar;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                ((ChatId) obj).m984unboximpl();
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                zzh zzhVar = new zzh((q0i) this.G, (tp4) obj3, 0);
                zzhVar.F = zBooleanValue;
                zzhVar.invokeSuspend(ieiVar);
                return ieiVar;
            case 1:
                ((ChatId) obj).m984unboximpl();
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                zzh zzhVar2 = new zzh((q0i) this.G, (tp4) obj3, 1);
                zzhVar2.F = zBooleanValue2;
                zzhVar2.invokeSuspend(ieiVar);
                return ieiVar;
            default:
                boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                zzh zzhVar3 = new zzh(3, (tp4) obj3);
                zzhVar3.G = (cpc) obj;
                zzhVar3.F = zBooleanValue3;
                return zzhVar3.invokeSuspend(ieiVar);
        }
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                boolean z = this.F;
                sf5.h0(obj);
                ((q0i) this.G).o.q(z);
                return ieiVar;
            case 1:
                boolean z2 = this.F;
                sf5.h0(obj);
                ((q0i) this.G).o.q(z2);
                return ieiVar;
            default:
                cpc cpcVar = (cpc) this.G;
                boolean z3 = this.F;
                sf5.h0(obj);
                return new cpc(cpcVar.F, Boolean.valueOf(z3));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zzh(int i, tp4 tp4Var) {
        super(i, tp4Var);
        this.E = 2;
    }
}
