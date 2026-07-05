package androidx.compose.ui.graphics.painter;

import defpackage.bpc;
import defpackage.csg;
import defpackage.cv9;
import defpackage.g79;
import defpackage.hr1;
import defpackage.ib2;
import defpackage.mdj;
import defpackage.r20;
import defpackage.sz6;
import defpackage.vb7;
import defpackage.x44;
import defpackage.xd6;
import defpackage.y69;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/painter/BitmapPainter;", "Lbpc;", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final class BitmapPainter extends bpc {
    public final r20 J;
    public final long K;
    public int L;
    public final long M;
    public float N;
    public hr1 O;

    public BitmapPainter(r20 r20Var, long j) {
        int i;
        this.J = r20Var;
        this.K = j;
        this.L = 1;
        int i2 = (int) (j >> 32);
        if (i2 < 0 || (i = (int) (4294967295L & j)) < 0 || i2 > r20Var.a.getWidth() || i > r20Var.a.getHeight()) {
            sz6.p("Failed requirement.");
            throw null;
        }
        this.M = j;
        this.N = 1.0f;
    }

    @Override // defpackage.bpc
    public final boolean c(float f) {
        this.N = f;
        return true;
    }

    @Override // defpackage.bpc
    public final boolean d(hr1 hr1Var) {
        this.O = hr1Var;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BitmapPainter)) {
            return false;
        }
        BitmapPainter bitmapPainter = (BitmapPainter) obj;
        return x44.r(this.J, bitmapPainter.J) && y69.b(0L, 0L) && g79.b(this.K, bitmapPainter.K) && this.L == bitmapPainter.L;
    }

    public final int hashCode() {
        return Integer.hashCode(this.L) + vb7.e(vb7.e(this.J.hashCode() * 31, 31, 0L), 31, this.K);
    }

    @Override // defpackage.bpc
    /* JADX INFO: renamed from: i */
    public final long getM() {
        return csg.T(this.M);
    }

    @Override // defpackage.bpc
    public final void j(cv9 cv9Var) {
        ib2 ib2Var = cv9Var.E;
        xd6.P(cv9Var, this.J, 0L, this.K, (((long) Math.round(Float.intBitsToFloat((int) (ib2Var.g() >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (ib2Var.g() & 4294967295L)))) & 4294967295L), this.N, this.O, this.L, 328);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BitmapPainter(image=");
        sb.append(this.J);
        sb.append(", srcOffset=");
        sb.append((Object) y69.e(0L));
        sb.append(", srcSize=");
        sb.append((Object) g79.c(this.K));
        sb.append(", filterQuality=");
        int i = this.L;
        sb.append((Object) (i == 0 ? "None" : i == 1 ? "Low" : i == 2 ? "Medium" : i == 3 ? "High" : "Unknown"));
        sb.append(')');
        return sb.toString();
    }

    public BitmapPainter(r20 r20Var) {
        this(r20Var, (((long) r20Var.a.getHeight()) & 4294967295L) | (((long) r20Var.a.getWidth()) << 32));
    }
}
