package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class z6a {
    public StringBuilder e;
    public String f;
    public char g;
    public StringBuilder h;
    public int a = 1;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public boolean i = false;

    public final void a() {
        if (this.i) {
            String strC = pu6.c(this.f);
            StringBuilder sb = this.h;
            String strC2 = sb != null ? pu6.c(sb.toString()) : null;
            String string = this.e.toString();
            x6a x6aVar = new x6a();
            x6aVar.g = string;
            x6aVar.h = strC;
            x6aVar.i = strC2;
            ArrayList arrayList = this.d;
            x6aVar.g(arrayList);
            arrayList.clear();
            this.c.add(x6aVar);
            this.e = null;
            this.i = false;
            this.f = null;
            this.h = null;
        }
    }
}
