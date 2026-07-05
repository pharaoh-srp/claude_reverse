package io.sentry.rrweb;

import io.sentry.a1;
import io.sentry.m2;
import io.sentry.q3;
import io.sentry.y;

/* JADX INFO: loaded from: classes3.dex */
public enum f implements m2 {
    MouseUp,
    MouseDown,
    Click,
    ContextMenu,
    DblClick,
    Focus,
    Blur,
    TouchStart,
    TouchMove_Departed,
    TouchEnd,
    TouchCancel;

    @Override // io.sentry.m2
    public void serialize(q3 q3Var, a1 a1Var) {
        ((y) q3Var).w(ordinal());
    }
}
