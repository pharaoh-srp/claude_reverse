package defpackage;

import android.content.Context;
import com.anthropic.claude.analytics.events.WebViewEvents$WebViewKind;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class aoi implements pz7 {
    public final /* synthetic */ int E;

    public /* synthetic */ aoi(int i) {
        this.E = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        final m7f m7fVar = (m7f) obj;
        bsc bscVar = (bsc) obj2;
        switch (this.E) {
            case 0:
                m7fVar.getClass();
                bscVar.getClass();
                Object obj3 = m7fVar.g;
                if (!(obj3 instanceof koi)) {
                    obj3 = null;
                }
                koi koiVar = (koi) obj3;
                if (koiVar != null) {
                    return koiVar;
                }
                sz6.j("Required value was null.");
                return null;
            case 1:
                m7fVar.getClass();
                bscVar.getClass();
                return new n10();
            default:
                m7fVar.getClass();
                bscVar.getClass();
                return new u4f() { // from class: w7j
                    @Override // defpackage.u4f
                    public final t4f a(Context context, String str) {
                        context.getClass();
                        str.getClass();
                        mrg mrgVar = nai.o;
                        kce kceVar = jce.a;
                        pl9 pl9VarB = kceVar.b(String.class);
                        m7f m7fVar2 = m7fVar;
                        return new t4f(context, (String) m7fVar2.a(pl9VarB, mrgVar, null), (ze0) m7fVar2.a(kceVar.b(ze0.class), null, null), (String) m7fVar2.a(kceVar.b(String.class), nai.m, null), (x4f) m7fVar2.a(kceVar.b(x4f.class), null, null), str, (h86) m7fVar2.a(kceVar.b(h86.class), null, null), (prb) m7fVar2.a(kceVar.b(prb.class), nai.x, null), (n3f) m7fVar2.a(kceVar.b(n3f.class), null, null), WebViewEvents$WebViewKind.ARTIFACT_SANDBOX, true);
                    }
                };
        }
    }
}
