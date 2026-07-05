package android.print;

import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.print.PrintDocumentAdapter;
import defpackage.h80;
import defpackage.jce;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends PrintDocumentAdapter.LayoutResultCallback {
    public final /* synthetic */ h80 a;

    public a(h80 h80Var) {
        this.a = h80Var;
    }

    @Override // android.print.PrintDocumentAdapter.LayoutResultCallback
    public final void onLayoutCancelled() {
        this.a.e("layout cancelled");
    }

    @Override // android.print.PrintDocumentAdapter.LayoutResultCallback
    public final void onLayoutFailed(CharSequence charSequence) {
        this.a.e(charSequence);
    }

    @Override // android.print.PrintDocumentAdapter.LayoutResultCallback
    public final void onLayoutFinished(PrintDocumentInfo printDocumentInfo, boolean z) {
        h80 h80Var = this.a;
        try {
            ParcelFileDescriptor parcelFileDescriptorOpen = ParcelFileDescriptor.open((File) h80Var.F, 1006632960);
            h80Var.I = parcelFileDescriptorOpen;
            ((PrintDocumentAdapter) h80Var.E).onWrite(new PageRange[]{PageRange.ALL_PAGES}, parcelFileDescriptorOpen, new CancellationSignal(), new b(h80Var));
        } catch (Throwable th) {
            h80Var.e("write threw: " + jce.a.b(th.getClass()).f());
        }
    }
}
