package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class gvh {
    public final int a;
    public final String b;
    public final List c;
    public final List d;

    public gvh(int i, String str, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5) {
        this.a = i;
        this.b = str;
        this.c = Collections.unmodifiableList(arrayList);
        Collections.unmodifiableList(arrayList2);
        Collections.unmodifiableList(arrayList3);
        this.d = Collections.unmodifiableList(arrayList4);
        Collections.unmodifiableList(arrayList5);
    }
}
