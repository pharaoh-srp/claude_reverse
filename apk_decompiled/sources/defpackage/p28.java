package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class p28 extends i28 implements aib {
    public sh7 F = sh7.c;
    public boolean G;

    public final void g(r28 r28Var) {
        ebg ebgVar;
        if (!this.G) {
            this.F = this.F.clone();
            this.G = true;
        }
        sh7 sh7Var = this.F;
        sh7 sh7Var2 = r28Var.E;
        sh7Var.getClass();
        int i = 0;
        while (true) {
            int size = sh7Var2.a.F.size();
            ebgVar = sh7Var2.a;
            if (i >= size) {
                break;
            }
            sh7Var.g((Map.Entry) ebgVar.F.get(i));
            i++;
        }
        Iterator it = ebgVar.d().iterator();
        while (it.hasNext()) {
            sh7Var.g((Map.Entry) it.next());
        }
    }
}
