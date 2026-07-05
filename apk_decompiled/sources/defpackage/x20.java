package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class x20 extends m08 implements bz7 {
    public final /* synthetic */ e2a E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x20(e2a e2aVar) {
        super(1, gb9.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
        this.E = e2aVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        float[] fArr = ((nwa) obj).a;
        cu9 cu9Var = (cu9) this.E.V.getValue();
        if (cu9Var != null) {
            if (!cu9Var.n()) {
                cu9Var = null;
            }
            if (cu9Var != null) {
                cu9Var.h(fArr);
            }
        }
        return iei.a;
    }
}
