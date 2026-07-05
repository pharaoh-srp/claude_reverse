package defpackage;

import android.view.MotionEvent;

/* JADX INFO: loaded from: classes2.dex */
public final class vrb {
    public static final vrb a = new vrb();

    public final boolean a(MotionEvent motionEvent, int i) {
        return (Float.floatToRawIntBits(motionEvent.getRawX(i)) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(motionEvent.getRawY(i)) & Integer.MAX_VALUE) < 2139095040;
    }
}
