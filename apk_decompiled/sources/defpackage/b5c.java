package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class b5c {
    public b5c a = null;
    public b5c b = null;
    public b5c c = null;
    public b5c d = null;
    public b5c e = null;
    public ArrayList f = null;

    public abstract void a(xjk xjkVar);

    public final void b(cfg cfgVar) {
        if (this.f == null) {
            this.f = new ArrayList();
        }
        this.f.add(cfgVar);
    }

    public final void c(b5c b5cVar) {
        b5cVar.i();
        b5cVar.f(this);
        b5c b5cVar2 = this.c;
        if (b5cVar2 == null) {
            this.b = b5cVar;
            this.c = b5cVar;
        } else {
            b5cVar2.e = b5cVar;
            b5cVar.d = b5cVar2;
            this.c = b5cVar;
        }
    }

    public final List d() {
        ArrayList arrayList = this.f;
        return arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.EMPTY_LIST;
    }

    public final void e(b5c b5cVar) {
        b5cVar.i();
        b5c b5cVar2 = this.e;
        b5cVar.e = b5cVar2;
        if (b5cVar2 != null) {
            b5cVar2.d = b5cVar;
        }
        b5cVar.d = this;
        this.e = b5cVar;
        b5c b5cVar3 = this.a;
        b5cVar.a = b5cVar3;
        if (b5cVar.e == null) {
            b5cVar3.c = b5cVar;
        }
    }

    public void f(b5c b5cVar) {
        this.a = b5cVar;
    }

    public final void g(List list) {
        if (list.isEmpty()) {
            this.f = null;
        } else {
            this.f = new ArrayList(list);
        }
    }

    public String h() {
        return "";
    }

    public final void i() {
        b5c b5cVar = this.d;
        if (b5cVar != null) {
            b5cVar.e = this.e;
        } else {
            b5c b5cVar2 = this.a;
            if (b5cVar2 != null) {
                b5cVar2.b = this.e;
            }
        }
        b5c b5cVar3 = this.e;
        if (b5cVar3 != null) {
            b5cVar3.d = b5cVar;
        } else {
            b5c b5cVar4 = this.a;
            if (b5cVar4 != null) {
                b5cVar4.c = b5cVar;
            }
        }
        this.a = null;
        this.e = null;
        this.d = null;
    }

    public final String toString() {
        return getClass().getSimpleName() + "{" + h() + "}";
    }
}
