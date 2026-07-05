package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.types.a;

/* JADX INFO: loaded from: classes.dex */
public class tg3 extends j08 implements dm4 {
    public final boolean h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tg3(qqb qqbVar, dm4 dm4Var, wc0 wc0Var, boolean z, int i, neg negVar) {
        super(i, wc0Var, qqbVar, dm4Var, ygg.e, negVar);
        if (qqbVar == null) {
            k0(0);
            throw null;
        }
        if (wc0Var == null) {
            k0(1);
            throw null;
        }
        if (i == 0) {
            k0(2);
            throw null;
        }
        if (negVar == null) {
            k0(3);
            throw null;
        }
        this.h0 = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void k0(int r8) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tg3.k0(int):void");
    }

    @Override // defpackage.j08, defpackage.bo5
    public final Object E(fo5 fo5Var, Object obj) {
        return fo5Var.F(this, obj);
    }

    @Override // defpackage.j08, defpackage.e92
    public final e92 M(qqb qqbVar, int i, ow5 ow5Var) {
        return (tg3) N0(qqbVar, i, ow5Var);
    }

    @Override // defpackage.j08
    /* JADX INFO: renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public tg3 P0(int i, wc0 wc0Var, bo5 bo5Var, h08 h08Var, sxb sxbVar, neg negVar) {
        if (bo5Var == null) {
            k0(23);
            throw null;
        }
        if (i == 0) {
            k0(24);
            throw null;
        }
        if (wc0Var == null) {
            k0(25);
            throw null;
        }
        if (i == 1 || i == 4) {
            return new tg3((qqb) bo5Var, this, wc0Var, this.h0, 1, negVar);
        }
        StringBuilder sb = new StringBuilder("Attempt at creating a constructor that is not a declaration: \ncopy from: ");
        sb.append(this);
        sb.append("\nnewOwner: ");
        sb.append(bo5Var);
        String strB = qy1.B(i);
        sb.append("\nkind: ");
        sb.append(strB);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.eo5, defpackage.bo5
    /* JADX INFO: renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public final qqb h() {
        qqb qqbVar = (qqb) super.h();
        if (qqbVar != null) {
            return qqbVar;
        }
        k0(17);
        throw null;
    }

    @Override // defpackage.j08, defpackage.eo5, defpackage.co5, defpackage.bo5
    /* JADX INFO: renamed from: a1, reason: merged with bridge method [inline-methods] */
    public final tg3 a() {
        tg3 tg3Var = (tg3) super.a();
        if (tg3Var != null) {
            return tg3Var;
        }
        k0(19);
        throw null;
    }

    public final void b1(List list, ow5 ow5Var) {
        if (list == null) {
            k0(13);
            throw null;
        }
        if (ow5Var != null) {
            c1(list, ow5Var, h().i0());
        } else {
            k0(14);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c1(java.util.List r12, defpackage.ow5 r13, java.util.List r14) {
        /*
            r11 = this;
            r0 = 0
            if (r12 == 0) goto L60
            if (r13 == 0) goto L5a
            if (r14 == 0) goto L54
            qqb r1 = r11.h()
            boolean r2 = r1.y()
            if (r2 == 0) goto L21
            bo5 r1 = r1.h()
            boolean r2 = r1 instanceof defpackage.qqb
            if (r2 == 0) goto L21
            qqb r1 = (defpackage.qqb) r1
            l6e r1 = r1.j0()
            r4 = r1
            goto L22
        L21:
            r4 = r0
        L22:
            qqb r1 = r11.h()
            java.util.List r2 = r1.k()
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L3e
            java.util.List r1 = r1.k()
            if (r1 == 0) goto L38
        L36:
            r5 = r1
            goto L43
        L38:
            r11 = 15
            k0(r11)
            throw r0
        L3e:
            java.util.List r1 = java.util.Collections.EMPTY_LIST
            if (r1 == 0) goto L4e
            goto L36
        L43:
            r8 = 0
            r9 = 1
            r3 = 0
            r2 = r11
            r7 = r12
            r10 = r13
            r6 = r14
            r2.S0(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        L4e:
            r11 = 16
            k0(r11)
            throw r0
        L54:
            r11 = 12
            k0(r11)
            throw r0
        L5a:
            r11 = 11
            k0(r11)
            throw r0
        L60:
            r11 = 10
            k0(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tg3.c1(java.util.List, ow5, java.util.List):void");
    }

    @Override // defpackage.j08, defpackage.e92
    public final void d0(Collection collection) {
        if (collection != null) {
            return;
        }
        k0(22);
        throw null;
    }

    @Override // defpackage.j08, defpackage.h08, defpackage.vwg
    /* JADX INFO: renamed from: d1, reason: merged with bridge method [inline-methods] */
    public final tg3 e(a aVar) {
        if (aVar != null) {
            return (tg3) super.e(aVar);
        }
        k0(20);
        throw null;
    }

    @Override // defpackage.j08, defpackage.e92, defpackage.c92
    public final Collection i() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        k0(21);
        throw null;
    }

    @Override // defpackage.dm4
    public final qqb s() {
        qqb qqbVarH = h();
        if (qqbVarH != null) {
            return qqbVarH;
        }
        k0(18);
        throw null;
    }
}
