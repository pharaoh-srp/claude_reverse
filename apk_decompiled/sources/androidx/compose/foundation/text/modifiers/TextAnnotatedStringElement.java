package androidx.compose.foundation.text.modifiers;

import defpackage.bz7;
import defpackage.fsh;
import defpackage.gid;
import defpackage.hqb;
import defpackage.k54;
import defpackage.kdh;
import defpackage.mdj;
import defpackage.nqb;
import defpackage.tkh;
import defpackage.vb7;
import defpackage.wt7;
import defpackage.x44;
import defpackage.zb0;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;", "Lnqb;", "Lkdh;", "Lk54;", "color", "Lk54;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final class TextAnnotatedStringElement extends nqb {
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
    public final bz7 O;
    private final k54 color = null;

    public TextAnnotatedStringElement(zb0 zb0Var, tkh tkhVar, wt7 wt7Var, bz7 bz7Var, int i, boolean z, int i2, int i3, List list, bz7 bz7Var2, bz7 bz7Var3) {
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
        this.O = bz7Var3;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        return new kdh(this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, null, this.color, this.O);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextAnnotatedStringElement)) {
            return false;
        }
        TextAnnotatedStringElement textAnnotatedStringElement = (TextAnnotatedStringElement) obj;
        return x44.r(this.color, textAnnotatedStringElement.color) && x44.r(this.E, textAnnotatedStringElement.E) && x44.r(this.F, textAnnotatedStringElement.F) && x44.r(this.M, textAnnotatedStringElement.M) && x44.r(this.G, textAnnotatedStringElement.G) && this.H == textAnnotatedStringElement.H && this.O == textAnnotatedStringElement.O && this.I == textAnnotatedStringElement.I && this.J == textAnnotatedStringElement.J && this.K == textAnnotatedStringElement.K && this.L == textAnnotatedStringElement.L && this.N == textAnnotatedStringElement.N;
    }

    public final int hashCode() {
        int iHashCode = (this.G.hashCode() + gid.n(this.F, this.E.hashCode() * 31, 31)) * 31;
        bz7 bz7Var = this.H;
        int iP = (((fsh.p(vb7.c(this.I, (iHashCode + (bz7Var != null ? bz7Var.hashCode() : 0)) * 31, 31), 31, this.J) + this.K) * 31) + this.L) * 31;
        List list = this.M;
        int iHashCode2 = (iP + (list != null ? list.hashCode() : 0)) * 31;
        bz7 bz7Var2 = this.N;
        int iHashCode3 = (iHashCode2 + (bz7Var2 != null ? bz7Var2.hashCode() : 0)) * 961;
        k54 k54Var = this.color;
        int iHashCode4 = (iHashCode3 + (k54Var != null ? k54Var.hashCode() : 0)) * 31;
        bz7 bz7Var3 = this.O;
        return iHashCode4 + (bz7Var3 != null ? bz7Var3.hashCode() : 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    @Override // defpackage.nqb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void update(defpackage.hqb r10) {
        /*
            r9 = this;
            r0 = r10
            kdh r0 = (defpackage.kdh) r0
            k54 r10 = r9.color
            k54 r1 = r0.d0
            boolean r1 = defpackage.x44.r(r10, r1)
            r0.d0 = r10
            if (r1 == 0) goto L25
            tkh r10 = r0.T
            tkh r1 = r9.F
            if (r1 == r10) goto L20
            egg r1 = r1.a
            egg r10 = r10.a
            boolean r10 = r1.c(r10)
            if (r10 == 0) goto L25
            goto L23
        L20:
            r1.getClass()
        L23:
            r10 = 0
            goto L26
        L25:
            r10 = 1
        L26:
            zb0 r1 = r9.E
            boolean r8 = r0.u1(r1)
            wt7 r6 = r9.G
            int r7 = r9.I
            tkh r1 = r9.F
            java.util.List r2 = r9.M
            int r3 = r9.L
            int r4 = r9.K
            boolean r5 = r9.J
            boolean r1 = r0.t1(r1, r2, r3, r4, r5, r6, r7)
            r2 = 0
            bz7 r3 = r9.O
            bz7 r4 = r9.H
            bz7 r9 = r9.N
            boolean r9 = r0.s1(r4, r9, r2, r3)
            r0.p1(r10, r8, r1, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement.update(hqb):void");
    }
}
