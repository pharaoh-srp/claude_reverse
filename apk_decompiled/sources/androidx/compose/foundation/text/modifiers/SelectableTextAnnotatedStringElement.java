package androidx.compose.foundation.text.modifiers;

import defpackage.bz7;
import defpackage.fsh;
import defpackage.gid;
import defpackage.hqb;
import defpackage.k54;
import defpackage.mdj;
import defpackage.nqb;
import defpackage.tkh;
import defpackage.vb7;
import defpackage.wgf;
import defpackage.wt7;
import defpackage.x44;
import defpackage.yhf;
import defpackage.zb0;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;", "Lnqb;", "Lwgf;", "Lk54;", "color", "Lk54;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final class SelectableTextAnnotatedStringElement extends nqb {
    public final zb0 E;
    public final tkh F;
    public final wt7 G;
    public final bz7 H;
    public final int I;
    public final boolean J;
    public final int K;
    public final int L;
    public final List M;
    public final bz7 N;
    public final yhf O;
    private final k54 color = null;

    public SelectableTextAnnotatedStringElement(zb0 zb0Var, tkh tkhVar, wt7 wt7Var, bz7 bz7Var, int i, boolean z, int i2, int i3, List list, bz7 bz7Var2, yhf yhfVar) {
        this.E = zb0Var;
        this.F = tkhVar;
        this.G = wt7Var;
        this.H = bz7Var;
        this.I = i;
        this.J = z;
        this.K = i2;
        this.L = i3;
        this.M = list;
        this.N = bz7Var2;
        this.O = yhfVar;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        return new wgf(this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.color);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectableTextAnnotatedStringElement)) {
            return false;
        }
        SelectableTextAnnotatedStringElement selectableTextAnnotatedStringElement = (SelectableTextAnnotatedStringElement) obj;
        return x44.r(this.color, selectableTextAnnotatedStringElement.color) && x44.r(this.E, selectableTextAnnotatedStringElement.E) && x44.r(this.F, selectableTextAnnotatedStringElement.F) && x44.r(this.M, selectableTextAnnotatedStringElement.M) && x44.r(this.G, selectableTextAnnotatedStringElement.G) && this.H == selectableTextAnnotatedStringElement.H && this.I == selectableTextAnnotatedStringElement.I && this.J == selectableTextAnnotatedStringElement.J && this.K == selectableTextAnnotatedStringElement.K && this.L == selectableTextAnnotatedStringElement.L && this.N == selectableTextAnnotatedStringElement.N && x44.r(this.O, selectableTextAnnotatedStringElement.O);
    }

    public final int hashCode() {
        int iHashCode = (this.G.hashCode() + gid.n(this.F, this.E.hashCode() * 31, 31)) * 31;
        bz7 bz7Var = this.H;
        int iP = (((fsh.p(vb7.c(this.I, (iHashCode + (bz7Var != null ? bz7Var.hashCode() : 0)) * 31, 31), 31, this.J) + this.K) * 31) + this.L) * 31;
        List list = this.M;
        int iHashCode2 = (iP + (list != null ? list.hashCode() : 0)) * 31;
        bz7 bz7Var2 = this.N;
        int iHashCode3 = (iHashCode2 + (bz7Var2 != null ? bz7Var2.hashCode() : 0)) * 31;
        yhf yhfVar = this.O;
        int iHashCode4 = (iHashCode3 + (yhfVar != null ? yhfVar.hashCode() : 0)) * 961;
        k54 k54Var = this.color;
        return iHashCode4 + (k54Var != null ? k54Var.hashCode() : 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    @Override // defpackage.nqb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void update(defpackage.hqb r12) {
        /*
            r11 = this;
            wgf r12 = (defpackage.wgf) r12
            k54 r0 = r11.color
            kdh r1 = r12.V
            k54 r2 = r1.d0
            boolean r2 = defpackage.x44.r(r0, r2)
            r1.d0 = r0
            tkh r4 = r11.F
            if (r2 == 0) goto L26
            tkh r0 = r1.T
            if (r4 == r0) goto L21
            egg r2 = r4.a
            egg r0 = r0.a
            boolean r0 = r2.c(r0)
            if (r0 == 0) goto L26
            goto L24
        L21:
            r4.getClass()
        L24:
            r0 = 0
            goto L27
        L26:
            r0 = 1
        L27:
            zb0 r2 = r11.E
            boolean r2 = r1.u1(r2)
            kdh r3 = r12.V
            java.util.List r5 = r11.M
            int r6 = r11.L
            int r7 = r11.K
            boolean r8 = r11.J
            wt7 r9 = r11.G
            int r10 = r11.I
            boolean r3 = r3.t1(r4, r5, r6, r7, r8, r9, r10)
            r4 = 0
            bz7 r5 = r11.H
            bz7 r6 = r11.N
            yhf r11 = r11.O
            boolean r4 = r1.s1(r5, r6, r11, r4)
            r1.p1(r0, r2, r3, r4)
            r12.U = r11
            av9 r11 = defpackage.yfd.W(r12)
            r11.T()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.modifiers.SelectableTextAnnotatedStringElement.update(hqb):void");
    }
}
