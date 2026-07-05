package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class cs4 extends m08 implements zy7 {
    public final /* synthetic */ boolean E;
    public final /* synthetic */ bz7 F;
    public final /* synthetic */ String G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cs4(bz7 bz7Var, String str, boolean z) {
        super(0, gb9.class, "dispatch", "ConwayComposer$dispatch(ZLkotlin/jvm/functions/Function1;Ljava/lang/String;)V", 0);
        this.E = z;
        this.F = bz7Var;
        this.G = str;
    }

    @Override // defpackage.zy7
    public final Object a() {
        if (this.E) {
            this.F.invoke(this.G);
        }
        return iei.a;
    }
}
