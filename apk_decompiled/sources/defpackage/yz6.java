package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class yz6 implements Runnable, Comparable, y86 {
    public long E;
    public int F = -1;
    private volatile Object _heap;

    public yz6(long j) {
        this.E = j;
    }

    @Override // defpackage.y86
    public final void a() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                sqb sqbVar = b07.a;
                if (obj == sqbVar) {
                    return;
                }
                zz6 zz6Var = obj instanceof zz6 ? (zz6) obj : null;
                if (zz6Var != null) {
                    synchronized (zz6Var) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof ynh ? (ynh) obj2 : null) != null) {
                            zz6Var.b(this.F);
                        }
                    }
                }
                this._heap = sqbVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int c(long j, zz6 zz6Var, a07 a07Var) {
        synchronized (this) {
            if (this._heap == b07.a) {
                return 2;
            }
            synchronized (zz6Var) {
                try {
                    yz6[] yz6VarArr = zz6Var.a;
                    yz6 yz6Var = yz6VarArr != null ? yz6VarArr[0] : null;
                    if (a07.M.get(a07Var) == 1) {
                        return 1;
                    }
                    if (yz6Var == null) {
                        zz6Var.c = j;
                    } else {
                        long j2 = yz6Var.E;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        if (j - zz6Var.c > 0) {
                            zz6Var.c = j;
                        }
                    }
                    long j3 = this.E;
                    long j4 = zz6Var.c;
                    if (j3 - j4 < 0) {
                        this.E = j4;
                    }
                    zz6Var.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.E - ((yz6) obj).E;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    public final void d(zz6 zz6Var) {
        if (this._heap != b07.a) {
            this._heap = zz6Var;
        } else {
            sz6.p("Failed requirement.");
        }
    }

    public String toString() {
        return ebh.p(new StringBuilder("Delayed[nanos="), this.E, ']');
    }
}
