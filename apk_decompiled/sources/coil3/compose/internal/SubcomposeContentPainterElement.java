package coil3.compose.internal;

import defpackage.bpc;
import defpackage.fsh;
import defpackage.hqb;
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

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcoil3/compose/internal/SubcomposeContentPainterElement;", "Lnqb;", "Lcoil3/compose/internal/SubcomposeContentPainterNode;", "Lbpc;", "painter", "Lbpc;", "io.coil-kt.coil3:coil-compose-core"}, k = 1, mv = {2, 2, 0}, xi = mdj.f)
public final /* data */ class SubcomposeContentPainterElement extends nqb {
    public final tt E;
    public final jo4 F;
    public final float G;
    public final boolean H;
    public final String I;
    private final bpc painter;

    public SubcomposeContentPainterElement(bpc bpcVar, tt ttVar, jo4 jo4Var, float f, boolean z, String str) {
        this.painter = bpcVar;
        this.E = ttVar;
        this.F = jo4Var;
        this.G = f;
        this.H = z;
        this.I = str;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        return new SubcomposeContentPainterNode(this.painter, this.E, this.F, this.G, this.H, this.I);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubcomposeContentPainterElement)) {
            return false;
        }
        SubcomposeContentPainterElement subcomposeContentPainterElement = (SubcomposeContentPainterElement) obj;
        return x44.r(this.painter, subcomposeContentPainterElement.painter) && x44.r(this.E, subcomposeContentPainterElement.E) && x44.r(this.F, subcomposeContentPainterElement.F) && Float.compare(this.G, subcomposeContentPainterElement.G) == 0 && this.H == subcomposeContentPainterElement.H && x44.r(this.I, subcomposeContentPainterElement.I);
    }

    public final int hashCode() {
        int iP = fsh.p(vb7.b(this.G, (this.F.hashCode() + ((this.E.hashCode() + (this.painter.hashCode() * 31)) * 31)) * 31, 961), 31, this.H);
        String str = this.I;
        return iP + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "SubcomposeContentPainterElement(painter=" + this.painter + ", alignment=" + this.E + ", contentScale=" + this.F + ", alpha=" + this.G + ", colorFilter=null, clipToBounds=" + this.H + ", contentDescription=" + this.I + ")";
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        SubcomposeContentPainterNode subcomposeContentPainterNode = (SubcomposeContentPainterNode) hqbVar;
        boolean zB = k8g.b(subcomposeContentPainterNode.getPainter().getM(), this.painter.getM());
        subcomposeContentPainterNode.s1(this.painter);
        subcomposeContentPainterNode.S = this.E;
        subcomposeContentPainterNode.T = this.F;
        subcomposeContentPainterNode.U = this.G;
        subcomposeContentPainterNode.V = null;
        subcomposeContentPainterNode.W = this.H;
        String str = subcomposeContentPainterNode.X;
        String str2 = this.I;
        if (!x44.r(str, str2)) {
            subcomposeContentPainterNode.X = str2;
            yfd.W(subcomposeContentPainterNode).V();
        }
        if (!zB) {
            yfd.W(subcomposeContentPainterNode).T();
        }
        wd6.t0(subcomposeContentPainterNode);
    }
}
