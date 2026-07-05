package com.anthropic.claude.app.main;

import com.anthropic.claude.app.main.MainAppScreens;
import defpackage.jce;
import defpackage.kce;
import defpackage.lq6;
import defpackage.odf;
import defpackage.pl9;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class m {
    public static final /* synthetic */ m a = new m();

    public final KSerializer serializer() {
        kce kceVar = jce.a;
        return new odf("com.anthropic.claude.app.main.MainAppScreens", kceVar.b(MainAppScreens.class), new pl9[]{kceVar.b(MainAppScreens.AddAccount.class), kceVar.b(MainAppScreens.InternalSettings.class), kceVar.b(MainAppScreens.LoggedIn.class), kceVar.b(MainAppScreens.LoggedOut.class), kceVar.b(MainAppScreens.RequiredUpdate.class), kceVar.b(MainAppScreens.StepUpReauth.class), kceVar.b(MainAppScreens.UiDemoApp.class)}, new KSerializer[]{new lq6("com.anthropic.claude.app.main.MainAppScreens.AddAccount", MainAppScreens.AddAccount.INSTANCE, new Annotation[0]), new lq6("com.anthropic.claude.app.main.MainAppScreens.InternalSettings", MainAppScreens.InternalSettings.INSTANCE, new Annotation[0]), n.a, p.a, new lq6("com.anthropic.claude.app.main.MainAppScreens.RequiredUpdate", MainAppScreens.RequiredUpdate.INSTANCE, new Annotation[0]), r.a, new lq6("com.anthropic.claude.app.main.MainAppScreens.UiDemoApp", MainAppScreens.UiDemoApp.INSTANCE, new Annotation[0])}, new Annotation[0]);
    }
}
