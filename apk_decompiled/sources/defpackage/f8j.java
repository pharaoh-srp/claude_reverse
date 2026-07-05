package defpackage;

import java.util.ArrayList;
import java.util.List;
import org.chromium.support_lib_boundary.WebViewStartUpResultBoundaryInterface;

/* JADX INFO: loaded from: classes3.dex */
public final class f8j implements h8j {
    public final ArrayList a;
    public final /* synthetic */ WebViewStartUpResultBoundaryInterface b;

    public f8j(ArrayList arrayList, ArrayList arrayList2, WebViewStartUpResultBoundaryInterface webViewStartUpResultBoundaryInterface) {
        this.b = webViewStartUpResultBoundaryInterface;
        this.a = arrayList;
    }

    @Override // defpackage.h8j
    public final List a() {
        return this.a;
    }

    @Override // defpackage.h8j
    public final Long getMaxTimePerTaskInUiThreadMillis() {
        return this.b.getMaxTimePerTaskInUiThreadMillis();
    }

    @Override // defpackage.h8j
    public final Long getTotalTimeInUiThreadMillis() {
        return this.b.getTotalTimeInUiThreadMillis();
    }
}
