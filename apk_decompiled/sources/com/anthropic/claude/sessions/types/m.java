package com.anthropic.claude.sessions.types;

import com.anthropic.claude.sessions.types.ControlRequestBody;
import defpackage.mq5;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
public final class m {
    public static final /* synthetic */ m a = new m();

    public static ControlRequestBody.Interrupt a() {
        return new ControlRequestBody.Interrupt((String) null, 1, (mq5) null);
    }

    public static ControlRequestBody.ReadFile b(m mVar, String str) {
        mVar.getClass();
        str.getClass();
        return new ControlRequestBody.ReadFile((String) null, str, (Integer) null, (String) null, 1, (mq5) null);
    }

    public static ControlRequestBody.SetMode c(String str) {
        str.getClass();
        return new ControlRequestBody.SetMode((String) null, str, 1, (mq5) null);
    }

    public static ControlRequestBody.SetModel d(String str) {
        return new ControlRequestBody.SetModel((String) null, str, 1, (mq5) null);
    }

    public final KSerializer serializer() {
        return z.c;
    }
}
