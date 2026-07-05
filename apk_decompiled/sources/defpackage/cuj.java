package defpackage;

import com.google.android.gms.internal.measurement.i0;
import com.google.android.gms.internal.measurement.j0;
import com.google.android.gms.internal.measurement.k0;
import com.google.android.gms.internal.measurement.zzc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class cuj {
    public final c61 a;
    public c61 b;
    public final lrb c;
    public final ire d;

    public cuj() {
        c61 c61Var = new c61(27);
        this.a = c61Var;
        this.b = ((c61) c61Var.G).L();
        lrb lrbVar = new lrb(21, false);
        lrbVar.F = new bqj("", 0L, null);
        lrbVar.G = new bqj("", 0L, null);
        lrbVar.H = new ArrayList();
        this.c = lrbVar;
        this.d = new ire(8);
        toj tojVar = new toj(0);
        tojVar.F = this;
        w05 w05Var = (w05) c61Var.I;
        w05Var.a.put("internal.registerCallback", tojVar);
        toj tojVar2 = new toj(1);
        tojVar2.F = this;
        w05Var.a.put("internal.eventLogger", tojVar2);
    }

    public final lrb a() {
        return this.c;
    }

    public final void b(j0 j0Var) throws zzc {
        nrj nrjVar;
        c61 c61Var = this.a;
        try {
            this.b = ((c61) c61Var.G).L();
            if (c61Var.M(this.b, (k0[]) j0Var.r().toArray(new k0[0])) instanceof drj) {
                throw new IllegalStateException("Program loading failed");
            }
            for (i0 i0Var : j0Var.p().r()) {
                dyk dykVarQ = i0Var.q();
                String strP = i0Var.p();
                Iterator it = dykVarQ.iterator();
                while (it.hasNext()) {
                    lsj lsjVarM = c61Var.M(this.b, (k0) it.next());
                    if (!(lsjVarM instanceof isj)) {
                        throw new IllegalArgumentException("Invalid rule definition");
                    }
                    c61 c61Var2 = this.b;
                    if (c61Var2.R(strP)) {
                        lsj lsjVarN = c61Var2.N(strP);
                        if (!(lsjVarN instanceof nrj)) {
                            throw new IllegalStateException("Invalid function name: " + strP);
                        }
                        nrjVar = (nrj) lsjVarN;
                    } else {
                        nrjVar = null;
                    }
                    if (nrjVar == null) {
                        throw new IllegalStateException("Rule function is undefined: " + strP);
                    }
                    nrjVar.c(this.b, Collections.singletonList(lsjVarM));
                }
            }
        } catch (Throwable th) {
            throw new zzc(th);
        }
    }

    public final void c(String str, Callable callable) {
        ((w05) this.a.I).a.put(str, callable);
    }

    public final boolean d(bqj bqjVar) {
        lrb lrbVar = this.c;
        try {
            lrbVar.F = bqjVar;
            lrbVar.G = (bqj) bqjVar.clone();
            ((ArrayList) lrbVar.H).clear();
            ((c61) this.a.H).S("runtime.counter", new yqj(Double.valueOf(0.0d)));
            this.d.t(this.b.L(), lrbVar);
            if (f()) {
                return true;
            }
            return e();
        } catch (Throwable th) {
            throw new zzc(th);
        }
    }

    public final boolean e() {
        return !((ArrayList) this.c.H).isEmpty();
    }

    public final boolean f() {
        lrb lrbVar = this.c;
        return !((bqj) lrbVar.G).equals((bqj) lrbVar.F);
    }
}
