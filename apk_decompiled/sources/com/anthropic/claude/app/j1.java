package com.anthropic.claude.app;

import com.anthropic.claude.api.feature.Feature;
import com.anthropic.claude.app.ClaudeAppDestination;
import defpackage.iei;
import defpackage.lp7;
import defpackage.n30;
import defpackage.nf7;
import defpackage.pj3;
import defpackage.qj3;
import defpackage.qzb;
import defpackage.sfa;
import defpackage.tp4;
import defpackage.yfa;
import defpackage.zfa;
import defpackage.zqc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class j1 implements lp7 {
    public final /* synthetic */ zqc E;
    public final /* synthetic */ nf7 F;
    public final /* synthetic */ qzb G;

    public j1(zqc zqcVar, nf7 nf7Var, qzb qzbVar) {
        this.E = zqcVar;
        this.F = nf7Var;
        this.G = qzbVar;
    }

    @Override // defpackage.lp7
    public final Object g(Object obj, tp4 tp4Var) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        zfa.a.getClass();
        boolean zB = yfa.b();
        nf7 nf7Var = this.F;
        qzb qzbVar = this.G;
        zqc zqcVar = this.E;
        sfa sfaVar = sfa.DEBUG;
        if (zB) {
            CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : copyOnWriteArrayList) {
                ((n30) ((zfa) obj2)).getClass();
                arrayList.add(obj2);
            }
            if (!arrayList.isEmpty()) {
                zfa.a.getClass();
                String str = "isChatEnabled=" + zBooleanValue + " chatStatus=" + nf7Var.g(Feature.CHAT).getValue() + " codeEnabled=" + qzbVar.d() + " onChatScreen=" + l1.b(zqcVar);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((n30) ((zfa) it.next())).b(sfaVar, "ChatAccessGuard", str);
                }
            }
        }
        iei ieiVar = iei.a;
        if (zBooleanValue || !l1.b(zqcVar)) {
            return ieiVar;
        }
        ClaudeAppDestination.List listA = m1.a(nf7Var, qzbVar);
        zfa.a.getClass();
        if (yfa.b()) {
            CopyOnWriteArrayList copyOnWriteArrayList2 = yfa.b;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : copyOnWriteArrayList2) {
                ((n30) ((zfa) obj3)).getClass();
                arrayList2.add(obj3);
            }
            if (!arrayList2.isEmpty()) {
                zfa.a.getClass();
                String str2 = "bouncing to " + listA;
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ((n30) ((zfa) it2.next())).b(sfaVar, "ChatAccessGuard", str2);
                }
            }
        }
        zqcVar.E.m(new qj3(listA, zqcVar, 16), pj3.f0);
        return ieiVar;
    }
}
