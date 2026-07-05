package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class f4d extends ts9 implements zy7 {
    public final /* synthetic */ short F;
    public final /* synthetic */ int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4d(short s, int i) {
        super(0);
        this.F = s;
        this.G = i;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.G;
        short sD = grc.d(i);
        StringBuilder sbU = vb7.u("Unexpected block type identifier=", this.F, " met, was expecting ");
        sbU.append(i != 1 ? i != 2 ? "null" : "META" : "EVENT");
        sbU.append("(");
        sbU.append((int) sD);
        sbU.append(")");
        return sbU.toString();
    }
}
