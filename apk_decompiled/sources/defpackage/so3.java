package defpackage;

import com.anthropic.claude.core.telemetry.SilentException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class so3 {
    public final u5e a;
    public final k8i b;
    public final owf c;
    public final bg9 d;
    public final h86 e;

    public so3(u5e u5eVar, k8i k8iVar, owf owfVar, bg9 bg9Var, h86 h86Var) {
        this.a = u5eVar;
        this.b = k8iVar;
        this.c = owfVar;
        this.d = bg9Var;
        this.e = h86Var;
    }

    public final void a(String str, Exception exc) {
        zfa.a.getClass();
        if (yfa.b()) {
            String strE = iuj.E(this);
            CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : copyOnWriteArrayList) {
                ((n30) ((zfa) obj)).getClass();
                arrayList.add(obj);
            }
            if (!arrayList.isEmpty()) {
                zfa.a.getClass();
                String strK = ij0.k("Per-message attestation failed for ", str, ": ", gsk.c(exc));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((n30) ((zfa) it.next())).b(sfa.ERROR, strE, strK);
                }
            }
        }
        SilentException.a(new SilentException(ij0.j("ClientEventAttestation sign failed (", str, ")"), exc), ozf.F, false, 2);
    }
}
