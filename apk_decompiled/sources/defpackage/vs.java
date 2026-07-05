package defpackage;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: loaded from: classes2.dex */
public final class vs implements AdapterView.OnItemClickListener {
    public final /* synthetic */ zs E;
    public final /* synthetic */ ws F;

    public vs(ws wsVar, zs zsVar) {
        this.F = wsVar;
        this.E = zsVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ws wsVar = this.F;
        DialogInterface.OnClickListener onClickListener = wsVar.j;
        zs zsVar = this.E;
        onClickListener.onClick(zsVar.b, i);
        if (wsVar.l) {
            return;
        }
        zsVar.b.dismiss();
    }
}
