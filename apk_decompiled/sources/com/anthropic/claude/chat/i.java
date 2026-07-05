package com.anthropic.claude.chat;

import com.anthropic.claude.chat.ChatScreenOverlay;
import defpackage.jce;
import defpackage.kce;
import defpackage.lq6;
import defpackage.odf;
import defpackage.pl9;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class i {
    public static final /* synthetic */ i a = new i();

    public final KSerializer serializer() {
        kce kceVar = jce.a;
        return new odf("com.anthropic.claude.chat.ChatScreenOverlay", kceVar.b(ChatScreenOverlay.class), new pl9[]{kceVar.b(ChatScreenOverlay.BrowserTakeover.class), kceVar.b(ChatScreenOverlay.None.class)}, new KSerializer[]{g.a, new lq6("com.anthropic.claude.chat.ChatScreenOverlay.None", ChatScreenOverlay.None.INSTANCE, new Annotation[0])}, new Annotation[0]);
    }
}
