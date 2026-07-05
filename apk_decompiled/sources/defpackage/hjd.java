package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class hjd extends ts9 implements bz7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ jjd G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hjd(jjd jjdVar, int i) {
        super(1);
        this.F = i;
        this.G = jjdVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.F;
        iei ieiVar = iei.a;
        jjd jjdVar = this.G;
        switch (i) {
            case 0:
                Map map = (Map) obj;
                map.getClass();
                map.put("profiler_is_running", Boolean.valueOf(jjdVar.G.n(jjdVar.E.getName())));
                break;
            default:
                Map map2 = (Map) obj;
                map2.getClass();
                map2.put("profiler_is_running", Boolean.valueOf(jjdVar.G.n(jjdVar.E.getName())));
                break;
        }
        return ieiVar;
    }
}
