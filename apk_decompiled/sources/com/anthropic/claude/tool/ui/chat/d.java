package com.anthropic.claude.tool.ui.chat;

import defpackage.iei;
import defpackage.jga;
import defpackage.nmd;
import defpackage.ppa;
import defpackage.rwe;
import defpackage.zy7;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ rwe F;
    public final /* synthetic */ Object G;

    public /* synthetic */ d(rwe rweVar, Object obj, int i) {
        this.E = i;
        this.F = rweVar;
        this.G = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj = this.G;
        rwe rweVar = this.F;
        switch (i) {
            case 0:
                jga jgaVar = new jga(14, new PhoneCallSheetDestination[]{obj});
                ppa ppaVar = new ppa(16);
                rweVar.getClass();
                rweVar.E.m(jgaVar, ppaVar);
                break;
            default:
                jga jgaVar2 = new jga(27, new FormSheetDestination[]{obj});
                nmd nmdVar = new nmd(4);
                rweVar.getClass();
                rweVar.E.m(jgaVar2, nmdVar);
                break;
        }
        return ieiVar;
    }
}
