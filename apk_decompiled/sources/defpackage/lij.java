package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lij implements s4a, zz7 {
    public final /* synthetic */ ge4 E;

    public lij(ge4 ge4Var) {
        this.E = ge4Var;
    }

    @Override // defpackage.zz7
    public final qz7 d() {
        return new m08(1, 0, ge4.class, this.E, "scheduleFrameEndCallback", "scheduleFrameEndCallback(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/CancellationHandle;");
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof s4a) && (obj instanceof zz7)) {
            return d().equals(((zz7) obj).d());
        }
        return false;
    }

    public final int hashCode() {
        return d().hashCode();
    }
}
