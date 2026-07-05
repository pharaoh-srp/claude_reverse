package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class mtb implements o5b {
    public final ltb a;

    public mtb(ltb ltbVar) {
        this.a = ltbVar;
    }

    @Override // defpackage.o5b
    public final int a(xa9 xa9Var, List list, int i) {
        return this.a.a(xa9Var, dch.v(xa9Var), i);
    }

    @Override // defpackage.o5b
    public final p5b b(q5b q5bVar, List list, long j) {
        return this.a.b(q5bVar, dch.v(q5bVar), j);
    }

    @Override // defpackage.o5b
    public final int c(xa9 xa9Var, List list, int i) {
        return this.a.c(xa9Var, dch.v(xa9Var), i);
    }

    @Override // defpackage.o5b
    public final int d(xa9 xa9Var, List list, int i) {
        return this.a.d(xa9Var, dch.v(xa9Var), i);
    }

    @Override // defpackage.o5b
    public final int e(xa9 xa9Var, List list, int i) {
        return this.a.e(xa9Var, dch.v(xa9Var), i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mtb) && x44.r(this.a, ((mtb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MultiContentMeasurePolicyImpl(measurePolicy=" + this.a + ')';
    }
}
