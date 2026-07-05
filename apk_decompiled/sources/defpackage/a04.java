package defpackage;

import com.anthropic.claude.analytics.events.CodeEvents$SessionFilterSelected;
import com.anthropic.claude.code.remote.c;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a04 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ c F;

    public /* synthetic */ a04(c cVar, int i) {
        this.E = i;
        this.F = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        Object[] objArr = 0;
        c cVar = this.F;
        switch (i) {
            case 0:
                ((r4a) obj).getClass();
                gb9.D(cVar.a, null, null, new m61((boolean) (objArr == true ? 1 : 0), (Object) cVar, (tp4) null, 3), 3);
                return new le(19);
            default:
                srf srfVar = (srf) obj;
                srfVar.getClass();
                lsc lscVar = cVar.B;
                if (srfVar != ((srf) lscVar.getValue())) {
                    lscVar.setValue(srfVar);
                    if (cVar.q.getEmitsCodeTabTelemetry()) {
                        qi3 qi3Var = cVar.m;
                        String strM116getUuidXjkXN6I = cVar.n.a().e().m116getUuidXjkXN6I();
                        String strA = srfVar.a();
                        Integer num = (Integer) ((Map) cVar.H.getValue()).get(srfVar);
                        qi3Var.e(new CodeEvents$SessionFilterSelected(strM116getUuidXjkXN6I, strA, num != null ? num.intValue() : 0), CodeEvents$SessionFilterSelected.Companion.serializer());
                    }
                }
                return iei.a;
        }
    }
}
