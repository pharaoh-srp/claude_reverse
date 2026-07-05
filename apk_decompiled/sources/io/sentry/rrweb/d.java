package io.sentry.rrweb;

import io.sentry.a1;
import io.sentry.m2;
import io.sentry.q3;
import io.sentry.y;

/* JADX INFO: loaded from: classes3.dex */
public enum d implements m2 {
    Mutation,
    MouseMove,
    MouseInteraction,
    Scroll,
    ViewportResize,
    Input,
    TouchMove,
    MediaInteraction,
    StyleSheetRule,
    CanvasMutation,
    Font,
    Log,
    Drag,
    StyleDeclaration,
    Selection,
    AdoptedStyleSheet,
    CustomElement;

    @Override // io.sentry.m2
    public void serialize(q3 q3Var, a1 a1Var) {
        ((y) q3Var).w(ordinal());
    }
}
