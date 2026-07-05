package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ppj extends nrj {
    public final /* synthetic */ int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ppj(String str, int i) {
        super(str);
        this.G = i;
    }

    @Override // defpackage.nrj
    public final lsj c(c61 c61Var, List list) {
        int i = this.G;
        ltj ltjVar = lsj.v;
        switch (i) {
            case 0:
                return new yqj(Double.valueOf(0.0d));
            case 1:
                return ltjVar;
            case 2:
            case 3:
                return this;
            default:
                return ltjVar;
        }
    }
}
