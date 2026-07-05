package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class uua extends vw7 {
    public static final Object e = new Object();
    public final Object c;
    public final Object d;

    public uua(mqh mqhVar, Object obj, Object obj2) {
        super(mqhVar);
        this.c = obj;
        this.d = obj2;
    }

    @Override // defpackage.vw7, defpackage.mqh
    public final int b(Object obj) {
        Object obj2;
        if (e == obj && (obj2 = this.d) != null) {
            obj = obj2;
        }
        return this.b.b(obj);
    }

    @Override // defpackage.vw7, defpackage.mqh
    public final jqh f(int i, jqh jqhVar, boolean z) {
        this.b.f(i, jqhVar, z);
        if (Objects.equals(jqhVar.b, this.d) && z) {
            jqhVar.b = e;
        }
        return jqhVar;
    }

    @Override // defpackage.vw7, defpackage.mqh
    public final Object l(int i) {
        Object objL = this.b.l(i);
        return Objects.equals(objL, this.d) ? e : objL;
    }

    @Override // defpackage.vw7, defpackage.mqh
    public final kqh m(int i, kqh kqhVar, long j) {
        this.b.m(i, kqhVar, j);
        if (Objects.equals(kqhVar.a, this.c)) {
            kqhVar.a = kqh.o;
        }
        return kqhVar;
    }
}
