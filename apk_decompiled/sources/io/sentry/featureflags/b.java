package io.sentry.featureflags;

import io.sentry.protocol.i;
import io.sentry.protocol.j;
import io.sentry.v;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class b implements c {
    public volatile CopyOnWriteArrayList E;
    public final io.sentry.util.a F;
    public final int G;

    public b(b bVar) {
        this.F = new io.sentry.util.a();
        this.G = bVar.G;
        this.E = new CopyOnWriteArrayList(bVar.E);
    }

    @Override // io.sentry.featureflags.c
    public final void c(String str, Boolean bool) {
        if (str != null) {
            v vVarA = this.F.a();
            try {
                int size = this.E.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    if (((a) this.E.get(i)).a.equals(str)) {
                        this.E.remove(i);
                        break;
                    }
                    i++;
                }
                this.E.add(new a(str, bool.booleanValue(), Long.valueOf(System.nanoTime())));
                if (this.E.size() > this.G) {
                    this.E.remove(0);
                }
                vVarA.close();
            } catch (Throwable th) {
                try {
                    vVarA.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    @Override // io.sentry.featureflags.c
    public final void clear() {
        v vVarA = this.F.a();
        try {
            this.E.clear();
            vVarA.close();
        } catch (Throwable th) {
            try {
                vVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.featureflags.c
    public final c clone() {
        return new b(this);
    }

    @Override // io.sentry.featureflags.c
    public final j k() {
        ArrayList arrayList = new ArrayList();
        for (a aVar : this.E) {
            arrayList.add(new i(aVar.a, aVar.b));
        }
        return new j(arrayList);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final Object m1184clone() {
        return new b(this);
    }

    public b(int i, CopyOnWriteArrayList copyOnWriteArrayList) {
        this.F = new io.sentry.util.a();
        this.G = i;
        this.E = copyOnWriteArrayList;
    }

    public b(int i) {
        this.F = new io.sentry.util.a();
        this.G = i;
        this.E = new CopyOnWriteArrayList();
    }
}
