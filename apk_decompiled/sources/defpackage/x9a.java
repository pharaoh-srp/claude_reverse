package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: loaded from: classes2.dex */
public final class x9a implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ eaa E;

    public x9a(eaa eaaVar) {
        this.E = eaaVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        dh6 dh6Var;
        if (i == -1 || (dh6Var = this.E.G) == null) {
            return;
        }
        dh6Var.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
