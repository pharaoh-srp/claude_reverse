package defpackage;

import com.arkivanov.essenty.statekeeper.b;

/* JADX INFO: loaded from: classes.dex */
public final class oe3 implements qe3 {
    public final Object a;
    public final String b;
    public final Object c;
    public final q4a d;
    public final b e;
    public final kd4 f;
    public final jq5 g;

    public oe3(Object obj, String str, Object obj2, q4a q4aVar, b bVar, kd4 kd4Var, jq5 jq5Var) {
        obj.getClass();
        str.getClass();
        obj2.getClass();
        this.a = obj;
        this.b = str;
        this.c = obj2;
        this.d = q4aVar;
        this.e = bVar;
        this.f = kd4Var;
        this.g = jq5Var;
    }

    @Override // defpackage.qe3
    public final Object a() {
        return this.c;
    }

    @Override // defpackage.qe3
    public final kd4 b() {
        return this.f;
    }

    @Override // defpackage.qe3
    public final Object c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof oe3) {
            oe3 oe3Var = (oe3) obj;
            return x44.r(this.a, oe3Var.a) && x44.r(this.b, oe3Var.b) && x44.r(this.c, oe3Var.c) && this.d == oe3Var.d && this.e == oe3Var.e && this.f == oe3Var.f && this.g == oe3Var.g;
        }
        return false;
    }

    @Override // defpackage.qe3
    public final String getKey() {
        return this.b;
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + kgh.l(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Created(configuration=" + this.a + ", key=" + this.b + ", instance=" + this.c + ", lifecycleRegistry=" + this.d + ", stateKeeperDispatcher=" + this.e + ", instanceKeeperDispatcher=" + this.f + ", backHandler=" + this.g + ')';
    }
}
