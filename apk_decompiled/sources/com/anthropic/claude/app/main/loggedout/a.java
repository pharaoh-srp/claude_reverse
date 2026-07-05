package com.anthropic.claude.app.main.loggedout;

import com.anthropic.claude.app.main.loggedout.LoggedOutAppDestination;
import defpackage.jce;
import defpackage.kce;
import defpackage.lq6;
import defpackage.odf;
import defpackage.pl9;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final /* synthetic */ a a = new a();

    public final KSerializer serializer() {
        kce kceVar = jce.a;
        return new odf("com.anthropic.claude.app.main.loggedout.LoggedOutAppDestination", kceVar.b(LoggedOutAppDestination.class), new pl9[]{kceVar.b(LoggedOutAppDestination.LoginApp.class)}, new KSerializer[]{new lq6("com.anthropic.claude.app.main.loggedout.LoggedOutAppDestination.LoginApp", LoggedOutAppDestination.LoginApp.INSTANCE, new Annotation[0])}, new Annotation[0]);
    }
}
