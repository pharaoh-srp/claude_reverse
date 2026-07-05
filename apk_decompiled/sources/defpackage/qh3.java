package defpackage;

import android.app.Activity;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class qh3 {
    public static /* bridge */ /* synthetic */ Activity.ScreenCaptureCallback b(Object obj) {
        return (Activity.ScreenCaptureCallback) obj;
    }

    public static /* bridge */ /* synthetic */ Class d() {
        return SelectGesture.class;
    }

    public static /* bridge */ /* synthetic */ Class k() {
        return SelectRangeGesture.class;
    }

    public static /* bridge */ /* synthetic */ Class l() {
        return DeleteRangeGesture.class;
    }

    public static /* bridge */ /* synthetic */ Class m() {
        return DeleteGesture.class;
    }

    public static /* bridge */ /* synthetic */ Class n() {
        return JoinOrSplitGesture.class;
    }

    public static /* bridge */ /* synthetic */ Class o() {
        return InsertGesture.class;
    }

    public static /* bridge */ /* synthetic */ Class p() {
        return RemoveSpaceGesture.class;
    }
}
