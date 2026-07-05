package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mp4 implements l45 {
    public final c45 E;

    public mp4(c45 c45Var) {
        this.E = c45Var;
    }

    @Override // defpackage.l45
    public final c45 getCoroutineContext() {
        return this.E;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.E + ')';
    }
}
