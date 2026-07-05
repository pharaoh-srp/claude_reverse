package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xqa extends awb {
    public final /* synthetic */ int F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xqa(int i, int i2, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, i);
        this.F = i2;
    }

    @Override // defpackage.awb, defpackage.kn9
    public final Object get() {
        switch (this.F) {
            case 0:
                return (bz7) ((pqa) this.receiver).f.getValue();
            case 1:
                return (bz7) ((pqa) this.receiver).g.getValue();
            case 2:
                return (tr5) ((pqa) this.receiver).a.getValue();
            case 3:
                return (bz7) ((pqa) this.receiver).b.getValue();
            case 4:
                return (bz7) ((pqa) this.receiver).c.getValue();
            case 5:
                return (zy7) ((pqa) this.receiver).d.getValue();
            default:
                return (zy7) ((pqa) this.receiver).e.getValue();
        }
    }
}
