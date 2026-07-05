package com.anthropic.claude.agentchat;

import com.anthropic.claude.agentchat.AgentChatDestination;
import defpackage.jce;
import defpackage.kce;
import defpackage.lq6;
import defpackage.odf;
import defpackage.pl9;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class a {
    public static final /* synthetic */ a a = new a();

    public final KSerializer serializer() {
        kce kceVar = jce.a;
        return new odf("com.anthropic.claude.agentchat.AgentChatDestination", kceVar.b(AgentChatDestination.class), new pl9[]{kceVar.b(AgentChatDestination.Home.class)}, new KSerializer[]{new lq6("com.anthropic.claude.agentchat.AgentChatDestination.Home", AgentChatDestination.Home.INSTANCE, new Annotation[0])}, new Annotation[0]);
    }
}
