package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class w8f {
    public final wjf a;
    public final int b;
    public final c79 c;
    public final m5c d;

    public w8f(wjf wjfVar, int i, c79 c79Var, m5c m5cVar) {
        this.a = wjfVar;
        this.b = i;
        this.c = c79Var;
        this.d = m5cVar;
    }

    public final cu9 a() {
        return this.d;
    }

    public final wjf b() {
        return this.a;
    }

    public final c79 c() {
        return this.c;
    }

    public final String toString() {
        return "ScrollCaptureCandidate(node=" + this.a + ", depth=" + this.b + ", viewportBoundsInWindow=" + this.c + ", coordinates=" + this.d + ')';
    }
}
