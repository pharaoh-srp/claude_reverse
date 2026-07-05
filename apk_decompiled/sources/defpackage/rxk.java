package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rxk implements Callable {
    public final /* synthetic */ int E;
    public final /* synthetic */ w2g F;

    public /* synthetic */ rxk(w2g w2gVar, int i) {
        this.E = i;
        this.F = w2gVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.E) {
        }
        return this.F.a();
    }
}
