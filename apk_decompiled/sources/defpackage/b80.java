package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class b80 extends t3 {
    public final /* synthetic */ int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b80(List list, int i) {
        super(1, list);
        this.G = i;
    }

    @Override // defpackage.k80
    public final ke1 a() {
        switch (this.G) {
            case 0:
                return new g54((List) this.F, 0);
            case 1:
                return new x98((List) this.F, 0);
            case 2:
                return new g54((List) this.F, 2);
            case 3:
                return new x98((List) this.F, 1);
            case 4:
                return new x98((List) this.F, 2);
            case 5:
                return new r0g((List) this.F);
            default:
                return new g54((List) this.F, 3);
        }
    }
}
