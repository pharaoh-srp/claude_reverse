package com.anthropic.claude.bell.api;

import com.anthropic.claude.bell.api.BellApiData;
import defpackage.jce;
import defpackage.kce;
import defpackage.odf;
import defpackage.pl9;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class y {
    public static final /* synthetic */ y a = new y();

    public final KSerializer serializer() {
        kce kceVar = jce.a;
        return new odf("com.anthropic.claude.bell.api.BellApiData", kceVar.b(BellApiData.class), new pl9[]{kceVar.b(BellApiData.AudioData.class), kceVar.b(BellApiData.MessageData.class)}, new KSerializer[]{w.a, z.a}, new Annotation[0]);
    }
}
