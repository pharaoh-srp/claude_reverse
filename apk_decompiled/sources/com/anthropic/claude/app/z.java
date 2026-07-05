package com.anthropic.claude.app;

import com.anthropic.claude.api.chat.tool.ImageGalleryItemId;
import com.anthropic.claude.app.ClaudeAppOverlay;
import defpackage.bz7;
import defpackage.cv;
import defpackage.iei;
import defpackage.j83;
import defpackage.rwe;

/* JADX INFO: loaded from: classes.dex */
public final class z implements bz7 {
    public final /* synthetic */ rwe E;

    public z(rwe rweVar) {
        this.E = rweVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        String strM310unboximpl = ((ImageGalleryItemId) obj).m310unboximpl();
        strM310unboximpl.getClass();
        cv cvVar = new cv(19, new ClaudeAppOverlay.ImageGalleryFullScreen(strM310unboximpl, null));
        j83 j83Var = new j83(16);
        rwe rweVar = this.E;
        rweVar.getClass();
        rweVar.E.m(cvVar, j83Var);
        return iei.a;
    }
}
