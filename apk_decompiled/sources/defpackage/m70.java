package defpackage;

import android.os.Parcelable;
import android.util.SparseArray;

/* JADX INFO: loaded from: classes2.dex */
public final class m70 extends ts9 implements zy7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ nxi G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m70(nxi nxiVar, int i) {
        super(0);
        this.F = i;
        this.G = nxiVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.F;
        iei ieiVar = iei.a;
        nxi nxiVar = this.G;
        switch (i) {
            case 0:
                nxiVar.getLayoutNode().Q();
                break;
            case 1:
                if (nxiVar.I && nxiVar.isAttachedToWindow() && nxiVar.getView().getParent() == nxiVar) {
                    omc snapshotObserver = nxiVar.getSnapshotObserver();
                    snapshotObserver.a.d(nxiVar, ex.O, nxiVar.getUpdate());
                }
                break;
            case 2:
                SparseArray<Parcelable> sparseArray = new SparseArray<>();
                nxiVar.h0.saveHierarchyState(sparseArray);
                break;
            case 3:
                nxiVar.getReleaseBlock().invoke(nxiVar.h0);
                nxi.p(nxiVar);
                break;
            case 4:
                nxiVar.getResetBlock().invoke(nxiVar.h0);
                break;
            default:
                nxiVar.getUpdateBlock().invoke(nxiVar.h0);
                break;
        }
        return ieiVar;
    }
}
