package defpackage;

import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.print.PageRange;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes2.dex */
public final class p7e extends PrintDocumentAdapter {
    public final /* synthetic */ PrintDocumentAdapter a;
    public final /* synthetic */ WebView b;

    public p7e(PrintDocumentAdapter printDocumentAdapter, WebView webView) {
        this.a = printDocumentAdapter;
        this.b = webView;
    }

    @Override // android.print.PrintDocumentAdapter
    public final void onFinish() {
        this.a.onFinish();
        this.b.destroy();
    }

    @Override // android.print.PrintDocumentAdapter
    public final void onLayout(PrintAttributes printAttributes, PrintAttributes printAttributes2, CancellationSignal cancellationSignal, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, Bundle bundle) {
        printAttributes2.getClass();
        layoutResultCallback.getClass();
        this.a.onLayout(printAttributes, printAttributes2, cancellationSignal, layoutResultCallback, bundle);
    }

    @Override // android.print.PrintDocumentAdapter
    public final void onWrite(PageRange[] pageRangeArr, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
        pageRangeArr.getClass();
        parcelFileDescriptor.getClass();
        writeResultCallback.getClass();
        this.a.onWrite(pageRangeArr, parcelFileDescriptor, cancellationSignal, writeResultCallback);
    }
}
