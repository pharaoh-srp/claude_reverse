package defpackage;

import java.util.HashMap;
import org.koin.core.error.MissingScopeValueException;

/* JADX INFO: loaded from: classes.dex */
public final class w7f extends x59 {
    public final boolean b;
    public final HashMap c;

    public w7f(qh1 qh1Var) {
        super(qh1Var);
        this.b = true;
        this.c = new HashMap();
    }

    @Override // defpackage.x59
    public final Object b(ra4 ra4Var) throws MissingScopeValueException {
        if (!x44.r(((m7f) ra4Var.F).a, this.a.a) && !x44.r((xai) ra4Var.K, this.a.a)) {
            sz6.l("Wrong Scope qualifier: trying to open instance for ", ((m7f) ra4Var.F).b, " in ", this.a);
            return null;
        }
        synchronized (this) {
            HashMap map = this.c;
            m7f m7fVar = (m7f) ra4Var.F;
            if (map.get(m7fVar != null ? m7fVar.b : null) == null && this.b) {
                this.c.put(((m7f) ra4Var.F).b, a(ra4Var));
            }
        }
        Object obj = this.c.get(((m7f) ra4Var.F).b);
        if (obj != null) {
            return obj;
        }
        throw new MissingScopeValueException("Factory.get -Scoped instance not found for " + ((m7f) ra4Var.F).b + " in " + this.a);
    }
}
