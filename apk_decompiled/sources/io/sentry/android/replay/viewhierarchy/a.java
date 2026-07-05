package io.sentry.android.replay.viewhierarchy;

import defpackage.av9;
import defpackage.ts9;
import defpackage.zy7;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends ts9 implements zy7 {
    public static final a F = new a(0);

    @Override // defpackage.zy7
    public final Object a() {
        try {
            Method declaredMethod = av9.class.getDeclaredMethod("getCollapsedSemantics$ui_release", null);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }
}
