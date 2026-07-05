package defpackage;

import com.anthropic.claude.types.strings.AccountId;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class ql3 {
    public final er9 a;
    public final fj0 b;
    public final LinkedHashMap c = new LinkedHashMap();

    public ql3(er9 er9Var, fj0 fj0Var) {
        this.a = er9Var;
        this.b = fj0Var;
    }

    public final synchronized void a(s7f s7fVar) {
        try {
            s7fVar.getClass();
            if (s7fVar instanceof p7f) {
                Set set = (Set) this.c.remove(AccountId.m943boximpl(((p7f) s7fVar).a));
                if (set != null) {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        a((r7f) it.next());
                    }
                }
            } else if (s7fVar instanceof r7f) {
                Set set2 = (Set) this.c.get(AccountId.m943boximpl(((r7f) s7fVar).a));
                if (set2 != null) {
                    set2.remove(s7fVar);
                }
            } else if (!s7fVar.equals(q7f.a)) {
                throw new NoWhenBranchMatchedException();
            }
            m7f m7fVarB = this.a.b(s7fVar.a());
            if (m7fVarB != null) {
                List list = xah.a;
                xah.e(6, "ClaudeKoinScopeHolder: Closing scope " + m7fVarB.b, null, null);
                lm1 lm1Var = new lm1(m7fVarB, 3);
                synchronized (m7fVarB) {
                    lm1Var.a();
                }
                er9 er9Var = this.a;
                String str = m7fVarB.b;
                str.getClass();
                dpf dpfVar = er9Var.c;
                dpfVar.getClass();
                m7f m7fVar = (m7f) ((ConcurrentHashMap) dpfVar.H).get(str);
                if (m7fVar != null) {
                    dpfVar.y(m7fVar);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized m7f b(r7f r7fVar, koi koiVar) {
        Object hreVar;
        try {
            r7fVar.getClass();
            koiVar.getClass();
            m7f m7fVarB = this.a.b(r7fVar.c);
            if (m7fVarB != null) {
                return m7fVarB;
            }
            m7f m7fVarC = c(new p7f(r7fVar.a));
            m7f m7fVarX = this.a.c.x(r7fVar.c, new xai(jce.a.b(zni.class)), koiVar);
            this.a.c((List) ((dm) this.b.F).a(), true);
            m7f[] m7fVarArr = {m7fVarC};
            if (m7fVarX.c) {
                throw new IllegalStateException("Can't add scope link to a root scope");
            }
            m7fVarX.f.addAll(0, mp0.Y0(m7fVarArr));
            LinkedHashMap linkedHashMap = this.c;
            AccountId accountIdM943boximpl = AccountId.m943boximpl(r7fVar.a);
            Object linkedHashSet = linkedHashMap.get(accountIdM943boximpl);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet();
                linkedHashMap.put(accountIdM943boximpl, linkedHashSet);
            }
            ((Set) linkedHashSet).add(r7fVar);
            try {
                ((bz7) this.b.G).invoke(m7fVarX);
                hreVar = iei.a;
            } catch (Throwable th) {
                hreVar = new hre(th);
            }
            Throwable thA = jre.a(hreVar);
            if (thA != null) {
                List list = xah.a;
                xah.f(thA, "userScopeEager failed", null, null, 28);
            }
            List list2 = xah.a;
            xah.e(6, "ClaudeKoinScopeHolder: Created UserScope " + m7fVarX.b, null, null);
            return m7fVarX;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized m7f c(p7f p7fVar) {
        m7f m7fVarB = this.a.b(p7fVar.b);
        if (m7fVarB != null) {
            return m7fVarB;
        }
        er9 er9Var = this.a;
        m7f m7fVarX = er9Var.c.x(p7fVar.b, new xai(jce.a.b(j8.class)), AccountId.m943boximpl(p7fVar.a));
        this.a.c((List) ((dm) this.b.E).a(), true);
        List list = xah.a;
        xah.e(6, "ClaudeKoinScopeHolder: Created AccountScope " + m7fVarX.b, null, null);
        return m7fVarX;
    }

    public final synchronized m7f d() {
        Iterator it = this.c.values().iterator();
        while (it.hasNext()) {
            for (r7f r7fVar : (Set) it.next()) {
                r7fVar.getClass();
                m7f m7fVarB = this.a.b(r7fVar.c);
                if (m7fVarB == null) {
                    m7fVarB = null;
                }
                if (m7fVarB != null) {
                    return m7fVarB;
                }
            }
        }
        return null;
    }
}
