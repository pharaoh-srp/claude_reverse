package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: loaded from: classes2.dex */
public final class uh0 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;

    public /* synthetic */ uh0(int i, Object obj) {
        this.E = i;
        this.F = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        int i2 = this.E;
        Object obj = this.F;
        switch (i2) {
            case 0:
                wh0 wh0Var = (wh0) obj;
                zh0 zh0Var = wh0Var.k0;
                zh0Var.setSelection(i);
                if (zh0Var.getOnItemClickListener() != null) {
                    zh0Var.performItemClick(view, i, wh0Var.h0.getItemId(i));
                }
                wh0Var.dismiss();
                break;
            default:
                sva svaVar = (sva) obj;
                eaa eaaVar = svaVar.I;
                sva.a(svaVar, i < 0 ? !eaaVar.d0.isShowing() ? null : eaaVar.G.getSelectedItem() : svaVar.getAdapter().getItem(i));
                AdapterView.OnItemClickListener onItemClickListener = svaVar.getOnItemClickListener();
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        view = !eaaVar.d0.isShowing() ? null : eaaVar.G.getSelectedView();
                        i = !eaaVar.d0.isShowing() ? -1 : eaaVar.G.getSelectedItemPosition();
                        j = !eaaVar.d0.isShowing() ? Long.MIN_VALUE : eaaVar.G.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(eaaVar.G, view, i, j);
                }
                eaaVar.dismiss();
                break;
        }
    }
}
