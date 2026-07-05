package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class av6 {
    public int a() {
        return 5;
    }

    public abstract boolean b(yj6 yj6Var, yj6 yj6Var2);

    public boolean c(yj6 yj6Var, a2a a2aVar) {
        return false;
    }

    public final boolean d(yj6 yj6Var, c5c c5cVar) {
        if (c5cVar instanceof yj6) {
            return b(yj6Var, (yj6) c5cVar);
        }
        if ((c5cVar instanceof a2a) && f()) {
            return c(yj6Var, (a2a) c5cVar);
        }
        return false;
    }

    public void e() {
    }

    public boolean f() {
        return false;
    }
}
