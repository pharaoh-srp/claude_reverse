package defpackage;

import android.app.ActivityOptions;
import android.content.Intent;
import android.credentials.CreateCredentialResponse;
import android.credentials.Credential;
import android.credentials.GetCredentialResponse;
import android.os.Bundle;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.widget.TextView;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.GetCredentialException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class i5 {
    public static CreateCredentialException a(Intent intent) {
        android.credentials.CreateCredentialException createCredentialException = (android.credentials.CreateCredentialException) intent.getSerializableExtra("android.service.credentials.extra.CREATE_CREDENTIAL_EXCEPTION", android.credentials.CreateCredentialException.class);
        if (createCredentialException == null) {
            return null;
        }
        String type = createCredentialException.getType();
        type.getClass();
        return urk.i(createCredentialException.getMessage(), type);
    }

    public static l65 b(Intent intent, String str) {
        CreateCredentialResponse createCredentialResponse = (CreateCredentialResponse) intent.getParcelableExtra("android.service.credentials.extra.CREATE_CREDENTIAL_RESPONSE", CreateCredentialResponse.class);
        if (createCredentialResponse == null) {
            return null;
        }
        Bundle data = createCredentialResponse.getData();
        data.getClass();
        return quk.g(str, data);
    }

    public static GetCredentialException c(Intent intent) {
        android.credentials.GetCredentialException getCredentialException = (android.credentials.GetCredentialException) intent.getSerializableExtra("android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION", android.credentials.GetCredentialException.class);
        if (getCredentialException == null) {
            return null;
        }
        String type = getCredentialException.getType();
        type.getClass();
        return urk.j(getCredentialException.getMessage(), type);
    }

    public static u38 d(Intent intent) {
        GetCredentialResponse getCredentialResponse = (GetCredentialResponse) intent.getParcelableExtra("android.service.credentials.extra.GET_CREDENTIAL_RESPONSE", GetCredentialResponse.class);
        if (getCredentialResponse == null) {
            return null;
        }
        Credential credential = getCredentialResponse.getCredential();
        credential.getClass();
        String type = credential.getType();
        type.getClass();
        Bundle data = credential.getData();
        data.getClass();
        return new u38(gvk.f(type, data));
    }

    public static float e(VelocityTracker velocityTracker, int i) {
        return velocityTracker.getAxisVelocity(i);
    }

    public static int f(ViewConfiguration viewConfiguration, int i, int i2, int i3) {
        return viewConfiguration.getScaledMaximumFlingVelocity(i, i2, i3);
    }

    public static int g(ViewConfiguration viewConfiguration, int i, int i2, int i3) {
        return viewConfiguration.getScaledMinimumFlingVelocity(i, i2, i3);
    }

    public static void h(AccessibilityEvent accessibilityEvent, boolean z) {
        accessibilityEvent.setAccessibilityDataSensitive(z);
    }

    public static void i(TextView textView, int i, float f) {
        textView.setLineHeight(i, f);
    }

    public static void j(ActivityOptions activityOptions) {
        activityOptions.setShareIdentityEnabled(false);
    }
}
