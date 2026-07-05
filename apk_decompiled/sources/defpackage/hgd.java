package defpackage;

import com.anthropic.claude.analytics.events.GroveEvents$GroveLocation;
import com.anthropic.claude.analytics.events.GroveEvents$GrovePolicyToggled;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hgd implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ jgd F;

    public /* synthetic */ hgd(jgd jgdVar, int i) {
        this.E = i;
        this.F = jgdVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        jgd jgdVar = this.F;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        switch (i) {
            case 0:
                f9 f9Var = jgdVar.c;
                f9Var.getClass();
                f9Var.d(new q8(zBooleanValue, 5));
                break;
            default:
                if (((Boolean) jgdVar.h.getValue()).booleanValue() && zBooleanValue != ((Boolean) jgdVar.j.getValue()).booleanValue()) {
                    jgdVar.d.e(new GroveEvents$GrovePolicyToggled(zBooleanValue, GroveEvents$GroveLocation.SETTINGS), GroveEvents$GrovePolicyToggled.Companion.serializer());
                    gb9.D(jgdVar.a, null, null, new igd(jgdVar, zBooleanValue, null), 3);
                }
                break;
        }
        return ieiVar;
    }
}
