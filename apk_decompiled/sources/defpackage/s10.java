package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class s10 extends ts9 implements bz7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ ArrayList G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s10(int i, ArrayList arrayList) {
        super(1);
        this.F = i;
        this.G = arrayList;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.F;
        iei ieiVar = iei.a;
        ArrayList arrayList = this.G;
        switch (i) {
            case 0:
                b3d b3dVar = (b3d) obj;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    b3d.k(b3dVar, (c3d) arrayList.get(i2), 0, 0);
                }
                break;
            case 1:
                b3d b3dVar2 = (b3d) obj;
                int size2 = arrayList.size() - 1;
                if (size2 >= 0) {
                    int i3 = 0;
                    while (true) {
                        b3d.k(b3dVar2, (c3d) arrayList.get(i3), 0, 0);
                        if (i3 != size2) {
                            i3++;
                        }
                    }
                }
                break;
            default:
                b3d b3dVar3 = (b3d) obj;
                int size3 = arrayList.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    b3d.l(b3dVar3, (c3d) arrayList.get(i4), 0, 0, null, 12);
                }
                break;
        }
        return ieiVar;
    }
}
