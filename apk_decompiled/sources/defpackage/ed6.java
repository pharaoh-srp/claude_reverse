package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ed6 {
    public final ArrayList a = new ArrayList();
    public float[] b;

    public ed6() {
        float[] fArr = new float[5];
        for (int i = 0; i < 5; i++) {
            fArr[i] = Float.NaN;
        }
        this.b = fArr;
    }

    public final void a(Object obj, float f) {
        ArrayList arrayList = this.a;
        arrayList.add(obj);
        if (this.b.length < arrayList.size()) {
            this.b = Arrays.copyOf(this.b, arrayList.size() + 2);
        }
        this.b[arrayList.size() - 1] = f;
    }
}
