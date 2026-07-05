package defpackage;

import android.credentials.ClearCredentialStateRequest;
import android.credentials.CredentialManager;
import android.credentials.CredentialOption;
import android.credentials.GetCredentialRequest;
import android.os.Bundle;
import android.text.GraphemeClusterSegmentFinder;
import android.text.SegmentFinder;
import android.text.TextPaint;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class ds {
    public static /* synthetic */ ClearCredentialStateRequest d(Bundle bundle) {
        return new ClearCredentialStateRequest(bundle);
    }

    public static /* bridge */ /* synthetic */ CredentialManager e(Object obj) {
        return (CredentialManager) obj;
    }

    public static /* synthetic */ CredentialOption.Builder f(Bundle bundle, Bundle bundle2) {
        return new CredentialOption.Builder("com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL", bundle, bundle2);
    }

    public static /* synthetic */ GetCredentialRequest.Builder g(Bundle bundle) {
        return new GetCredentialRequest.Builder(bundle);
    }

    public static /* synthetic */ GraphemeClusterSegmentFinder k(CharSequence charSequence, TextPaint textPaint) {
        return new GraphemeClusterSegmentFinder(charSequence, textPaint);
    }

    public static /* bridge */ /* synthetic */ SegmentFinder l(Object obj) {
        return (SegmentFinder) obj;
    }

    public static /* synthetic */ void n() {
    }

    public static /* synthetic */ void v() {
    }

    public static /* synthetic */ void x() {
    }

    public static /* synthetic */ void z() {
    }
}
