package com.anthropic.claude.app.main.loggedin;

import com.anthropic.claude.app.main.loggedin.LoggedInScreens;
import defpackage.jce;
import defpackage.jj;
import defpackage.kce;
import defpackage.koi;
import defpackage.lq6;
import defpackage.odf;
import defpackage.pl9;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class j {
    public static final /* synthetic */ j a = new j();

    public static LoggedInScreens a(koi koiVar, jj jjVar) {
        koiVar.getClass();
        jjVar.getClass();
        return jjVar.a() ? LoggedInScreens.MinorBlocked.INSTANCE : ((Boolean) koiVar.h.getValue()).booleanValue() ? LoggedInScreens.Onboarding.INSTANCE : !koiVar.b.a().is_verified() ? LoggedInScreens.AccountVerification.INSTANCE : LoggedInScreens.ClaudeApp.INSTANCE;
    }

    public final KSerializer serializer() {
        kce kceVar = jce.a;
        return new odf("com.anthropic.claude.app.main.loggedin.LoggedInScreens", kceVar.b(LoggedInScreens.class), new pl9[]{kceVar.b(LoggedInScreens.AccountVerification.class), kceVar.b(LoggedInScreens.ClaudeApp.class), kceVar.b(LoggedInScreens.MinorBlocked.class), kceVar.b(LoggedInScreens.Onboarding.class)}, new KSerializer[]{new lq6("com.anthropic.claude.app.main.loggedin.LoggedInScreens.AccountVerification", LoggedInScreens.AccountVerification.INSTANCE, new Annotation[0]), new lq6("com.anthropic.claude.app.main.loggedin.LoggedInScreens.ClaudeApp", LoggedInScreens.ClaudeApp.INSTANCE, new Annotation[0]), new lq6("com.anthropic.claude.app.main.loggedin.LoggedInScreens.MinorBlocked", LoggedInScreens.MinorBlocked.INSTANCE, new Annotation[0]), new lq6("com.anthropic.claude.app.main.loggedin.LoggedInScreens.Onboarding", LoggedInScreens.Onboarding.INSTANCE, new Annotation[0])}, new Annotation[0]);
    }
}
