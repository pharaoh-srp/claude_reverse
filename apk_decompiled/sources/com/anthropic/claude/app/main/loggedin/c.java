package com.anthropic.claude.app.main.loggedin;

import com.anthropic.claude.app.main.loggedin.BootstrapScreen;
import defpackage.jce;
import defpackage.kce;
import defpackage.odf;
import defpackage.pl9;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static final /* synthetic */ c a = new c();

    public final KSerializer serializer() {
        kce kceVar = jce.a;
        return new odf("com.anthropic.claude.app.main.loggedin.BootstrapScreen", kceVar.b(BootstrapScreen.class), new pl9[]{kceVar.b(BootstrapScreen.Bootstrapped.class), kceVar.b(BootstrapScreen.NeedsBootstrap.class)}, new KSerializer[]{a.a, d.a}, new Annotation[0]);
    }
}
