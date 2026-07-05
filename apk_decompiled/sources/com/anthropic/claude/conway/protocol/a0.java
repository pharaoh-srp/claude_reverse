package com.anthropic.claude.conway.protocol;

import com.anthropic.claude.conway.protocol.StreamMessage;
import defpackage.iei;
import defpackage.ij0;
import defpackage.iuj;
import defpackage.l45;
import defpackage.m45;
import defpackage.n30;
import defpackage.pz7;
import defpackage.sf5;
import defpackage.sfa;
import defpackage.sz6;
import defpackage.tp4;
import defpackage.xzg;
import defpackage.yfa;
import defpackage.zfa;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class a0 extends xzg implements pz7 {
    public int E;
    public /* synthetic */ Object F;
    public final /* synthetic */ b0 G;
    public final /* synthetic */ StreamMessage H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(b0 b0Var, StreamMessage streamMessage, tp4 tp4Var) {
        super(2, tp4Var);
        this.G = b0Var;
        this.H = streamMessage;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        a0 a0Var = new a0(this.G, this.H, tp4Var);
        a0Var.F = obj;
        return a0Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((a0) create((l45) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        l45 l45Var = (l45) this.F;
        int i = this.E;
        try {
            if (i == 0) {
                sf5.h0(obj);
                b0 b0Var = this.G;
                String probeId = ((StreamMessage.HealthProbe) this.H).getProbeId();
                this.F = l45Var;
                this.E = 1;
                Object objD = b0.d(b0Var, probeId, this);
                m45 m45Var = m45.E;
                if (objD == m45Var) {
                    return m45Var;
                }
            } else {
                if (i != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sf5.h0(obj);
            }
        } catch (IOException e) {
            zfa.a.getClass();
            if (yfa.b()) {
                String strE = iuj.E(l45Var);
                CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : copyOnWriteArrayList) {
                    ((n30) ((zfa) obj2)).getClass();
                    arrayList.add(obj2);
                }
                if (!arrayList.isEmpty()) {
                    zfa.a.getClass();
                    String strI = ij0.i("health_response send failed: ", e.getMessage());
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((n30) ((zfa) it.next())).b(sfa.WARN, strE, strI);
                    }
                }
            }
        }
        return iei.a;
    }
}
