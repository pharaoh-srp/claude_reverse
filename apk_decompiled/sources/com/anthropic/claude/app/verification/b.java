package com.anthropic.claude.app.verification;

import com.anthropic.claude.app.verification.VerificationScreens;
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
        return new odf("com.anthropic.claude.app.verification.VerificationScreens", kceVar.b(VerificationScreens.class), new pl9[]{kceVar.b(VerificationScreens.EnterPhoneStep.class), kceVar.b(VerificationScreens.VerifyPhoneCodeStep.class)}, new KSerializer[]{new lq6("com.anthropic.claude.app.verification.VerificationScreens.EnterPhoneStep", VerificationScreens.EnterPhoneStep.INSTANCE, new Annotation[0]), c.a}, new Annotation[0]);
    }
}
