package defpackage;

import android.content.Context;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class iyk extends t3 {
    public final /* synthetic */ int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iyk(int i) {
        super(4);
        this.G = i;
    }

    @Override // defpackage.t3
    public final Object g(Object obj) {
        switch (this.G) {
            case 0:
                wkb wkbVarC = wkb.c();
                return new yxk(wkbVarC.b(), (w2g) wkbVarC.a(w2g.class), new pxk(wkb.c().b(), (axk) obj));
            case 1:
                wkb wkbVarC2 = wkb.c();
                return new zxk(wkbVarC2.b(), (w2g) wkbVarC2.a(w2g.class), new qxk(wkb.c().b(), (bxk) obj, 0));
            default:
                wkb wkbVarC3 = wkb.c();
                Context contextB = wkb.c().b();
                ArrayList arrayList = new ArrayList();
                yl4 yl4Var = new yl4();
                g42 g42Var = g42.e;
                n6i.b(contextB);
                n6i.a().c(g42Var);
                g42.d.contains(new en6("json"));
                arrayList.add(yl4Var);
                return new hzk(wkbVarC3.b(), (w2g) wkbVarC3.a(w2g.class));
        }
    }
}
