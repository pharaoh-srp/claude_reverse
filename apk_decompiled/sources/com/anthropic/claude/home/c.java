package com.anthropic.claude.home;

import defpackage.iei;
import defpackage.ih9;
import defpackage.pf6;
import defpackage.pz7;
import defpackage.sf5;
import defpackage.tp4;
import defpackage.uf6;
import defpackage.x44;
import defpackage.xbd;
import defpackage.xzg;
import defpackage.yvb;
import defpackage.zf6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends xzg implements pz7 {
    public /* synthetic */ Object E;
    public final /* synthetic */ uf6 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(uf6 uf6Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.F = uf6Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        c cVar = new c(this.F, tp4Var);
        cVar.E = obj;
        return cVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        c cVar = (c) create((yvb) obj, (tp4) obj2);
        iei ieiVar = iei.a;
        cVar.invokeSuspend(ieiVar);
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        yvb yvbVar = (yvb) this.E;
        sf5.h0(obj);
        xbd xbdVar = zf6.d;
        uf6 uf6Var = this.F;
        uf6Var.getClass();
        ih9 ih9Var = uf6.d;
        KSerializer kSerializerSerializer = DrawerTabPreferences$Persisted.Companion.serializer();
        List list = uf6Var.a;
        ArrayList arrayList = new ArrayList(x44.y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((pf6) it.next()).E);
        }
        List list2 = uf6Var.b;
        ArrayList arrayList2 = new ArrayList(x44.y(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((pf6) it2.next()).E);
        }
        yvbVar.d(xbdVar, ih9Var.d(new DrawerTabPreferences$Persisted(arrayList, arrayList2, uf6Var.c.E), kSerializerSerializer));
        return iei.a;
    }
}
