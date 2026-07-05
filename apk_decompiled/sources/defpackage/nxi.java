package defpackage;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.ui.node.Owner;

/* JADX INFO: loaded from: classes2.dex */
public final class nxi extends n70 {
    public final View h0;
    public final b0c i0;
    public b5f j0;
    public bz7 k0;
    public bz7 l0;
    public bz7 m0;

    public nxi(Context context, bz7 bz7Var, c18 c18Var, c5f c5fVar, int i, Owner owner) {
        View view = (View) bz7Var.invoke(context);
        b0c b0cVar = new b0c();
        super(context, c18Var, i, b0cVar, view, owner);
        this.h0 = view;
        this.i0 = b0cVar;
        setClipChildren(false);
        String strValueOf = String.valueOf(i);
        Object objF = c5fVar != null ? c5fVar.f(strValueOf) : null;
        SparseArray<Parcelable> sparseArray = objF instanceof SparseArray ? (SparseArray) objF : null;
        if (sparseArray != null) {
            view.restoreHierarchyState(sparseArray);
        }
        if (c5fVar != null) {
            setSavableRegistryEntry(c5fVar.b(new m70(this, 2), strValueOf));
        }
        ex exVar = ex.R;
        this.k0 = exVar;
        this.l0 = exVar;
        this.m0 = exVar;
    }

    public static final void p(nxi nxiVar) {
        nxiVar.setSavableRegistryEntry(null);
    }

    private final void setSavableRegistryEntry(b5f b5fVar) {
        b5f b5fVar2 = this.j0;
        if (b5fVar2 != null) {
            ((w3c) b5fVar2).f();
        }
        this.j0 = b5fVar;
    }

    public final b0c getDispatcher() {
        return this.i0;
    }

    public final bz7 getReleaseBlock() {
        return this.m0;
    }

    public final bz7 getResetBlock() {
        return this.l0;
    }

    public /* bridge */ /* synthetic */ a1 getSubCompositionView() {
        return null;
    }

    public final bz7 getUpdateBlock() {
        return this.k0;
    }

    public View getViewRoot() {
        return this;
    }

    public final void setReleaseBlock(bz7 bz7Var) {
        this.m0 = bz7Var;
        setRelease(new m70(this, 3));
    }

    public final void setResetBlock(bz7 bz7Var) {
        this.l0 = bz7Var;
        setReset(new m70(this, 4));
    }

    public final void setUpdateBlock(bz7 bz7Var) {
        this.k0 = bz7Var;
        setUpdate(new m70(this, 5));
    }
}
