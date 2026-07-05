package androidx.compose.foundation.text.modifiers;

import defpackage.fsh;
import defpackage.gid;
import defpackage.hqb;
import defpackage.k54;
import defpackage.mdj;
import defpackage.nqb;
import defpackage.rkh;
import defpackage.tkh;
import defpackage.vb7;
import defpackage.wt7;
import defpackage.x44;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;", "Lnqb;", "Lrkh;", "Lk54;", "color", "Lk54;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final class TextStringSimpleElement extends nqb {
    public final String E;
    public final tkh F;
    public final wt7 G;
    public final int H;
    public final boolean I;
    public final int J;
    public final int K;
    private final k54 color = null;

    public TextStringSimpleElement(String str, tkh tkhVar, wt7 wt7Var, int i, boolean z, int i2, int i3) {
        this.E = str;
        this.F = tkhVar;
        this.G = wt7Var;
        this.H = i;
        this.I = z;
        this.J = i2;
        this.K = i3;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        k54 k54Var = this.color;
        rkh rkhVar = new rkh();
        rkhVar.S = this.E;
        rkhVar.T = this.F;
        rkhVar.U = this.G;
        rkhVar.V = this.H;
        rkhVar.W = this.I;
        rkhVar.X = this.J;
        rkhVar.Y = this.K;
        rkhVar.Z = k54Var;
        return rkhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStringSimpleElement)) {
            return false;
        }
        TextStringSimpleElement textStringSimpleElement = (TextStringSimpleElement) obj;
        return x44.r(this.color, textStringSimpleElement.color) && x44.r(this.E, textStringSimpleElement.E) && x44.r(this.F, textStringSimpleElement.F) && x44.r(this.G, textStringSimpleElement.G) && this.H == textStringSimpleElement.H && this.I == textStringSimpleElement.I && this.J == textStringSimpleElement.J && this.K == textStringSimpleElement.K;
    }

    public final int hashCode() {
        int iP = (((fsh.p(vb7.c(this.H, (this.G.hashCode() + gid.n(this.F, this.E.hashCode() * 31, 31)) * 31, 31), 31, this.I) + this.J) * 31) + this.K) * 31;
        k54 k54Var = this.color;
        return iP + (k54Var != null ? k54Var.hashCode() : 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    @Override // defpackage.nqb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void update(defpackage.hqb r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            rkh r1 = (defpackage.rkh) r1
            k54 r2 = r0.color
            k54 r3 = r1.Z
            boolean r3 = defpackage.x44.r(r2, r3)
            r1.Z = r2
            r2 = 0
            r4 = 1
            tkh r5 = r0.F
            if (r3 == 0) goto L2a
            tkh r3 = r1.T
            if (r5 == r3) goto L25
            egg r6 = r5.a
            egg r3 = r3.a
            boolean r3 = r6.c(r3)
            if (r3 == 0) goto L2a
            goto L28
        L25:
            r5.getClass()
        L28:
            r3 = r2
            goto L2b
        L2a:
            r3 = r4
        L2b:
            java.lang.String r6 = r1.S
            java.lang.String r7 = r0.E
            boolean r6 = defpackage.x44.r(r6, r7)
            r8 = 0
            if (r6 == 0) goto L37
            goto L3c
        L37:
            r1.S = r7
            r1.e0 = r8
            r2 = r4
        L3c:
            tkh r6 = r1.T
            boolean r6 = r6.e(r5)
            r6 = r6 ^ r4
            r1.T = r5
            int r5 = r1.Y
            int r7 = r0.K
            if (r5 == r7) goto L4e
            r1.Y = r7
            r6 = r4
        L4e:
            int r5 = r1.X
            int r7 = r0.J
            if (r5 == r7) goto L57
            r1.X = r7
            r6 = r4
        L57:
            boolean r5 = r1.W
            boolean r7 = r0.I
            if (r5 == r7) goto L60
            r1.W = r7
            r6 = r4
        L60:
            wt7 r5 = r1.U
            wt7 r7 = r0.G
            boolean r5 = defpackage.x44.r(r5, r7)
            if (r5 != 0) goto L6d
            r1.U = r7
            r6 = r4
        L6d:
            int r5 = r1.V
            int r0 = r0.H
            if (r5 != r0) goto L75
            r4 = r6
            goto L77
        L75:
            r1.V = r0
        L77:
            if (r3 != 0) goto L7d
            if (r2 != 0) goto L7d
            if (r4 == 0) goto L7f
        L7d:
            r1.c0 = r8
        L7f:
            if (r2 != 0) goto L83
            if (r4 == 0) goto L9a
        L83:
            hrc r9 = r1.p1()
            java.lang.String r10 = r1.S
            tkh r11 = r1.T
            wt7 r12 = r1.U
            int r13 = r1.V
            boolean r14 = r1.W
            int r15 = r1.X
            int r0 = r1.Y
            r16 = r0
            r9.f(r10, r11, r12, r13, r14, r15, r16)
        L9a:
            boolean r0 = r1.R
            if (r0 != 0) goto L9f
            goto Lc1
        L9f:
            if (r2 != 0) goto La7
            if (r3 == 0) goto Lae
            pkh r0 = r1.d0
            if (r0 == 0) goto Lae
        La7:
            av9 r0 = defpackage.yfd.W(r1)
            r0.V()
        Lae:
            if (r2 != 0) goto Lb2
            if (r4 == 0) goto Lbc
        Lb2:
            av9 r0 = defpackage.yfd.W(r1)
            r0.T()
            defpackage.wd6.t0(r1)
        Lbc:
            if (r3 == 0) goto Lc1
            defpackage.wd6.t0(r1)
        Lc1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.modifiers.TextStringSimpleElement.update(hqb):void");
    }
}
