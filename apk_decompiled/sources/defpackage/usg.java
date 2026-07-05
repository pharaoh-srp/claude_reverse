package defpackage;

import java.util.Map;
import java.util.function.Function;

/* JADX INFO: loaded from: classes3.dex */
public abstract class usg extends av6 {
    public final av6 a;
    public boolean b;
    public final ThreadLocal c = ThreadLocal.withInitial(new ui2(6));

    public usg(av6 av6Var) {
        this.a = av6Var;
        this.b = av6Var.f();
    }

    @Override // defpackage.av6
    public boolean b(yj6 yj6Var, yj6 yj6Var2) {
        return g(yj6Var, yj6Var2);
    }

    @Override // defpackage.av6
    public final boolean c(yj6 yj6Var, a2a a2aVar) {
        return g(yj6Var, a2aVar);
    }

    @Override // defpackage.av6
    public void e() {
        this.c.remove();
        this.a.e();
    }

    @Override // defpackage.av6
    public final boolean f() {
        return this.b;
    }

    public abstract boolean g(yj6 yj6Var, c5c c5cVar);

    public final boolean h(final yj6 yj6Var, c5c c5cVar) {
        return ((Boolean) ((Map) ((Map) this.c.get()).computeIfAbsent(yj6Var, new a41(8))).computeIfAbsent(c5cVar, new Function() { // from class: osg
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Boolean.valueOf(this.a.a.d(yj6Var, (c5c) obj));
            }
        })).booleanValue();
    }
}
