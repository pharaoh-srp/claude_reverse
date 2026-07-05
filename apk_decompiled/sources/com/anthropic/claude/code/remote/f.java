package com.anthropic.claude.code.remote;

import com.anthropic.claude.analytics.events.DispatchEvents$StarterIntroCompleted;
import com.anthropic.claude.analytics.events.DispatchEvents$StarterIntroDismissReason;
import com.anthropic.claude.code.remote.CodeSessionListScope;
import com.anthropic.claude.types.strings.SessionId;
import defpackage.iei;
import defpackage.kgc;
import defpackage.l45;
import defpackage.lsc;
import defpackage.pz7;
import defpackage.qi3;
import defpackage.sf5;
import defpackage.tp4;
import defpackage.vb7;
import defpackage.x44;
import defpackage.xzg;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends xzg implements pz7 {
    public final /* synthetic */ c E;
    public final /* synthetic */ String F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ boolean H;
    public final /* synthetic */ qi3 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(c cVar, String str, boolean z, boolean z2, qi3 qi3Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = cVar;
        this.F = str;
        this.G = z;
        this.H = z2;
        this.I = qi3Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        return new f(this.E, this.F, this.G, this.H, this.I, tp4Var);
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        f fVar = (f) create((l45) obj, (tp4) obj2);
        iei ieiVar = iei.a;
        fVar.invokeSuspend(ieiVar);
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        sf5.h0(obj);
        c cVar = this.E;
        lsc lscVar = cVar.y;
        lsc lscVar2 = cVar.T;
        String str = this.F;
        lscVar.setValue(str != null ? SessionId.m1114boximpl(str) : null);
        cVar.z.setValue(Boolean.valueOf(this.G));
        if (x44.r(cVar.q, CodeSessionListScope.DramaticShrimp.INSTANCE) && this.H && !((Boolean) lscVar2.getValue()).booleanValue()) {
            if (cVar.Z() instanceof kgc) {
                this.I.e(new DispatchEvents$StarterIntroCompleted(DispatchEvents$StarterIntroDismissReason.AUTO_NAVIGATION), DispatchEvents$StarterIntroCompleted.Companion.serializer());
            }
            vb7.B(cVar.i.a, "cowork_starter_seen", true);
            lscVar2.setValue(Boolean.TRUE);
        }
        return iei.a;
    }
}
