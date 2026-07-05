package defpackage;

import android.content.ClipData;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class bc0 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ ArrayList F;

    public /* synthetic */ bc0(int i, ArrayList arrayList) {
        this.E = i;
        this.F = arrayList;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i;
        int i2 = this.E;
        iei ieiVar = iei.a;
        int i3 = 1;
        ArrayList arrayList = this.F;
        switch (i2) {
            case 0:
                b3d b3dVar = (b3d) obj;
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    b3d.k(b3dVar, (c3d) arrayList.get(i4), 0, 0);
                }
                return ieiVar;
            case 1:
                b3d b3dVar2 = (b3d) obj;
                int size2 = arrayList.size();
                int i5 = 0;
                while (i5 < size2) {
                    r5b r5bVar = (r5b) arrayList.get(i5);
                    List list = r5bVar.b;
                    boolean z = r5bVar.g;
                    if (r5bVar.k == Integer.MIN_VALUE) {
                        e39.a("position() should be called first");
                    }
                    int size3 = list.size();
                    int i6 = 0;
                    while (i6 < size3) {
                        c3d c3dVar = (c3d) list.get(i6);
                        int[] iArr = r5bVar.i;
                        int i7 = i6 * 2;
                        b3d b3dVar3 = b3dVar2;
                        long jD = y69.d((((long) iArr[i7 + i3]) & 4294967295L) | (((long) iArr[i7]) << 32), r5bVar.c);
                        if (z) {
                            i = i6;
                            b3dVar2 = b3dVar3;
                            b3d.o(b3dVar2, c3dVar, jD, null, 6);
                        } else {
                            i = i6;
                            b3dVar2 = b3dVar3;
                            b3d.m(b3dVar2, c3dVar, jD);
                        }
                        i6 = i + 1;
                        i3 = 1;
                    }
                    i5++;
                    i3 = 1;
                }
                return ieiVar;
            case 2:
                ClipData.Item item = (ClipData.Item) obj;
                item.getClass();
                boolean z2 = item.getUri() != null;
                if (z2) {
                    Uri uri = item.getUri();
                    uri.getClass();
                    arrayList.add(uri);
                }
                return Boolean.valueOf(z2);
            default:
                return ((rvh) arrayList.get(((Integer) obj).intValue())).a;
        }
    }
}
