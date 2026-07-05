package android.print;

import android.os.ParcelFileDescriptor;
import android.print.PrintDocumentAdapter;
import defpackage.h80;
import defpackage.x04;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends PrintDocumentAdapter.WriteResultCallback {
    public final /* synthetic */ h80 a;

    public b(h80 h80Var) {
        this.a = h80Var;
    }

    @Override // android.print.PrintDocumentAdapter.WriteResultCallback
    public final void onWriteCancelled() {
        this.a.e("write cancelled");
    }

    @Override // android.print.PrintDocumentAdapter.WriteResultCallback
    public final void onWriteFailed(CharSequence charSequence) {
        this.a.e(charSequence);
    }

    @Override // android.print.PrintDocumentAdapter.WriteResultCallback
    public final void onWriteFinished(PageRange[] pageRangeArr) {
        h80 h80Var = this.a;
        try {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) h80Var.I;
            if (parcelFileDescriptor != null) {
                parcelFileDescriptor.close();
            }
        } catch (Throwable unused) {
        }
        h80Var.I = null;
        try {
            ((PrintDocumentAdapter) h80Var.E).onFinish();
        } catch (Throwable unused2) {
        }
        ((x04) h80Var.G).a();
    }
}
