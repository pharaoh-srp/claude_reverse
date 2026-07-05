package com.anthropic.claude.api.tasks;

import com.anthropic.claude.api.tasks.AgentContentBlock;
import defpackage.jce;
import defpackage.kce;
import defpackage.odf;
import defpackage.pl9;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class a {
    public static final /* synthetic */ a a = new a();

    public final KSerializer serializer() {
        kce kceVar = jce.a;
        return new odf("com.anthropic.claude.api.tasks.AgentContentBlock", kceVar.b(AgentContentBlock.class), new pl9[]{kceVar.b(AgentContentBlock.Text.class), kceVar.b(AgentContentBlock.Thinking.class)}, new KSerializer[]{b.a, d.a}, new Annotation[0]);
    }
}
