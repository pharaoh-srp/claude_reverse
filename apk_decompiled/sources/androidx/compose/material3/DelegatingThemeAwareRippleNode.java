package androidx.compose.material3;

import defpackage.d4c;
import defpackage.e0g;
import defpackage.eue;
import defpackage.k54;
import defpackage.lbc;
import defpackage.mdj;
import defpackage.oe4;
import defpackage.qw5;
import defpackage.w79;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/material3/DelegatingThemeAwareRippleNode;", "Lqw5;", "Loe4;", "Llbc;", "Lk54;", "color", "Lk54;", "material3"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
final class DelegatingThemeAwareRippleNode extends qw5 implements oe4, lbc {
    public final w79 U;
    public final boolean V;
    public final float W;
    public final e0g X;
    public final boolean Y;
    public final boolean Z;
    public final boolean a0;
    public final boolean b0;
    public eue c0;
    private final k54 color;

    public DelegatingThemeAwareRippleNode(w79 w79Var, boolean z, float f, k54 k54Var, e0g e0gVar, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.U = w79Var;
        this.V = z;
        this.W = f;
        this.color = k54Var;
        this.X = e0gVar;
        this.Y = z2;
        this.Z = z3;
        this.a0 = z4;
        this.b0 = z5;
    }

    @Override // defpackage.lbc
    public final void F0() {
        d4c.a0(this, new a(this));
    }

    @Override // defpackage.hqb
    public final void h1() {
        d4c.a0(this, new a(this));
    }
}
