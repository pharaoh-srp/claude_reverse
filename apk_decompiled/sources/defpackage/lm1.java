package defpackage;

import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lm1 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ m7f F;

    public /* synthetic */ lm1(m7f m7fVar, int i) {
        this.E = i;
        this.F = m7fVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        qo0 qo0Var;
        int i = this.E;
        m7f m7fVar = this.F;
        switch (i) {
            case 0:
                return (hdc) m7fVar.a(jce.a.b(hdc.class), null, null);
            case 1:
                return (t82) m7fVar.a(jce.a.b(hdc.class), null, null);
            case 2:
                return (t82) m7fVar.a(jce.a.b(hdc.class), nai.h, null);
            default:
                er9 er9Var = m7fVar.e;
                rok rokVar = er9Var.a;
                String str = "|- (-) Scope - id:'" + m7fVar.b + '\'';
                rokVar.getClass();
                rokVar.u0(k3a.E, str);
                LinkedHashSet linkedHashSet = m7fVar.h;
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    mr9.o();
                    return null;
                }
                linkedHashSet.clear();
                m7fVar.j = true;
                m7fVar.g = null;
                ThreadLocal threadLocal = m7fVar.i;
                if (threadLocal != null && (qo0Var = (qo0) threadLocal.get()) != null) {
                    qo0Var.clear();
                }
                m7fVar.i = null;
                er9Var.c.y(m7fVar);
                return iei.a;
        }
    }
}
