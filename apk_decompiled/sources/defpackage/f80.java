package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class f80 implements k80 {
    public final c80 E;
    public final c80 F;

    public f80(c80 c80Var, c80 c80Var2) {
        this.E = c80Var;
        this.F = c80Var2;
    }

    @Override // defpackage.k80
    public final ke1 a() {
        return new rig(this.E.a(), this.F.a());
    }

    @Override // defpackage.k80
    public final List b() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // defpackage.k80
    public final boolean c() {
        return this.E.c() && this.F.c();
    }
}
