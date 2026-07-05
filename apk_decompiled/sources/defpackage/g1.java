package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public interface g1 extends hn5 {
    dn0 b();

    default z52 build() {
        ArrayList arrayList = b().E;
        arrayList.getClass();
        return new z52(arrayList);
    }

    g1 h();
}
