package androidx.compose.ui.draw;

import defpackage.bpc;
import defpackage.fsh;
import defpackage.hqb;
import defpackage.hr1;
import defpackage.jo4;
import defpackage.k8g;
import defpackage.mdj;
import defpackage.nqb;
import defpackage.tt;
import defpackage.vb7;
import defpackage.wd6;
import defpackage.x44;
import defpackage.yfd;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/draw/PainterElement;", "Lnqb;", "Landroidx/compose/ui/draw/PainterNode;", "Lbpc;", "painter", "Lbpc;", "getPainter", "()Lbpc;", "ui"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
final /* data */ class PainterElement extends nqb {
    public final boolean E;
    public final tt F;
    public final jo4 G;
    public final float H;
    public final hr1 I;
    private final bpc painter;

    public PainterElement(bpc bpcVar, boolean z, tt ttVar, jo4 jo4Var, float f, hr1 hr1Var) {
        this.painter = bpcVar;
        this.E = z;
        this.F = ttVar;
        this.G = jo4Var;
        this.H = f;
        this.I = hr1Var;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        return new PainterNode(this.painter, this.E, this.F, this.G, this.H, this.I);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PainterElement)) {
            return false;
        }
        PainterElement painterElement = (PainterElement) obj;
        return x44.r(this.painter, painterElement.painter) && this.E == painterElement.E && x44.r(this.F, painterElement.F) && x44.r(this.G, painterElement.G) && Float.compare(this.H, painterElement.H) == 0 && x44.r(this.I, painterElement.I);
    }

    public final int hashCode() {
        int iB = vb7.b(this.H, (this.G.hashCode() + ((this.F.hashCode() + fsh.p(this.painter.hashCode() * 31, 31, this.E)) * 31)) * 31, 31);
        hr1 hr1Var = this.I;
        return iB + (hr1Var == null ? 0 : hr1Var.hashCode());
    }

    public final String toString() {
        return "PainterElement(painter=" + this.painter + ", sizeToIntrinsics=" + this.E + ", alignment=" + this.F + ", contentScale=" + this.G + ", alpha=" + this.H + ", colorFilter=" + this.I + ')';
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        PainterNode painterNode = (PainterNode) hqbVar;
        boolean z = painterNode.S;
        boolean z2 = this.E;
        boolean z3 = z != z2 || (z2 && !k8g.b(painterNode.getPainter().getM(), this.painter.getM()));
        painterNode.u1(this.painter);
        painterNode.S = z2;
        painterNode.T = this.F;
        painterNode.U = this.G;
        painterNode.V = this.H;
        painterNode.W = this.I;
        if (z3) {
            yfd.W(painterNode).T();
        }
        wd6.t0(painterNode);
    }
}
