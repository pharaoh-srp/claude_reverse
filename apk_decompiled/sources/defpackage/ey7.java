package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ey7 {
    public final List a;
    public long b;
    public long c;
    public boolean d;
    public long e;

    public ey7(ArrayList arrayList) {
        arrayList.getClass();
        this.a = arrayList;
        this.b = 0L;
        this.c = 0L;
        this.d = false;
    }

    public final boolean a(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        ey7 ey7Var = (ey7) obj;
        return this.b == ey7Var.b && this.c == ey7Var.c && this.d == ey7Var.d && x44.r(this.a, ey7Var.a);
    }

    public final int b() {
        return this.a.hashCode() + fsh.p(vb7.e(Long.hashCode(this.b) * 31, 31, this.c), 31, this.d);
    }

    public boolean equals(Object obj) {
        return (obj instanceof ey7) && a(obj) && this.e == ((ey7) obj).e;
    }

    public int hashCode() {
        return Long.hashCode(this.e) + (b() * 31);
    }

    public String toString() {
        return "FrameData(frameStartNanos=" + this.b + ", frameDurationUiNanos=" + this.c + ", frameDurationCpuNanos=" + this.e + ", isJank=" + this.d + ", states=" + this.a + ')';
    }
}
