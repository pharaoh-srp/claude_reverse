package defpackage;

import android.content.Context;
import com.anthropic.claude.R;
import com.anthropic.claude.conway.f;
import com.anthropic.claude.conway.send.OutboxItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class mx4 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ f F;

    public /* synthetic */ mx4(f fVar, int i) {
        this.E = i;
        this.F = fVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        f fVar = this.F;
        switch (i) {
            case 0:
                OutboxItem outboxItem = (OutboxItem) obj;
                long jLongValue = ((Long) obj2).longValue();
                outboxItem.getClass();
                sfa sfaVar = sfa.WARN;
                zfa.a.getClass();
                if (yfa.b()) {
                    String strE = iuj.E(fVar);
                    CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : copyOnWriteArrayList) {
                        ((n30) ((zfa) obj3)).getClass();
                        arrayList.add(obj3);
                    }
                    if (!arrayList.isEmpty()) {
                        zfa.a.getClass();
                        String str = "outbox retry attempts=" + outboxItem.getAttempts() + " delayMs=" + jLongValue;
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((n30) ((zfa) it.next())).b(sfaVar, strE, str);
                        }
                    }
                }
                List list = xah.a;
                xah.e(6, grc.o(((qo0) fVar.F0.k).size(), outboxItem.getAttempts(), "conway outbox retry depth=", " attempts="), null, null);
                break;
            case 1:
                OutboxItem outboxItem2 = (OutboxItem) obj;
                Exception exc = (Exception) obj2;
                outboxItem2.getClass();
                exc.getClass();
                sfa sfaVar2 = sfa.ERROR;
                zfa.a.getClass();
                if (yfa.b()) {
                    String strE2 = iuj.E(fVar);
                    CopyOnWriteArrayList copyOnWriteArrayList2 = yfa.b;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj4 : copyOnWriteArrayList2) {
                        ((n30) ((zfa) obj4)).getClass();
                        arrayList2.add(obj4);
                    }
                    if (!arrayList2.isEmpty()) {
                        String strQ = sq6.q(zfa.a, exc, "outbox dropped: ");
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            ((n30) ((zfa) it2.next())).b(sfaVar2, strE2, strQ);
                        }
                    }
                }
                b54.w0(new kx4(outboxItem2, 1), fVar.C0);
                ArrayList arrayList3 = fVar.y0;
                Context context = fVar.b;
                String message = exc.getMessage();
                if (message == null) {
                    message = "";
                }
                String string = context.getString(R.string.conway_error_send_failed, message);
                string.getClass();
                arrayList3.add(new mpg(string, System.currentTimeMillis()));
                if (((qo0) fVar.F0.k).isEmpty()) {
                    if (fVar.E0 == sfb.F) {
                        fVar.E0 = sfb.E;
                    }
                    fkg fkgVar = fVar.G0;
                    if (fkgVar != null) {
                        fkgVar.d(null);
                    }
                    fVar.G0 = null;
                    fVar.H0 = 0;
                    fVar.I0 = 0L;
                    fVar.J0 = false;
                }
                fVar.C0(false);
                break;
            default:
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zF = e18Var.f(fVar);
                    Object objN = e18Var.N();
                    if (zF || objN == jd4.a) {
                        objN = new jx4(fVar, 6);
                        e18Var.k0(objN);
                    }
                    csg.j((zy7) objN, null, false, null, null, null, null, wjk.g, e18Var, 805306368, 510);
                } else {
                    e18Var.T();
                }
                break;
        }
        return iei.a;
    }
}
