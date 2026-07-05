package androidx.media3.exoplayer;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.common.PlaybackException;
import defpackage.fd9;
import defpackage.jw7;
import defpackage.tpi;
import defpackage.z7b;
import io.sentry.e0;

/* JADX INFO: loaded from: classes2.dex */
public final class ExoPlaybackException extends PlaybackException {
    public final int G;
    public final String H;
    public final int I;
    public final jw7 J;
    public final int K;
    public final z7b L;
    public final boolean M;

    /* JADX WARN: Illegal instructions before constructor call */
    public ExoPlaybackException(int i, Exception exc, int i2, String str, int i3, jw7 jw7Var, int i4, z7b z7bVar, boolean z) {
        String str2;
        int i5;
        jw7 jw7Var2;
        String string;
        String str3;
        if (i == 0) {
            str2 = str;
            i5 = i3;
            jw7Var2 = jw7Var;
            string = "Source error";
        } else if (i != 1) {
            string = i != 3 ? "Unexpected runtime error" : "Remote error";
            str2 = str;
            i5 = i3;
            jw7Var2 = jw7Var;
        } else {
            StringBuilder sb = new StringBuilder();
            str2 = str;
            sb.append(str2);
            sb.append(" error, index=");
            i5 = i3;
            sb.append(i5);
            sb.append(", format=");
            jw7Var2 = jw7Var;
            sb.append(jw7Var2);
            sb.append(", format_supported=");
            String str4 = tpi.a;
            if (i4 == 0) {
                str3 = "NO";
            } else if (i4 == 1) {
                str3 = "NO_UNSUPPORTED_SUBTYPE";
            } else if (i4 == 2) {
                str3 = "NO_UNSUPPORTED_DRM";
            } else if (i4 == 3) {
                str3 = "NO_EXCEEDS_CAPABILITIES";
            } else {
                if (i4 != 4) {
                    e0.b();
                    throw null;
                }
                str3 = "YES";
            }
            sb.append(str3);
            string = sb.toString();
        }
        this(TextUtils.isEmpty(null) ? string : string.concat(": null"), exc, i2, i, str2, i5, jw7Var2, i4, z7bVar, SystemClock.elapsedRealtime(), z);
    }

    public final ExoPlaybackException a(z7b z7bVar) {
        String message = getMessage();
        String str = tpi.a;
        return new ExoPlaybackException(message, getCause(), this.E, this.G, this.H, this.I, this.J, this.K, z7bVar, this.F, this.M);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExoPlaybackException(String str, Throwable th, int i, int i2, String str2, int i3, jw7 jw7Var, int i4, z7b z7bVar, long j, boolean z) {
        super(str, th, i, j);
        Bundle bundle = Bundle.EMPTY;
        fd9.E(!z || i2 == 1);
        fd9.E(th != null || i2 == 3);
        this.G = i2;
        this.H = str2;
        this.I = i3;
        this.J = jw7Var;
        this.K = i4;
        this.L = z7bVar;
        this.M = z;
    }

    public ExoPlaybackException(int i, Exception exc, int i2) {
        this(i, exc, i2, null, -1, null, 4, null, false);
    }
}
