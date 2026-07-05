package defpackage;

import android.media.AudioDescriptor;
import android.media.AudioProfile;
import android.view.autofill.AutofillId;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class q00 {
    public static /* bridge */ /* synthetic */ AudioDescriptor c(Object obj) {
        return (AudioDescriptor) obj;
    }

    public static /* bridge */ /* synthetic */ AudioProfile e(Object obj) {
        return (AudioProfile) obj;
    }

    public static /* synthetic */ ViewTranslationRequest.Builder h(AutofillId autofillId, long j) {
        return new ViewTranslationRequest.Builder(autofillId, j);
    }

    public static /* bridge */ /* synthetic */ ViewTranslationResponse j(Object obj) {
        return (ViewTranslationResponse) obj;
    }

    public static /* synthetic */ void m() {
    }
}
