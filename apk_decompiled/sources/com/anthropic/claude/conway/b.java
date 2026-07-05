package com.anthropic.claude.conway;

import com.anthropic.claude.conway.ConwayAppScreen;
import defpackage.jce;
import defpackage.kce;
import defpackage.lq6;
import defpackage.odf;
import defpackage.pl9;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class b {
    public static final /* synthetic */ b a = new b();

    public final KSerializer serializer() {
        kce kceVar = jce.a;
        return new odf("com.anthropic.claude.conway.ConwayAppScreen", kceVar.b(ConwayAppScreen.class), new pl9[]{kceVar.b(ConwayAppScreen.Chat.class), kceVar.b(ConwayAppScreen.Extension.class), kceVar.b(ConwayAppScreen.System.class)}, new KSerializer[]{new lq6("com.anthropic.claude.conway.ConwayAppScreen.Chat", ConwayAppScreen.Chat.INSTANCE, new Annotation[0]), c.a, new lq6("com.anthropic.claude.conway.ConwayAppScreen.System", ConwayAppScreen.System.INSTANCE, new Annotation[0])}, new Annotation[0]);
    }
}
