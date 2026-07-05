package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fg8 implements zz7 {
    public final /* synthetic */ gg8 E;

    public fg8(gg8 gg8Var) {
        this.E = gg8Var;
    }

    @Override // defpackage.zz7
    public final qz7 d() {
        return new m08(0, 1, wd6.class, this.E, "invalidateDraw", "invalidateDraw(Landroidx/compose/ui/node/DrawModifierNode;)V");
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof fg8) && (obj instanceof zz7)) {
            return d().equals(((zz7) obj).d());
        }
        return false;
    }

    public final int hashCode() {
        return d().hashCode();
    }
}
