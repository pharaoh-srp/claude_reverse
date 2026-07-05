package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class uj7 implements ymf {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public uj7(File file) {
        this.a = 0;
        file.getClass();
        this.b = file;
        this.c = jk7.E;
    }

    @Override // defpackage.ymf
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new g96(this);
            case 1:
                return new jzc(this);
            default:
                c54 c54Var = (c54) this.b;
                ArrayList arrayList = new ArrayList();
                Iterator it = c54Var.iterator();
                while (true) {
                    x1 x1Var = (x1) it;
                    if (!x1Var.hasNext()) {
                        a54.s0(arrayList, (mt7) this.c);
                        return arrayList.iterator();
                    }
                    arrayList.add(x1Var.next());
                }
                break;
        }
    }

    public /* synthetic */ uj7(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
