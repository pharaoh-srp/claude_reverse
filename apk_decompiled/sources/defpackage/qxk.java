package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class qxk {
    public final /* synthetic */ int a;
    public final Object b;

    public qxk(Context context, bxk bxkVar, int i) {
        this.a = i;
        switch (i) {
            case 1:
                g42 g42Var = g42.e;
                n6i.b(context);
                l6i l6iVarC = n6i.a().c(g42Var);
                if (g42.d.contains(new en6("json"))) {
                    new lw9(new cyk(l6iVarC, 2));
                }
                this.b = new lw9(new cyk(l6iVarC, 3));
                break;
            default:
                ArrayList arrayList = new ArrayList();
                this.b = arrayList;
                arrayList.add(new qxk(context, bxkVar, 1));
                break;
        }
    }

    public final void a(s20 s20Var) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Iterator it = ((ArrayList) obj).iterator();
                while (it.hasNext()) {
                    ((qxk) it.next()).a(s20Var);
                }
                break;
            default:
                ((m6i) ((lw9) obj).get()).a(s20Var.E != 0 ? new n81(s20Var.r(), agd.E, null) : new n81(s20Var.r(), agd.F, null));
                break;
        }
    }
}
