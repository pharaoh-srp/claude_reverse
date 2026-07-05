package defpackage;

import android.content.Context;
import com.anthropic.claude.types.strings.AccountId;
import com.anthropic.claude.types.strings.OrganizationId;

/* JADX INFO: loaded from: classes.dex */
public final class za0 extends xzg implements pz7 {
    public /* synthetic */ Object E;
    public final /* synthetic */ bz7 F;
    public final /* synthetic */ m9j G;
    public final /* synthetic */ long H;
    public final /* synthetic */ Context I;
    public final /* synthetic */ rz7 J;
    public final /* synthetic */ zy7 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public za0(bz7 bz7Var, m9j m9jVar, long j, Context context, rz7 rz7Var, zy7 zy7Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.F = bz7Var;
        this.G = m9jVar;
        this.H = j;
        this.I = context;
        this.J = rz7Var;
        this.K = zy7Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        za0 za0Var = new za0(this.F, this.G, this.H, this.I, this.J, this.K, tp4Var);
        za0Var.E = obj;
        return za0Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        za0 za0Var = (za0) create((s9j) obj, (tp4) obj2);
        iei ieiVar = iei.a;
        za0Var.invokeSuspend(ieiVar);
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        s9j s9jVar = (s9j) this.E;
        sf5.h0(obj);
        if (s9jVar instanceof n9j) {
            this.F.invoke(((n9j) s9jVar).a());
        } else if (s9jVar instanceof o9j) {
            String strA = ((o9j) s9jVar).a();
            this.G.S(this.H, this.I, strA);
        } else if (s9jVar instanceof r9j) {
            r9j r9jVar = (r9j) s9jVar;
            this.J.invoke(AccountId.m943boximpl(r9jVar.a()), OrganizationId.m1065boximpl(r9jVar.c()), r9jVar.b());
        } else if (s9jVar instanceof p9j) {
            this.K.a();
        } else if (!(s9jVar instanceof q9j)) {
            mr9.b();
            return null;
        }
        return iei.a;
    }
}
