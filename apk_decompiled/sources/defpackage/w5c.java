package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class w5c {
    public final wwb a = new wwb(0, new d5c[16]);
    public final qvb b = new qvb(10);

    public boolean a(zka zkaVar, cu9 cu9Var, i99 i99Var, boolean z) {
        wwb wwbVar = this.a;
        Object[] objArr = wwbVar.E;
        int i = wwbVar.G;
        boolean z2 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z2 = ((d5c) objArr[i2]).a(zkaVar, cu9Var, i99Var, z) || z2;
        }
        return z2;
    }

    public void b(i99 i99Var) {
        wwb wwbVar = this.a;
        int i = wwbVar.G;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            }
            if (((d5c) wwbVar.E[i]).d.h()) {
                wwbVar.m(i);
            }
        }
    }
}
