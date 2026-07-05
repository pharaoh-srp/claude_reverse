package com.anthropic.claude.chat.input.files;

import defpackage.agj;
import defpackage.iei;
import defpackage.pz7;
import defpackage.sf5;
import defpackage.tp4;
import defpackage.xzg;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends xzg implements pz7 {
    public /* synthetic */ Object E;

    public h() {
        super(2, null);
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        h hVar = new h(2, tp4Var);
        hVar.E = obj;
        return hVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((agj) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        agj agjVar = (agj) this.E;
        sf5.h0(obj);
        return Boolean.valueOf(agjVar.b.a());
    }
}
