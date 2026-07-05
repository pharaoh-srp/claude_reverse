package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class gzc extends c4 implements sz8, Collection, mm9 {
    public static final gzc H;
    public final Object E;
    public final Object F;
    public final jyc G;

    static {
        zp3 zp3Var = zp3.H;
        H = new gzc(zp3Var, zp3Var, jyc.G);
    }

    public gzc(Object obj, Object obj2, jyc jycVar) {
        this.E = obj;
        this.F = obj2;
        this.G = jycVar;
    }

    public final gzc a(Object obj) {
        jyc jycVar = this.G;
        if (jycVar.containsKey(obj)) {
            return this;
        }
        if (isEmpty()) {
            return new gzc(obj, obj, jycVar.h(obj, new s7a()));
        }
        Object obj2 = this.F;
        Object obj3 = jycVar.get(obj2);
        obj3.getClass();
        return new gzc(this.E, obj, jycVar.h(obj2, new s7a(((s7a) obj3).a, obj)).h(obj, new s7a(obj2)));
    }

    @Override // defpackage.w0, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.G.containsKey(obj);
    }

    public final gzc e(Object obj) {
        jyc jycVarH = this.G;
        s7a s7aVar = (s7a) jycVarH.get(obj);
        if (s7aVar == null) {
            return this;
        }
        Object obj2 = s7aVar.a;
        Object obj3 = s7aVar.b;
        x6i x6iVar = jycVarH.E;
        x6i x6iVarV = x6iVar.v(obj != null ? obj.hashCode() : 0, obj, 0);
        if (x6iVar != x6iVarV) {
            jycVarH = x6iVarV == null ? jyc.G : new jyc(x6iVarV, jycVarH.F - 1);
        }
        zp3 zp3Var = zp3.H;
        if (obj2 != zp3Var) {
            Object obj4 = jycVarH.get(obj2);
            obj4.getClass();
            jycVarH = jycVarH.h(obj2, new s7a(((s7a) obj4).a, obj3));
        }
        if (obj3 != zp3Var) {
            Object obj5 = jycVarH.get(obj3);
            obj5.getClass();
            jycVarH = jycVarH.h(obj3, new s7a(obj2, ((s7a) obj5).b));
        }
        Object obj6 = obj2 != zp3Var ? this.E : obj3;
        if (obj3 != zp3Var) {
            obj2 = this.F;
        }
        return new gzc(obj6, obj2, jycVarH);
    }

    @Override // defpackage.w0
    public final int getSize() {
        return this.G.d();
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new jzc(this.E, this.G, 1);
    }
}
