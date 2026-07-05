package com.anthropic.claude.login;

import com.anthropic.claude.login.OverlayScreens;
import defpackage.jce;
import defpackage.kce;
import defpackage.lq6;
import defpackage.odf;
import defpackage.pl9;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class g {
    public static final /* synthetic */ g a = new g();

    public final KSerializer serializer() {
        kce kceVar = jce.a;
        return new odf("com.anthropic.claude.login.OverlayScreens", kceVar.b(OverlayScreens.class), new pl9[]{kceVar.b(OverlayScreens.MagicLinkVerify.class), kceVar.b(OverlayScreens.None.class)}, new KSerializer[]{h.a, new lq6("com.anthropic.claude.login.OverlayScreens.None", OverlayScreens.None.INSTANCE, new Annotation[0])}, new Annotation[0]);
    }
}
