package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class vsb extends my1 {
    public final long G;
    public final ArrayList H;
    public final ArrayList I;

    public vsb(int i, long j) {
        super(i);
        this.G = j;
        this.H = new ArrayList();
        this.I = new ArrayList();
    }

    public final vsb e(int i) {
        ArrayList arrayList = this.I;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            vsb vsbVar = (vsb) arrayList.get(i2);
            if (vsbVar.F == i) {
                return vsbVar;
            }
        }
        return null;
    }

    public final wsb f(int i) {
        ArrayList arrayList = this.H;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            wsb wsbVar = (wsb) arrayList.get(i2);
            if (wsbVar.F == i) {
                return wsbVar;
            }
        }
        return null;
    }

    @Override // defpackage.my1
    public final String toString() {
        return my1.b(this.F) + " leaves: " + Arrays.toString(this.H.toArray()) + " containers: " + Arrays.toString(this.I.toArray());
    }
}
