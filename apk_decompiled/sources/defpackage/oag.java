package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class oag {
    public static final z31 g = new z31(16);
    public static final z31 h = new z31(17);
    public int a;
    public int b;
    public int c;
    public int d;
    public Serializable e;
    public Serializable f;

    public void a(int i, float f) {
        nag nagVar;
        nag[] nagVarArr = (nag[]) this.f;
        ArrayList arrayList = (ArrayList) this.e;
        if (this.a != 1) {
            Collections.sort(arrayList, g);
            this.a = 1;
        }
        int i2 = this.d;
        if (i2 > 0) {
            int i3 = i2 - 1;
            this.d = i3;
            nagVar = nagVarArr[i3];
        } else {
            nagVar = new nag();
        }
        int i4 = this.b;
        this.b = i4 + 1;
        nagVar.a = i4;
        nagVar.b = i;
        nagVar.c = f;
        arrayList.add(nagVar);
        this.c += i;
        while (true) {
            int i5 = this.c;
            if (i5 <= 2000) {
                return;
            }
            int i6 = i5 - 2000;
            nag nagVar2 = (nag) arrayList.get(0);
            int i7 = nagVar2.b;
            if (i7 <= i6) {
                this.c -= i7;
                arrayList.remove(0);
                int i8 = this.d;
                if (i8 < 5) {
                    this.d = i8 + 1;
                    nagVarArr[i8] = nagVar2;
                }
            } else {
                nagVar2.b = i7 - i6;
                this.c -= i6;
            }
        }
    }

    public float b() {
        ArrayList arrayList = (ArrayList) this.e;
        if (this.a != 0) {
            Collections.sort(arrayList, h);
            this.a = 0;
        }
        float f = 0.5f * this.c;
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            nag nagVar = (nag) arrayList.get(i2);
            i += nagVar.b;
            if (i >= f) {
                return nagVar.c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((nag) arrayList.get(arrayList.size() - 1)).c;
    }
}
