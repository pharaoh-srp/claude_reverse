package defpackage;

import com.anthropic.claude.R;
import com.anthropic.claude.conway.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class sx4 implements lp7 {
    public final /* synthetic */ f E;
    public final /* synthetic */ z9e F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ z9e H;
    public final /* synthetic */ boolean I;
    public final /* synthetic */ boolean J;

    public sx4(f fVar, z9e z9eVar, boolean z, z9e z9eVar2, boolean z2, boolean z3) {
        this.E = fVar;
        this.F = z9eVar;
        this.G = z;
        this.H = z9eVar2;
        this.I = z2;
        this.J = z3;
    }

    @Override // defpackage.lp7
    public final Object g(Object obj, tp4 tp4Var) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        f fVar = this.E;
        amg amgVar = fVar.e0;
        ls4 ls4Var = (ls4) amgVar.getValue();
        iei ieiVar = iei.a;
        z9e z9eVar = this.F;
        if (zBooleanValue) {
            z9eVar.E = true;
            if (this.G && !this.H.E) {
                zfa.a.getClass();
                if (yfa.b()) {
                    CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : copyOnWriteArrayList) {
                        ((n30) ((zfa) obj2)).getClass();
                        arrayList.add(obj2);
                    }
                    if (!arrayList.isEmpty()) {
                        zfa.a.getClass();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((n30) ((zfa) it.next())).b(sfa.INFO, "Conway", "Stalled after skipped probe — falling back to full provisioning");
                        }
                    }
                }
                gb9.D(fVar.a, null, null, new lk1(fVar, this.I, this.J, (tp4) null), 3);
                return ieiVar;
            }
            if ((ls4Var instanceof gs4) || (ls4Var instanceof ks4)) {
                String string = fVar.b.getString(R.string.conway_error_connection_failed);
                string.getClass();
                hs4 hs4Var = new hs4(string);
                amgVar.getClass();
                amgVar.n(null, hs4Var);
                return ieiVar;
            }
        } else if (z9eVar.E && (ls4Var instanceof hs4) && ((hs4) ls4Var).b) {
            amgVar.getClass();
            amgVar.n(null, ks4.a);
        }
        return ieiVar;
    }
}
