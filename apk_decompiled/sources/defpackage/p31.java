package defpackage;

import android.media.AudioAttributes;
import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public final class p31 {
    public static final p31 b = new p31();
    public AudioAttributes a;

    static {
        ebh.w(0, 1, 2, 3, 4);
        tpi.w(5);
        tpi.w(6);
    }

    public final AudioAttributes a() {
        if (this.a == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                usage.setAllowedCapturePolicy(1);
                usage.setHapticChannelsMuted(true);
            }
            if (i >= 32) {
                usage.setSpatializationBehavior(0);
                usage.setIsContentSpatialized(false);
            }
            this.a = usage.build();
        }
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p31.class != obj.getClass()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -436042064;
    }
}
