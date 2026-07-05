package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class at5 {
    public final String a;
    public int b;
    public long c;
    public final z7b d;
    public boolean e;
    public boolean f;
    public final /* synthetic */ bt5 g;

    public at5(bt5 bt5Var, String str, int i, z7b z7bVar) {
        this.g = bt5Var;
        this.a = str;
        this.b = i;
        this.c = z7bVar == null ? -1L : z7bVar.d;
        if (z7bVar == null || !z7bVar.b()) {
            return;
        }
        this.d = z7bVar;
    }

    public final boolean a(kx kxVar) {
        z7b z7bVar = kxVar.d;
        mqh mqhVar = kxVar.b;
        if (z7bVar == null) {
            return this.b != kxVar.c;
        }
        long j = this.c;
        if (j == -1) {
            return false;
        }
        if (z7bVar.d > j) {
            return true;
        }
        z7b z7bVar2 = this.d;
        if (z7bVar2 == null) {
            return false;
        }
        int i = z7bVar2.b;
        int iB = mqhVar.b(z7bVar.a);
        int iB2 = mqhVar.b(z7bVar2.a);
        if (z7bVar.d < z7bVar2.d || iB < iB2) {
            return false;
        }
        if (iB > iB2) {
            return true;
        }
        if (!z7bVar.b()) {
            int i2 = z7bVar.e;
            return i2 == -1 || i2 > i;
        }
        int i3 = z7bVar.b;
        int i4 = z7bVar.c;
        if (i3 <= i) {
            return i3 == i && i4 > z7bVar2.c;
        }
        return true;
    }

    public final boolean b(mqh mqhVar, mqh mqhVar2) {
        z7b z7bVar;
        int i = this.b;
        if (i < mqhVar.o()) {
            bt5 bt5Var = this.g;
            kqh kqhVar = bt5Var.a;
            mqhVar.n(i, kqhVar);
            for (int i2 = kqhVar.l; i2 <= kqhVar.m; i2++) {
                int iB = mqhVar2.b(mqhVar.l(i2));
                if (iB != -1) {
                    i = mqhVar2.f(iB, bt5Var.b, false).c;
                    break;
                }
            }
            i = -1;
        } else if (i >= mqhVar2.o()) {
            i = -1;
        }
        this.b = i;
        return i != -1 && ((z7bVar = this.d) == null || mqhVar2.b(z7bVar.a) != -1);
    }
}
