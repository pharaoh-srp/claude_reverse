package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.types.a;

/* JADX INFO: loaded from: classes3.dex */
public class eri extends jri implements lrc {
    public final int J;
    public final boolean K;
    public final boolean L;
    public final boolean M;
    public final yr9 N;
    public final eri O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eri(c92 c92Var, eri eriVar, int i, wc0 wc0Var, sxb sxbVar, yr9 yr9Var, boolean z, boolean z2, boolean z3, yr9 yr9Var2, neg negVar) {
        super(c92Var, wc0Var, sxbVar, yr9Var, negVar);
        c92Var.getClass();
        wc0Var.getClass();
        sxbVar.getClass();
        yr9Var.getClass();
        negVar.getClass();
        this.J = i;
        this.K = z;
        this.L = z2;
        this.M = z3;
        this.N = yr9Var2;
        this.O = eriVar == null ? this : eriVar;
    }

    public static final eri O0(c92 c92Var, eri eriVar, int i, wc0 wc0Var, sxb sxbVar, yr9 yr9Var, boolean z, boolean z2, boolean z3, yr9 yr9Var2, neg negVar, o4 o4Var) {
        wc0Var.getClass();
        sxbVar.getClass();
        negVar.getClass();
        return o4Var == null ? new eri(c92Var, eriVar, i, wc0Var, sxbVar, yr9Var, z, z2, z3, yr9Var2, negVar) : new dri(c92Var, eriVar, i, wc0Var, sxbVar, yr9Var, z, z2, z3, yr9Var2, negVar, o4Var);
    }

    @Override // defpackage.iri
    public final /* bridge */ /* synthetic */ il4 D() {
        return null;
    }

    @Override // defpackage.bo5
    public final Object E(fo5 fo5Var, Object obj) {
        return fo5Var.g(this, obj);
    }

    public eri N0(k08 k08Var, sxb sxbVar, int i) {
        wc0 annotations = getAnnotations();
        annotations.getClass();
        yr9 type = getType();
        type.getClass();
        return new eri(k08Var, null, i, annotations, sxbVar, type, P0(), this.L, this.M, this.N, neg.n);
    }

    public final boolean P0() {
        return this.K && ((e92) h()).getKind() != 2;
    }

    @Override // defpackage.eo5, defpackage.bo5
    /* JADX INFO: renamed from: Q0, reason: merged with bridge method [inline-methods] */
    public final c92 h() {
        bo5 bo5VarH = super.h();
        bo5VarH.getClass();
        return (c92) bo5VarH;
    }

    @Override // defpackage.iri
    public final boolean R() {
        return false;
    }

    @Override // defpackage.eo5, defpackage.co5, defpackage.bo5
    /* JADX INFO: renamed from: R0, reason: merged with bridge method [inline-methods] */
    public final eri a() {
        eri eriVar = this.O;
        return eriVar == this ? this : eriVar.a();
    }

    public final yr9 S0() {
        return this.N;
    }

    public final boolean T0() {
        return this.L;
    }

    public final boolean U0() {
        return this.M;
    }

    @Override // defpackage.vwg
    public final do5 e(a aVar) {
        aVar.getClass();
        if (aVar.a.f()) {
            return this;
        }
        mr9.x();
        return null;
    }

    public final int getIndex() {
        return this.J;
    }

    @Override // defpackage.go5, defpackage.w9b
    public final ow5 getVisibility() {
        p06 p06Var = q06.f;
        p06Var.getClass();
        return p06Var;
    }

    @Override // defpackage.c92
    public final Collection i() {
        Collection collectionI = h().i();
        collectionI.getClass();
        Collection collection = collectionI;
        ArrayList arrayList = new ArrayList(x44.y(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add((eri) ((c92) it.next()).I().get(this.J));
        }
        return arrayList;
    }
}
