package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class q62 implements Comparable {
    public final int E;
    public final int F;
    public final int G;
    public final long H;

    public q62(int i, int i2, int i3, long j) {
        this.E = i;
        this.F = i2;
        this.G = i3;
        this.H = j;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return x44.A(this.H, ((q62) obj).H);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q62)) {
            return false;
        }
        q62 q62Var = (q62) obj;
        return this.E == q62Var.E && this.F == q62Var.F && this.G == q62Var.G && this.H == q62Var.H;
    }

    public final int hashCode() {
        return Long.hashCode(this.H) + vb7.c(this.G, vb7.c(this.F, Integer.hashCode(this.E) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CalendarDate(year=");
        sb.append(this.E);
        sb.append(", month=");
        sb.append(this.F);
        sb.append(", dayOfMonth=");
        sb.append(this.G);
        sb.append(", utcTimeMillis=");
        return ebh.p(sb, this.H, ')');
    }
}
