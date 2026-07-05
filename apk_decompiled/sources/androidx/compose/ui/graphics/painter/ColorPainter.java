package androidx.compose.ui.graphics.painter;

import defpackage.bpc;
import defpackage.cv9;
import defpackage.d54;
import defpackage.hr1;
import defpackage.mdj;
import defpackage.qk7;
import defpackage.xd6;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/painter/ColorPainter;", "Lbpc;", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final class ColorPainter extends bpc {
    public final long J;
    public hr1 L;
    public float K = 1.0f;
    public final long M = 9205357640488583168L;

    public ColorPainter(long j) {
        this.J = j;
    }

    @Override // defpackage.bpc
    public final boolean c(float f) {
        this.K = f;
        return true;
    }

    @Override // defpackage.bpc
    public final boolean d(hr1 hr1Var) {
        this.L = hr1Var;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ColorPainter) {
            return d54.c(this.J, ((ColorPainter) obj).J);
        }
        return false;
    }

    public final int hashCode() {
        int i = d54.i;
        return Long.hashCode(this.J);
    }

    @Override // defpackage.bpc
    /* JADX INFO: renamed from: i, reason: from getter */
    public final long getM() {
        return this.M;
    }

    @Override // defpackage.bpc
    public final void j(cv9 cv9Var) {
        cv9Var.T0(this.J, 0L, (58 & 4) != 0 ? xd6.h0(cv9Var.g(), 0L) : 0L, (58 & 8) != 0 ? 1.0f : this.K, (58 & 16) != 0 ? qk7.a : null, (58 & 32) != 0 ? null : this.L, (58 & 64) != 0 ? 3 : 0);
    }

    public final String toString() {
        return "ColorPainter(color=" + ((Object) d54.i(this.J)) + ')';
    }
}
