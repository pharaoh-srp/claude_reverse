package defpackage;

import android.credentials.ClearCredentialStateException;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialResponse;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class fa5 {
    public static /* bridge */ /* synthetic */ boolean B(Object obj) {
        return obj instanceof InsertGesture;
    }

    public static /* bridge */ /* synthetic */ boolean C(Object obj) {
        return obj instanceof RemoveSpaceGesture;
    }

    public static /* bridge */ /* synthetic */ boolean D(Object obj) {
        return obj instanceof JoinOrSplitGesture;
    }

    public static /* bridge */ /* synthetic */ ClearCredentialStateException f(Throwable th) {
        return (ClearCredentialStateException) th;
    }

    public static /* bridge */ /* synthetic */ GetCredentialException k(Throwable th) {
        return (GetCredentialException) th;
    }

    public static /* bridge */ /* synthetic */ GetCredentialResponse m(Object obj) {
        return (GetCredentialResponse) obj;
    }

    public static /* bridge */ /* synthetic */ InsertGesture q(Object obj) {
        return (InsertGesture) obj;
    }

    public static /* bridge */ /* synthetic */ RemoveSpaceGesture r(Object obj) {
        return (RemoveSpaceGesture) obj;
    }

    public static /* bridge */ /* synthetic */ SelectGesture s(Object obj) {
        return (SelectGesture) obj;
    }

    public static /* bridge */ /* synthetic */ boolean z(Object obj) {
        return obj instanceof SelectGesture;
    }
}
